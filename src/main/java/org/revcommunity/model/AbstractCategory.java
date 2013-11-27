package org.revcommunity.model;

import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonIgnore;
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

    public abstract boolean isLeaf();

    private Long remoteId;

    private Long parentId;

    @GraphId
    private Long nodeId;

    @RelatedTo( type = "CONTAINS", direction = Direction.INCOMING )
    private CategoryGroup parent;

    private boolean baseCategory = true;

    @RelatedTo( type = "FILTERS", direction = Direction.OUTGOING )
    private Set<CategoryFilter> filters = new HashSet<CategoryFilter>(5);

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

    public void addFilter(CategoryFilter cf){
        this.filters.add( cf );
    }
    
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

    @Override
    public String toString()
    {
        return "AbstractCategory [nodeId=" + nodeId + ", parent.name=" + parent.getName() + ", name=" + name + "]";
    }

    public boolean isBaseCategory()
    {
        return baseCategory;
    }

    public void setBaseCategory( boolean baseCategory )
    {
        this.baseCategory = baseCategory;
    }

    public Long getParentId()
    {
        return parentId;
    }

    public void setParentId( Long parentId )
    {
        this.parentId = parentId;
    }

    public Long getRemoteId()
    {
        return remoteId;
    }

    public void setRemoteId( Long remoteId )
    {
        this.remoteId = remoteId;
    }

}
