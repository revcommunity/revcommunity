package org.revcommunity.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.Category;
import org.revcommunity.model.CategoryFilter;
import org.revcommunity.model.CategoryFilterType;
import org.revcommunity.model.CategoryGroup;
import org.revcommunity.model.Product;
import org.revcommunity.repo.AbstractCategoryRepo;
import org.revcommunity.repo.CategoryGroupRepo;
import org.revcommunity.repo.CategoryRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.service.CategoryService;
import org.revcommunity.service.ProductService;
import org.revcommunity.util.TestHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( { "classpath*:applicationContext-test.xml" } )
public class CategoryTest
{

    private static final Logger log = Logger.getLogger( CategoryTest.class );

    @Autowired
    private Neo4jTemplate tpl;

    @Autowired
    private CategoryRepo cr;

    @Autowired
    private CategoryService cs;

    @Autowired
    private CategoryGroupRepo cgr;

    @Autowired
    private AbstractCategoryRepo acr;

    @Autowired
    private TestHelper th;

    @Autowired
    private ProductRepo pr;

    @Autowired
    private ProductService ps;

    @Test
    @Transactional
    public void test()
        throws Exception
    {
        cr.deleteAll();
        cgr.deleteAll();
        CategoryGroup cg1 = new CategoryGroup();
        cg1.setName( "Elektronika" );

        Set<CategoryFilter> scf1 = new HashSet<CategoryFilter>();
        CategoryFilter cf1 = new CategoryFilter();
        cf1.setName( "Prcesor" );
        cf1.setType( CategoryFilterType.INTEGER );
        scf1.add( cf1 );
        cg1.setFilters( scf1 );

        tpl.save( cg1 );
        log.debug( cg1 );

        CategoryGroup cg2 = new CategoryGroup();
        cg2.setName( "Laptopy" );
        Set<CategoryFilter> scf = new HashSet<CategoryFilter>();
        CategoryFilter cf = new CategoryFilter();
        cf.setName( "Pamięć RAM" );
        cf.setType( CategoryFilterType.INTEGER );
        scf.add( cf );
        cg2.setFilters( scf );
        cg2.setParent( cg1 );
        tpl.save( cg2 );
        log.debug( cg2 );

        cg2 = cgr.findOne( cg2.getNodeId() );
        tpl.fetch( cg2.getFilters() );
        log.debug( cg2.getFilters() );

        Category c1 = new Category();
        c1.setName( "Dell" );
        c1.setParent( cg2 );
        tpl.save( c1 );
        log.debug( c1 );

        Category c2 = new Category();
        c2.setName( "HP" );
        c2.setParent( cg2 );
        tpl.save( c2 );
        log.debug( c2 );

        log.debug( "*****************Categories**********8" );
        EndResult<Category> cats = cr.findAll();
        for ( Category category : cats )
        {
            tpl.fetch( category.getParent() );
            if ( category.getParent() != null )
                log.debug( category.getName() + ": " + category.getParent().getName() );
        }

        log.debug( "*****************CategoryGroups**********8" );
        EndResult<CategoryGroup> cgs = cgr.findAll();
        for ( CategoryGroup cg : cgs )
        {
            StringBuilder sb = new StringBuilder( cg.getName() );
            sb.append( ": " );
            tpl.fetch( cg.getChildren() );
            for ( AbstractCategory ac : cg.getChildren() )
            {
                sb.append( ac.getName() );
                sb.append( " || " );
            }
            log.debug( sb );
        }

        log.debug( "****************BaseCategories**********" );
        try
        {
            List<AbstractCategory> list = cgr.findByBaseCategory( true );
            for ( AbstractCategory cg : list )
            {
                log.debug( cg.getName() );
                CategoryGroup cc = new CategoryGroup();
                cc.setNodeId( cg.getNodeId() );
                Iterable<AbstractCategory> l = cgr.getChildren( cc );
                log.debug( "childs:" );
                for ( AbstractCategory categoryGroup : l )
                {
                    log.debug( categoryGroup.getName() );
                    log.debug( "childs:" );
                    Iterable<AbstractCategory> lll = cgr.getChildren( categoryGroup );
                    for ( AbstractCategory cgg : lll )
                    {
                        log.debug( cgg.getName() );
                    }
                }
            }
        }
        catch ( Exception e )
        {
            log.error( e, e );
            throw e;
        }
        log.debug( "*********FILTERA*************" );
        List<CategoryFilter> filters = cr.getFilters( c1 );
        for ( CategoryFilter f : filters )
        {
            log.debug( f.getName() );
        }
    }

    @Test
    @Transactional
    public void getProductsFromCategory()
    {
        cs.createCategories();
        th.createProducts();
        AbstractCategory cg = acr.findByName( "Elektronika" );
        List<Product> prods = pr.findByCategory( cg );
        log.debug( "wypisuje produkty" );
        for ( Product product : prods )
        {
            log.debug( product );
        }
        log.debug( "ok" );
    }

    @Test
    @Transactional
    public void getCategoryFilters()
    {
        cs.createCategories();
        th.createProducts();
        AbstractCategory cg = acr.findByName( "HP" );
        List<CategoryFilter> filters = cr.getFilters( cg );
        log.debug( "wupisuje" );
        for ( CategoryFilter f : filters )
        {
            log.debug( f.getName() );
        }
        log.debug( "ok" );
    }
}
