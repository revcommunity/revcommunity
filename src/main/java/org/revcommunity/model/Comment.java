package org.revcommunity.model;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class Comment
{
    @GraphId
    private Long nodeId;

    private String text;

    @RelatedTo( type = "WROTE_C", direction = Direction.INCOMING )
    private User author;

    public Comment()
    {
    }

    public Comment( String comment, User author )
    {
        text = comment;
        this.author = author;
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
        return "Comment [nodeId=" + nodeId + ", text=" + text + ", author=" + author + "]";
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

    public User getAuthor()
    {
        return author;
    }

    public void setAuthor( User author )
    {
        this.author = author;
    }

}
