package org.revcommunity.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.revcommunity.model.Comment;
import org.revcommunity.model.User;
import org.revcommunity.repo.CommentRepo;
import org.revcommunity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( { "classpath*:applicationContext-test.xml" } )
public class UserTest
{

    @Autowired
    private UserRepo userRepository;

    @Autowired
    private CommentRepo cr;
    

    // TODO Testy nie przechodzą jak nie ma użytkownka tim91 i travis rzuca błędy. Dlatego
    // trzeba napisać testy w taki sposób, żeby działały niezależnie od bazy.
    public void addUser()
    {

        // User u = new User();
        //
        // u.setUsername("tim93");
        // u.setPassword("qwerty");
        // u.setEmail("test@email.com");
        // Set<Role> roles = new HashSet<Role>();
        //
        // roles.add(new Role("ROLE_USER"));
        // u.setAuthorities(roles);
        //
        // userRepository.save(u);

        User un = userRepository.findByUserName( "tim91" );

        // Collection<Role> set = un.getAuthorities();

        // System.out.println( set.toString() );

    }

    // @Test
    public void getUser()
    {

        User u = getUserByName( "tim911" );
        Assert.assertEquals( "tim91", u.getUserName() );
    }

    public User getUserByName( String name )
    {

        return this.userRepository.findByUserName( "tim91" );
    }
    
    
    @Test
    public void all(){
        
        Comment c = new Comment();
        c.setSpamCount( new Integer(10) );
        
        cr.save( c );
        
        List<Comment> d = cr.findCommentMarkedAsSpam();
        for ( Comment comment : d )
        {
            System.out.println(comment);
        }
    }

}
