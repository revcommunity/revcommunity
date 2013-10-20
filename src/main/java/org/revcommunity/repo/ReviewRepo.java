package org.revcommunity.repo;

import java.util.List;

import org.revcommunity.model.Review;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ReviewRepo
    extends GraphRepository<Review>
{

    public List<Review> findByProductNodeId( Long productId );
}
