package org.revcommunity.util;

import org.revcommunity.authentication.UsernameAlreadyExistsException;
import org.revcommunity.model.User;
import org.revcommunity.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

public class AuthenticationServiceImpl
    implements AuthenticationService
{

    @Autowired
    private UserRepository userRepository;

    private static String SALT = "cewuiqwzie";
    
    private ShaPasswordEncoder passwordEncoder = new ShaPasswordEncoder( 256 );

    @Transactional
    public UserDetails loadUserByUsername( String username )
        throws UsernameNotFoundException
    {

        if ( username == null || username.length() == 0 )
            throw new UsernameNotFoundException( "User : " + username + " was not found" );

        //FIXME Klasa Rosola
        User user = userRepository.findByUsername(username);
        
		//user.setAuthorities(roles);
        
        return user;

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
        addUser(username, password, "", "",new String[]{"ROLE_ADMIN"});

    }

    public void addUser( String username, String password, String firstName, String lastName, String... permissions )
        throws UsernameAlreadyExistsException
    {

    	if(this.userRepository.findByUsername(username) != null)
    		throw new UsernameAlreadyExistsException();

//        Set<Permission> authorities = new HashSet<Permission>();
//        authorities.add(new Permission("ROLE_USER"));

        String password_encoded = passwordEncoder.encodePassword( password, SALT );
        User newUser = new User( username, password_encoded, firstName, lastName, permissions);

        this.userRepository.save( newUser );

    }

    public void addUserToGroup( String username, String groupname )
    {
        // TODO Auto-generated method stub

    }

    public void removeUser( String username )
        throws UsernameNotFoundException
    {
    	User user = this.userRepository.findByUsername(username);
    	
    	if( user == null)
    		throw new UsernameNotFoundException("User :" + username + " doesn't not exist");
    	else
    		this.userRepository.delete(user);
    }

    public boolean userExists( String username )
    {
    	User user = this.userRepository.findByUsername(username);
    	
    	if( user != null)
    		return true;
    	
    	return false;
    }

	public void addUser(User user) throws UsernameAlreadyExistsException {
		
		
		if( userExists(user.getUsername()))
			throw new UsernameAlreadyExistsException();
		
		this.userRepository.save(user);
		
	}

}
