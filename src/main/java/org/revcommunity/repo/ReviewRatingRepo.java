package org.revcommunity.repo;

import java.util.List;

import org.revcommunity.model.Review;
import org.revcommunity.model.ReviewRating;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ReviewRatingRepo extends GraphRepository<ReviewRating> {

    @Query( "START review=node({0}) MATCH review-[?:RATED_BY]->(rating)<-[?:GIVE]-user WHERE user.userName = {1} RETURN rating" )
    public List<ReviewRating> findUserRatings( Review review, String userName );
}
