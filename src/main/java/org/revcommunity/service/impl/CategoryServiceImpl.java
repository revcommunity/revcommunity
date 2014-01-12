package org.revcommunity.service.impl;

import java.util.HashSet;

import org.apache.log4j.Logger;
import org.revcommunity.model.Category;
import org.revcommunity.model.CategoryFilter;
import org.revcommunity.model.CategoryFilterType;
import org.revcommunity.model.CategoryGroup;
import org.revcommunity.repo.CategoryGroupRepo;
import org.revcommunity.repo.CategoryRepo;
import org.revcommunity.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import scala.actors.threadpool.Arrays;

@Service
@Transactional
public class CategoryServiceImpl
    implements CategoryService
{
    private static final Logger log = Logger.getLogger( CategoryServiceImpl.class );

    @Autowired
    private CategoryGroupRepo cgr;

    @Autowired
    private Neo4jTemplate tpl;

    @Autowired
    private CategoryRepo cr;

    @Transactional
    public void createCategories()
    {
        clean();
        create();
    }

    private CategoryFilter buildFilter( String name, String... values )
    {
        CategoryFilter cf = new CategoryFilter( name, CategoryFilterType.LIST );
        cf.setValues( new HashSet<String>( Arrays.asList( values ) ) );
        return cf;
    }

    private void create()
    {
        CategoryGroup cg1 = new CategoryGroup();
        cg1.setName( "Elektronika" );
        cg1.addCategoryFilter( buildFilter( "Producent", "Samsung", "Apple", "HP", "DELL", "TOSHIBA", "BOSH" ) );
        tpl.save( cg1 );
        log.debug( cg1 );

        CategoryGroup cg2 = new CategoryGroup();
        cg2.setName( "Laptopy" );
        cg2.addCategoryFilter( buildFilter( "Producent", "HP", "DELL", "TOSHIBA" ) );
        cg2.setParent( cg1 );
        tpl.save( cg2 );
        log.debug( cg2 );

        Category c1 = new Category();
        c1.setName( "Dell" );
        c1.setParent( cg2 );
        c1.addFilter( buildFilter( "Producent", "DELL" ) );
        c1.addFilter( new CategoryFilter( "Gwarancja", CategoryFilterType.INTEGER ) );
        c1.addFilter( new CategoryFilter( "Pamięć RAM", CategoryFilterType.INTEGER ) );
        tpl.save( c1 );
        log.debug( c1 );

        Category c2 = new Category();
        c2.setName( "HP" );
        c2.setParent( cg2 );
        c2.addFilter( buildFilter( "Producent", "HP" ) );
        c2.addFilter( new CategoryFilter( "Gwarancja", CategoryFilterType.INTEGER ) );
        c2.addFilter( new CategoryFilter( "Pamięć RAM", CategoryFilterType.INTEGER ) );
        tpl.save( c2 );
        log.debug( c2 );

        CategoryGroup tel = new CategoryGroup();
        tel.setName( "Telewizory" );
        tel.addCategoryFilter( new CategoryFilter( "Przekątna", CategoryFilterType.INTEGER ) );
        tel.setParent( cg1 );
        tpl.save( tel );

        CategoryGroup sp = new CategoryGroup();
        sp.setName( "Sport" );
        tpl.save( sp );

        CategoryGroup dom = new CategoryGroup();
        dom.setName( "Dom" );
        tpl.save( dom );

    }

    public void clean()
    {
        cr.deleteAll();
        cgr.deleteAll();
        log.debug( "Usunietao wszystkie kategorie" );
    }

    public void delete( Long categoryId )
    {
        cr.delete( categoryId );
    }
}
