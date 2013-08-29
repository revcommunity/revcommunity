package org.revcommunity.model;

import java.util.ArrayList;
import java.util.List;

import org.revcommunity.util.ImageService;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Product
{
    @GraphId
    private Long id;

    private String name;

    private String producer;

    private String productCode;

    private String description;

    private List<String> images;

    private String mainImage;

    public Long getId()
    {
        return id;
    }

    public void setId( Long id )
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getProducer()
    {
        return producer;
    }

    public void setProducer( String producer )
    {
        this.producer = producer;
    }

    public String getProductCode()
    {
        return productCode;
    }

    public void setProductCode( String productCode )
    {
        this.productCode = productCode;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public List<String> getImages()
    {
        if ( images == null )
            images = new ArrayList<String>();
        return images;
    }

    public void setImages( List<String> images )
    {
        this.images = images;
    }

    public void addImage( String image )
    {
        if ( getImages().isEmpty() )
            setMainImage( image );
        getImages().add( image );
    }

    @Override
    public String toString()
    {
        return "Product [id=" + id + ", name=" + name + ", producer=" + producer + ", productCode=" + productCode + ", description=" + description
            + ", images=" + images + "]";
    }

    public String getMainImage()
    {
        return mainImage;
    }

    public void setMainImage( String mainImage )
    {
        this.mainImage = mainImage;
    }

}
