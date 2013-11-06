package org.revcommunity.service;

import org.apache.log4j.Logger;
import org.revcommunity.model.Comment;
import org.revcommunity.model.Product;
import org.revcommunity.model.Review;
import org.revcommunity.model.User;
import org.revcommunity.repo.CommentRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.repo.ReviewRepo;
import org.revcommunity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
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
}
