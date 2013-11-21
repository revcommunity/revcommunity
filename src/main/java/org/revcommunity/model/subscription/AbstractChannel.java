package org.revcommunity.model.subscription;

import java.util.Set;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public abstract class AbstractChannel
{

    @GraphId
    private Long nodeId;

    @RelatedTo( type = "HAS", direction = Direction.OUTGOING )
    private Set<AbstractNotification> notifications;

    public Long getNodeId()
    {
        return nodeId;
    }

    public void setNodeId( Long nodeId )
    {
        this.nodeId = nodeId;
    }

    @JsonIgnore
    public Set<AbstractNotification> getNotifications()
    {
        return notifications;
    }

    public void setNotifications( Set<AbstractNotification> notifications )
    {
        this.notifications = notifications;
    }

    public AbstractChannel()
    {
        super();
    }
}
