package org.revcommunity.model.subscription.exception;

public class UnsupportedNotificationType
    extends RuntimeException
{

    private static final long serialVersionUID = 1L;

    public UnsupportedNotificationType()
    {
        super();
    }

    public UnsupportedNotificationType( String message, Throwable cause )
    {
        super( message, cause );
    }

    public UnsupportedNotificationType( String message )
    {
        super( message );
    }

    public UnsupportedNotificationType( Throwable cause )
    {
        super( cause );
    }

}
