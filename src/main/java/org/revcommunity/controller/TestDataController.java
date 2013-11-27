package org.revcommunity.controller;

import org.apache.log4j.Logger;
import org.revcommunity.model.Comment;
import org.revcommunity.model.Product;
import org.revcommunity.model.Review;
import org.revcommunity.model.User;
import org.revcommunity.repo.CategoryRepo;
import org.revcommunity.repo.CommentRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.repo.ReviewRepo;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.service.CategoryService;
import org.revcommunity.service.ProductService;
import org.revcommunity.service.ReviewService;
import org.revcommunity.service.SubscriptionService;
import org.revcommunity.service.UserService;
import org.revcommunity.util.Message;
import org.revcommunity.util.TestHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Kontroler odpowiedzialny za operacje na produktach
 * 
 * @author Paweł Rosolak 20 paź 2013
 */
@Controller
@RequestMapping( "/test" )
public class TestDataController
{

    private static final Logger log = Logger.getLogger( TestDataController.class );

    @Autowired
    private Neo4jTemplate tpl;

    @Autowired
    private CategoryService cs;

    @Autowired
    private CategoryRepo cr;

    @Autowired
    private ProductRepo pr;

    @Autowired
    private ProductService ps;

    @Autowired
    private ReviewRepo rr;

    @Autowired
    private ReviewService rs;

    @Autowired
    private TestHelper th;

    @Autowired
    private CommentRepo commentRepo;

    @Autowired
    private UserRepo ur;

    @Autowired
    private UserService userService;

    @Autowired
    private SubscriptionService ss;

    /**
     * Generuje testowe kategorie
     * 
     * @return
     * @author Paweł Rosolak 4 lis 2013
     */
    @RequestMapping( value = "createCategories" )
    @ResponseBody
    public Message createCategories()
    {
        cs.createCategories();
        return new Message();
    }

    @RequestMapping( value = "testData" )
    @ResponseBody
    public Message createTestData()
    {
        cs.createCategories();
        createProducts();
        createUsers();
        createSubscription();
        createReviews();
        return new Message();
    }

    private void createSubscription()
    {
        ss.clean();
        User observer = ur.findByUserName( "jkowalski" );
        User channelOwner = ur.findByUserName( "anowak" );
        User channelOwner2 = ur.findByUserName( "madamczyk" );
        ss.addUserSubscription( observer, channelOwner );
        ss.addUserSubscription( observer, channelOwner2 );

        EndResult<Product> prods = pr.findAll();
        for ( Product product : prods )
        {
            ss.addProductSubscription( observer, product );
        }
    }

    @RequestMapping( value = "clean" )
    @ResponseBody
    public Message clean()
    {
        commentRepo.deleteAll();
        return new Message();
    }

    private void createUsers()
    {
        ur.deleteAll();
        User u1 = new User();
        u1.setFirstName( "Jan" );
        u1.setLastName( "Kowalski" );
        u1.setUserName( "jkowalski" );
        u1.setImage( "img/u1.jpg" );
        u1.setPassword( "pass" );
        userService.createUser( u1 );

        User u2 = new User();
        u2.setFirstName( "Adam" );
        u2.setLastName( "Nowak" );
        u2.setUserName( "anowak" );
        u2.setImage( "img/u2.jpg" );
        u2.setPassword( "pass" );
        userService.createUser( u2 );

        User u3 = new User();
        u3.setFirstName( "Michał" );
        u3.setLastName( "Adamczyk" );
        u3.setUserName( "madamczyk" );
        u3.setImage( "img/u3.jpg" );
        u3.setPassword( "pass" );
        userService.createUser( u3 );

    }

    private void createReviews()
    {
        commentRepo.deleteAll();
        rr.deleteAll();
        EndResult<Product> list = pr.findAll();
        String[] users = { "jkowalski", "anowak", "madamczyk" };
        for ( Product p : list )
        {
            for ( int i = 0; i < 5; i++ )
            {
                Review r = new Review();
                r.setAuthor( ur.findByUserName( users[i % 3] ) );
                r.setContent( p.getName()
                    + " to wydajny laptop dla graczy, posiadający 17-calową matrycę. W przetestowanej konfiguracji znalazły się procesor Core i7-4800MQ, karta grafiki GeForce GTX 770M i dysk SSD Samsung 840 o pojemności 500 GB." );
                r.setProduct( p );
                r.setTitle( "Recenzja " + p.getName() );
                for ( int j = 0; j < 2; j++ )
                {
                    String txt = p.getName() + ". " + p.getDescription() + ". Komentarz " + j + " - " + i;
                    User u = ur.findByUserName( users[j] );

                    Comment c = new Comment( txt, u );
                    r.addComment( c );

                }
                r.setRank( i + 1 );
                r.setUsefulness( new Integer( i * 10 + 20 ).doubleValue() );
                rs.save( r );
            }
        }

    }

    private void createProducts()
    {
        th.createProducts();
    }

}
