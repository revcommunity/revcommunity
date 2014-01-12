package org.revcommunity.authentication;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.revcommunity.util.SessionUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component( "authSuccessHandler" )
public class AuthenticationSuccessHandlerImpl
    extends SimpleUrlAuthenticationSuccessHandler
{

    private static final Logger log = Logger.getLogger( AuthenticationSuccessHandlerImpl.class );

    @Override
    public void onAuthenticationSuccess( HttpServletRequest request, HttpServletResponse response, Authentication authentication )
        throws IOException, ServletException
    {
        this.setDefaultTargetUrl( SessionUtils.getLastUrl( request ) );
        super.onAuthenticationSuccess( request, response, authentication );
    }

}
