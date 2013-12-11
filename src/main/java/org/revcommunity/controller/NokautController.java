package org.revcommunity.controller;

import org.apache.log4j.Logger;
import org.revcommunity.model.Category;
import org.revcommunity.repo.CategoryRepo;
import org.revcommunity.util.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping( "/nokaut" )
public class NokautController
{

    private static final Logger logger = Logger.getLogger( NokautController.class );

    @Autowired
    @Qualifier( "NokautService" )
    RemoteService nokautConnector;

    @Autowired
    @Qualifier( "AllegroService" )
    RemoteService allegroConnector;

    @Autowired
    private CategoryRepo categoryRepo;

    @RequestMapping( value = "/download", method = RequestMethod.GET )
    public void download()
    {

        try
        {

            nokautConnector.downloadMainCategories();
            // nokautConnector.downloadAllCategories();
            nokautConnector.downloadCategoriesByParentId( new Long( 126 ) );
            EndResult<Category> p = this.categoryRepo.findAll();
            for ( Category c : p )
            {
                logger.debug( c );
                nokautConnector.downloadProductsByCategoryId( c, 2 );
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
		try {
			
		    nokautConnector.downloadMainCategories();
		    //nokautConnector.downloadAllCategories();
			nokautConnector.downloadCategoriesByParentId(new Long(126));
			EndResult<Category> p = this.categoryRepo.findAll();
			for (Category c : p) {
				nokautConnector.downloadProductsByCategoryId(c, 1);
			}
		    
		   // nokautConnector.downloadMainCategories();
		    
		    //komputery
		   // nokautConnector.downloadCategoriesByParentId( new Long(2) );
		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

}
