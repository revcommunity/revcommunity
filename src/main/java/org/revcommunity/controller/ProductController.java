package org.revcommunity.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.revcommunity.model.FilterValue;
import org.revcommunity.model.Product;
import org.revcommunity.repo.AbstractCategoryRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.service.CategoryService;
import org.revcommunity.service.ProductService;
import org.revcommunity.util.ImageService;
import org.revcommunity.util.Message;
import org.revcommunity.util.TestHelper;
import org.revcommunity.util.search.SortDirection;
import org.revcommunity.util.search.Sorter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.data.neo4j.support.Neo4jTemplate;
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
    private Neo4jTemplate tpl;

    @Autowired
    private ProductService ps;

    @Autowired
    private AbstractCategoryRepo acr;

    @Autowired
    private ImageService imageService;

    private ObjectMapper om = new ObjectMapper();

    /**
     * Metoda tworzy nowy produkt lub edytuje istniejący
     * 
     * @param product Product w formacie JSON
     * @param removedImages Zdjęcia które usunięto z produktu(w trybie edycji)
     * @param images Zdjęcia produktu z formularza
     * @return Wiadomość zawierająca zapisany obiekt
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     * @author Paweł Rosolak 4 gru 2013
     */
    @RequestMapping( method = RequestMethod.POST )
    @ResponseBody
    public Message save( @RequestParam String product, @RequestParam List<String> removedImages, @RequestParam ArrayList<MultipartFile> images )
        throws JsonParseException, JsonMappingException, IOException
    {
        ObjectMapper om = new ObjectMapper();
        Product p = om.readValue( product, Product.class );
        List<File> files = imageService.save( images );
        imageService.remove( removedImages );
        for ( File file : files )
        {
            p.addImage( ImageService.imgDirName + "/" + file.getName() );
        }
        if ( p.getNodeId() == null )
        {
            ps.createProduct( p );
        }
        else
        {
            ps.updateProduct( p );
        }
        log.debug( "Zapisano nowy produkt: " + p );
        return new Message( p );
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
        return ps.getProduct( id );
    }

    @Autowired
    private TestHelper th;

    @Autowired
    private CategoryService cs;

    @RequestMapping( method = RequestMethod.GET )
    @ResponseBody
    public Page<Product> filter( @RequestParam( required = false ) Long categoryId, @RequestParam( required = false ) String query,
                                 @RequestParam( value = "filters", required = false ) String sFilters,
                                 @RequestParam( value = "sort", required = false ) String sSorters, @RequestParam Integer start,
                                 @RequestParam Integer limit )
        throws JsonParseException, JsonMappingException, IOException
    {
        List<FilterValue> filters = readFilters( sFilters );
        List<Sorter> sorters = readSorters( sSorters );
        Page<Product> prods = ps.findByFilters( categoryId, query, filters, sorters, start, limit );
        return prods;
    }

    private List<FilterValue> readFilters( String sFilters )
        throws JsonParseException, JsonMappingException, IOException
    {
        if ( StringUtils.isBlank( sFilters ) )
            return null;
        List<FilterValue> filters = om.readValue( sFilters, new TypeReference<List<FilterValue>>()
        {
        } );
        return filters;
    }

    private List<Sorter> readSorters( String sSorters )
        throws JsonParseException, JsonMappingException, IOException
    {
        if ( StringUtils.isBlank( sSorters ) )
            return null;
        List<Sorter> sorters = om.readValue( sSorters, new TypeReference<List<Sorter>>()
        {
        } );
        return sorters;
    }

    @RequestMapping( method = RequestMethod.DELETE, value = "{productId}" )
    @ResponseBody
    public Message delete( @PathVariable Long productId )
    {
        ps.delete( productId );
        return new Message();
    }

}
