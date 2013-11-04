package org.revcommunity.model;

import java.util.Set;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class Category
    extends AbstractCategory
{

    @RelatedTo( type = "CATEGORY_PARENT", direction = Direction.INCOMING )
    private CategoryGroup parent;

    @RelatedTo( type = "FILTERS", direction = Direction.OUTGOING )
    private Set<CategoryFilter> filters;

    public CategoryGroup getParent()
    {
        return parent;
    }

    public void setParent( CategoryGroup parent )
    {
        this.parent = parent;
    }

    public Set<CategoryFilter> getFilters()
    {
        return filters;
    }

    public void setFilters( Set<CategoryFilter> filters )
    {
        this.filters = filters;
    }

}
