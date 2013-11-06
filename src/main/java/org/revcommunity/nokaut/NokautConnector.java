package org.revcommunity.nokaut;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
import org.revcommunity.model.CategoryGroup;
import org.revcommunity.model.Product;
import org.revcommunity.repo.AbstractCategoryRepo;
import org.revcommunity.repo.CategoryGroupRepo;
import org.revcommunity.repo.CategoryRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.util.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Tomek
 */
@Service
public class NokautConnector
{

    private static final Logger logger = Logger.getLogger( NokautConnector.class );

    @Autowired
    private AbstractCategoryRepo abstractCategoryRepo;
    
    @Autowired
    private ProductRepo productRepo;
    
    @Autowired
    private org.revcommunity.util.ImageService imageService;

    private static final ObjectMapper objectMapper = new ObjectMapper();

    private static HttpClient httpClient = new HttpClient();

    private static GetMethod getMethod = new GetMethod();

    /**
     * Metoda pobiera główne kategorie i zapisuje je w bazie
     * @param id
     * @return Listę ientyfikatorów pobranych kategorii 
     * @throws IOException 
     * @throws JsonMappingException 
     * @throws JsonParseException 
     */
    @Transactional
    public List<Long> downloadMainCategories() throws JsonParseException, JsonMappingException, IOException
    {
       Long nokautParentId = new Long(0);
    	
       List<Long> categories = new ArrayList<Long>();
        
       JSONObject j = getMethod( NokautConstans.URI + NokautConstans.NOKAUT_CATEGORY_GET_BY_PARENT_ID + "&parent_id=" + nokautParentId.longValue() );

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
            Long prId = category.getNokautId();
            //sprawdzam czy obiekt nie istnieje juz bazie
            if( this.abstractCategoryRepo.findByNokautId(prId) != null)
            	exist = true;
            
            if(!exist){
            	logger.info(category);
                category.setParent(parent);
                this.abstractCategoryRepo.save(category);
                
            }
            categories.add(category.getNokautId());
        }
        
        return categories;
    }

    @Transactional
    public void downloadAllCategories() throws JsonParseException, JsonMappingException, IOException
    {
    	List<Long> ids = downloadMainCategories();
    	
    	for (Long id : ids) {
    		downloadCategoriesByParentId(id);
		}
    }
    
    /**
     * Metoda rekurencyjnie pobiera wszystkie podkategorie(schodzi do liscia) dla danej kateogorii, 
     * wszystkie kategorie zostaja automatycznie zapisane w bazie!
     * @param nokautParentId
     * @return Lista bezposrednich potomkow danej kategorii
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    @Transactional
    public List<AbstractCategory> downloadCategoriesByParentId( Long nokautParentId ) throws JsonParseException, JsonMappingException, IOException
    {
        if ( nokautParentId == null )
            return null;

        List<AbstractCategory> categories = new ArrayList<AbstractCategory>();
        	JSONObject j = getMethod( NokautConstans.URI + NokautConstans.NOKAUT_CATEGORY_GET_BY_PARENT_ID + "&parent_id=" + nokautParentId.longValue() );

        	if ( j == null ){
            	return categories;//throw new Exception("Response is null");
            }
        	
            CategoryGroup parent = (CategoryGroup) this.abstractCategoryRepo.findByNokautId(nokautParentId);
             
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
                 	
                 	Long prId = category.getNokautId();
                    //sprawdzam czy obiekt nie istnieje juz bazie
                    if( this.abstractCategoryRepo.findByNokautId(prId) != null)
                    	exist = true;
                 	
                 	if(!exist){
                 		logger.info(category);
                     	category.setParent(parent);
                 		this.abstractCategoryRepo.save(category);
                 	}
                 	
                 	List<AbstractCategory> childs = downloadCategoriesByParentId(category.getNokautId());
                 	for (AbstractCategory child : childs) {
     					((CategoryGroup)category).addChild(child);
     				}
                 	
                 }else{
                 	category = objectMapper.readValue( cat.toString(), Category.class );
                 	Long prId = category.getNokautId();
                    //sprawdzam czy obiekt nie istnieje juz bazie
                    if( this.abstractCategoryRepo.findByNokautId(prId) != null)
                    	exist = true;
                    
                    if(!exist){
                    	logger.info(category);
                    	category.setParent(parent);
                    	this.abstractCategoryRepo.save(category);
                    }
                 }
                 
                 if(!exist){
                	 categories.add(category);
                 }
             }
             
        return categories;
    }

    /**
     * Pobiera produkty z danej kategorii, podana kategoria musi być lisciem.
     * Pobrane produkty są automatycznie zapisywane w bazie
     * @param categoryId
     * @param limit
     * @return JSON z produkatmi
     * @throws Exception
     */
    @Transactional
    public void downloadProductsByCategoryId( Category category, int limit ) throws Exception
    {
        if ( category == null ){
        	throw new Exception("Category object is null");
        }
            
        if ( limit <= 0 )
            limit = 100; // omyslna wartosc

        JSONObject jsonObject = getMethod( NokautConstans.URI + NokautConstans.NOKAUT_PRODUCT_GET_BY_CATEGORY + "&category=" + category.getNokautId().longValue() + "&limit=" + limit );

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
            
            Long prId = product.getNokautId();
            //sprawdzam czy obiekt nie istnieje juz bazie
            if( this.productRepo.findByNokautId(prId) != null)
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
            
            
            
            this.productRepo.save(product);
            logger.info(product);
        }
    }

    private static JSONObject getMethod( String URI )
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
    public static String parse( String s )
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
}
