package org.revcommunity.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.revcommunity.model.Comment;
import org.revcommunity.model.KeyValuePair;
import org.revcommunity.model.Product;
import org.revcommunity.model.Review;
import org.revcommunity.model.ReviewRating;
import org.revcommunity.model.User;
import org.revcommunity.model.subscription.ProductNotificationType;
import org.revcommunity.model.subscription.UserNotificationType;
import org.revcommunity.repo.CommentRepo;
import org.revcommunity.repo.KeyValuePairRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.repo.ReviewRepo;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.search.CypherQueryBuilder;
import org.revcommunity.service.ReviewService;
import org.revcommunity.service.SubscriptionService;
import org.revcommunity.util.SessionUtils;
import org.revcommunity.util.search.Sorter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ReviewServiceImpl
    implements ReviewService
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

    @Autowired
    private KeyValuePairRepo keyValuePairRepo;

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
        review.calculateUsefulness( getAvgUsefulness() );
        User u = ur.findByUserName( SessionUtils.getLoggedUserName() );
        u.addRating( rating );
        ur.save( u );       
        rr.save( review );
     
        User reviewAuthor = tpl.fetch( review.getAuthor() );
        reviewAuthor.calculateRank();
        ur.save( reviewAuthor );
    }

    public Double getAvgUsefulness()
    {
        KeyValuePair kvp = keyValuePairRepo.findOneByKey( "avgUsefulness" );
        return (Double) kvp.getValue();
    }

    private static final Logger log = Logger.getLogger( ReviewServiceImpl.class );

    public Page<Review> find( Integer start, Integer limit, List<Sorter> sorters )
    {
        log.debug( "Rozpoczynam generowanie zapytania" );
        Map<String, Object> params = new HashMap<String, Object>();
        StringBuilder sb = new StringBuilder();
        sb.append( StringUtils.join( "start n=node:__types__(className='org.revcommunity.model.Review') " ) );
        sb.append( "  where ID(n)>0 " );
        String countQuery = sb.toString() + " return count(distinct n) ";
        sb.append( " return distinct n " );
        CypherQueryBuilder.buildSort( sb, sorters, "n." );
        CypherQueryBuilder.buildPaging( sb, params, start, limit );
        String cypherQuery = sb.toString();
        log.debug( "Wygenerowane zapytanie: " + cypherQuery );
        Page<Review> result = tpl.query( cypherQuery, params ).to( Review.class ).as( Page.class );
        Long count = tpl.query( countQuery, params ).to( Long.class ).single();
        log.debug( "totalElements: " + count );
        result = new PageImpl<Review>( result.getContent(), null, count );
        return result;
    }

    public Page<Review> findByProductNodeId( Long productId, PageRequest page )
    {
        Page<Review> reviews = rr.findByProductNodeId( productId, page );
        Long count = rr.countByProductNodeId( productId );
        reviews = new PageImpl<Review>( reviews.getContent(), page, count );
        return reviews;
    }

    public Page<Review> findByAuthorUserName( String userName, PageRequest page )
    {
        Page<Review> reviews = rr.findByAuthorUserName( userName, page );
        User u = ur.findByUserName( userName );
        Long count = rr.countByAuthorId( u.getNodeId() );
        reviews = new PageImpl<Review>( reviews.getContent(), page, count );
        return reviews;
    }
    
    public void delete( Long nodeId )
    {
        rr.delete( nodeId );
    }
}
