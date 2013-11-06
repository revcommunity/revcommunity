package org.revcommunity.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.Category;
import org.revcommunity.model.CategoryGroup;
import org.revcommunity.model.Product;
import org.revcommunity.nokaut.NokautConnector;
import org.revcommunity.repo.AbstractCategoryRepo;
import org.revcommunity.repo.CategoryGroupRepo;
import org.revcommunity.repo.CategoryRepo;
import org.revcommunity.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( { "classpath*:applicationContext-test.xml" } )
public class APITest
{

    private static final Logger logger = Logger.getLogger( APITest.class );

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private NokautConnector nokautConnctor;
    
    @Autowired
    private CategoryGroupRepo categoryGroupRepo;
    
    @Autowired
    private AbstractCategoryRepo abstractCategoryRepo;
    
    @Autowired
    private ProductRepo productRepo;

    @Test
    @Transactional
    public void testCategoryById() throws Exception
    {
    	
        logger.info("-------------------------------------------------------------------------------------------------");
        logger.info("-------------------------------------------------------------------------------------------------");
        logger.info("-------------------------------------------------------------------------------------------------");
        logger.info("-------------------------------------------------------------------------------------------------");
       //List<AbstractCategory> list =  nokautConnctor.downloadCategoriesByParentId(new Long(126));
       
       
       
//       logger.info("------------------------------------------------------------------------------------------------");
//       EndResult<Category> p = this.categoryRepo.findAll();
//       for ( Category c : p )
//       {
//           logger.info(c);
//       }
       
//       logger.info("------------------------------------------------------------------------------------------------");
//       logger.info("------------------------------------------------------------------------------------------------");
//       EndResult<CategoryGroup> ppp = this.categoryGroupRepo.findAll();
//       for ( AbstractCategory c : ppp )
//       {
//           logger.info(c);
//       }
//       
//       logger.info("------------------------------------------------------------------------------------------------");
//       logger.info("------------------------------------------------------------------------------------------------");
//       logger.info("------------------------------------------------------------------------------------------------");
//       logger.info("------------------------------------------------------------------------------------------------");
//       EndResult<AbstractCategory> pp = this.abstractCategoryRepo.findAll();
//       for ( AbstractCategory c : pp )
//       {
//           logger.info(c);
//       }
       
       
    }
    
    @Test
    @Transactional
    public void testDownloadProductsByCategoryId() throws Exception
    {
       nokautConnctor.downloadCategoriesByParentId(new Long(126));
       
       
       logger.info("------------------------------------------------------------------------------------------------");
       EndResult<Category> p = this.categoryRepo.findAll();
       for ( Category c : p )
       {
           logger.info(c);
           nokautConnctor.downloadProductsByCategoryId(c, 2);
       }
       
       
    }
    
    //@Test
    @Transactional
    public void testMainCategories() throws Exception
    {
    	nokautConnctor.downloadMainCategories();
    }
    
    // @Test
    public void parserTest()
    {
        String s = NokautConnector.parse( "is_leaf" );

        assertEquals( "isLeaf", s );

        s = NokautConnector.parse( "is_leaf_and_leafek" );
        assertEquals( "isLeafAndLeafek", s );

        s = NokautConnector.parse( "is" );
        assertEquals( "is", s );

        s = NokautConnector.parse( "tree_name" );
        assertEquals( "treeName", s );
    }

    // @Test
    public void deleteAllProducts()
    {
        EndResult<Product> p = productRepo.findAll();
        for ( Product product : p )
        {
            productRepo.delete( product );
        }
    }
}