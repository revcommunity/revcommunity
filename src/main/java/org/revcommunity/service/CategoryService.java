package org.revcommunity.service;

import org.apache.log4j.Logger;
import org.revcommunity.model.Category;
import org.revcommunity.model.CategoryFilter;
import org.revcommunity.model.CategoryFilterType;
import org.revcommunity.model.CategoryGroup;
import org.revcommunity.repo.CategoryGroupRepo;
import org.revcommunity.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryService
{
    private static final Logger log = Logger.getLogger( CategoryService.class );

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

    private void create()
    {
        CategoryGroup cg1 = new CategoryGroup();
        cg1.setName( "Elektronika" );
        cg1.addCategoryFilter( new CategoryFilter( "Gwarancja", CategoryFilterType.INTEGER ) );
        tpl.save( cg1 );
        log.debug( cg1 );

        CategoryGroup cg2 = new CategoryGroup();
        cg2.setName( "Laptopy" );
        cg2.addCategoryFilter( new CategoryFilter( "PamirAM", CategoryFilterType.INTEGER ) );
        cg2.setParent( cg1 );
        tpl.save( cg2 );
        log.debug( cg2 );

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

    }

    private void clean()
    {
        cr.deleteAll();
        cgr.deleteAll();
        log.debug( "Usunietao wszystkie kategorie" );
    }
}
