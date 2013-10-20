package org.revcommunity.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.revcommunity.model.Product;
import org.revcommunity.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( { "classpath*:applicationContext-test.xml" } )
public class ProductTest
{

    @Autowired
    private Neo4jTemplate tpl;

    @Test
    @Transactional
    public void test()
    {
        Product p = new Product();
        p.setName( "testName" );
        p.setDescription( "testDesc" );
        p.setImages( Arrays.asList( "img1", "img2" ) );
        p.setProducer( "testProd" );
        p.setProductCode( "testCode" );
        p = tpl.save( p );

        Product savedProd = tpl.findOne( p.getId(), Product.class );
        assertEquals( "id equals", p.getId(), savedProd.getId() );
        assertEquals( "images size ok", 2, savedProd.getImages().size() );
        assertEquals( "testName", savedProd.getName() );
    }

    @Autowired
    private ProductRepo pr;

    @Test
    public void deleteAllProducts()
    {
        EndResult<Product> p = pr.findAll();
        for ( Product product : p )
        {
            pr.delete( product );
        }
    }

}
