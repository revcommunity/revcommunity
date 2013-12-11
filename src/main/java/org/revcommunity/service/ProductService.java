package org.revcommunity.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.FilterValue;
import org.revcommunity.model.Product;
import org.revcommunity.model.User;
import org.revcommunity.model.subscription.ProductChannel;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.repo.subscription.ProductChannelRepo;
import org.revcommunity.search.CypherQueryBuilder;
import org.revcommunity.util.SessionUtils;
import org.revcommunity.util.search.Sorter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sun.swing.StringUIClientPropertyKey;

@Service
@Transactional
public class ProductService
{
    @Autowired
    private ProductRepo pr;

    @Autowired
    private ProductChannelRepo pcr;

    @Autowired
    private UserRepo ur;

    @Autowired
    private Neo4jTemplate tpl;

    private static final Logger log = Logger.getLogger( ProductService.class );

    /**
     * Tworzy obiekt produktu.
     * 
     * @param product Definicja produktu
     * @return Utworzony produkt
     * @author Paweł Rosolak 4 gru 2013
     */
    public Product createProduct( Product product )
    {
        product.setDateAdded( new Date() );
        pr.save( product );
        ProductChannel pc = new ProductChannel();
        pc.setChannelProduct( product );
        pcr.save( pc );
        return product;
    }

    /**
     * Edytuje produkt
     * 
     * @param product Definicja produktu
     * @author Paweł Rosolak 4 gru 2013
     */
    public void updateProduct( Product product )
    {
        String userName = SessionUtils.getLoggedUserName();
        User modificationUser = ur.findByUserName( userName );
        product.setLastEditUser( modificationUser );
        product.setLastModification( new Date() );
        pr.save( product );
    }

    /**
     * Pobiera produkt po id. Odpowiednio konwertuje mapę keys z DynamicProperties. Dołącza drzewo kategorii dla
     * produktu.
     * 
     * @param nodeId Id produktu
     * @return Obiekt produktu
     * @author Paweł Rosolak 4 gru 2013
     */
    public Product getProduct( Long nodeId )
    {
        Product p = pr.findOne( nodeId );
        AbstractCategory c = p.getCategory();
        while ( c != null )
        {
            tpl.fetch( c.getParent() );
            c = c.getParent();
        }
        return p;
    }

    public Page<Product> findNewest( Pageable pagable )
    {
        String q = "start n=node:__types__(className='Product') return n order by n.dateAdded desc ";
        Map<String, Object> params = new HashMap<String, Object>();
        Page<Product> res = tpl.query( q, params ).to( Product.class ).as( Page.class );
        return res;

    }

    public Page<Product> findAllByDescription( String query, Pageable pagable )
    {
        Page<Product> prods = pr.findAllByDescriptionLike( query, pagable );
        return prods;
    }

    public List<Product> findByCategory( AbstractCategory c )
    {
        List<Product> prods = pr.findByCategory( c );
        return prods;
    }

    @SuppressWarnings( "unchecked" )
    public Page<Product> findByFilters( Long categoryId, String query, List<FilterValue> filters, List<Sorter> sorters, Integer start, Integer limit )
    {
        log.debug( "Rozpoczynam generowanie zapytania" );
        log.debug( "categoryId: " + categoryId );
        Map<String, Object> params = new HashMap<String, Object>();
        StringBuilder sb = new StringBuilder();
        String catIdParam = "*";
        if ( categoryId != null )
        {
            catIdParam = "{categoryId}";
            params.put( "categoryId", categoryId );
        }
        sb.append( StringUtils.join( "start category=node(", catIdParam, ") " ) );
        sb.append( " match category-[?:CONTAINS*]->leafCategory<-[?:BELONGS_TO]-product-[?:BELONGS_TO]->category " );
        if ( filters != null && !filters.isEmpty() )
        {
            sb.append( ", product-[?:HAS_FILTERS]-filter " );
            sb.append( " where product IS NOT NULL and " );
            CypherQueryBuilder.buildCategoryFilters( sb, filters, params );
        }
        else
        {
            sb.append( " where product IS NOT NULL " );
        }
        if ( StringUtils.isNotBlank( query ) )
        {
            sb.append( " and ( product.description?=~ {query}  or product.name?=~ {query} ) " );
            params.put( "query", "(?i).*" + query + ".*" );
        }
        sb.append( " return distinct product " );
        CypherQueryBuilder.buildSort( sb, sorters );
        CypherQueryBuilder.buildPaging( sb, params, start, limit );
        String cypherQuery = sb.toString();
        log.debug( "Wygenerowane zapytanie: " + cypherQuery );

        if ( categoryId != null )
            params.put( "categoryId", categoryId );
        else
            params.put( "categoryId", "*" );

        Page<Product> result = tpl.query( cypherQuery, params ).to( Product.class ).as( Page.class );
        return result;

    }

    public void delete( Long productId )
    {
        pr.delete( productId );
    }
}
