package org.revcommunity.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.revcommunity.model.Comment;
import org.revcommunity.model.FilterValue;
import org.revcommunity.model.Product;
import org.revcommunity.model.Review;
import org.revcommunity.repo.CategoryRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.repo.ReviewRepo;
import org.revcommunity.service.CategoryService;
import org.revcommunity.service.ProductService;
import org.revcommunity.util.TestHelper;
import org.revcommunity.util.search.SortDirection;
import org.revcommunity.util.search.Sorter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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

    @Test
    @Transactional
    @Rollback
    public void find()
    {
        th.createProducts();
        log.debug( "all-------------" );
        for ( Product p : pr.findAll() )
        {
            log.debug( p.getName() );
        }
        log.debug( "finded-------------" );
        PageRequest req = new PageRequest( 0, 2, new Sort( Direction.ASC, "product.description" ) );
        for ( Product p : ps.findAllByDescription( "*DELL*", req ) )
        {
            log.debug( p.getName() );
        }
        log.debug( "END" );
    }

    @Test
    @Transactional
    @Rollback
    public void findProperties()
    {
        th.createProducts();
        log.debug( "all-------------" );
        for ( Product p : pr.findAll() )
        {
            p.buildKeys();
            log.debug( p.getName() + " props: " + printKeys( p.getKeys() ) );
        }
        log.debug( "finded-------------" );
        // PageRequest req = new PageRequest( 0, 2, new Sort( Direction.ASC, "product.description" ) );
        for ( Product p : pr.findAllByPropertyValue( "properties-xxx", 1 ) )
        {
            log.debug( p.getName() );
        }
        log.debug( "END" );
    }

    private String printKeys( Map<String, Object> keys )
    {
        StringBuilder sb = new StringBuilder();
        for ( String key : keys.keySet() )
        {
            sb.append( key );
            sb.append( " = " );
            sb.append( keys.get( key ) );
            sb.append( " || " );
        }
        return sb.toString();
    }

    @Test
    @Transactional
    @Rollback
    public void saveProperties()
    {
        Long id = cr.findByName( "HP" ).getNodeId();
        Product p = new Product();
        p.setCategory( cr.findByName( "HP" ) );
        p.setDescription( "dasd" );
        p.addImage( "img/hp1.jpg" );
        p.setName( "HP h300" );
        p.setPriceAvg( 3000.0 );
        p.setProducer( "HP" );
        p.setProductCode( "000L300" );
        Set<FilterValue> filters = new HashSet<FilterValue>();
        FilterValue fv = new FilterValue();
        fv.setSymbol( "p1" );
        fv.setValue( 1 );
        filters.add( fv );
        p.setFilters( filters );
        pr.save( p );
        Product pp = pr.findOne( p.getNodeId() );
        log.debug( pp );
        String q =
            "start c=node({catId}) match c<-[:BELONGS_TO]-n-[:HAS_FILTERS]-f where ( f.symbol={symbol_x} and f.value={value} ) return n order by n.dateAdded? desc ";

        Map<String, Object> params = new HashMap<String, Object>();
        params.put( "symbol_x", "p1" );
        params.put( "value", 1 );
        params.put( "catId", 4915 );
        EndResult<Product> res = tpl.query( q, params ).to( Product.class );
        log.debug( "wypisuje" );
        for ( Product map : res )
        {
            log.debug( map );
        }
        log.debug( "KONIEC" );

    }

    @Test
    @Transactional
    @Rollback
    public void saveProperties2()
    {
        Long id = cr.findByName( "HP" ).getNodeId();
        Product p = new Product();
        p.setCategory( cr.findByName( "HP" ) );
        p.setDescription( "dasd" );
        p.addImage( "img/hp1.jpg" );
        p.setName( "HP h300" );
        p.setPriceAvg( 3000.0 );
        p.setProducer( "HP" );
        p.setProductCode( "000L300" );
        Set<FilterValue> filters = new HashSet<FilterValue>();
        FilterValue fv = new FilterValue();
        fv.setSymbol( "p1" );
        fv.setValue( 1 );
        filters.add( fv );
        p.setFilters( filters );
        pr.save( p );
        Product pp = pr.findOne( p.getNodeId() );
        log.debug( pp );

        Long cId = 4915L;
        List<Sorter> sorters = new ArrayList<Sorter>();
        Sorter ss = new Sorter();
        ss.setDirection( SortDirection.ASC );
        ss.setProperty( "dateAdded" );
        sorters.add( ss );
        Page<Product> res = ps.findByFilters( cId, filters, sorters, 0, 10 );
        log.debug( "wypisuje" );
        for ( Product map : res )
        {
            log.debug( map );
        }
        log.debug( "KONIEC" );

    }
}
