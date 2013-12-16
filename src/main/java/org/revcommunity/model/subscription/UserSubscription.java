package org.revcommunity.model.subscription;

import org.neo4j.graphdb.Direction;
import org.revcommunity.model.User;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class UserSubscription
{
    @GraphId
    private Long nodeId;

    @RelatedTo( type = "HAS_USER_SUBSCRIPTION", direction = Direction.INCOMING )
    private User observer;

    @Fetch
    @RelatedTo( type = "SUBSCRIBE_USER", direction = Direction.OUTGOING )
    private UserChannel channel;

    private int newNotifications;

    public UserSubscription()
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

    public UserChannel getChannel()
    {
        return channel;
    }

    public void setChannel( UserChannel channel )
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
