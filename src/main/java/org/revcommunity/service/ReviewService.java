package org.revcommunity.service;

import org.revcommunity.model.Product;
import org.revcommunity.model.Review;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.repo.ReviewRepo;
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
}
