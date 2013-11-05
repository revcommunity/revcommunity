package org.revcommunity.repo;

import java.util.List;

import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.Category;
import org.revcommunity.model.CategoryFilter;
import org.springframework.data.neo4j.annotation.Query;
//github.com/revcommunity/revcommunity.git
import org.springframework.data.neo4j.repository.GraphRepository;

public interface CategoryRepo
    extends GraphRepository<Category>
{

    @Query( "START cat=node({0}) MATCH filters<-[:FILTERS]-parent-[:CONTAINS*]->cat RETURN filters" )
    public List<CategoryFilter> getFilters( AbstractCategory cat );

    public AbstractCategory findByNokautId( Long id );
}
