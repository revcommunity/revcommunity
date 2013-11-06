package org.revcommunity.model;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class Review
{

    @Override
    public String toString()
    {
        return "Review [nodeId=" + nodeId + ", content=" + content + ", title=" + title + ", comments=" + comments + "]";
    }

    public Review()
    {
    }

    @GraphId
    private Long nodeId;

    @Indexed
    private String content;

    private String title;

    private Integer usefulness;

    private Integer rank;

    @RelatedTo( type = "WROTE", direction = Direction.INCOMING )
    private User author;

    @RelatedTo( type = "HAS", direction = Direction.OUTGOING )
    private Set<Comment> comments;

    private Set<ReviewRating> ratings;

    private Product product;

    public Long getNodeId()
    {
        return nodeId;
    }

    public void setNodeId( Long nodeId )
    {
        this.nodeId = nodeId;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent( String content )
    {
        this.content = content;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle( String title )
    {
        this.title = title;
    }

    public Integer getUsefulness()
    {
        return usefulness;
    }

    public void setUsefulness( Integer usefulness )
    {
        this.usefulness = usefulness;
    }

    public Integer getRank()
    {
        return rank;
    }

    public void setRank( Integer rank )
    {
        this.rank = rank;
    }

    public User getAuthor()
    {
        return author;
    }

    public void setAuthor( User author )
    {
        this.author = author;
    }

    public Set<Comment> getComments()
    {
        if ( comments == null )
            comments = new HashSet<Comment>();
        return comments;
    }

    public void setComments( Set<Comment> comments )
    {
        this.comments = comments;
    }

    public Set<ReviewRating> getRatings()
    {
        return ratings;
    }

    public void setRatings( Set<ReviewRating> ratings )
    {
        this.ratings = ratings;
    }

    public Product getProduct()
    {
        return product;
    }

    public void setProduct( Product product )
    {
        this.product = product;
    }

    public void addComment( Comment comment )
    {
        getComments().add( comment );

    }

}
