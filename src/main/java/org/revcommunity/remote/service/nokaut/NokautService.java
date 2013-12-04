package org.revcommunity.remote.service.nokaut;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.URIException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.Category;
import org.revcommunity.model.CategoryFilter;
import org.revcommunity.model.CategoryFilterType;
import org.revcommunity.model.CategoryGroup;
import org.revcommunity.model.Product;
import org.revcommunity.repo.AbstractCategoryRepo;
import org.revcommunity.repo.CategoryFilterRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.util.FilterSet;
import org.revcommunity.util.ImageService;
import org.revcommunity.util.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Tomek Straszewski Nov 17, 2013
 */
@Service("NokautService")
public class NokautService implements RemoteService
{

    private static final Logger logger = Logger.getLogger( NokautService.class );

    @Autowired
    private AbstractCategoryRepo abstractCategoryRepo;
    
    @Autowired
    private ProductRepo productRepo;
    
    @Autowired
    private org.revcommunity.util.ImageService imageService;

    private static final ObjectMapper objectMapper = new ObjectMapper();

    private static HttpClient httpClient = new HttpClient();

    private static GetMethod getMethod = new GetMethod();

    @Autowired
    private CategoryFilterRepo categoryFilterRepo;
    
    @Autowired
    private Neo4jTemplate tpl;
    
    @Transactional
    public List<CategoryGroup> downloadMainCategories()
    {
        Long nokautParentId = new Long(0);
        List<CategoryGroup> categories = new ArrayList<CategoryGroup>();
       try{
           JSONObject j = getMethod( NokautConstans.URI + NokautConstans.NOKAUT_CATEGORY_GET_BY_PARENT_ID + "&parent_id=" + nokautParentId.longValue(), false );

           if ( j == null ){
            return categories;//throw new Exception("Response is null");
           }
           
           CategoryGroup parent = null;
            
            for ( Object o : j.keySet() )
            {
                boolean exist = false;
                JSONObject c = j.getJSONObject( (String) o );

                JSONObject cat = new JSONObject();
                for(String key : NokautConstans.categoryFields){
                    String value = c.getString(key);
                    cat.put(NokautConstans.categoryFieldsMapper.get(key), value);
                }
                
                CategoryGroup category = objectMapper.readValue( cat.toString(), CategoryGroup.class );
                
                //FIXME w funkcji ?
                Long prId = category.getRemoteId();
                //sprawdzam czy obiekt nie istnieje juz bazie
                if( this.abstractCategoryRepo.findByRemoteId(prId) != null)
                    exist = true;
                
                if(!exist){
                    addFiltersToCategory( category);
                    
                    logger.info(category);
                    category.setParent(parent);
                    this.abstractCategoryRepo.save(category);
                    
                }
                categories.add(category);
            }
       }catch(Exception ex){
           ex.printStackTrace();
       }
       
        
        return categories;
    }

    @Transactional
    public void downloadAllCategories()
    {
        try{
            List<CategoryGroup> ids = downloadMainCategories();
            
            for (CategoryGroup id : ids) {
                List<AbstractCategory> l = downloadCategoriesByParentId(id.getRemoteId());
                for ( AbstractCategory abstractCategory : l )
                {
                    id.addChild( abstractCategory );
                }
                this.abstractCategoryRepo.save( id );
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    	
    }
    
   
    @Transactional
    public List<AbstractCategory> downloadCategoriesByParentId( Long nokautParentId )
    {
        List<AbstractCategory> categories = new ArrayList<AbstractCategory>();
        try{
            if ( nokautParentId == null )
                return null;

            
                JSONObject j = getMethod( NokautConstans.URI + NokautConstans.NOKAUT_CATEGORY_GET_BY_PARENT_ID + "&parent_id=" + nokautParentId.longValue(), false );

                if ( j == null ){
                    return categories;//throw new Exception("Response is null");
                }
                
                CategoryGroup parent = (CategoryGroup) this.abstractCategoryRepo.findByRemoteId(nokautParentId);
                 
                 for ( Object o : j.keySet() )
                 {
                     boolean exist = false;
                     JSONObject c = j.getJSONObject( (String) o );

                     AbstractCategory category = null;
                     JSONObject cat = new JSONObject();
                     for(String key : NokautConstans.categoryFields){
                        String value = c.getString(key);
                        cat.put(NokautConstans.categoryFieldsMapper.get(key), value);
                     }
                     
                     String isLeaf = c.getString(NokautConstans.IS_LEAF);
                     if(isLeaf.equals("0")){
                        category = objectMapper.readValue( cat.toString(), CategoryGroup.class );
                        
                        Long prId = category.getRemoteId();
                        //sprawdzam czy obiekt nie istnieje juz bazie
                        if( this.abstractCategoryRepo.findByRemoteId(prId) != null)
                            exist = true;
                        
                        if(!exist){
                            
                            addFiltersToCategory( category);
                            
                            logger.info(category);
                            category.setParent(parent);
                            this.abstractCategoryRepo.save(category);
                        }
                        
                        List<AbstractCategory> childs = downloadCategoriesByParentId(category.getRemoteId());
                        for (AbstractCategory child : childs) {
                            ((CategoryGroup)category).addChild(child);
                        }
                        
                        if(childs.size() > 0){
                            this.abstractCategoryRepo.save(category);
                        }
                        
                     }else{
                        category = objectMapper.readValue( cat.toString(), Category.class );
                        Long prId = category.getRemoteId();
                        //sprawdzam czy obiekt nie istnieje juz bazie
                        if( this.abstractCategoryRepo.findByRemoteId(prId) != null)
                            exist = true;
                        
                        if(!exist){
                            
                            addFiltersToCategory(category);
                            
                            logger.info(category);
                            category.setParent(parent);
                            this.abstractCategoryRepo.save(category);
                        }
                     }
                     
                     if(!exist){
                         categories.add(category);
                     }
                 }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return categories;
    }


    @Transactional
    public void downloadProductsByCategoryId( Category category, int limit )
    {
        try{
            if ( category == null ){
                throw new Exception("Category object is null");
            }
                
            if ( limit <= 0 )
                limit = 100; // omyslna wartosc

            JSONObject jsonObject = getMethod( NokautConstans.URI + NokautConstans.NOKAUT_PRODUCT_GET_BY_CATEGORY + "&category=" + category.getRemoteId().longValue() + "&limit=" + limit, false );

            if ( jsonObject == null ){
                return;//throw new Exception("Response is null");
            }

            for ( Object o : jsonObject.keySet() )
            {
                JSONObject p = jsonObject.getJSONObject( (String) o );

                JSONObject prod = new JSONObject();
                for(String key : NokautConstans.productFields){
                    String value = p.getString(key);
                    if(key.equals(NokautConstans.PRICE_AVG)){
                        value = value.replace(",", ".");
                    }
                    prod.put(NokautConstans.productFieldsMapper.get(key), value);
                }
                
                
                Product product = objectMapper.readValue( prod.toString(), Product.class );
                
                Long prId = product.getRemoteId();
                //sprawdzam czy obiekt nie istnieje juz bazie
                if( this.productRepo.findByRemoteId(prId) != null)
                //sprawdzam czy obiekt nie istnieje juz bazie
                if( this.productRepo.findByRemoteId(prId) != null){
                    
                    if(logger.isDebugEnabled()){
                        logger.debug( "POMIJAM, OBIEKT JUZ ISTNIEJE" );
                    }
                    continue;
                
                String imageUrl  = p.getString(NokautConstans.IMAGE);
                }
                   
                
                product = getProductDetails(product, category);
                if(product == null){
                    //strona z produktem jest niedostepna, pomijam
                    if(logger.isDebugEnabled()){
                        logger.debug( "POMIJAM, NIE ISTNIEJE NA NOKAUCIE STRONA Z OPISEM PRODUKTU" );
                    }
                    continue;
                }
                
                String imageUrl  = p.getString(NokautConstans.IMAGE);

                MultipartFile nokautImage = downloadImage(imageUrl);
                
                if(nokautImage != null){
                    List<File> files = this.imageService.save(Arrays.asList(nokautImage));
                    
                    for ( File file : files )
                    {
                        product.addImage( ImageService.imgDirName + "/" + file.getName() );
                    }
                }
                
                product.setCategory( category );
                
                this.productRepo.save(product);
                logger.info(product);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }

    private static JSONObject getMethod( String URI , boolean filters)
    
    private Product getProductDetails(Product p, Category c){
        
        /**
         * TODO
         * Opis produktu, zobaczyc klase .FullDescription, tylko co z tymi obrazkami... ?
         */
        
        boolean categoryChanged = false;
        String url = p.getRemoteUrl() + NokautConstans.PRODUCT_DESCRIPTION_POSTFIX;
        
        Connection connection = Jsoup.connect(url);
        
        try
        {
            Document doc =  connection.get();
            Elements properties = doc.select(NokautConstans.HTML_PARAMETERS_REGEX);
            Elements descriptions = doc.select( NokautConstans.HTML_DESCRIPTION_REGEX );
            
            if(descriptions.size() > 0){
                Iterator<Element> it = properties.iterator();
                
                //parametry
                for ( Element element : properties )
                {
                    String paramName = element.child( 0 ).text();
                    String value = element.child( 1 ).text();
                    
                    if(logger.isDebugEnabled()){
                        logger.debug( "Product parameter : " + paramName + " value : " + value );
                    }
                    
                    p.addProperties( paramName, value );
                    
                    
                    if(NokautConstans.specialFilters.contains( paramName )){
                        //np. System operacyjny
                        
                        if(logger.isDebugEnabled()){
                            logger.debug( "*************************  Special filter : " + paramName );
                        }
                        
                        CategoryFilter cat = new CategoryFilter( paramName, CategoryFilterType.STRING );
                        
                        FilterSet<CategoryFilter> filters = tpl.fetch(c.getFilters());
                        
                        //sprawdzam jeszcze czy moze tego filtru nie ma juz na liscie
                        if(!filters.contains( cat )){
                            c.addFilter( cat );
                            categoryChanged = true;
                        }
                        
                    }
                }
                
                //FIXME przykladowy opis to : (tak moze byc?)
                /*
                 *   <article class="ShopOfferDescription"> 
                         <header> 
                                 <h4><a onmousedown="clickWrapper(this,'http://www.nokaut.pl/Click/Offer/?click=aCyc*yFMVWnP0RgenwCnN1Xsw1y9htVk4ywQZjNOFYErpZuoUJ1oP6QYQvLF4mWrWSdnZvOqWylOPUXCzm2Q1wwWgZTdreyAZka9q0A8XIE_P._0_0_PictureBrowser_', 0, {o: '1921e586179e428ae424e494482016e1', s: '258', t: 'Samsung Series 7 Chronos (NP770Z7E-S01PL) /Darmowa dostawa wpisz kod 6E9E1X / Warszawa, Poznan, Katowice, L&oacute;dz, Gdynia, Krak&oacute;w - ODBI&Oacute;R OSOBISTY GRATIS!', wspolczynnik_dostawy: '0.3', cena: '4798', productId: '51934e952da47c2f07000033'})" href="http://www.nokaut.pl/goClick/?click=aHR0cDovL3d3dy5hZ2l0by5wbC9sYXB0b3Atc2Ftc3VuZy1zZXJpZXMtNy1jaHJvbm9zLW5wNzcwejdlLXMwMXBsLTIyNTEtODU4OTk2Lmh0bWw*dXRtX21lZGl1bT1GZWVkJmFtcDt1dG1fc291cmNlPW5va2F1dC5wbCZhbXA7dXRtX2NhbXBhaWduPXdzenlzdGtpZSZhbXA7dXRtX2NvbnRlbnQ9ODU4OTk2" data-click-type="cpc" data-place="descriptionsFromShops" class="GoToShop" target="_blank"> Agito.pl</a>: Opis Samsung Series 7 Chronos (NP770Z7E-S01PL) /Darmowa dostawa wpisz kod 6E9E1X / Warszawa, Poznan, Katowice, L&oacute;dz, Gdynia, Krak&oacute;w - ODBI&Oacute;R OSOBISTY GRATIS!</h4> 
                         </header> 
                         <p> Elegancki i stylowy laptop o doskonalych parametrach. Zostal stworzony z mysla o multimedialnym zastosowaniu. Charakteryzuje sie ekranem o przekatnej 17.3&quot; o rozdzielczosci 1920x1080. Za plynnosc i stabilnosc dzialan odpowiada procesor Intel Core i7 trzeciej generacji oraz pamiec operacyjna RAM 8GB.Duzy dysk twardy jest idealnym rozwiazaniem do magazynowania duzych plik&oacute;w, takich jak zdjecia, filmy, dokumenty.</p> 
                         <p>Do dyspozycji pozostaje takze wygodna, podswietlana klawiatura wyspowa z blokiem numerycznym, kamera internetowa 720p i niezbedne zlacza, dzieki kt&oacute;rym mozna podlaczyc dodatkowe akcesoria. Zainstalowany system operacyjny to Windows 8.</p> 
                    </article>
                 */
                StringBuilder sb = new StringBuilder();
                for ( Element desc : descriptions )
                {
                    sb.append( desc.text() );
                    sb.append( "\n\n" );
                }
                p.setDescription( sb.toString() );
                
                
                if(categoryChanged){
                    abstractCategoryRepo.save( c );
                }
                
                return p;
            }
            else{
                //strona nie istnieje
                return null;
            }
            
            
        }
        catch ( IOException e )
        {
            if(logger.isDebugEnabled()){
                e.printStackTrace();
            }
            return null;
        }
    }
    
    
    private static JSONObject getMethod( String URI , boolean filters)
    {
        String res = null;
        JSONObject json = null;
        // FIXME tutaj parsowac to na klase czy dalej ?
        try
        {
            getMethod.setURI( new URI( URI ) );
            int status = httpClient.executeMethod( getMethod );
            if ( status == HttpStatus.SC_OK )
            {
                res = getMethod.getResponseBodyAsString();
                JSONObject j = new JSONObject( res );
                logger.debug(j);
                try{
                    if(filters)
                        json = j.getJSONObject( NokautConstans.SUCCESS );
                    else
                        json = j.getJSONObject( NokautConstans.SUCCESS ).getJSONObject( NokautConstans.ITEMS );
                }catch(Exception r){
                	return null;
                }
                
                return json;
            }

        }
        catch ( URIException e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch ( HttpException e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch ( IOException e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return json;
    }

    /**
     * Method prase from snake_case to camelCase
     * 
     * @param s
     * @return
     */
    private static String parse( String s )
    {
        // np is_leaf -> isLeaf
        StringBuffer sb = new StringBuffer();
        String[] parts = s.split( "_" );
        sb.append( parts[0] );
        for ( int i = 1; i < parts.length; i++ )
        {
            sb.append( Character.toUpperCase( parts[i].charAt( 0 ) ) );
            if ( parts[i].length() > 1 )
            {
                sb.append( parts[i].substring( 1, parts[i].length() ).toLowerCase() );
            }
        }
        return sb.toString();
    }
    
    
    private NokautImage downloadImage(String imageUrl){
    	try
        {
            getMethod.setURI( new URI( imageUrl ) );
            int status = httpClient.executeMethod( getMethod );
            if ( status == HttpStatus.SC_OK )
            {
                InputStream is = getMethod.getResponseBodyAsStream();
               
                NokautImage ni = new NokautImage(is);
                ni.setSize(getMethod.getResponseContentLength());
                ni.setContentType(getMethod.getResponseCharSet());
                int i =imageUrl.lastIndexOf('/');
                imageUrl = imageUrl.substring(++i);
                ni.setName(imageUrl);
                ni.setOriginalFilename(imageUrl);
                return ni;
            }

        }
        catch ( URIException e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch ( HttpException e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch ( IOException e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    	return null;
    }
    
    private AbstractCategory addFiltersToCategory(AbstractCategory category){
        JSONObject d = getMethod( NokautConstans.URI + NokautConstans.NOKAUT_CATEGORY_FILTERS + "&filters[category_id]=" + category.getRemoteId(), true);
        if(! (d instanceof JSONObject))
            return category;
        
        return applyFiltersToCategory( category, d );
    }
    
    private AbstractCategory applyFiltersToCategory(AbstractCategory category, JSONObject data){
        
        
        Set<String> keys = data.keySet();
        for ( String key : keys )
        {   
            if(!NokautConstans.notAlowedFilters.contains( key )){
                //mozemy pobrac
                if(key.equals( NokautConstans.FILTR_PRODUCERS )){
                    
                    CategoryFilter producerCategory = new CategoryFilter();
                    producerCategory.setName( NokautConstans.PRODUCER_LABEL );
                    producerCategory.setType( CategoryFilterType.LIST );
                    Set<String> producers = new HashSet<String>();
                    JSONObject p = data.getJSONObject( key );
                    
                    Set<String> ps = p.keySet();
                    
                    for ( String pr : ps )
                    {
                        JSONObject prod = p.getJSONObject( pr );
                        if(prod.has( NokautConstans.FILTER_TITLE )){
                            String ri = (String) prod.get( NokautConstans.FILTER_TITLE );
                            producers.add( ri );
                        }
                    }
                    
                    producerCategory.setValues( producers );
                    category.addFilter( producerCategory );
                    
                }else{
                    JSONObject jsonFilter = data.getJSONObject( key );
                    if(jsonFilter.has( NokautConstans.FILTER_ID )){
                        Long remoteId = Long.valueOf( jsonFilter.getString( NokautConstans.FILTER_ID ) );
                        CategoryFilter filter = filterAlreadyExist(remoteId);
                        
                        if(filter != null){
                            category.addFilter( filter );
                            continue;
                        }
                        
                        //nie ma jeszcze takiego filtru
                        
                        //nie ma jeszcze takiego filtru








                        filter = new CategoryFilter();
                        CategoryFilter filter = new CategoryFilter();
                        
                        String name = jsonFilter.getString( NokautConstans.FILTER_TITLE );
                        
                        if(name == null)
                            continue;
                        
                        JSONObject val = jsonFilter.getJSONObject( NokautConstans.FILTER_VALUES );
                        String type = jsonFilter.getString( NokautConstans.FILTER_TYPE );
                        String unit = null;
                        Object o_ = jsonFilter.get( NokautConstans.FILTER_UNIT );
                        if(o_ instanceof String){
                            //FIXME obsluga obiektu ktory nie jest stringiem
                            unit = (String)o_;
                        }else{
                            unit = o_.toString();
                            if(!unit.equals( "null" )){
                                System.out.println();
                            }
                        }
                            
                        
                        filter.setName( name );
                        filter.setSymbol( unit );
                        if(logger.isDebugEnabled()){
                            //decimal
                            //integer
                        filter.setSymbol( name );
                        filter.setUnit( unit );
                        if(logger.isDebugEnabled()){
                            //decimal
                            //integer
                            logger.debug( "Typ filtru : " + type );
                        }
                        
                        filter.setType( NokautConstans.filterTypeMapper.get( type ) );
                        
                        Set<String> values = new HashSet<String>();
                        
                        Set<String> vv = val.keySet();
                        for ( String v : vv )
                        {
                            Object o = val.get( v );
                            if(!( o instanceof String )){
                                //FIXME nie continue tylko obsluga tego
                                continue;
                        if(type.equals( NokautConstans.FILTER_TYPE_STRING_SELECT )){
                            Set<String> values = new HashSet<String>();
                            
                            Set<String> vv = val.keySet();
                            for ( String v : vv )
                            {
                                Object o = val.get( v );
                                
                                if(!( o instanceof String )){
                                    continue;
                                }
                                    
                                
                                values.add( val.getString( v ) );
                            }
                                
                            
                            
                            values.add( val.getString( v ) );
                            if(logger.isDebugEnabled() ){
                                logger.debug( values.toString() );
                            }
                            
                            if(values.size() > 0 ){
                                filter.setValues( values );
                            }
                        }
                        
                        if(logger.isDebugEnabled() ){
                            logger.debug( values.toString() );
                        }
                        
                        if(values.size() > 0 ){
                            filter.setValues( values );
                            category.addFilter( filter );
                            this.categoryFilterRepo.save( filter );
                        }
                        
                        category.addFilter( filter );










                            
                    }
                }
            }
            
        }
        
        return category;
    }
    
    
    private CategoryFilter filterAlreadyExist(Long remoteId){
        
        CategoryFilter cf = this.categoryFilterRepo.findByRemoteId( remoteId );
        
        if(cf != null)
            return cf;
        
        return null;
    }
}
