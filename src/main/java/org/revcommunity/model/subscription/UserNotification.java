package org.revcommunity.model.subscription;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

@RelationshipEntity( type = "READ" )
public class UserNotification
{

    @GraphId
    private Long nodeId;

    private boolean readed;

    @StartNode
    private UserSubscription subscription;

    @Fetch
    @EndNode
    private UserChannelNotification notification;

    UserNotification()
    {
    }

    public UserNotification( UserSubscription subscription, UserChannelNotification notification )
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

    public UserSubscription getSubscription()
    {
        return subscription;
    }

    public void setSubscription( UserSubscription subscription )
    {
        this.subscription = subscription;
    }

    public UserChannelNotification getNotification()
    {
        return notification;
    }

    public void setNotification( UserChannelNotification notification )
    {
        this.notification = notification;
    }

}
