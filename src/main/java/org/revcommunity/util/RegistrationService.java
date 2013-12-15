package org.revcommunity.util;

import org.revcommunity.model.User;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.util.registration.AlphanumericValidator;
import org.revcommunity.util.registration.EmailValidator;
import org.revcommunity.util.registration.MinMaxValidator;
import org.revcommunity.util.registration.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * Klasa odpowiedzialna za walidację użytkownika podczas rejestracji
 *
 * @author Tomek Straszewski Dec 15, 2013
 */
@Service
public class RegistrationService
{
    @Autowired
    private UserRepo userRepo;
    
    public boolean validateUser(User u){
        
        Validator validator = new MinMaxValidator( 3, 15 );
        
        String firstName = u.getFirstName();
        
        if( !validator.validate( firstName ))
                        return false;
        
        validator = new AlphanumericValidator();
        
        if( !validator.validate( firstName ))
            return false;
        
        String lastName = u.getLastName();
        
        validator = new MinMaxValidator( 3, 20 );
        
        if( !validator.validate( lastName ))
                        return false;
        
        validator = new AlphanumericValidator();
        
        if( !validator.validate( lastName ))
            return false;
        
        
        String email = u.getEmail();
        
        validator = new MinMaxValidator( 0, 1000 );
        
        if( !validator.validate( email ))
                        return false;
        
        validator = new EmailValidator();
        
        if( !validator.validate( email ))
            return false;
        
        
        String login = u.getUserName();
        
        validator = new MinMaxValidator( 5, 15 );
        
        if( !validator.validate( login ))
                        return false;
        
        validator = new AlphanumericValidator();
        
        if( !validator.validate( login ))
            return false;
        
        String pass = u.getPassword();
        
        validator = new MinMaxValidator( 5, 15 );
        
        if( !validator.validate( pass ))
                        return false;
        
        return true;
    }
}
