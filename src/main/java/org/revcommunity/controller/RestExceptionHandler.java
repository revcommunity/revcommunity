package org.revcommunity.controller;

import org.revcommunity.util.Message;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RestExceptionHandler
{
    @ExceptionHandler( Exception.class )
    @ResponseStatus( HttpStatus.INTERNAL_SERVER_ERROR )
    @ResponseBody
    public Message handleIOException( Exception exception )
    {
        Message m = new Message();
        m.setMessage( "unknown-error" );
        m.setSuccess( false );
        return m;
    }

}