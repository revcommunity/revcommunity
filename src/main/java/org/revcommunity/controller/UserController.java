package org.revcommunity.controller;

import java.io.IOException;
import java.util.Set;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.revcommunity.model.Review;
import org.revcommunity.model.User;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    private ShaPasswordEncoder passwordEncoder = new ShaPasswordEncoder( 256 );

    @ResponseBody
    @RequestMapping( method = RequestMethod.POST )
    public Message save( @RequestBody User user )
    {
        /*
         * Zakldam że login oraz haslo to pola wymagane (walidacja na poziomie interfejsu)
         */
        String password_encoded = passwordEncoder.encodePassword( user.getPassword(), SALT );

        user.setPassword( password_encoded );
        user.addRole( "ROLE_USER" );
        userRepo.save( user );
        return new Message();
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

    @RequestMapping( value = "clear" )
    public void clearUsers()
        throws JsonParseException, JsonMappingException, IOException
    {
        for ( User u : userRepo.findAll() )
        {
            userRepo.delete( u );
        }
    }

}
