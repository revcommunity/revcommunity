package org.revcommunity.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.lucene.util.ArrayUtil;
import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.springframework.security.core.GrantedAuthority;

@NodeEntity
public class User
    extends org.springframework.security.core.userdetails.User
{

    public User( String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired,
                 boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities )
    {
        super( username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities );
    }

    public User( String username, String password, Collection<? extends GrantedAuthority> authorities )
    {
        super( username, password, true, true, true, true, authorities );
    }

    public User( String username, String password, String firstName, String lastName, Collection<? extends GrantedAuthority> authorities )
    {
        super( username, password, true, true, true, true, authorities );

        this.firstName = firstName;
        this.lastName = lastName;
    }

    @GraphId
    private Long nodeId;

    @Indexed
    private String userName;

    private String firstName;

    private String lastName;

    private List<String> permissions = new ArrayList<String>();

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

    @Override
    public String getUsername()
    {
        return this.userName;
    }

    public void setUsername( String userName )
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

    public List<String> getPermissions()
    {
        return permissions;
    }

    public void setPermissions( List<String> permissions )
    {
        this.permissions = permissions;
    }

    public void addPermission( String permission )
    {
        for ( String p : permissions )
        {
            // TODO zbior dozwolonych uprawnien
            if ( p.equals( permission ) /* && prawidlowa nazwa uprawnienia */)
                return;
        }

        this.permissions.add( permission );

    }

}
