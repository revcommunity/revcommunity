package org.revcommunity.controller;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.revcommunity.model.Category;
import org.revcommunity.model.User;
import org.revcommunity.nokaut.NokautConnector;
import org.revcommunity.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/nokaut")
public class NokautController {

	private static final Logger logger = Logger.getLogger(NokautController.class);
	
	@Autowired
	NokautConnector nokautConnector;
	
	@Autowired
    private CategoryRepo categoryRepo;

	@RequestMapping(value = "/download",method = RequestMethod.GET)
	public void download() {

		try {
			
			nokautConnector.downloadMainCategories();
			
			nokautConnector.downloadCategoriesByParentId(new Long(126));
			EndResult<Category> p = this.categoryRepo.findAll();
			for (Category c : p) {
				logger.info(c);
				nokautConnector.downloadProductsByCategoryId(c, 1);
			}
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
