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
import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.Category;
import org.revcommunity.model.CategoryGroup;
import org.revcommunity.model.Product;
import org.revcommunity.repo.AbstractCategoryRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.service.ProductService;
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

/**
 * Kontroler odpowiedzialny za operacje na produktach
 * 
 * @author Paweł Rosolak 20 paź 2013
 */
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
    private ProductService ps;

    @Autowired
    private AbstractCategoryRepo acr;

    @Autowired
    private ImageService imageService;

    /**
     * @param product Product w formacie JSON
     * @param images Zdjęcia produktu z formularza
     * @return Wiadomość zakończenia powodzeniem.
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
        ps.createProduct( p );
        log.debug( "Zapisano nowy produkt: " + p );
        return new Message();
    }

    /**
     * Pobiera listę wszystkich produktów
     * 
     * @return Lista produktów
     * @author Paweł Rosolak 20 paź 2013
     */
    @RequestMapping( method = RequestMethod.GET )
    @ResponseBody
    public EndResult<Product> getAll()
    {
        return pr.findAll();
    }

    /**
     * Pobiera jeden produkt na posdstawie id
     * 
     * @param id Id produktu
     * @return Obiekt produktu
     * @author Paweł Rosolak 20 paź 2013
     */
    @RequestMapping( value = "/{id}", method = RequestMethod.GET )
    @ResponseBody
    public Product get( @PathVariable Long id )
    {
        try
        {
            Product p = pr.findOne( id );
            return p;
        }
        catch ( Exception e )
        {
            log.error( e, e );
        }
        return null;

    }

    /**
     * Pobiera jeden produkt na posdstawie id
     * 
     * @param id Id produktu
     * @return Obiekt produktu
     * @author Paweł Rosolak 20 paź 2013
     */
    @RequestMapping( value = "categories", method = RequestMethod.GET )
    @ResponseBody
    public List<Product> findByCategory( @RequestParam Long categoryId )
    {
        AbstractCategory c = acr.findOne( categoryId );
        List<Product> prods = pr.findByCategory( c );
        return prods;
    }
}
