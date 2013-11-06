package org.revcommunity.controller;

import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.revcommunity.model.Comment;
import org.revcommunity.repo.CommentRepo;
import org.revcommunity.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Controller;
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

    @RequestMapping( method = RequestMethod.GET )
    @ResponseBody
    public EndResult<Comment> getAll()
    {
        return cr.findAll();
    }
    
    @RequestMapping( method = RequestMethod.POST )
    @ResponseBody
    public Message save( @RequestParam String comment )
        throws JsonParseException, JsonMappingException, IOException
    {
        ObjectMapper om = new ObjectMapper();
        Comment c = om.readValue( comment, Comment.class );

        cr.save( c );
        log.debug( "Zapisano komentarz: " + c.getNodeId() );
        return new Message();
    }
}
