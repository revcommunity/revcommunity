package org.revcommunity.test;

import java.util.Arrays;

import org.revcommunity.model.Product;
import org.revcommunity.model.Review;
import org.revcommunity.model.User;
import org.revcommunity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestHelper
{
    @Autowired
    private UserService us;

    @Autowired
    private Neo4jTemplate tpl;

    @Transactional
    public User createUser( String userName )
    {
        User user = new User();
        user.setUserName( userName );
        us.createUser( user );
        return user;
    }

    public Review createReview( User author )
    {
        Product p = new Product();
        p.setName( "testName" );
        p.setDescription( "testDesc" );
        p.setImages( Arrays.asList( "img1", "img2" ) );
        p.setProducer( "testProd" );
        p.setProductCode( "testCode" );
        p = tpl.save( p );

        Review r = new Review();
        r.setAuthor( author );
        r.setContent( "SADSD" );
        r.setTitle( "DASDAS" );
        r.setProduct( p );
        return r;
    }

}
