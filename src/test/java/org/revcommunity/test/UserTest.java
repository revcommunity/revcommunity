package org.revcommunity.test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.revcommunity.model.Role;
import org.revcommunity.model.User;
import org.revcommunity.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( { "classpath*:applicationContext-test.xml" } )
public class UserTest {

	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void addUser(){
		
//		User u = new User();
//		
//		u.setUsername("tim93");
//		u.setPassword("qwerty");
//		u.setEmail("test@email.com");
//		Set<Role> roles = new HashSet<Role>();
//		
//		roles.add(new Role("ROLE_USER"));
//		u.setAuthorities(roles);
//		
//		userRepository.save(u);
		
		User un = userRepository.findByUsername("tim91");
		
		Collection<Role> set = un.getAuthorities();
		
		System.out.println(set.toString());
		
	}
	
	//@Test
	public void getUser(){
		
		User u = getUserByName("tim911");
		Assert.assertEquals("tim91", u.getUsername());
	}
	
	public User getUserByName(String name){
		
		return this.userRepository.findByUsername("tim91");
	}
	
	
}
