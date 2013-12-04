package org.revcommunity.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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

    public Product()
    {
        super();
    }

    private String name;

    private String producer;

    private int reviewCount = 0;

    private String productCode;

    private String description;

    private List<String> images;

    private Date dateAdded;

    private Date lastModification;

    private User lastEditUser;

    public Date getDateAdded()
    {
        return dateAdded;
    }

    public void setDateAdded( Date dateAdded )
    {
        this.dateAdded = dateAdded;
    }

    public Date getLastModification()
    {
        return lastModification;
    }

    public void setLastModification( Date lastModification )
    {
        this.lastModification = lastModification;
    }

    public User getLastEditUser()
    {
        return lastEditUser;
    }

    public void setLastEditUser( User lastEditUser )
    {
        this.lastEditUser = lastEditUser;
    }

    private Double priceAvg;

    private String remoteUrl;

    private Long remoteId;

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

    public void addProperties( String key, Object value )
    {
        properties.setProperty( key, value );
    }

    // public void setProperties( DynamicProperties properties )
    // {
    // this.properties = properties;
    // }

    public Map<String, Object> getKeys()
    {
        if ( keys == null && properties != null )
            keys = properties.asMap();
        return keys;
    }

    public void setKeys( Map<String, Object> keys )
    {
        this.keys = keys;
    }

    public Double getPriceAvg()
    {
        return priceAvg;
    }

    public void setPriceAvg( Double priceAvg )
    {
        this.priceAvg = priceAvg;
    }

    public int getReviewCount()
    {
        return reviewCount;
    }

    public void setReviewCount( int reviewCount )
    {
        this.reviewCount = reviewCount;
    }

    public void increaseReviewCount()
    {
        reviewCount++;
    }

    @Override
    public String toString()
    {
        return "Product [nodeId=" + nodeId + ", name=" + name + ", producer=" + producer + ", reviewCount=" + reviewCount + ", productCode="
            + productCode + ", description=" + description + ", images=" + images + ", priceAvg=" + priceAvg + ", remoteUrl=" + remoteUrl
            + ", remoteId=" + remoteId + ", mainImage=" + mainImage + ", keys=" + keys + ", properties=" + properties + ", category=" + category
            + "]";
    }

    public String getRemoteUrl()
    {
        return remoteUrl;
    }

    public void setRemoteUrl( String remoteUrl )
    {
        this.remoteUrl = remoteUrl;
    }

    public Long getRemoteId()
    {
        return remoteId;
    }

    public void setRemoteId( Long remoteId )
    {
        this.remoteId = remoteId;
    }

    public void buildProperites()
    {
        if ( keys != null )
        {
            for ( String key : keys.keySet() )
            {
                Object value = keys.get( key );
                if ( value != null )
                    properties.setProperty( key, value );
            }
        }
    }

}
