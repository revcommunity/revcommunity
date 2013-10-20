package org.revcommunity.controller;

import org.apache.log4j.Logger;
import org.revcommunity.model.User;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Kontroler odpowiedzialny za operacje na użytkownikach
 * 
 * @author Paweł Rosolak 20 paź 2013
 */
@Controller
@RequestMapping( "/user" )
public class UserController
{

    private static final Logger log = Logger.getLogger( UserController.class );

    private static String SALT = "cewuiqwzie";

    @Autowired
    private UserRepo userRepo;

    private ShaPasswordEncoder passwordEncoder = new ShaPasswordEncoder( 256 );

    @RequestMapping( method = RequestMethod.POST )
    public Message save( @RequestParam User user )
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

}
