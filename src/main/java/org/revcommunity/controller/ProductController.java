package org.revcommunity.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.revcommunity.model.Product;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.util.ImageService;
import org.revcommunity.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping( "/products" )
public class ProductController
{

    private static final Logger log = Logger.getLogger( ProductController.class );

    @Autowired
    private ServletContext servletContext;

    @Autowired
    private ProductRepo pr;

    @Autowired
    private ImageService imageService;

    /**
     * @param product TODO Nie wiem dlaczego nie potrafi odczytać odrazu obiektu Product.
     * @param images
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    @RequestMapping( method = RequestMethod.POST )
    @ResponseBody
    public Message save( @RequestParam String product, @RequestParam ArrayList<MultipartFile> images )
        throws JsonParseException, JsonMappingException, IOException
    {
        ObjectMapper om = new ObjectMapper();
        Product p = om.readValue( product, Product.class );
        List<File> files = imageService.save( images );
        for ( File file : files )
        {
            p.addImage( ImageService.imgDirName + "/" + file.getName() );
        }
        pr.save( p );
        log.debug( "Zapisano nowy produkt: " + p );
        return new Message();
    }

    @RequestMapping( method = RequestMethod.GET )
    @ResponseBody
    public EndResult<Product> getAll()
    {
        return pr.findAll();
    }

    @RequestMapping( value = "/{id}", method = RequestMethod.GET )
    @ResponseBody
    public Product get( @PathVariable Long id )
    {
        return pr.findOne( id );
    }
}
