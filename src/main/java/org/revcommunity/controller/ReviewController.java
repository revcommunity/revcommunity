package org.revcommunity.controller;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.revcommunity.model.Comment;
import org.revcommunity.model.Review;
import org.revcommunity.model.ReviewRating;
import org.revcommunity.model.User;
import org.revcommunity.repo.ReviewRepo;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.service.ReviewService;
import org.revcommunity.util.ControllerUtils;
import org.revcommunity.util.Message;
import org.revcommunity.util.SessionUtils;
import org.revcommunity.util.search.SortDirection;
import org.revcommunity.util.search.Sorter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
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
        if ( r != null )
        {
            tpl.fetch( r.getAuthor() );
            tpl.fetch( r.getProduct() );
            tpl.fetch( r.getRatings() );
            for ( Comment c : tpl.fetch( r.getComments() ) )
            {
                tpl.fetch( c.getAuthor() );
            }
        }
        return r;
    }

    @RequestMapping( value = "/productReviews/{productId}", method = RequestMethod.GET )
    @ResponseBody
    public Page<Review> getReviewsByProductId( @PathVariable Long productId, @RequestParam( required = false ) Integer start,
                                               @RequestParam( required = false ) Integer limit )
    {
        PageRequest page = new PageRequest( start / limit, limit );
        Page<Review> reviews = rs.findByProductNodeId( productId, page );
        for ( Review r : reviews )
        {
            tpl.fetch( r.getAuthor() );
            tpl.fetch( r.getRatings() );
        }
        return reviews;
    }

    @RequestMapping( value = "/edit", method = RequestMethod.POST )
    @ResponseBody
    public Message saveEdit( @RequestParam String review )
        throws JsonParseException, JsonMappingException, IOException
    {

        ObjectMapper om = new ObjectMapper();
        Review r = om.readValue( review, Review.class );
        Review reviewTemp = rr.findByNodeId( r.getNodeId() );
        reviewTemp.setContent( r.getContent() );
        reviewTemp.setTitle( r.getTitle() );
        reviewTemp.setRank( r.getRank() );
        rs.updateReview( reviewTemp );
        log.debug( "Edytowano recenzje: " + reviewTemp.getNodeId() );
        return new Message();
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
        if ( r.getAuthor() == null )
        {
            User logged = ur.findByUserName( SessionUtils.getLoggedUserName() );
            if ( logged != null )
                r.setAuthor( logged );
        }
        rs.createReview( r );
        log.debug( "Zapisano recenzje: " + r.getNodeId() );
        return new Message();
    }

    @RequestMapping( method = RequestMethod.GET, value = "my/reviews" )
    @ResponseBody
    public Page<Review> getMyReviews( @RequestParam( required = false ) Integer start, @RequestParam( required = false ) Integer limit )
        throws JsonParseException, JsonMappingException, IOException
    {
        return getReviewsForUser( SessionUtils.getLoggedUserName(), start, limit );
    }

    @RequestMapping( method = RequestMethod.GET, value = "/user/{userName}" )
    @ResponseBody
    public Page<Review> getReviewsForUser( @PathVariable String userName, @RequestParam( required = false ) Integer start,
                                           @RequestParam( required = false ) Integer limit )
        throws JsonParseException, JsonMappingException, IOException
    {
        PageRequest page = new PageRequest( start / limit, limit );
        return rs.findByAuthorUserName( userName, page );
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

        log.debug( "Dodano ReviewRating: " + reviewRating.getNodeId() + " do recenzji:" + review.getNodeId() );
        return new Message( review.getUsefulness() );
    }

    @RequestMapping( value = "find", method = RequestMethod.GET )
    @ResponseBody
    public Page<Review> find( @RequestParam( value = "sort", required = false ) String sSorters, @RequestParam( required = false ) Integer start,
                              @RequestParam( required = false ) Integer limit )
    {
        List<Sorter> sorters = ControllerUtils.readSorters( sSorters );

        if ( sorters.isEmpty() )
            sorters.add( new Sorter( SortDirection.DESC, "n.dateAdded" ) );
        Page<Review> prods = rs.find( start, limit, sorters );

        for ( Review r : prods )
        {
            tpl.fetch( r.getAuthor() );
        }
        return prods;
    }

    @RequestMapping( value = "countReviewRatings/{reviewId}", method = RequestMethod.GET )
    @ResponseBody
    public Integer countReviewRatings( @PathVariable Long reviewId )
    {
        Review r = rr.findByNodeId( reviewId );
        return r.getRatings().size();
    }

    private Sort buildSort( List<Sorter> sorters )
    {
        if ( sorters.isEmpty() )
            return new Sort( new Order( Direction.DESC, "n.dateAdded" ) );
        else
        {
            return new Sort( new Order( convertDirection( sorters.get( 0 ).getDirection() ), "n." + sorters.get( 0 ).getProperty() ) );
        }
    }

    private Direction convertDirection( SortDirection direction )
    {
        if ( direction == SortDirection.ASC )
            return Direction.ASC;
        else
            return Direction.DESC;
    }

    @RequestMapping( method = RequestMethod.DELETE, value = "{reviewId}" )
    @ResponseBody
    public Message delete( @PathVariable Long reviewId )
    {
        rs.delete( reviewId );
        return new Message();
    }
}
