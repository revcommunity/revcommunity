package org.revcommunity.controller;

import org.apache.log4j.Logger;
import org.revcommunity.model.Category;
import org.revcommunity.model.CategoryGroup;
import org.revcommunity.service.CategoryService;
import org.revcommunity.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Kontroler odpowiedzialny za operacje na produktach
 * 
 * @author Paweł Rosolak 20 paź 2013
 */
@Controller
@RequestMapping( "/test" )
public class TestDataController
{

    private static final Logger log = Logger.getLogger( TestDataController.class );

    @Autowired
    private CategoryService cs;

    /**
     * Generuje testowe kategorie
     * 
     * @return
     * @author Paweł Rosolak 4 lis 2013
     */
    @RequestMapping( value = "createCategories" )
    @ResponseBody
    public Message createCategories()
    {
        cs.createCategories();
        return new Message();
    }

}
