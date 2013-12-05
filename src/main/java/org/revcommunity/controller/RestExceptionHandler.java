package org.revcommunity.controller;

import org.apache.log4j.Logger;
import org.revcommunity.util.Message;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RestExceptionHandler
{
    private static final Logger log = Logger.getLogger( RestExceptionHandler.class );

    @ExceptionHandler( Exception.class )
    @ResponseStatus( HttpStatus.INTERNAL_SERVER_ERROR )
    @ResponseBody
    public Message handleIOException( Exception ex )
    {
        Message m = new Message();
        m.setMessage( "unknown-error" );
        m.setSuccess( false );
        log.error( ex, ex );
        return m;
    }
}