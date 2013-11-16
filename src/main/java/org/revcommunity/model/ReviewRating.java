package org.revcommunity.model;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class ReviewRating
{
    @GraphId
    private Long nodeId;

    private Boolean positive;

    public ReviewRating()
    {
    }

    public ReviewRating( Long nodeId, Boolean positive )
    {
        this.nodeId = nodeId;
        this.positive = positive;
    }

    @Override
    public String toString()
    {
        return "ReviewRating [nodeId=" + nodeId + ", positive=" + positive + "]";
    }

    public Long getNodeId()
    {
        return nodeId;
    }

    public void setNodeId( Long nodeId )
    {
        this.nodeId = nodeId;
    }

    public Boolean getPositive()
    {
        return positive;
    }

    public void setPositive( Boolean positive )
    {
        this.positive = positive;
    }
}
