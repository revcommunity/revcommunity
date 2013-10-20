package org.revcommunity.repo;

import org.revcommunity.model.User;
import org.revcommunity.model.UserAuth;
import org.revcommunity.model.UserAuth;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface UserRepo
    extends GraphRepository<User>
{

    public User findByUserName( String userName );
}
