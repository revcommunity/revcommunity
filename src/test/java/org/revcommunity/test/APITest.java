package org.revcommunity.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.revcommunity.model.Category;
import org.revcommunity.model.Product;
import org.revcommunity.nokaut.NokautConnector;
import org.revcommunity.repo.CategoryRepo;
import org.revcommunity.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
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
<<<<<<< HEAD
	
	@Autowired
	private NokautConnector nokauConnctor;
	
	@Autowired 
	private ProductRepo productRepo;
	
	@Test
	//@Transactional
	public void test() {
		
		 EndResult<Category> p = categoryRepo.findAll();
	        for ( Category category : p )
	        {
	           categoryRepo.delete( category );
	        }
		
	    deleteAllProducts();
	        
		Category c = nokauConnctor.getCategoryByName("Komputery");
		
		assertEquals(c.getName(), "Komputery");
	
		categoryRepo.save(c);
		
		Long id = c.getId();
		
		List<Category> categories = nokauConnctor.getCategoriesByParentId(""+id.longValue());
		
		assertTrue(categories.size() > 0);

		for (Category category : categories) {
			logger.info(category.toString());
			
			categoryRepo.save(category);
			
			Long cid = category.getId();
			List<Product> products = nokauConnctor.getProductsByCategoryId(""+cid.longValue(), 5);
			
			for (Product product : products) {
				logger.info(product.toString());
				productRepo.save(product);
			}
		}
	}
	
	@Test
	public void getAllProducts(){
		EndResult<Product> p = productRepo.findAll();
        for ( Product product : p )
        {
        	logger.info(product);
        }
	}
	
	//@Test
	public void parserTest(){
		String s = NokautConnector.parse("is_leaf");
		
		assertEquals("isLeaf", s);
		
		s = NokautConnector.parse("is_leaf_and_leafek");
		assertEquals("isLeafAndLeafek", s);
		

		s = NokautConnector.parse("is");
		assertEquals("is", s);
		
		s = NokautConnector.parse("tree_name");
		assertEquals("treeName", s);
	}
	
	//@Test
=======

    @Autowired
    private NokautConnector nokauConnctor;

    @Autowired
    private ProductRepo productRepo;

    @Test
    @Transactional
    public void test()
        throws Exception
    {

        EndResult<Category> p = categoryRepo.findAll();
        for ( Category category : p )
        {
            categoryRepo.delete( category );
        }

        deleteAllProducts();

        Category c = nokauConnctor.getCategoryByName( "Komputery" );

        assertEquals( c.getName(), "Komputery" );

        categoryRepo.save( c );

        Long id = 1L;// c.getId();

        List<Category> categories = nokauConnctor.getCategoriesByParentId( "" + id.longValue() );

        assertTrue( categories.size() > 0 );

        for ( Category category : categories )
        {
            logger.info( category.toString() );

            categoryRepo.save( category );

            Long cid = category.getNodeId();
            List<Product> products = nokauConnctor.getProductsByCategoryId( "" + cid.longValue(), 5 );

            for ( Product product : products )
            {
                logger.info( product.toString() );
                productRepo.save( product );
            }
        }
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
>>>>>>> 6cde5e4732691582146ba7f2f3b8755311007643
    public void deleteAllProducts()
    {
        EndResult<Product> p = productRepo.findAll();
        for ( Product product : p )
        {
            productRepo.delete( product );
        }
    }
}
