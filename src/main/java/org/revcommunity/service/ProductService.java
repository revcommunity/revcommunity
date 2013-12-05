package org.revcommunity.service;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.Product;
import org.revcommunity.model.User;
import org.revcommunity.model.subscription.ProductChannel;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.repo.subscription.ProductChannelRepo;
import org.revcommunity.util.SessionUtils;
import org.revcommunity.util.search.Sorter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.neo4j.fieldaccess.DynamicProperties;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        product.buildProperites();
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
        product.buildProperites();
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
        p.buildKeys();
        AbstractCategory c = p.getCategory();
        while ( c != null )
        {
            tpl.fetch( c.getParent() );
            c = c.getParent();
        }
        return p;
    }

    public Page<Product> find( Pageable pagable )
    {
        Page<Product> prods = pr.find( pagable );
        for ( Product product : prods )
        {
            product.buildKeys();
        }
        return prods;

    }

    public List<Product> findByCategory( AbstractCategory c )
    {
        List<Product> prods = pr.findByCategory( c );
        for ( Product product : prods )
        {
            product.buildKeys();
        }
        return prods;
    }
}
