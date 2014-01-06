package org.revcommunity.model;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
@JsonIgnoreProperties( ignoreUnknown = true )
public class User
{
    @JsonIgnore
    private static final double DEFAULT_RANK = 0.5;

    @GraphId
    private Long nodeId;

    private String userName;

    private String firstName;

    private String lastName;

    private String password;

    private String email;

    // FIXME ustawilem true do testow, trzeba to jeszcze dodac do formularza rejestracji
    private boolean sendNewsletter = true;

    private Set<String> roles;

    private String image = "img/empty.jpg";

    @JsonIgnore
    private Double rankAsDouble = DEFAULT_RANK * 100;

    public User()
    {
    }

    @JsonIgnore
    @Fetch
    @RelatedTo( type = "WROTE", direction = Direction.OUTGOING )
    private Set<Review> reviews;

    @RelatedTo( type = "WROTE_C", direction = Direction.OUTGOING )
    private Set<Comment> comments;

    @RelatedTo( type = "GIVE", direction = Direction.OUTGOING )
    private Set<ReviewRating> ratings;

    public Long getNodeId()
    {
        return nodeId;
    }

    public void setNodeId( Long nodeId )
    {
        this.nodeId = nodeId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }

    public Set<String> getRoles()
    {
        return roles;
    }

    public void setRoles( Set<String> roles )
    {
        this.roles = roles;
    }

    public Set<Review> getReviews()
    {
        if ( reviews == null )
            reviews = new HashSet<Review>();
        return reviews;
    }

    public void setReviews( Set<Review> reviews )
    {
        this.reviews = reviews;
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

    public void addRating( ReviewRating rating )
    {
        getRatings().add( rating );
    }

    public void addRole( String roleName )
    {
        if ( roles == null )
            roles = new HashSet<String>();
        roles.add( roleName );
    }

    public String getImage()
    {
        return image;
    }

    public void setImage( String image )
    {
        this.image = image;
    }

    public void addReview( Review review )
    {
        getReviews().add( review );
    }

    public void addComment( Comment comment )
    {
        getComments().add( comment );
    }

    public String getFullName()
    {
        return StringUtils.join( getFirstName(), " ", getLastName() ).trim();
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName( String userName )
    {
        this.userName = userName;
    }

    @JsonProperty( "positiveReviewRatingsCount" )
    public int countPositiveReviewRatings()
    {
        int result = 0;

        for ( Review r : getReviews() )
        {
            result += r.countPositiveRatings();
        }

        return result;
    }

    @JsonProperty( "reviewRatingsCount" )
    public int countReviewRatings()
    {
        int result = 0;

        for ( Review r : getReviews() )
        {
            result += r.getRatings().size();
        }

        return result;
    }

    @JsonIgnore
    public Double getRankAsDouble()
    {
        return rankAsDouble;
    }

    @JsonIgnore
    public void setRankAsDouble( Double rankAsDouble )
    {
        this.rankAsDouble = rankAsDouble;
    }

    public void calculateRank()
    {
        // TODO: update const values
        double defaultRank = DEFAULT_RANK;
        double defaultRankWeight = 10;
        double reviewRatingsWeight = 1;

        double numerator = defaultRank * defaultRankWeight;
        numerator += countPositiveReviewRatings() * reviewRatingsWeight;

        double denominator = defaultRankWeight;
        denominator += reviewRatingsWeight * countReviewRatings();

        double result = numerator * 100.0 / denominator;

        setRankAsDouble( result );
    }

    public String getRank()
    {
        if ( getRankAsDouble() <= 20.0 )
        {
            return "Niezaufany";
        }
        else if ( getRankAsDouble() <= 40.0 )
        {
            return "Adept";
        }
        else if ( getRankAsDouble() <= 60.0 )
        {
            return "Przeciętny";
        }
        else if ( getRankAsDouble() <= 80.0 )
        {
            return "Godny zaufania";
        }
        else
        {
            return "Ekspert";
        }
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public boolean isSendNewsletter()
    {
        return sendNewsletter;
    }

    public void setSendNewsletter( boolean sendNewsletter )
    {
        this.sendNewsletter = sendNewsletter;
    }

    @Override
    public String toString()
    {
        return "User [nodeId=" + nodeId + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
            + ", roles=" + roles + ", image=" + image + ", reviews=" + reviews + ", comments=" + comments + ", ratings=" + ratings + "]";
    }
}
