package org.revcommunity.repo;

import org.revcommunity.model.User;
import org.revcommunity.model.User;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface UserRepository extends GraphRepository<User> {

	User findByUsername(String username);
}
