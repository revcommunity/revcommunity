package org.revcommunity.service;

import java.util.List;

import org.revcommunity.model.Comment;
import org.revcommunity.model.Review;
import org.revcommunity.model.ReviewRating;
import org.revcommunity.util.search.Sorter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface ReviewService
{

    public void createReview( Review review );

    public void updateReview( Review review );

    public void addComment( Review review, Comment comment );

    public Review getReview( Long reviewId );

    public void addReviewRating( Review review, ReviewRating rating );

    public Double getAvgUsefulness();

    public Page<Review> find( Integer start, Integer limit, List<Sorter> sorters );

    public Page<Review> findByProductNodeId( Long productId, PageRequest page );

    public Page<Review> findByAuthorUserName( String userName, PageRequest page );
    
    public void delete( Long nodeId );
    
    public void calculateUsefulnessForAll();
}
