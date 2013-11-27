package org.revcommunity.model.subscription;

import java.util.Date;

import org.neo4j.graphdb.Direction;
import org.revcommunity.model.Review;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public abstract class AbstractNotification
{

    @GraphId
    private Long nodeId;

    private Date date;

    private String message;

    @Fetch
    @RelatedTo( type = "ABOUT", direction = Direction.OUTGOING )
    private Review review;

    public Review getReview()
    {
        return review;
    }

    public void setReview( Review review )
    {
        this.review = review;
    }

    public Long getNodeId()
    {
        return nodeId;
    }

    public void setNodeId( Long nodeId )
    {
        this.nodeId = nodeId;
    }

    public void setDate( Date date )
    {
        this.date = date;
    }

    public void setMessage( String message )
    {
        this.message = message;
    }

    public AbstractNotification()
    {
        super();
        this.date = new Date();
    }

    public Date getDate()
    {
        return date;
    }

    public String getMessage()
    {
        if ( message == null )
            message = buildMessage();
        return message;
    }

    protected abstract String buildMessage();

}
