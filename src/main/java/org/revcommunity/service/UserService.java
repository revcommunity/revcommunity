package org.revcommunity.service;

import org.revcommunity.model.User;

public interface UserService
{

    public User createUser( User user );

    public User getUser( String userName );

    public User getUser( Long userId );

    public void delete( User admin );

    public boolean userExist( User user );
}
