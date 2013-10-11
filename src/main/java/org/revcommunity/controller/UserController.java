package org.revcommunity.controller;

import org.apache.log4j.Logger;
import org.revcommunity.authentication.UsernameAlreadyExistsException;
import org.revcommunity.model.User;
import org.revcommunity.repo.UserRepository;
import org.revcommunity.util.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping( "/user" )
public class UserController
{

    private static final Logger log = Logger.getLogger( UserController.class );

    private static String SALT = "cewuiqwzie";

    private ShaPasswordEncoder passwordEncoder = new ShaPasswordEncoder( 256 );

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping( value = "/add", method = RequestMethod.POST )
    // TODO musimy zwracac jakis status (0-OK, 1-Juz istnieje, 2-Blad serwera ? )
    public void addUser( @RequestParam User user )
    {
        /*
         * Zakldam że login oraz haslo to pola wymagane (walidacja na poziomie interfejsu)
         */
        String password_encoded = passwordEncoder.encodePassword( user.getPassword(), SALT );

        user.setPassword( password_encoded );
        user.addAuthority( "ROLE_USER" );

        try
        {
            this.authenticationService.addUser( user );
        }
        catch ( UsernameAlreadyExistsException e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void removeUser( @RequestParam String username )
    {

        this.authenticationService.removeUser( username );
    }

}
