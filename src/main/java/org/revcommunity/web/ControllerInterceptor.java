package org.revcommunity.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.revcommunity.util.SessionUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * Interceptor dla kontrolerów. Metody tej klasy są wywoływane przy każdym wywołaniu metody kontrolera.
 * 
 * @author Paweł Rosolak 6 gru 2013
 */
public class ControllerInterceptor
    implements HandlerInterceptor
{
    private static final Logger log = Logger.getLogger( ControllerInterceptor.class );

    public void afterCompletion( HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3 )
        throws Exception
    {
    }

    public void postHandle( HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3 )
        throws Exception
    {
    }

    public boolean preHandle( HttpServletRequest arg0, HttpServletResponse arg1, Object arg2 )
        throws Exception
    {
        String loggedUserName = SessionUtils.getLoggedUserName();
        if ( StringUtils.isBlank( loggedUserName ) )
        {
            log.trace( "W sesji nie znaleziono nazwy użytkownika" );
            return false;
        }
        log.trace( "Użytkownik :" + loggedUserName + " wywołał " + arg2 );
        return true;
    }

}
