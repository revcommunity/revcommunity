package org.revcommunity.service.internal;

import org.revcommunity.model.User;
import org.revcommunity.model.subscription.UserChannel;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.repo.subscription.UserChannelRepo;
import org.revcommunity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
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

    private String SALT = "cewuiqwzie";

    private ShaPasswordEncoder passwordEncoder = new ShaPasswordEncoder( 256 );

    public User createUser( User user )
    {
        String password_encoded = passwordEncoder.encodePassword( user.getPassword(), SALT );
        user.addRole( "ROLE_USER" );
        user.setPassword( password_encoded );
        ur.save( user );
        UserChannel uc = new UserChannel();
        uc.setChannelOwner( user );
        ucr.save( uc );
        return user;
    }

}
