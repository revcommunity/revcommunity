package org.revcommunity.remote.service.nokaut;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.URIException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.Category;
import org.revcommunity.model.CategoryFilter;
import org.revcommunity.model.CategoryFilterType;
import org.revcommunity.model.CategoryGroup;
import org.revcommunity.model.Product;
import org.revcommunity.repo.AbstractCategoryRepo;
import org.revcommunity.repo.CategoryFilterRepo;
import org.revcommunity.repo.CategoryGroupRepo;
import org.revcommunity.repo.CategoryRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.util.ImageService;
import org.revcommunity.util.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import pl.allegro.webapi.service_php.SellFormType;

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
                    continue;
                
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
                        filter = new CategoryFilter();
                        
                        String name = jsonFilter.getString( NokautConstans.FILTER_TITLE );
                        
                        JSONObject val = jsonFilter.getJSONObject( NokautConstans.FILTER_VALUES );
                        String type = jsonFilter.getString( NokautConstans.FILTER_TYPE );
                        String unit = null;
                        Object o_ = jsonFilter.get( NokautConstans.FILTER_UNIT );
                        if(o_ instanceof String){
                            //FIXME obsluga obiektu ktory nie jest stringiem
                            unit = (String)o_;
                        }
                            
                        
                        filter.setName( name );
                        filter.setSymbol( unit );
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
                            }
                                
                            
                            values.add( val.getString( v ) );
                        }
                        
                        if(logger.isDebugEnabled() ){
                            logger.debug( values.toString() );
                        }
                        
                        if(values.size() > 0 )
                            filter.setValues( values );
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
