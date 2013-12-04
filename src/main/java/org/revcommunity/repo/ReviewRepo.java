package org.revcommunity.repo;

import java.util.Set;

import org.revcommunity.model.Review;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ReviewRepo
    extends GraphRepository<Review>
{

    public Set<Review> findByProductNodeId( Long productId );

    public Set<Review> findByAuthorUserName( String userName );

    public Review findByNodeId( Long nodeId );
}
