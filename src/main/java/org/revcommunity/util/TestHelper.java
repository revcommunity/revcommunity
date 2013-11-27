package org.revcommunity.util;

import java.util.Arrays;

import org.revcommunity.model.Product;
import org.revcommunity.model.Review;
import org.revcommunity.model.User;
import org.revcommunity.repo.CategoryRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.service.CategoryService;
import org.revcommunity.service.ProductService;
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

    @Autowired
    private CategoryService cs;

    @Autowired
    private CategoryRepo cr;

    @Autowired
    private ProductRepo pr;

    @Autowired
    private ProductService ps;

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

    public void createProducts()
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

        ps.createProduct( p );

        p = new Product();
        p.setCategory( cr.findByName( "HP" ) );
        p.setDescription( "Laptop HP h500" );
        p.addImage( "img/hp2.jpg" );
        p.setName( "HP h500" );
        p.setPriceAvg( 3550.0 );
        p.setProducer( "HP" );
        p.setProductCode( "000L500" );

        ps.createProduct( p );

        p = new Product();
        p.setCategory( cr.findByName( "Dell" ) );
        p.setDescription( "Laptop DELL D200" );
        p.addImage( "img/dell1.jpg" );
        p.setName( "DELL D200" );
        p.setPriceAvg( 2800.0 );
        p.setProducer( "DELL" );
        p.setProductCode( "EAAD200" );

        ps.createProduct( p );

        p = new Product();
        p.setCategory( cr.findByName( "Dell" ) );
        p.setDescription( "Laptop DELL D600" );
        p.addImage( "img/dell2.jpg" );
        p.setName( "DELL D600" );
        p.setPriceAvg( 4550.0 );
        p.setProducer( "DELL" );
        p.setProductCode( "TR0D500" );

        ps.createProduct( p );
    }

}
