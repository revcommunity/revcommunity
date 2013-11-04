package org.revcommunity.nokaut;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.revcommunity.model.Category;
import org.revcommunity.model.Product;
import org.revcommunity.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author Tomek
 *
 */
@Service
public class NokautConnector {
	
	private static final Logger logger = Logger.getLogger(NokautConnector.class);
	
	@Autowired
    private CategoryRepo categoryRepo;
	
	private static final String KEY = "cf9d036f25be50b91c04b2ec9b82de07";
	private static final String URI = "http://api.nokaut.pl/?key="+KEY+"&format=json";
	
	private static final String METHOD = "&method=";
	//methods
	private static final String NOKAUT_CATEGORY_GET_BY_NAME = METHOD+"nokaut.Category.getByName";
	private static final String NOKAUT_CATEGORY_GET_BY_PARENT_ID = METHOD+"nokaut.Category.getByParentId";
	private static final String NOKAUT_PRODUCT_GET_BY_CATEGORY = METHOD+"nokaut.Product.getByCategory";
	
	//json fields
	private static final String PARENT_ID  = "parentId";
	private static final String ITEMS  = "items";
	
	
	private static final ObjectMapper objectMapper = new ObjectMapper();
	private static HttpClient httpClient = new HttpClient();
	private static GetMethod getMethod = new GetMethod();
	
	//FIXME jak bedziemy docelowo to pobierac?
	//Po nazwie czy po ID, myślicie że ID sie moze zmienic ?
	//Po nazwie mam wiele wyników ale za to są już uszeregowane hierarchicznie
	@Transactional
	public Category getCategoryByName(String name){
		if(name == null || name.length() == 0)
			return null;
		
		JSONObject json =  getMethod(URI+NOKAUT_CATEGORY_GET_BY_NAME+"&name="+name+"&limit="+1);
		
		JSONObject j = json.getJSONObject("1item");
		Category c = null;
		String parentId = j.getString(PARENT_ID);
		//j.put("parent", "");
		try {
			c = objectMapper.readValue( j.toString(), Category.class );
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//c = om.fromJson(j.toString(), Category.class);
		if(!parentId.equals("0")){
			// nie root
			Long l = Long.parseLong(parentId);
			Category cg = categoryRepo.findById(l);
			if(cg == null){
				return null;
			}
			c.setParent(cg);
			cg.addChildren(c);
			categoryRepo.save(cg);
		}
		
		return c;
	}
	
	@Transactional
	public List<Category> getCategoriesByParentId(String parentId){
		if(parentId == null || parentId.length() == 0)
			return null;
		
		List<Category> list = new ArrayList<Category>();
		
		JSONObject j = getMethod(URI+NOKAUT_CATEGORY_GET_BY_PARENT_ID+"&parent_id="+parentId);
		
		for(Object o : j.keySet()){
			JSONObject category = j.getJSONObject((String)o);
			
			try {
				Category c = objectMapper.readValue( category.toString(), Category.class );
				
				Long parentId1 = c.getParentId();
				if(parentId1.longValue() > 0){
					// nie root
					Category cg = categoryRepo.findById(parentId1);
					if(cg == null){
						return null;
					}
					//TODO Dlaczego leci StackOverFlow
					//c.setParent(cg);
					cg.addChildren(c);
					categoryRepo.save(cg);
				}
				
				list.add(c);
				
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
		
	}
	
	/**
	 * Pobiera produkty z danej kategorii, kategoria może być kategorią nadrzędną
	 * @param categoryId
	 * @param limit
	 * @return JSON z produkatmi
	 * @throws Exception 
	 */
	@Transactional
	public List<Product> getProductsByCategoryId(String categoryId, int limit){
		if(categoryId == null || categoryId.length() == 0)
			return null;
		
		if(limit <= 0)
			limit = 100; //omyslna wartosc
		
		Category category = categoryRepo.findById(Long.parseLong(categoryId));
		List<Product> products = new ArrayList<Product>();
		if(!category.isLeaf())
			return products;
		
		JSONObject jsonObject = getMethod(URI+NOKAUT_PRODUCT_GET_BY_CATEGORY+"&category="+categoryId+"&limit="+limit);
		
		
		if(jsonObject == null)
			return null;
		
		
		
		for(Object o : jsonObject.keySet()){
			String key = (String)o;
			JSONObject product = jsonObject.getJSONObject(key);
			
			Product p;
			try {
				p = objectMapper.readValue(product.toString(), Product.class);
				
				//TODO to samo co wyzej
				//p.setCategory(category);
				
				category.addProduct(p);
				categoryRepo.save(category);
				products.add(p);
		
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		return products;
	}
	
	private static JSONObject getMethod(String URI){
		String res = null;
		JSONObject json = null;
		//FIXME tutaj parsowac to na klase czy dalej ?
		try {
			getMethod.setURI(new URI(URI));
			int status = httpClient.executeMethod(getMethod);
			if(status == HttpStatus.SC_OK){
				res = getMethod.getResponseBodyAsString();
				JSONObject j = new JSONObject(res);
				json = j.getJSONObject("success").getJSONObject(ITEMS);
				
				if(json.keySet().size() > 0){
					JSONObject o = json.getJSONObject("1item");
					String jsonString = json.toString();
					for(Object k : o.keySet()){
						String s = ((String)k).toString();
						jsonString = jsonString.replaceAll(s, parse(s));
					}
					json = new JSONObject(jsonString);
				}
				
				return json;
			}
			
		} catch (URIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}
	
	/**
	 * Method prase from snake_case to camelCase
	 * @param s
	 * @return
	 */
	public static String parse(String s){
		//np is_leaf -> isLeaf
	    StringBuffer sb = new StringBuffer();
	    String[] parts =  s.split("_");
	    sb.append(parts[0]);
	    for (int i=1;i<parts.length;i++ ) {
	        sb.append(Character.toUpperCase(parts[i].charAt(0)));
	        if (parts[i].length() > 1) {
	            sb.append(parts[i].substring(1, parts[i].length()).toLowerCase());
	        }
	    }
	    return sb.toString();
	}
}
