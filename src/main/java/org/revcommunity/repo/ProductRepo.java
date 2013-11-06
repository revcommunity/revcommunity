package org.revcommunity.repo;

import org.revcommunity.model.Product;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ProductRepo
    extends GraphRepository<Product>
{
	public Product findByNokautId(Long nokautId);
}
