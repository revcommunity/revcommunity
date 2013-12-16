package org.revcommunity.repo;

import java.util.List;

import org.revcommunity.model.User;
import org.revcommunity.model.UserAuth;
import org.revcommunity.model.UserAuth;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface UserRepo
    extends GraphRepository<User>
{

    public User findByUserName( String userName );
    
    
    /**
     * 
     * Zapytanie zwraca użytkownikow do, ktorych mamy wysłać email
     * WHERE user.sendNewsletter == true AND user.email != null AND user.userName != admin 
     * @return
     * @author Tomek Straszewski Dec 16, 2013
     */
    @Query("START user=node:__types__(className='org.revcommunity.model.User') WHERE user.sendNewsletter = true AND NOT (user.userName='admin') RETURN user") 
    public List<User> findUsersToSendNewsLetter();
}
