package org.revcommunity.controller;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.JSONObject;
import org.revcommunity.model.Review;
import org.revcommunity.model.ReviewRating;
import org.revcommunity.model.User;
import org.revcommunity.repo.ReviewRatingRepo;
import org.revcommunity.repo.ReviewRepo;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.service.UserService;
import org.revcommunity.util.Message;
import org.revcommunity.util.RegistrationService;
import org.revcommunity.util.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Kontroler odpowiedzialny za operacje na użytkownikach
 * 
 * @author Paweł Rosolak 20 paź 2013
 */
@Controller
@RequestMapping( "/users" )
public class UserController
{

    private static final Logger log = Logger.getLogger( UserController.class );

    private static String SALT = "cewuiqwzie";

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private Neo4jTemplate tpl;

    @Autowired
    private UserService userService;

    @Autowired
    private RegistrationService registrationService;
    
    @Autowired
    private ReviewRatingRepo ratingRepo;
    
    @Autowired
    private ReviewRepo reviewRepo;
    
    private ShaPasswordEncoder passwordEncoder = new ShaPasswordEncoder( 256 );

    @RequestMapping( method = RequestMethod.POST )
    @ResponseBody
    public ModelAndView save( User user )
    {
        //walidacja danych z formularza
        if(registrationService.validateUser( user ) && !userService.userExist( user )){
            log.debug( user );
            
            userService.createUser( user );
        }else{
            //FIXME co tutaj?
            log.debug( "Dane do rejestracji uzytkownika sa niepoprawne" );
            return null;
        }
        
        
        return new ModelAndView( "redirect:" + "/auth/login.jsp" );
    }

    /**
     * Pobiera wszystkich użytkowników
     * 
     * @return
     * @author Paweł Rosolak 23 paź 2013
     */
    @RequestMapping( method = RequestMethod.GET )
    @ResponseBody
    public EndResult<User> getAll()
    {

        return userRepo.findAll();
    }

    @RequestMapping( value = "me", method = RequestMethod.GET )
    @ResponseBody
    public User getLoggedUser()
    {
        String userName = SessionUtils.getLoggedUserName();
        if ( userName.equals( "anonymousUser" ) )
        {
            User u = new User();
            u.setUserName( userName );
            u.setRoles( new HashSet<String>() );
            return u;
        }
        User u = userRepo.findByUserName( userName );
        return u;
    }

    @RequestMapping( value = "name/{userName}", method = RequestMethod.GET )
    @ResponseBody
    public User getByName( @PathVariable String userName )
    {
        return userRepo.findByUserName( userName );
    }

    @RequestMapping( value = "roles" )
    @ResponseBody
    public boolean hasRole( @RequestParam String role, HttpServletRequest request )
    {
        return request.isUserInRole( role );
    }

    @RequestMapping( value = "clear" )
    public void clearUsers()
        throws JsonParseException, JsonMappingException, IOException
    {
        for ( User u : userRepo.findAll() )
        {
            userRepo.delete( u );
        }
    }

    @RequestMapping( value = "/session", method = RequestMethod.GET )
    @ResponseBody
    public Message session()
    {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        log.debug( "Nazwa uzytkownika : " + username );
        JSONObject j = new JSONObject();
        j.put( "username", username );
        return new Message( j.toString() );
    }

    @RequestMapping( value = "/redirect", method = RequestMethod.GET )
    @ResponseBody
    public ResponseEntity redirectToLoginPage()
    {
        if ( log.isDebugEnabled() )
        {
            log.debug( "Redirect to login page" );
        }

        Message m = new Message();
        m.setSuccess( false );

        return new ResponseEntity( org.springframework.http.HttpStatus.UNAUTHORIZED );
    }
    
    @RequestMapping( value = "rated" )
    @ResponseBody
    public Message isReviewRated( @RequestParam Long reviewId )
        throws JsonParseException, JsonMappingException, IOException
    {
    	boolean result = false;
        String userName = SessionUtils.getLoggedUserName();
        Review r = reviewRepo.findByNodeId(reviewId);
        tpl.fetch(r.getRatings());
        List<ReviewRating> reviewRatings = ratingRepo.findUserRatings(r, userName);
        if(!reviewRatings.isEmpty()){
        	result = true;
        }
        
        Message m = new Message();
        m.setMessage( result );
        return m;
    }
    
    @RequestMapping( value = "best", method = RequestMethod.GET )
    @ResponseBody
    public Page<User> getBestUsers(@RequestParam( required = false ) Integer start, @RequestParam( required = false ) Integer limit)
    {
        PageRequest page = new PageRequest( start, limit, new Sort( new Order( Direction.DESC, "n.rankAsDouble" ) ) );
        Page<User> users = userRepo.findBestUsers( page );
        
        //TODO: zawsze zwraca "lastpage=true". Neo4j nie wspiera PageRequest?
        //TODO: nie działa sortowanie
        
        return users;
    }
}
