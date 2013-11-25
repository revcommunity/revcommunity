package org.revcommunity.model.subscription;

import org.revcommunity.model.subscription.exception.UnsupportedNotificationType;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class ProductNotification
    extends AbstractNotification
{
    private ProductSubscription subscription;

    private ProductNotificationType type;

    public ProductNotification( ProductSubscription subscription )
    {
        super();
        this.subscription = subscription;
    }

    public ProductNotificationType getType()
    {
        return type;
    }

    public void setType( ProductNotificationType type )
    {
        this.type = type;
    }

    @Override
    protected String buildMessage()
    {
        if ( getType() == ProductNotificationType.NEW_REVIEW )
        {
            StringBuilder sb = new StringBuilder( "Dodano nową recenzję dla produktu " );
            sb.append( subscription.getSubscribed().getName() );
            return sb.toString();
        }
        else
        {
            throw new UnsupportedNotificationType( "Unsupported notification type: " + getType() );
        }
    }
}
