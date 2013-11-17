package org.revcommunity.remote.service.allegro;

import org.revcommunity.model.AbstractCategory;

import pl.allegro.webapi.service_php.CategoryData;
import pl.allegro.webapi.service_php.SellFormType;


public class AllegroConstans
{
    protected static String WEB_API_KEY = "24f1c801";
    protected static int COUNTRY_ID = 1;
    protected static long LOCAL_VERSION = 1384392682;
    protected static String LOGIN = "reviewcommunityallegro@gmail.com";
    protected static String PASSWORD = "CKXW0.)a";
    
    protected static int LEAF = 1;
    protected static String ERR_SESSION_EXPIRED = "ERR_SESSION_EXPIRED";
    
    
    public static AbstractCategory CategoryCreator(AbstractCategory category, CategoryData data, SellFormType[] filters){
        
        category.setName( data.getCatName() );
        category.setRemoteId( new Long(data.getCatId()) );
        
        //tutaj dodajemy filtry
        
        
        return category;
    }
    
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
