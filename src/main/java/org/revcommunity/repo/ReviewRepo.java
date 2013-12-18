package org.revcommunity.repo;

import java.util.List;
import java.util.Set;

import org.revcommunity.model.Product;
import org.revcommunity.model.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ReviewRepo
    extends GraphRepository<Review>
{

    public Set<Review> findByProductNodeId( Long productId );

    public Set<Review> findByAuthorUserName( String userName );

    public Review findByNodeId( Long nodeId );

    @Query( "start n=node:__types__(className='org.revcommunity.model.Review') where ID(n)>0  return n" )
    public Page<Review> find( Pageable pagable );

    /**
     * Zapytanie zwraca recenzje nowsze od podanej daty
     * 
     * @param date podajemy jako paramter long'a z daty przeklształconego do stringa
     * @return
     * @author Tomek Straszewski Dec 16, 2013
     */
    @Query( "START rev=node:__types__(className='org.revcommunity.model.Review') WHERE rev.dateAdded > {0} RETURN rev" )
    List<Review> findNewerThanSpecifiedDate( String date );
}
