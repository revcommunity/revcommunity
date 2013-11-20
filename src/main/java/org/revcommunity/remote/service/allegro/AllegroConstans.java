package org.revcommunity.remote.service.allegro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.CategoryFilter;
import org.revcommunity.model.CategoryFilterType;

import pl.allegro.webapi.service_php.CategoryData;
import pl.allegro.webapi.service_php.SellFormType;


public class AllegroConstans
{
    private static final Logger logger = Logger.getLogger( AllegroConstans.class );
    
    protected static String WEB_API_KEY = "24f1c801";
    protected static int COUNTRY_ID = 1;
    protected static long LOCAL_VERSION = 1384392682;
    protected static String LOGIN = "reviewcommunityallegro@gmail.com";
    protected static String PASSWORD = "CKXW0.)a";
    
    protected static int LEAF = 1;
    protected static String ERR_SESSION_EXPIRED = "ERR_SESSION_EXPIRED";
    
    protected static String LIST_VALUES_DIVIDER = "\\|";
    
    
    public static AbstractCategory CategoryCreator(AbstractCategory category, CategoryData data, SellFormType[] filters_){
        
        category.setName( data.getCatName() );
        category.setRemoteId( new Long(data.getCatId()) );
        
        //tutaj dodajemy filtry
        Set<CategoryFilter> filters = new HashSet<CategoryFilter>();
        for ( SellFormType type : filters_ )
        {
            int typeId = type.getSellFormType();
            CategoryFilterType c = filterMapper.get( typeId );
            if(c != null){
                CategoryFilter cf = new CategoryFilter(type.getSellFormTitle(),c);
                if(logger.isDebugEnabled()){
                    logger.debug( "Filter name : " + type.getSellFormTitle() );
                }
                if(c == CategoryFilterType.LIST){
                    String l = type.getSellFormDesc();
                    Set<String> val = new HashSet<String>();
                    String [] t = l.split( LIST_VALUES_DIVIDER );
                    for(String f : t){
                        val.add( f );
                    }
                    cf.setValues( val );
                    if(logger.isDebugEnabled()){
                        logger.debug( "Filter values : " + val.toString() );
                    }
                }
                filters.add( cf );
            }
        }
        category.setFilters( filters );
        return category;
    }
    
    public static final Map<Integer,CategoryFilterType> filterMapper = new HashMap<Integer , CategoryFilterType>() {{
        put(1, CategoryFilterType.STRING);
        put(2,   CategoryFilterType.INTEGER);
        put(4,   CategoryFilterType.LIST);
        put(8,   CategoryFilterType.STRING);
        put(13, CategoryFilterType.DATE);
        /*
         (1 - string, 2 - integer, 3 - float, 4 - combobox, 5 - radiobutton, 6 - checkbox, 7 - image (base64Binary), 8 - text (textarea), 9 - datetime (Unix time), 13 - date
         */
    }};
    
//    public static AbstractCategory ProductCreator(Product product, CategoryData data, SellFormType[] filters){
//        
//        category.setName( data.getCatName() );
//        category.setRemoteId( new Long(data.getCatId()) );
//        
//        //tutaj dodajemy filtry
//        
//        
//        return category;
//    }
}
