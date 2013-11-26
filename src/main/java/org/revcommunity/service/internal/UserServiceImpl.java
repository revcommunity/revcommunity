package org.revcommunity.service.internal;

import org.revcommunity.model.User;
import org.revcommunity.model.subscription.UserChannel;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.repo.subscription.UserChannelRepo;
import org.revcommunity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl
    implements UserService
{
    @Autowired
    private UserRepo ur;

    @Autowired
    private UserChannelRepo ucr;

    public User createUser( User user )
    {
        ur.save( user );
        UserChannel uc = new UserChannel();
        uc.setChannelOwner( user );
        ucr.save( uc );
        return user;
    }

}
