package org.revcommunity.controller;

import org.apache.log4j.Logger;
import org.revcommunity.authentication.AuthenticationService;
import org.revcommunity.authentication.UsernameAlreadyExistsException;
import org.revcommunity.model.Review;
import org.revcommunity.model.User;
import org.revcommunity.repo.ReviewRepo;
import org.revcommunity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( "/test" )
public class Test
{

    @Autowired
    private AuthenticationService authService;

    private static final Logger log = Logger.getLogger( Test.class );

    @Autowired
    private UserRepo repo;

    @Autowired
    private ReviewRepo rr;

    @RequestMapping( value = "/add" )
    public void addUser()
    {
        log.debug( "add" );
        User u = new User();
        u.setUsername( "u1" );
        Review r = new Review();
        r.setContent( "r1" );
        u.addReview( r );
        repo.save( u );
        // try {
        // authService.addUser("jan123", "jan123", "Jan", "Kowalski", new String[] {"read","write"});
        // authService.loadUserByUsername("jan123");
        // } catch (UsernameAlreadyExistsException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
    }

    @RequestMapping( value = "/users" )
    public @ResponseBody
    EndResult<User> getUsers()
    {
        return repo.findAll();
    }

    @RequestMapping( value = "/reviews" )
    public @ResponseBody
    EndResult<Review> getReviews()
    {

        return rr.findAll();
    }

}
