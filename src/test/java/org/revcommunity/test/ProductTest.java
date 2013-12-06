package org.revcommunity.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
import org.revcommunity.repo.CategoryRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.repo.ReviewRepo;
import org.revcommunity.service.CategoryService;
import org.revcommunity.service.ProductService;
import org.revcommunity.util.TestHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.test.annotation.Rollback;
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

    @Autowired
    private TestHelper th;

    @Autowired
    private CategoryService cs;

    @Autowired
    private ProductService ps;

    @Autowired
    private CategoryRepo cr;

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
        p.addFilterValue( "prop1", 221 );
        p = tpl.save( p );

        Product savedProd = ps.getProduct( p.getNodeId() );
        assertEquals( "id equals", p.getNodeId(), savedProd.getNodeId() );
        assertEquals( "images size ok", 2, savedProd.getImages().size() );
        assertEquals( "testName", savedProd.getName() );
        assertEquals( (Integer) 221, (Integer) p.getKeys().get( "prop1" ) );
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
        p.addFilterValue( "xx", 33 );
        p = tpl.save( p );

        Product savedProd = tpl.findOne( p.getNodeId(), Product.class );
        log.debug( savedProd.getKeys().get( "xx" ) );
        ObjectMapper om = new ObjectMapper();
        String s = om.writeValueAsString( savedProd );
        log.debug( s );
    }

    @Autowired
    private ProductRepo pr;

    // @Test
    public void deleteAllProducts()
    {
        EndResult<Product> p = pr.findAll();
        for ( Product product : p )
        {
            pr.delete( product );
        }
    }

    @Test
    public void sort()
    {
        PageRequest page = new PageRequest( 0, 2 );
        Page<Product> pp = pr.find( page );
        log.debug( pp.getSize() );
        for ( Product product : pp )
        {
            log.debug( product );
        }
    }

    @Test
    public void props()
    {
        cs.createCategories();
        th.createProducts();
        EndResult<Product> pp = pr.findAll();
        for ( Product product : pp )
        {
            for ( String s : product.getKeys().keySet() )
            {
                log.debug( s + "= " + product.getKeys().get( s ) );
            }
        }
    }

    @Test
    @Transactional
    @Rollback
    public void cp()
    {
        Product p = new Product();
        p.setCategory( cr.findByName( "HP" ) );
        p.setDescription( "Opi" );
        p.addImage( "img/hp1.jpg" );
        p.setName( "XXX" );
        p.setPriceAvg( 3000.0 );
        p.setProducer( "HP" );
        p.setProductCode( "000L300" );

        Map<String, Object> filterValues = new HashMap<String, Object>();
        filterValues.put( "xxx", 9999 );
        p.setKeys( filterValues );
        ps.createProduct( p );

        Product saved = pr.findOne( p.getNodeId() );
        log.debug( saved );

    }

}
