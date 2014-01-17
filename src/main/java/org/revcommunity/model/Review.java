package org.revcommunity.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
@JsonIgnoreProperties( ignoreUnknown = true )
public class Review
{
    private static final Logger log = Logger.getLogger( Review.class );

    @JsonIgnore
    private static final double DEFAULT_USEFULNESS = 0.5;

    @JsonIgnore
    private static final double DEFAULT_REVIEW_WEIGHT = 1;

    @JsonIgnore
    private static final double VOTES_WEIGHT = 8;

    @JsonIgnore
    private static final double AUTOR_RANK_WEIGHT = 3;
    
    @JsonIgnore
    private static final double CONST_VALUE = 15;

    @Override
    public String toString()
    {
        return "Review [nodeId=" + nodeId + ", content=" + content + ", title=" + title + ", comments=" + comments + "]";
    }

    public Review()
    {
        initUsefulness();
    }

    private Double usefulness;

    private Date dateAdded;

    private Date lastModification;

    public Date getDateAdded()
    {
        return dateAdded;
    }

    public void setDateAdded( Date dateAdded )
    {
        this.dateAdded = dateAdded;
    }

    public Date getLastModification()
    {
        return lastModification;
    }

    public void setLastModification( Date lastModification )
    {
        this.lastModification = lastModification;
    }

    @GraphId
    private Long nodeId;

    @Indexed
    private String content;

    private String title;

    private Integer rank;

    @RelatedTo( type = "WROTE", direction = Direction.INCOMING )
    private User author;

    @RelatedTo( type = "HAS", direction = Direction.OUTGOING )
    private Set<Comment> comments;

    @Fetch
    @RelatedTo( type = "RATED_BY", direction = Direction.OUTGOING )
    private Set<ReviewRating> ratings;

    @Fetch
    @RelatedTo( type = "WRITTEN_FOR", direction = Direction.OUTGOING )
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

    public void calculateUsefulness( double avgSystemUsefulness )
    {
        double result = 0;
        try
        {
            double numerator = DEFAULT_REVIEW_WEIGHT * CONST_VALUE * avgSystemUsefulness;
            numerator += VOTES_WEIGHT * countPositiveRatings();
            numerator += AUTOR_RANK_WEIGHT * author.countPositiveReviewRatings();

            double denominator = DEFAULT_REVIEW_WEIGHT * CONST_VALUE;
            denominator += VOTES_WEIGHT * getRatings().size();
            denominator += AUTOR_RANK_WEIGHT * author.countReviewRatings();

            result = numerator * 100.0 / denominator;
        }
        catch ( Exception e )
        {
            log.error( e.getMessage() );
        }

        setUsefulness( result );
    }

    public void setUsefulness( Double usefulness )
    {
        this.usefulness = usefulness;
    }

    public Double getUsefulness()
    {
        if ( usefulness == null )
        {
            initUsefulness();
        }

        return usefulness;
    }

    public int countPositiveRatings()
    {
        int result = 0;
        for ( ReviewRating rating : getRatings() )
        {
            if ( rating.getPositive() )
            {
                result++;
            }
        }
        return result;
    }

    public void initUsefulness()
    {
        setUsefulness( DEFAULT_USEFULNESS * 100 );
    }
}
