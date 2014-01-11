package org.revcommunity.repo;

import java.util.List;
import java.util.Set;

import org.revcommunity.model.Product;
import org.revcommunity.model.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ReviewRepo
    extends GraphRepository<Review>
{

    @Query( "start n=node({0}) match review-[:WRITTEN_FOR]->n return count(review)" )
    public Long countByProductNodeId( Long productId );

    @Query( "start n=node({0}) match review<-[:WROTE]-n return count(review)" )
    public Long countByAuthorId( Long authorId );

    public Set<Review> findByProductNodeId( Long productId );

    public Page<Review> findByProductNodeId( Long productId, Pageable pageable );

    public Set<Review> findByAuthorUserName( String userName );

    public Review findByNodeId( Long nodeId );

    @Query( "start n=node:__types__(className='org.revcommunity.model.Review') where ID(n)>0  return n" )
    public Page<Review> find( Pageable pagable );

    @Query( "start n=node:__types__(className='org.revcommunity.model.Review') where ID(n)>0  return n order by {2} {3} skip {0} limit {1}" )
    public List<Review> find( int start, int limit, String sortProperty, String direction );

    @Query( "start n=node:__types__(className='org.revcommunity.model.Review') where ID(n)>0  return count(n) " )
    public Long getCount();

    /**
     * Zapytanie zwraca recenzje nowsze od podanej daty
     * 
     * @param date podajemy jako paramter long'a z daty przeklształconego do stringa
     * @return
     * @author Tomek Straszewski Dec 16, 2013
     */
    @Query( "START rev=node:__types__(className='org.revcommunity.model.Review') WHERE rev.dateAdded > {0} RETURN rev" )
    List<Review> findNewerThanSpecifiedDate( String date );

    Page<Review> findByAuthorUserName( String userName, Pageable page );
}
