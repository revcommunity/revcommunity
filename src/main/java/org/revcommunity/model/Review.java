package org.revcommunity.model;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.graphdb.Direction;
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

    private Double usefulness;

    private Integer rank;

    @RelatedTo( type = "WROTE", direction = Direction.INCOMING )
    private User author;

    @RelatedTo( type = "HAS", direction = Direction.OUTGOING )
    private Set<Comment> comments;

    @RelatedTo( type = "RATED_BY", direction = Direction.OUTGOING )
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

    public Double getUsefulness()
    {
        return usefulness;
    }

    public void setUsefulness( Double usefulness )
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

    public void addReviewRating( ReviewRating rating )
    {
        this.getRatings().add( rating );
    }

    public Set<ReviewRating> getRatings()
    {
        if ( ratings == null )
        {
            ratings = new HashSet<ReviewRating>();
        }
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

    public void recalculateUsefulness()
    {
        if ( getRatings().size() == 0 )
        {
            return;
        }

        int positiveCount = 0;
        for ( ReviewRating rating : getRatings() )
        {
            if ( rating.getPositive() )
            {
                positiveCount++;
            }
        }
        double valueToSet = (double) positiveCount * 100 / getRatings().size();
        setUsefulness( valueToSet );
    }
}
