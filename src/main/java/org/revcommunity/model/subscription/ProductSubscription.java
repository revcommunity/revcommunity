package org.revcommunity.model.subscription;

import org.neo4j.graphdb.Direction;
import org.revcommunity.model.User;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class ProductSubscription
{
    @GraphId
    private Long nodeId;

    @RelatedTo( type = "HAS_PRODUCT_SUBSCRIPTION", direction = Direction.INCOMING )
    private User observer;

    @Fetch
    @RelatedTo( type = "SUBSCRIBE_PRODUCT", direction = Direction.OUTGOING )
    private ProductChannel channel;

    private int newNotifications;

    public ProductSubscription()
    {
        super();
        this.newNotifications = 0;
    }

    public Long getNodeId()
    {
        return nodeId;
    }

    public void setNodeId( Long nodeId )
    {
        this.nodeId = nodeId;
    }

    public User getObserver()
    {
        return observer;
    }

    public void setObserver( User observer )
    {
        this.observer = observer;
    }

    public ProductChannel getChannel()
    {
        return channel;
    }

    public void setChannel( ProductChannel channel )
    {
        this.channel = channel;
    }

    public int getNewNotifications()
    {
        return newNotifications;
    }

    public void setNewNotifications( int newNotifications )
    {
        this.newNotifications = newNotifications;
    }

    public void decreaseNewNotifications()
    {
        newNotifications--;
    }

}
