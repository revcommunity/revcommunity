package org.revcommunity.model.subscription;

import java.util.Set;

import org.neo4j.graphdb.Direction;
import org.revcommunity.model.User;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class UserSubscription
{
    @GraphId
    private Long nodeId;

    @RelatedTo( type = "HAS_SUBSCRIPTION", direction = Direction.INCOMING )
    private User observer;

    @RelatedTo( type = "SUBSCRIBE", direction = Direction.OUTGOING )
    private UserChannel channel;

    private int newNotifications;

    public UserSubscription()
    {
        super();
        this.newNotifications = 0;
    }

    private Set<UserChannelNotification> notifications;

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

    public Set<UserChannelNotification> getNotifications()
    {
        return notifications;
    }

    public void setNotifications( Set<UserChannelNotification> notifications )
    {
        this.notifications = notifications;
    }

    public int getNewNotifications()
    {
        return newNotifications;
    }

    public void setNewNotifications( int newNotifications )
    {
        this.newNotifications = newNotifications;
    }

}
