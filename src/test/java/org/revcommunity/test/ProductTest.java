package org.revcommunity.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.revcommunity.model.Comment;
import org.revcommunity.model.Product;
import org.revcommunity.model.Review;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.repo.ReviewRepo;
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
    private static final Logger log = Logger.getLogger( ProductTest.class );

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

        Product savedProd = tpl.findOne( p.getNodeId(), Product.class );
        assertEquals( "id equals", p.getNodeId(), savedProd.getNodeId() );
        assertEquals( "images size ok", 2, savedProd.getImages().size() );
        assertEquals( "testName", savedProd.getName() );
    }

    @Autowired
    private ReviewRepo rr;

    @Test
    @Transactional
    public void tea()
    {
        Review r = new Review();
        r.setContent( "SADSD" );
        r.setTitle( "DASDAS" );
        Set<Comment> sc = new HashSet<Comment>();
        Comment c = new Comment();
        c.setText( "DSADSAD" );
        sc.add( c );
        r.setComments( sc );
        tpl.save( r );

        Review saved = rr.findOne( r.getNodeId() );

        tpl.fetch( saved.getComments() );
        log.debug( saved );
    }

    @Test
    @Transactional
    public void test2()
        throws JsonGenerationException, JsonMappingException, IOException
    {
        Product p = new Product();
        p.setName( "testName" );
        p.setDescription( "testDesc" );
        p.setImages( Arrays.asList( "img1", "img2" ) );
        p.setProducer( "testProd" );
        p.setProductCode( "testCode" );
        p.getProperties().setProperty( "xx", 33 );
        p = tpl.save( p );

        Product savedProd = tpl.findOne( p.getNodeId(), Product.class );
        log.debug( savedProd.getProperties().getProperty( "xx" ) );
        ObjectMapper om = new ObjectMapper();
        String s = om.writeValueAsString( savedProd );
        log.debug( s );
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
