package org.revcommunity.service;

import org.revcommunity.model.Product;
import org.revcommunity.model.Review;
import org.revcommunity.model.User;
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

    @Transactional
    public void save( Review review )
    {
        validate( review );
        Product p = review.getProduct();
        rr.save( review );
        p.increaseReviewCount();
        pr.save( p );
        User user = review.getAuthor();
        user.addReview( review );
        ur.save( user );
    }

    private void validate( Review review )
    {
        // TODO
    }
}
