package org.revcommunity.service;

import org.revcommunity.model.Comment;
import org.revcommunity.model.Product;
import org.revcommunity.model.Review;
import org.revcommunity.model.ReviewRating;
import org.revcommunity.model.User;
import org.revcommunity.repo.CommentRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.repo.ReviewRepo;
import org.revcommunity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReviewService
{
    @Autowired
    private ReviewRepo rr;

    @Autowired
    private ProductRepo pr;

    @Autowired
    private UserRepo ur;

    @Autowired
    private CommentRepo cr;
    
    @Transactional
    public void save( Review review )
    {
        validate( review );

        Product p = review.getProduct();
        rr.save( review );
        p.increaseReviewCount();
        pr.save( p );
    }

    private void validate( Review review )
    {
        // TODO
    }

    @Transactional
    public void addComment( Review review, Comment comment )
    {
        review.addComment( comment );
    }

    @Transactional
    public void addReviewRating( Review review, ReviewRating rating )
    {
        review.addReviewRating( rating );
        
        //TODO: zamienic na zalogowanego usera
        User u = ur.findByUserName( "jkowalski" );
        u.addRating( rating );
        ur.save( u );
        
    }

}
