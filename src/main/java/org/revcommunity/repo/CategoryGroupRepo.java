package org.revcommunity.repo;

import java.util.List;

import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.CategoryGroup;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface CategoryGroupRepo
    extends GraphRepository<CategoryGroup>
{

    public List<AbstractCategory> findByBaseCategory( boolean base );

    @Query( "START parent=node({0}) MATCH parent-[:CONTAINS]->children RETURN children" )
    public List<AbstractCategory> getChildren( AbstractCategory parent );

    public CategoryGroup findByNodeId( Long nodeId );
}