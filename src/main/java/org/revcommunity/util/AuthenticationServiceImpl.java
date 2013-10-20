package org.revcommunity.util;

import org.revcommunity.authentication.UsernameAlreadyExistsException;
import org.revcommunity.model.UserAuth;
import org.revcommunity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

public class AuthenticationServiceImpl
    implements AuthenticationService
{

    @Autowired
    private UserRepo userRepository;

    private static String SALT = "cewuiqwzie";

    private ShaPasswordEncoder passwordEncoder = new ShaPasswordEncoder( 256 );

    @Transactional
    public UserDetails loadUserByUsername( String username )
        throws UsernameNotFoundException
    {

        if ( username == null || username.length() == 0 )
            throw new UsernameNotFoundException( "User : " + username + " was not found" );

        // FIXME Klasa Rosola
        // UserAuth user = userRepository.findByUsername( username );

        // user.setAuthorities(roles);
        return null;

    }

    public void addGroup( String groupname )
    {
        // TODO Auto-generated method stub

    }

    public void addGroup( String groupname, String parentGroupname )
    {
        // TODO Auto-generated method stub

    }

    public void addUser( String username, String password )
        throws UsernameAlreadyExistsException
    {
        addUser( username, password, "", "", new String[] { "ROLE_ADMIN" } );

    }

    public void addUser( String username, String password, String firstName, String lastName, String... permissions )
        throws UsernameAlreadyExistsException
    {
        // if ( this.userRepository.findByUsername( username ) != null )
        // throw new UsernameAlreadyExistsException();

        String password_encoded = passwordEncoder.encodePassword( password, SALT );

    }

    public void addUserToGroup( String username, String groupname )
    {
        // TODO Auto-generated method stub

    }

    public void removeUser( String username )
        throws UsernameNotFoundException
    {
        // UserAuth user = this.userRepository.findByUsername( username );
        //
        // if ( user == null )
        // throw new UsernameNotFoundException( "User :" + username + " doesn't not exist" );
        // else
        // this.userRepository.delete( user );
    }

    public boolean userExists( String username )
    {
        // UserAuth user = this.userRepository.findByUsername( username );
        //
        // if ( user != null )
        // return true;

        return false;
    }

    public void addUser( UserAuth user )
        throws UsernameAlreadyExistsException
    {

        if ( userExists( user.getUsername() ) )
            throw new UsernameAlreadyExistsException();

        // this.userRepository.save( user );

    }

}
