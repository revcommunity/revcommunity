package org.revcommunity.authentication;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.revcommunity.model.User;
import org.revcommunity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	private UserRepo userRepo;
	
	private ShaPasswordEncoder passwordEncoder = new ShaPasswordEncoder(256);
	
	@Transactional
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		
		if(username == null || username.length() == 0 )
			throw new UsernameNotFoundException("User : " + username + " was not found");
		
		
		User user = userRepo.findByPropertyValue("userName", username);
		
		Set<GrantedAuthority> authorities = (Set<GrantedAuthority>) user.getAuthorities();
		
		if(authorities.isEmpty())
			throw new UsernameNotFoundException(username + "has no permissions.");
	 
	    return new User(user.getUsername(), user.getPassword(), true, true, true, true, authorities);

	}

	public void addGroup(String groupname) {
		// TODO Auto-generated method stub
		
	}

	public void addGroup(String groupname, String parentGroupname) {
		// TODO Auto-generated method stub
		
	}

	public void addUser(String username, String password)
			throws UsernameAlreadyExistsException {
		// TODO Auto-generated method stub
		
	}

	public void addUser(String username, String password, String firstName,
			String lastName, String ... permissions)
			throws UsernameAlreadyExistsException {
		
		//TODO Sprawdzamy czy user istnieje
	
		
		if(permissions.length == 0){
			// TODO Co teraz ?
		}
		
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		for (String p : permissions) {
			authorities.add(new GrantedAuthorityImpl(p));
		}
		
		
		String hash = passwordEncoder.encodePassword(password, username);
		User u = new User(username, hash, firstName, lastName, authorities);
		
	   userRepo.save(u);
		
	}

	public void addUserToGroup(String username, String groupname) {
		// TODO Auto-generated method stub
		
	}

	public void removeUser(String username) throws UsernameNotFoundException {
		
		
	}

	public boolean userExists(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
