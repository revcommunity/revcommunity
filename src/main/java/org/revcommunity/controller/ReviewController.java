package org.revcommunity.controller;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.revcommunity.model.Review;
import org.revcommunity.model.User;
import org.revcommunity.repo.ReviewRepo;
import org.revcommunity.repo.UserRepo;
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
        return rr.findOne( id );
    }

    @RequestMapping( value = "/productReviews/{productId}", method = RequestMethod.GET )
    @ResponseBody
    public List<Review> getReviewsByProductId( @PathVariable Long productId )
    {
        return rr.findByProductNodeId( productId );
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
        log.debug( "Zapisano review: " + r.getNodeId() );
        return new Message();
    }

    @RequestMapping( method = RequestMethod.GET, value = "myReviews" )
    @ResponseBody
    public Set<Review> getMyReviews()
        throws JsonParseException, JsonMappingException, IOException
    {
        // TODO zmienić na uzytkownika zalogowanego
        return getReviewsForUser( "test" );
    }

    @RequestMapping( method = RequestMethod.GET, value = "userReviews" )
    @ResponseBody
    public Set<Review> getReviewsForUser( @PathVariable String userName )
        throws JsonParseException, JsonMappingException, IOException
    {
        User u = ur.findByUserName( userName );
        tpl.fetch( u.getReviews() );
        return u.getReviews();
    }

}
