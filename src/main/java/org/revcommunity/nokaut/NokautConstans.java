package org.revcommunity.nokaut;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NokautConstans {

    public static final String KEY = "cf9d036f25be50b91c04b2ec9b82de07";

    public static final String URI = "http://api.nokaut.pl/?key=" + KEY + "&format=json";

    public static final String METHOD = "&method=";

    // methods
    public static final String NOKAUT_CATEGORY_GET_BY_NAME = METHOD + "nokaut.Category.getByName";

    public static final String NOKAUT_CATEGORY_GET_BY_PARENT_ID = METHOD + "nokaut.Category.getByParentId";

    public static final String NOKAUT_PRODUCT_GET_BY_CATEGORY = METHOD + "nokaut.Product.getByCategory";
	
    public static final String IS_LEAF = "is_leaf"; 
    
    public static final String SUCCESS = "success"; 
    
    public static final String ITEMS = "items"; 
    
    public static final String IMAGE = "image_large"; 
    
    public static final String PRICE_AVG = "price_avg"; 
    
	public static final Map<String,String> productFieldsMapper = new HashMap<String , String>() {{
	    put("url",    "nokautUrl");
	    put("name", "name");
	    put("price_avg",   "priceAvg");
	    put("id",   "nokautId");
	}};
	
	public static final List<String> productFields = 
			Arrays.asList("name", "url", "price_avg","id");
	
	public static final Map<String,String> categoryFieldsMapper = new HashMap<String , String>() {{
	    put("name", "name");
	    put("id",   "nokautId");
	}};
	
	public static final List<String> categoryFields = 
			Arrays.asList("id", "name");
}
