package org.revcommunity.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.revcommunity.model.Category;
import org.revcommunity.model.Product;
import org.revcommunity.repo.CategoryRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.util.ImageService;
import org.revcommunity.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( "/categories" )
public class CategoryController
{
    @Autowired
    private CategoryRepo pr;

    private static final Logger log = Logger.getLogger( CategoryController.class );

    @RequestMapping( method = RequestMethod.POST )
    @ResponseBody
    public Message save( @RequestBody Category cat )
        throws JsonParseException, JsonMappingException, IOException
    {

        pr.save( cat );
        System.out.printf( "Zapisano nowa kategorie: " + cat );
        for ( Category iterable_element : pr.findAll() )
        {
            log.debug( "name: " + iterable_element.getName() );
        }

        return new Message();
    }

    @RequestMapping( method = RequestMethod.GET )
    @ResponseBody
    public EndResult<Category> getAll()
    {
        return pr.findAll();
    }
}
