package org.revcommunity.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.revcommunity.model.KeyValuePair;
import org.revcommunity.model.User;
import org.revcommunity.repo.KeyValuePairRepo;
import org.revcommunity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Klasa odpowiada za wykonanie dodatkowych operacji inicjalizujących system.
 * 
 * @author Paweł Rosolak 6 gru 2013
 */
public class RevContextListener
    implements ServletContextListener
{
    private static final Logger log = Logger.getLogger( RevContextListener.class );

    @Autowired
    private UserService us;
    
    @Autowired
    private KeyValuePairRepo keyValuePairRepo;

    @Value( "${admin.username}" )
    private String adminUserName;

    @Value( "${admin.password}" )
    private String adminPassword;

    public void contextInitialized( ServletContextEvent sce )
    {
        WebApplicationContextUtils.getRequiredWebApplicationContext( sce.getServletContext() ).getAutowireCapableBeanFactory().autowireBean( this );

        checkAdminUser();
        checkAverageUsefulness();
        log.debug( "System został uruchomiony." );
    }

    /**
     * Sprawdza czy w systemie istnieje użytkownik admin, jeżeli nie to użytkownik jest tworzony. Nazwę tego użytkownika
     * i hasło można edytować w pliku konfiguracyjnym - config.properties
     * 
     * @author Paweł Rosolak 6 gru 2013
     */
    private void checkAdminUser()
    {
        User admin = us.getUser( adminUserName );
        if ( admin == null )
        {
            log.debug( "W systemie nie ma użytkownika admin." );
            log.debug( "Tworze użytkownika admin o logine: " + adminUserName );
            admin = new User();
            admin.setUserName( adminUserName );
            admin.setFirstName( "Administrator" );
            admin.setPassword( adminPassword );
            admin.addRole( "ROLE_ADMIN" );
            us.createUser( admin );
        }
        else
        {
            log.debug( "Użytkownika admin już istnieje." );
        }
    }
    
    public void checkAverageUsefulness(){
		KeyValuePair keyValuePair = keyValuePairRepo.findOneByKey("avgUsefulness");
		if(keyValuePair == null){
			keyValuePair = new KeyValuePair();
			keyValuePair.setKey("avgUsefulness");
			//TODO: mozna jakos wymusic akcje Joba?
			keyValuePair.setValue(0.5);
			keyValuePairRepo.save(keyValuePair);
			log.debug( "Tworzę averageUsefulness keyValuePair." );
		}
        else
        {
            log.debug( "averageUsefulness keyValuePair już istnieje." );
        }
    }

    public void contextDestroyed( ServletContextEvent sce )
    {

        log.debug( "System został zatrzymany." );
    }

}
