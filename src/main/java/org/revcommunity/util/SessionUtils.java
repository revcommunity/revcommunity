package org.revcommunity.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

public class SessionUtils
{
    public static String getLoggedUserName()
    {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        return username;
    }

    public static void setLastUrl( String url, HttpServletRequest request )
    {
        request.getSession().setAttribute( "lastUrl", url );

    }

    public static String getLastUrl( HttpServletRequest request )
    {
        String url = (String) request.getSession().getAttribute( "lastUrl" );
        if ( StringUtils.isBlank( url ) )
            return "/";
        return url;
    }

}
