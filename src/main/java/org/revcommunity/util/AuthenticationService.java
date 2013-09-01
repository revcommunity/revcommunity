package org.revcommunity.util;

import org.revcommunity.authentication.UsernameAlreadyExistsException;
import org.revcommunity.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface AuthenticationService extends UserDetailsService {
	
	/**
	 * Create a new group.
	 * 
	 * @param groupname
	 *            The name of the group
	 */
	public void addGroup(String groupname);

	/**
	 * Create a new sub-group.
	 * 
	 * @param groupname
	 *            The name of the sub-group
	 * @param parentGroupname
	 *            The name of the parent group
	 */
	public void addGroup(String groupname, String parentGroupname);

	/**
	 * Create a new user.
	 * 
	 * @param username
	 *            The name of the user
	 * @param password
	 *            The encrypted password
	 * @throws UsernameAlreadyExistsException
	 *             Thrown when a user with this username already exists
	 */
	public void addUser(String username, String password)
			throws UsernameAlreadyExistsException;
	
	
	public void addUser(User user)
			throws UsernameAlreadyExistsException;

	/**
	 * Create a new user and add to an existing group
	 * 
	 * @param username
	 *            The name of the user
	 * @param password
	 *            The encrypted password
	 * @param firstName
	 * @param lastNames
	 * @param groupname
	 *            The group the user should be added to; the group must already
	 *            exist
	 * @throws UsernameAlreadyExistsException
	 *             Thrown when a user with this username already exists
	 */
	public void addUser(String username, String password,String firstName,String lastName, String ... permissions)
			throws UsernameAlreadyExistsException;

	/**
	 * Add an existing user to an existing group.
	 * 
	 * @param username
	 *            The name of the user
	 * @param groupname
	 *            The name of the group
	 */
	void addUserToGroup(String username, String groupname);

	/**
	 * Remove a specific user.
	 * 
	 * @param username
	 *            The name of the user to remove
	 * @throws UsernameNotFoundException
	 *             If there is no user named <code>username</code>
	 */
	public void removeUser(String username) throws UsernameNotFoundException;
	
	/**
	 * Check if a user with a given name exists.
	 * 
	 * @param username The user's name
	 * @return True if the user exists
	 */
	public boolean userExists(String username);

}
