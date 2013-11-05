package org.revcommunity.model;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Comment
{
    @GraphId
    private Long nodeId;

    private String text;

    public Comment()
    {
    }

    public Comment( String comment )
    {
        text = comment;
    }

    public Long getNodeId()
    {
        return nodeId;
    }

    @Override
    public String toString()
    {
        return "Comment [nodeId=" + nodeId + ", text=" + text + "]";
    }

    public void setNodeId( Long nodeId )
    {
        this.nodeId = nodeId;
    }

    public String getText()
    {
        return text;
    }

    public void setText( String text )
    {
        this.text = text;
    }

}
