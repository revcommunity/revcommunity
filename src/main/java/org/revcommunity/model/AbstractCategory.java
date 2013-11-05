package org.revcommunity.model;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public abstract class AbstractCategory
{

    public AbstractCategory()
    {
        super();
    }

    public AbstractCategory( Long nodeId )
    {
        super();
        this.nodeId = nodeId;
    }

    @GraphId
    private Long nodeId;

    @RelatedTo( type = "CONTAINS", direction = Direction.INCOMING )
    private CategoryGroup parent;

    private boolean baseCategory = true;

    @RelatedTo( type = "FILTERS", direction = Direction.OUTGOING )
    private Set<CategoryFilter> filters;

    public Set<CategoryFilter> getFilters()
    {
        if ( filters == null )
            filters = new HashSet<CategoryFilter>();
        return filters;
    }

    public void setFilters( Set<CategoryFilter> filters )
    {
        this.filters = filters;
    }

    @Deprecated
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
        if ( parent != null )
            baseCategory = false;
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

    @Override
    public String toString()
    {
        return "AbstractCategory [nodeId=" + nodeId + ", parent=" + parent + ", name=" + name + "]";
    }

    public boolean isBaseCategory()
    {
        return baseCategory;
    }

    public void setBaseCategory( boolean baseCategory )
    {
        this.baseCategory = baseCategory;
    }

}
