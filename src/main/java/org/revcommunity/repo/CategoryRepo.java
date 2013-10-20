package org.revcommunity.repo;

import org.revcommunity.model.Category;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface CategoryRepo extends GraphRepository<Category> {

}