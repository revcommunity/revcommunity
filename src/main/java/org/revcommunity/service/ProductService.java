package org.revcommunity.service;

import java.util.List;

import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.FilterValue;
import org.revcommunity.model.Product;
import org.revcommunity.util.search.Sorter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService
{

    /**
     * Tworzy obiekt produktu.
     * 
     * @param product Definicja produktu
     * @return Utworzony produkt
     * @author Paweł Rosolak 4 gru 2013
     */
    public Product createProduct( Product product );

    /**
     * Edytuje produkt
     * 
     * @param product Definicja produktu
     * @author Paweł Rosolak 4 gru 2013
     */
    public void updateProduct( Product product );

    /**
     * Pobiera produkt po id. Odpowiednio konwertuje mapę keys z DynamicProperties. Dołącza drzewo kategorii dla
     * produktu.
     * 
     * @param nodeId Id produktu
     * @return Obiekt produktu
     * @author Paweł Rosolak 4 gru 2013
     */
    public Product getProduct( Long nodeId );

    public Page<Product> findNewest( Pageable pagable );

    public Page<Product> findAllByDescription( String query, Pageable pagable );

    public List<Product> findByCategory( AbstractCategory c );

    @SuppressWarnings( "unchecked" )
    public Page<Product> findByFilters( Long categoryId, String query, List<FilterValue> filters, List<Sorter> sorters, Integer start, Integer limit );

    public void delete( Long productId );
}
