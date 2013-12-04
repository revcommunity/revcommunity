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

    @Query( "start n=node:__types__(className='org.revcommunity.model.Product') where ID(n)>0  return n" )
    public Page<Product> find( Pageable pagable );
}
