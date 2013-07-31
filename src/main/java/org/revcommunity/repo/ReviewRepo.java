package org.revcommunity.repo;

import org.revcommunity.model.Review;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ReviewRepo
    extends GraphRepository<Review>
{

}
