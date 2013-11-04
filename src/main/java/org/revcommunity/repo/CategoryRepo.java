package org.revcommunity.repo;

import org.revcommunity.model.Category;
import org.revcommunity.model.CategoryGroup;
import org.revcommunity.model.User;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface CategoryRepo extends GraphRepository<Category> {

	 //id z nokaut'u
	 public Category findById( Long id );
}