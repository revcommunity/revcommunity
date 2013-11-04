package org.revcommunity.model;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelatedTo;

public abstract class AbstractCategory
{

    @GraphId
    private Long nodeId;

    @RelatedTo( type = "CategoryGroup_Parent", direction = Direction.OUTGOING )
    private CategoryGroup parent;

    private Long parentId;

    private String name;

    public Long getNodeId()
    {
        return nodeId;
    }

    public void setNodeId( Long nodeId )
    {
        this.nodeId = nodeId;
    }

    public CategoryGroup getParent()
    {
        return parent;
    }

    public void setParent( CategoryGroup parent )
    {
        this.parent = parent;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public Long getParentId()
    {
        return parentId;
    }

    public void setParentId( Long parentId )
    {
        this.parentId = parentId;
    }

}
