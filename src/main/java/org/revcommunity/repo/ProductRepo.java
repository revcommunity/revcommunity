package org.revcommunity.repo;

import java.util.List;

import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ProductRepo
    extends GraphRepository<Product>
{
    public Product findByRemoteId( Long nokautId );

    @Query( "START cat=node({0}) MATCH cat-[?:CONTAINS*]->leaf<-[?:BELONGS_TO]-prods-[?:BELONGS_TO]->cat where prods IS NOT NULL RETURN distinct prods" )
    public List<Product> findByCategory( AbstractCategory cat );

    @Query( "start  n=node:__types__(className='Product') return n " )
    public Page<Product> find( Pageable pagable );

    public Page<Product> findAllByDescriptionLike( String query, Pageable pagable );
    
    /**
     * 
     * Zapytanie zwraca produkty nowsze od podanej daty
     *
     * @param date podajemy jako paramter long'a z daty przeklształconego do stringa
     * @return
     * @author Tomek Straszewski Dec 16, 2013
     */
    @Query("START product=node:__types__(className='Product') WHERE product.dateAdded > {0} RETURN product") 
    List<Product> findNewerThanSpecifiedDate(String date);

}
