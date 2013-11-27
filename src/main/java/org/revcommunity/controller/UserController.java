package org.revcommunity.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.JSONObject;
import org.revcommunity.model.User;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.service.UserService;
import org.revcommunity.util.Message;
import org.revcommunity.util.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
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
    private UserService userService;

    private ShaPasswordEncoder passwordEncoder = new ShaPasswordEncoder( 256 );

    @RequestMapping( method = RequestMethod.POST )
    @ResponseBody
    public ModelAndView save( User user )
    {
        log.debug( user );
        /*
         * Zakldam że login oraz haslo to pola wymagane (walidacja na poziomie interfejsu)
         */
        userService.createUser( user );
        // return new Message();
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
    public Message session()    {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        log.debug( "Nazwa uzytkownika : " + username );
        JSONObject j = new JSONObject();
        j.put( "username", username );
        return new Message( j.toString() );
    }
    @RequestMapping(value="/redirect", method = RequestMethod.GET )
    @ResponseBody
    public ResponseEntity  redirectToLoginPage()
    {
        if(log.isDebugEnabled()){
            log.debug( "Redirect to login page" );
        }
        
        Message m = new Message();
        m.setSuccess( false );
        
        return new ResponseEntity(org.springframework.http.HttpStatus.UNAUTHORIZED);
    }
}
