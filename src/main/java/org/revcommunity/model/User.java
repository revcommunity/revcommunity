package org.revcommunity.model;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class User
{

    @GraphId
    private Long nodeId;

    private String userName;

    private String firstName;

    private String lastName;

    private String password;

    private Set<String> roles;

    private String image = "img/empty.jpg";

    @RelatedTo( type = "WROTE", direction = Direction.OUTGOING )
    private Set<Review> reviews;

    private Set<Comment> comments;

    private Set<ReviewRating> ratings;

    public Long getNodeId()
    {
        return nodeId;
    }

    public void setNodeId( Long nodeId )
    {
        this.nodeId = nodeId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName( String userName )
    {
        this.userName = userName;
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

}
