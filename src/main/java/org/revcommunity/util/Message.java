package org.revcommunity.util;

/**
 * Class represents message with is sending to javaScript
 * 
 * @author tstraszewski
 */
public class Message
{

    private Object message;

    private boolean success = true;

    public Message( Object data )
    {
        this.message = data;
    }

    public Message()
    {
    }

    public Object getMessage()
    {
        return message;
    }

    public void setMessage( Object message )
    {
        this.message = message;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public void setSuccess( boolean success )
    {
        this.success = success;
    }

}
