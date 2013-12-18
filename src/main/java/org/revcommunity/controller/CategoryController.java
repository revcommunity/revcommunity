package org.revcommunity.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.Category;
import org.revcommunity.model.CategoryFilter;
import org.revcommunity.model.CategoryGroup;
import org.revcommunity.repo.AbstractCategoryRepo;
import org.revcommunity.repo.CategoryGroupRepo;
import org.revcommunity.repo.CategoryRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.service.CategoryService;
import org.revcommunity.util.FilterSet;
import org.revcommunity.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( "/categories" )
public class CategoryController
{
    @Autowired
    private CategoryRepo cr;

    @Autowired
    private AbstractCategoryRepo acr;

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private Neo4jTemplate tpl;

    @Autowired
    private CategoryService cs;

    @Autowired
    private CategoryGroupRepo cgr;

    private static final Logger log = Logger.getLogger( CategoryController.class );

    @RequestMapping( value = "/add_leaf", method = RequestMethod.POST )
    @ResponseBody
    public Message saveLeaf( @RequestBody Category cat )
        throws JsonParseException, JsonMappingException, IOException
    {
        if ( cat.getParentId() == null )
        {
            cat.setParent( null );
            cr.save( cat );
        }
        else
        {
            CategoryGroup catParent = cgr.findByNodeId( cat.getParentId() );
            cat.setParent( catParent );
            cr.save( cat );
            catParent.addChild( cat );
        }

        for ( Category iterable_element : cr.findAll() )
        {
            log.debug( "" );
            log.debug( "name: " + iterable_element.getName() );
            log.debug( "parent: " + iterable_element.getParentId() );
            log.debug( "filters: " + iterable_element.getFilters() );

            for ( CategoryFilter i : tpl.fetch( iterable_element.getFilters() ) )
            {
                log.debug( "  param:" + i.getName() );
                if ( i.getName() != null && i.getValues() != null )
                    for ( String s : i.getValues() )
                    {
                        log.debug( "    value:" + s );
                    }
                log.debug( "    typ:" + i.getType() );
            }
        }

        return new Message();
    }

    @RequestMapping( value = "/add_group", method = RequestMethod.POST )
    @ResponseBody
    public Message saveGroup( @RequestBody CategoryGroup cat )
        throws JsonParseException, JsonMappingException, IOException
    {

        if ( cat.getParentId() == null )
        {
            cat.setParent( null );
            cgr.save( cat );
        }
        else
        {
            CategoryGroup catParent = cgr.findByNodeId( cat.getParentId() );
            cat.setParent( catParent );
            cgr.save( cat );
            catParent.addChild( cat );
        }
        for ( CategoryGroup iterable_element : cgr.findAll() )
        {
            log.debug( "" );
            log.debug( "name: " + iterable_element.getName() );
            log.debug( "ID: " + iterable_element.getNodeId() );
            log.debug( "parentID: " + iterable_element.getParentId() );
        }

        return new Message();
    }

    @RequestMapping( method = RequestMethod.GET )
    @ResponseBody
    public EndResult<Category> getAll()
    {
        return cr.findAll();
    }

    @RequestMapping( value = "/{id}", method = RequestMethod.GET )
    @ResponseBody
    public AbstractCategory get( @PathVariable Long id )
    {
        return acr.findOne( id );
    }

    @RequestMapping( value = "/parent", method = RequestMethod.GET )
    @ResponseBody
    public ArrayList<Category> getAllParent()
    {
        EndResult<Category> cat;
        ArrayList<Category> cat2 = new ArrayList<Category>();
        cat = cr.findAll();
        for ( Category category : cat )
        {
            if ( category.getName() != null )
            {
                cat2.add( category );
                log.debug( category.getName() );
            }

        }
        return cat2;
    }

    @RequestMapping( value = "/getByParentWithoutLeaf" )
    @ResponseBody
    public List<AbstractCategory> getByParentWithoutLeaf( @RequestParam( required = false ) Long parentId )
    {
        if ( parentId != null )
        {
            CategoryGroup parent = new CategoryGroup( parentId );
            List<AbstractCategory> abstractCategory = cgr.getChildren( parent );
            List<AbstractCategory> childrenWithoutLeaf = new ArrayList<AbstractCategory>();

            for ( int i = 0; i < abstractCategory.size(); i++ )
            {
                if ( abstractCategory.get( i ).isLeaf() == false )
                {
                    childrenWithoutLeaf.add( abstractCategory.get( i ) );
                }
            }
            return childrenWithoutLeaf;
        }
        else
        {
            return cgr.findByBaseCategory( true );
        }
    }

    @RequestMapping( value = "/getByParent" )
    @ResponseBody
    public List<AbstractCategory> getByParent( @RequestParam( required = false ) Long parentId )
    {
        if ( parentId != null )
        {
            CategoryGroup parent = new CategoryGroup( parentId );
            List<AbstractCategory> list = cgr.getChildren( parent );
            return list;
        }
        else
        {
            return cgr.findByBaseCategory( true );
        }
    }

    @RequestMapping( value = "/getFilters" )
    @ResponseBody
    public FilterSet<CategoryFilter> getFilters( @RequestParam Long categoryId )
    {
        Category c = cr.findOne( categoryId );
        FilterSet<CategoryFilter> lc = c.getFilters();
        log.debug( lc );
        return lc;
    }

    @RequestMapping( method = RequestMethod.DELETE, value = "{categoryId}" )
    @ResponseBody
    public Message delete( @PathVariable Long categoryId )
    {
        cs.delete( categoryId );
        return new Message();
    }
    
//    
//    @RequestMapping( value = "/getTest" )
//    @ResponseBody
//    public void getFiltersTest()
//    {
//        EndResult<AbstractCategory> l =   acr.findAll();
//        for ( AbstractCategory abstractCategory : l )
//        {
//            for ( CategoryFilter s : abstractCategory.getFilters() )
//            {
//                System.out.println(s.getName());
//                for ( String aa : s.getValues() )
//                {
//                    System.out.println("\t " + aa);
//                }
//            }
//        }
//    }

}