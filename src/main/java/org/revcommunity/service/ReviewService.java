package org.revcommunity.service;

import java.util.Date;

import org.revcommunity.model.Comment;
import org.revcommunity.model.Product;
import org.revcommunity.model.Review;
import org.revcommunity.model.ReviewRating;
import org.revcommunity.model.User;
import org.revcommunity.model.subscription.ProductNotificationType;
import org.revcommunity.model.subscription.UserNotificationType;
import org.revcommunity.repo.CommentRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.repo.ReviewRepo;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.util.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ReviewService
{
    @Autowired
    private Neo4jTemplate tpl;
    
    @Autowired
    private ReviewRepo rr;

    @Autowired
    private ProductRepo pr;

    @Autowired
    private UserRepo ur;

    @Autowired
    private CommentRepo cr;

    @Autowired
    private SubscriptionService ss;

    public void createReview( Review review )
    {
        validate( review );
        review.setDateAdded( new Date() );
        rr.save( review );
        Product p = pr.findOne( review.getProduct().getNodeId() );
        p.increaseReviewCount();
        pr.save( p );
        review.setProduct( p );
        ss.createUserChannelNotification( review.getAuthor(), UserNotificationType.NEW_REVIEW, review );
        ss.createProductChannelNotification( p, ProductNotificationType.NEW_REVIEW, review );
    }

    public void updateReview( Review review )
    {
        review.setLastModification( new Date() );
        rr.save( review );
    }

    private void validate( Review review )
    {
        // TODO
    }

    public void addComment( Review review, Comment comment )
    {
        review.addComment( comment );
    }

    public Review getReview( Long reviewId )
    {
        return rr.findOne( reviewId );
    }

    @Transactional
    public void addReviewRating( Review review, ReviewRating rating )
    {
        review.addReviewRating( rating );
        User reviewAuthor = tpl.fetch(review.getAuthor());
        reviewAuthor.calculateRank();
        
        User u = ur.findByUserName( SessionUtils.getLoggedUserName() );
        u.addRating( rating );
        ur.save( u );

    }

}
