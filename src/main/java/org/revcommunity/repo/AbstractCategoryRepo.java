package org.revcommunity.repo;

import org.revcommunity.model.AbstractCategory;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface AbstractCategoryRepo
    extends GraphRepository<AbstractCategory>
{

    public AbstractCategory findByRemoteId( Long id );

    public AbstractCategory findByName( String name );

}
