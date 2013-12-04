package org.revcommunity.remote.service.nokaut;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.revcommunity.model.CategoryFilterType;

public class NokautConstans {
    
    
    
    private static final Logger logger = Logger.getLogger( NokautConstans.class );

    public static final String KEY = "cf9d036f25be50b91c04b2ec9b82de07";

    public static final String URI = "http://api.nokaut.pl/?key=" + KEY + "&format=json";

    public static final String METHOD = "&method=";

    // methods
    public static final String NOKAUT_CATEGORY_GET_BY_NAME = METHOD + "nokaut.Category.getByName";

    public static final String NOKAUT_CATEGORY_GET_BY_PARENT_ID = METHOD + "nokaut.Category.getByParentId";

    public static final String NOKAUT_PRODUCT_GET_BY_CATEGORY = METHOD + "nokaut.Product.getByCategory";
	
    public static final String NOKAUT_CATEGORY_FILTERS = METHOD + "nokaut.Product.getFilters";
    
    public static final String IS_LEAF = "is_leaf"; 
    
    public static final String SUCCESS = "success"; 
    
    public static final String ITEMS = "items"; 
    
    public static final String IMAGE = "image_large"; 
    
    public static final String PRICE_AVG = "price_avg"; 
    
    protected static final String FILTR_PRODUCERS = "filter_producers";
    protected static final String PRODUCER_LABEL = "Producent";
    
    protected static final String FILTER_ID = "id";
    protected static final String FILTER_TITLE = "title";
    protected static final String FILTER_VALUES = "values";
    protected static final String FILTER_TYPE = "type";
    protected static final String FILTER_UNIT = "unit_short";
    protected static final String FILTER_TYPE_STRING_SELECT = "string_select";
    
    public static final String PRODUCT_DESCRIPTION_POSTFIX = "#opis";
    
    protected static final String HTML_PARAMETERS_REGEX = ".wideTable tbody tr";
    protected static final String HTML_DESCRIPTION_REGEX = ".ShopOfferDescription";
    
    
	public static final Map<String,String> productFieldsMapper = new HashMap<String , String>() {{
	    put("url",    "remoteUrl");
	    put("name", "name");
	    put("price_avg",   "priceAvg");
	    put("id",   "remoteId");
	}};
	
	public static final List<String> productFields = 
			Arrays.asList("name", "url", "price_avg","id");
	
	public static final Map<String,String> categoryFieldsMapper = new HashMap<String , String>() {{
	    put("name", "name");
	    put("id",   "remoteId");
	}};
	
	public static final Map<String,CategoryFilterType> filterTypeMapper = new HashMap<String , CategoryFilterType>() {{
        put("string_select", CategoryFilterType.LIST);
        put("decimal", CategoryFilterType.FLOAT);
        put("integer", CategoryFilterType.INTEGER);
    }};
	
	public static final List<String> categoryFields = 
			Arrays.asList("id", "name");
	

    
    public static final Set<String> notAlowedFilters = new HashSet<String>() {{
        add("filter_category");
        add("filter_price");
    }};

   
    public static final Set<String> specialFilters = new HashSet<String>() {{
        add("System operacyjny"); //tego nie ma w filtrach, wydaje mi się, że jest on istotny
    }};
}
