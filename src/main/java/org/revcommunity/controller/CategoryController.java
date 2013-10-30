package org.revcommunity.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.revcommunity.model.Category;
import org.revcommunity.model.CategoryFilter;
import org.revcommunity.model.Product;
import org.revcommunity.repo.CategoryRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.util.ImageService;
import org.revcommunity.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import scala.collection.Set;

@Controller
@RequestMapping( "/categories" )
public class CategoryController
{
    @Autowired
    private CategoryRepo pr;

    @Autowired
    private Neo4jTemplate tpl;

    private static final Logger log = Logger.getLogger( CategoryController.class );

    @RequestMapping( method = RequestMethod.POST )
    @ResponseBody
    public Message save( @RequestBody Category cat )
        throws JsonParseException, JsonMappingException, IOException
    {

        pr.save( cat );

        for ( Category iterable_element : pr.findAll() )
        {
            log.debug( "" );
            log.debug( "name: " + iterable_element.getName() );
            log.debug( "idParent: " + iterable_element.getParentId() );
            log.debug( "filters: " + iterable_element.getFilters() );
            for ( CategoryFilter i : tpl.fetch( iterable_element.getFilters() ) )
            {
                log.debug( "  param:" + i.getName() );
                if ( i.getName() != null )
                    for ( String s : i.getValues() )
                    {
                        log.debug( "    value:" + s );
                    }
            }
        }

        return new Message();
    }

    @RequestMapping( method = RequestMethod.GET )
    @ResponseBody
    public ArrayList<Category> getAll()
    {
        EndResult<Category> cat;
        ArrayList<Category> cat2 = new ArrayList<Category>();
        cat = pr.findAll();
        for ( Category category : cat )
        {
            if ( category.getName() != null )
            {
                cat2.add( category );
                log.debug( ">>" + category.getName() );
            }

        }
        return cat2;
    }

    @RequestMapping( value = "/parent", method = RequestMethod.GET )
    @ResponseBody
    public ArrayList<Category> getAllParent()
    {
        EndResult<Category> cat;
        ArrayList<Category> cat2 = new ArrayList<Category>();
        cat = pr.findAll();
        for ( Category category : cat )
        {
            if ( category.getName() != null )
            {
                cat2.add( category );
                log.debug( ">><<" + category.getName() );
            }

        }
        return cat2;
    }
}
