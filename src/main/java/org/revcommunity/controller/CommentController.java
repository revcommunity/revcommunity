package org.revcommunity.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.revcommunity.model.Comment;
import org.revcommunity.model.Review;
import org.revcommunity.repo.CommentRepo;
import org.revcommunity.repo.ReviewRepo;
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
@RequestMapping( "/comments" )
public class CommentController
{

    private static final Logger log = Logger.getLogger( CommentController.class );

    @Autowired
    private ServletContext servletContext;

    @Autowired
    private Neo4jTemplate tpl;

    @Autowired
    private CommentRepo cr;

    @Autowired
    private ReviewRepo rr;

    @Autowired
    private ReviewService rs;

    @RequestMapping( method = RequestMethod.GET )
    @ResponseBody
    public EndResult<Comment> getAll()
    {
        return cr.findAll();
    }

    @RequestMapping( value = "/reviewComments/{reviewNodeId}", method = RequestMethod.GET )
    @ResponseBody
    public Set<Comment> getCommentsByReviewNodeId( @PathVariable Long reviewNodeId )
    {
        Review review = rr.findOne( reviewNodeId );
        Set<Comment> comments = tpl.fetch( review.getComments() );
        for ( Comment c : comments )
        {
            tpl.fetch( c.getAuthor() );
        }
        return comments;
    }

    @RequestMapping( method = RequestMethod.POST, params = { "comment", "reviewNodeId" } )
    @ResponseBody
    public Message save( @RequestParam( value = "comment" ) String comment, @RequestParam( value = "reviewNodeId" ) Long reviewNodeId )
        throws JsonParseException, JsonMappingException, IOException
    {
        ObjectMapper om = new ObjectMapper();
        om.configure( DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false );
        Comment c = om.readValue( comment, Comment.class );
        c.setDateAdded(new Date());

        Review r = rr.findOne( new Long( reviewNodeId ) );

        rs.addComment( r, c );

        rr.save( r );
        log.debug( "Dodano komentarz: " + c.getNodeId() + " do recenzji:" + r.getNodeId() );
        return new Message();
    }
  
}
