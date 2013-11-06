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
import org.revcommunity.service.ReviewService;
import org.revcommunity.util.Message;
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
    private ReviewRepo rr;

    @Autowired
    private ReviewService rs;

    @Autowired
    private CommentRepo commentRepo;

    @Autowired
    private UserRepo ur;

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
        createReviews();
        return new Message();
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
        ur.save( u1 );

        User u2 = new User();
        u2.setFirstName( "Adam" );
        u2.setLastName( "Nowak" );
        u2.setUserName( "anowak" );
        u2.setImage( "img/u2.jpg" );
        ur.save( u2 );

        User u3 = new User();
        u3.setFirstName( "Michał" );
        u3.setLastName( "Adamczyk" );
        u3.setUserName( "madamczyk" );
        u3.setImage( "img/u3.jpg" );
        ur.save( u3 );

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
                r.setUsefulness( i * 10 + 20 );
                rs.save( r );
            }
        }

    }

    private void createProducts()
    {
        pr.deleteAll();
        Product p = new Product();
        p.setCategory( cr.findByName( "HP" ) );
        p.setDescription( "Opis Techniczny Procesor (opis): i7-3517U od 1,9 do 3.00 GHz Procesor (opis): 4 procesory logiczne, 2 Fizyczne Matryca (przekątna): 15,6 cale Matryca (rozdzielczość): WXGA 1366 x 768 (16:9) Matryca (powłoka): świecąca Matryca (opis): WLED Pamięć zainstalowana (pojemność): 4 GB Pamięć (max. pojemność): 8 GB Pamięć (technologia): 1600MHz DDR3 Dysk twardy (pojemność): 1000 GB Dysk twardy (interfejs): SATA Napęd optyczny (typ): Super Multi DVD+/-RW/RAM Karta graficzna (model): AMD Radeon HD 8730M 2GB Karta dźwiękowa: HD Audio Wbudowany mikrofon: Tak Karta sieciowa przewodowa: 10/100 Mbps Ethernet Karta sieciowa bezprzewodowa: Tak Karta sieciowa bezprzewodowa (opis): Dell Wireless 1703 - 802.11b/g/n, Bluetooth wer. 4.0 + LE Bluetooth: Tak Kensington Lock: Tak HDMI: Tak Line-out: Tak Wejście mikrofonu: Tak Czytnik kart pamięci: Tak USB 2.0: 2 szt. USB 3.0: 2 szt. System operacyjny: brak Wbudowana kamera: Tak Wymiary (wysokość): 25 mm Wymiary (szerokość): 376 mm Wymiary (głębokość): 259 mm Waga: 2,25 kg Gwarancja: 24 m-ce Next Business Day" );
        p.addImage( "img/hp1.jpg" );
        p.setName( "HP h300" );
        p.setPriceAvg( 3000.0 );
        p.setProducer( "HP" );
        p.setProductCode( "000L300" );

        pr.save( p );

        p = new Product();
        p.setCategory( cr.findByName( "HP" ) );
        p.setDescription( "Laptop HP h500" );
        p.addImage( "img/hp2.jpg" );
        p.setName( "HP h500" );
        p.setPriceAvg( 3550.0 );
        p.setProducer( "HP" );
        p.setProductCode( "000L500" );

        pr.save( p );

        p = new Product();
        p.setCategory( cr.findByName( "DELL" ) );
        p.setDescription( "Laptop DELL D200" );
        p.addImage( "img/dell1.jpg" );
        p.setName( "DELL D200" );
        p.setPriceAvg( 2800.0 );
        p.setProducer( "DELL" );
        p.setProductCode( "EAAD200" );

        pr.save( p );

        p = new Product();
        p.setCategory( cr.findByName( "DELL" ) );
        p.setDescription( "Laptop DELL D600" );
        p.addImage( "img/dell2.jpg" );
        p.setName( "DELL D600" );
        p.setPriceAvg( 4550.0 );
        p.setProducer( "DELL" );
        p.setProductCode( "TR0D500" );

        pr.save( p );

    }

}
