package org.revcommunity.repo;

import org.revcommunity.model.User;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface UserRepo
    extends GraphRepository<User>
{

}
