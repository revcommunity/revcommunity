package org.revcommunity.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.springframework.data.neo4j.fieldaccess.DynamicProperties;
import org.springframework.data.neo4j.fieldaccess.DynamicPropertiesContainer;

@NodeEntity
public class Product
{
    @GraphId
    private Long nodeId;

    private String name;

    private String producer;

    private String productCode;

    private String description;

    private List<String> images;

    private String mainImage;

    private Map<String, Object> keys;

    private DynamicProperties properties = new DynamicPropertiesContainer();

    @Fetch
    @RelatedTo( type = "BELONGS_TO", direction = Direction.OUTGOING )
    private Category category;

    public Long getNodeId()
    {
        return nodeId;
    }

    public void setNodeId( Long nodeId )
    {
        this.nodeId = nodeId;
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

    public String getMainImage()
    {
        return mainImage;
    }

    public void setMainImage( String mainImage )
    {
        this.mainImage = mainImage;
    }

    public Category getCategory()
    {
        return category;
    }

    public void setCategory( Category category )
    {
        this.category = category;
    }

    public DynamicProperties getProperties()
    {
        return properties;
    }

    public void setProperties( DynamicProperties properties )
    {
        this.properties = properties;
    }

    public Map<String, Object> getKeys()
    {
        return keys;
    }

    public void setKeys( Map<String, Object> keys )
    {
        if ( keys != null )
            properties.createFrom( keys );
        this.keys = keys;
    }

}
