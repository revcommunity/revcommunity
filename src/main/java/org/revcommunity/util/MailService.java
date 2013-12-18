package org.revcommunity.util;

import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;

/**
 * @author Tomek Straszewski Dec 16, 2013
 */
public class MailService
{
    private static final Logger logger = Logger.getLogger( MailService.class );

    private static final String MAIL_SMTP_PORT = "465";

    private static final String MAIL_SMTP_HOST = "smtp.gmail.com";

    private static final String MAIL_SMTP_STARTTLS_ENABLE = "true";

    private static final String MAIL_SMTP_AUTH = "true";

    private static final String USERNAME = "reviewcommunityallegro@gmail.com";

    private static final String PASSWORD = "CKXW0.)a";

    private static final String NEWSLETTER_SUBJECT = "Newsletter - RevCommunity";

    Properties props = new Properties();

    Session session;

    public MailService()
    {
        props.put( "mail.smtp.auth", MAIL_SMTP_AUTH );
        props.put( "mail.smtp.socketFactory.port", MAIL_SMTP_PORT );
        props.put( "mail.smtp.host", MAIL_SMTP_HOST );
        props.put( "mail.smtp.port", MAIL_SMTP_PORT );
        props.put( "mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory" );

        session = Session.getInstance( props, new javax.mail.Authenticator()
        {
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication( USERNAME, PASSWORD );
            }
        } );
    }

    public void sendEmails( String text, String... recipents )
    {

        ArrayList<Address> addressTo = new ArrayList<Address>( recipents.length );

        try
        {

            for ( String r : recipents )
            {
                addressTo.add( new InternetAddress( r ) );
            }

            Address[] adds = addressTo.toArray( new InternetAddress[0] );

            if ( logger.isDebugEnabled() )
            {
                logger.debug( "Trying sent mail message to: " + addressTo.size() + " people..." );
            }

            MimeMessage message = new MimeMessage( session );
            message.setFrom( new InternetAddress( USERNAME ) );
            message.setRecipients( MimeMessage.RecipientType.TO, adds );
            message.setSubject( NEWSLETTER_SUBJECT );
            message.setContent( text, "text/html; charset=utf-8" );

            Transport.send( message );

            if ( logger.isDebugEnabled() )
            {
                logger.debug( "Mail sent to: " + addressTo.size() + " people" );
                logger.debug( "Exit..." );
            }

        }
        catch ( MessagingException e )
        {
            e.printStackTrace();
        }
    }
}
