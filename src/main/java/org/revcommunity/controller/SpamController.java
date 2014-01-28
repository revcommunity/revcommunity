package org.revcommunity.controller;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.revcommunity.model.Comment;
import org.revcommunity.repo.CommentRepo;
import org.revcommunity.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * Kontroler odpowiedzialny za obsluge spamu
 *
 * @author Tomek Straszewski Jan 28, 2014
 */
@Controller
@RequestMapping( "/spam" )
public class SpamController
{
    /**
     * Zrobiłem osobną klase ponieważ prościej będzie to obsłużyć w spring security
     */
    private static final Logger logger = Logger.getLogger( SpamController.class );
    
    @Autowired
    private CommentRepo cr;
    
    @RequestMapping( method = RequestMethod.POST, params = { "id" } )
    @ResponseBody
    public Message submitSpam(@RequestParam( value = "id" ) Long commentId )
        throws JsonParseException, JsonMappingException, IOException
    {
        Comment c = cr.findOne(commentId);
        c.addSpamNotification();
        cr.save(c);
        logger.debug( "Zgłoszono spam dla komentarza: " + commentId);
        return new Message();
    }

    @RequestMapping( method = RequestMethod.GET )
    @ResponseBody
    public List<Comment> getCommentsMarkedAsSpam()
    {
        List<Comment> spam = cr.findCommentMarkedAsSpam();
        if(logger.isDebugEnabled()){
            logger.debug( "SPAM:" );
            logger.debug( spam );
        }
        return spam;
    }
    
    /**
     * 
     * Kontroler usuwa komanetarz, ktory zostal oznaczony jako spam
     *
     * @param commentId identyfikator komentarza
     * @author Tomek Straszewski Jan 28, 2014
     */
    @RequestMapping( value = "/delete/{commentId}", method = RequestMethod.DELETE )
    @ResponseBody
    @Transactional
    public Message deleteSpam( @PathVariable Long commentId )
    {
        if(logger.isDebugEnabled()){
            logger.debug( "Usuwam komentarz: "  + commentId);
        }
        if(commentId != null){
            Comment c  = cr.findOne( commentId );
            
            if(c != null)
                cr.delete( c );
        }
        return new Message();
    }
    
    /**
     * 
     * Kontroler usuwa komantarz z listy spamu
     *
     * @param commentId identyfikator komentarza
     * @author Tomek Straszewski Jan 28, 2014
     */
    @RequestMapping(value = "/unspam", method = RequestMethod.POST, params = { "id" })
    @ResponseBody
    public Message Unspam( @RequestParam( value = "id" ) Long commentId )
    {
        if(logger.isDebugEnabled()){
            logger.debug( "Odznaczam spam: "  + commentId);
        }
        if(commentId != null){
            Comment c = cr.findOne( commentId );
            if(c!= null){
                c.setSpamCount( new Integer(0) );
                cr.save( c );
            }
        }
        return new Message();
    }
}
