package org.revcommunity.model.subscription;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

@RelationshipEntity( type = "READ_PRODUCT_NOTIF" )
public class ProductNotification
{

    @GraphId
    private Long nodeId;

    private boolean readed;

    @StartNode
    private ProductSubscription subscription;

    @Fetch
    @EndNode
    private ProductChannelNotification notification;

    ProductNotification()
    {
    }

    public ProductNotification( ProductSubscription subscription, ProductChannelNotification notification )
    {
        super();
        this.subscription = subscription;
        this.notification = notification;
        this.readed = false;
    }

    public Long getNodeId()
    {
        return nodeId;
    }

    public void setNodeId( Long nodeId )
    {
        this.nodeId = nodeId;
    }

    public boolean isReaded()
    {
        return readed;
    }

    public void setReaded( boolean readed )
    {
        this.readed = readed;
    }

    public ProductSubscription getSubscription()
    {
        return subscription;
    }

    public void setSubscription( ProductSubscription subscription )
    {
        this.subscription = subscription;
    }

    public ProductChannelNotification getNotification()
    {
        return notification;
    }

    public void setNotification( ProductChannelNotification notification )
    {
        this.notification = notification;
    }

}
