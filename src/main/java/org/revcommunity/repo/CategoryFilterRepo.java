package org.revcommunity.repo;

import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.CategoryFilter;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface CategoryFilterRepo extends GraphRepository<CategoryFilter> {
    
    public CategoryFilter findByRemoteId( Long id );
}
