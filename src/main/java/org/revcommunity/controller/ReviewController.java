package org.revcommunity.controller;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.revcommunity.model.Comment;
import org.revcommunity.model.Review;
import org.revcommunity.model.ReviewRating;
import org.revcommunity.repo.ReviewRepo;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.service.ReviewService;
import org.revcommunity.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( "/reviews" )
public class ReviewController
{

    private static final Logger log = Logger.getLogger( ReviewController.class );

    @Autowired
    private ServletContext servletContext;

    @Autowired
    private Neo4jTemplate tpl;

    @Autowired
    private UserRepo ur;

    @Autowired
    private ReviewRepo rr;

    @Autowired
    private ReviewService rs;

    @RequestMapping( method = RequestMethod.GET )
    @ResponseBody
    public EndResult<Review> getAll()
    {
        return rr.findAll();
    }

    @RequestMapping( value = "/{id}", method = RequestMethod.GET )
    @ResponseBody
    public Review get( @PathVariable Long id )
    {
        Review r = rr.findOne( id );
        tpl.fetch( r.getAuthor() );
        tpl.fetch( r.getProduct() );
        tpl.fetch( r.getRatings() );
        for ( Comment c : tpl.fetch( r.getComments() ) )
        {
            tpl.fetch( c.getAuthor() );
        }
        return r;
    }

    @RequestMapping( value = "/productReviews/{productId}", method = RequestMethod.GET )
    @ResponseBody
    public Set<Review> getReviewsByProductId( @PathVariable Long productId )
    {
        Set<Review> reviews = rr.findByProductNodeId( productId );
        for ( Review r : reviews )
        {
            tpl.fetch( r.getAuthor() );
        }
        return reviews;
    }

    /**
     * @param review
     * @param images
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    @RequestMapping( method = RequestMethod.POST )
    @ResponseBody
    public Message save( @RequestParam String review )
        throws JsonParseException, JsonMappingException, IOException
    {
        ObjectMapper om = new ObjectMapper();
        Review r = om.readValue( review, Review.class );

        rr.save( r );
        log.debug( "Zapisano recenzje: " + r.getNodeId() );
        return new Message();
    }

    @RequestMapping( method = RequestMethod.GET, value = "my" )
    @ResponseBody
    public Set<Review> getMyReviews()
        throws JsonParseException, JsonMappingException, IOException
    {
        // TODO zmienić na uzytkownika zalogowanego
        return getReviewsForUser( "jkowalski" );
    }

    @RequestMapping( method = RequestMethod.GET, value = "/user/{userName}" )
    @ResponseBody
    public Set<Review> getReviewsForUser( @PathVariable String userName )
        throws JsonParseException, JsonMappingException, IOException
    {
        // User u = ur.findByUserName( userName );
        // tpl.fetch( u.getReviews() );
        // return u.getReviews();
        return rr.findByAuthorUserName( userName );
    }

    @RequestMapping( method = RequestMethod.POST, params = { "rating", "reviewNodeId" } )
    @ResponseBody
    public Message saveReviewRating( @RequestParam( value = "rating" ) String rating, @RequestParam( value = "reviewNodeId" ) Long reviewNodeId )
        throws JsonParseException, JsonMappingException, IOException
    {
        ObjectMapper om = new ObjectMapper();
        ReviewRating reviewRating = om.readValue( rating, ReviewRating.class );
        Review review = rr.findOne( new Long( reviewNodeId ) );
        
        tpl.fetch( review.getRatings() );
        
        rs.addReviewRating( review, reviewRating );

        review.recalculateUsefulness();
        
        rr.save( review );

        log.debug( "Dodano ReviewRating: " + reviewRating.getNodeId() + " do recenzji:" + review.getNodeId() );
        return new Message(review.getUsefulness());
    }
}
