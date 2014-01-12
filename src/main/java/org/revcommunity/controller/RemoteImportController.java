package org.revcommunity.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.Category;
import org.revcommunity.repo.CategoryGroupRepo;
import org.revcommunity.repo.CategoryRepo;
import org.revcommunity.util.Message;
import org.revcommunity.util.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( "/remoteImport" )
public class RemoteImportController
{

    private static final Logger logger = Logger.getLogger( RemoteImportController.class );

    @Autowired
    @Qualifier( "NokautService" )
    RemoteService nokautConnector;

    @Autowired
    @Qualifier( "AllegroService" )
    RemoteService allegroConnector;

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private CategoryGroupRepo categoryGroupRepo;

    @RequestMapping( value = "/download", method = RequestMethod.GET )
    public void download()
    {

        try
        {

            nokautConnector.downloadMainCategories();
            // nokautConnector.downloadAllCategories();
            // nokautConnector.downloadCategoriesByParentId( new Long( 126 ) );
            // EndResult<Category> p = this.categoryRepo.findAll();
            // for ( Category c : p )
            // {
            // nokautConnector.downloadProductsByCategoryId( c, 1 );
            // }

            // nokautConnector.downloadMainCategories();

            // komputery
            // nokautConnector.downloadCategoriesByParentId( new Long(2) );

        }
        catch ( Exception e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    @RequestMapping( value = "/downloadWithId", method = RequestMethod.POST )
    public void download(@RequestParam List<Integer> ids, @RequestParam Integer limit)
    {

        try
        {

            //nokautConnector.downloadMainCategories();
            // nokautConnector.downloadAllCategories();
            
            for ( Integer integer : ids )
            {
                nokautConnector.downloadCategoriesByParentId( new Long( integer.intValue() ) );
            }
            
             
             EndResult<Category> p = this.categoryRepo.findAll();
             for ( Category c : p )
             {
                 nokautConnector.downloadProductsByCategoryId( c, limit.intValue() );
             }

            // nokautConnector.downloadMainCategories();

            // komputery
            // nokautConnector.downloadCategoriesByParentId( new Long(2) );

        }
        catch ( Exception e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    @RequestMapping( value = "/downloadMain", method = RequestMethod.POST )
    @ResponseBody
    public Message downloadMainCategories()
    {
        try
        {
            nokautConnector.downloadMainCategories();
            return new Message();
        }
        catch ( Exception e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        Message m = new Message();
        m.setSuccess( false );
        return m;
    }
    
    
    @RequestMapping( value = "/mainCategories", method = RequestMethod.GET )
    @ResponseBody
    public List<AbstractCategory> getMainCategories()
    {
        return categoryGroupRepo.findByBaseCategory( true );

    }

}
