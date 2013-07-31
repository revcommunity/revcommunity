package org.revcommunity.model;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class User
{

    @GraphId
    private Long nodeId;

    @Indexed
    private String userName;

    private String firstName;

    private String lastName;

    @RelatedTo( type = "REVIEWS", direction = Direction.BOTH, elementClass = Review.class )
    private Set<Review> reviews = new HashSet<Review>();

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

    public Set<Review> getReviews()
    {
        return reviews;
    }

    public void addReview( Review review )
    {
        this.reviews.add( review );
    }

}
