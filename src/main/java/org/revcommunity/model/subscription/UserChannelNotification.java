package org.revcommunity.model.subscription;

import org.neo4j.graphdb.Direction;
import org.revcommunity.model.Review;
import org.revcommunity.model.subscription.exception.UnsupportedNotificationType;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class UserChannelNotification
    extends AbstractNotification
{
    private UserNotificationType type;

    @RelatedTo( type = "HAS", direction = Direction.INCOMING )
    private UserChannel channel;

    UserChannelNotification()
    {
        super();
    }

    public UserChannelNotification( UserChannel channel, UserNotificationType type, Review review )
    {
        super();
        this.channel = channel;
        this.type = type;
        this.setReview( review );
    }

    public UserNotificationType getType()
    {
        return type;
    }

    public void setType( UserNotificationType type )
    {
        this.type = type;
    }

    @Override
    protected String buildMessage()
    {
        if ( getType() == UserNotificationType.NEW_REVIEW )
        {
            StringBuilder sb = new StringBuilder( "Użytkownik " );
            sb.append( channel.getChannelOwner().getFullName() );
            sb.append( " dodał nową recenzje dla produktu " );
            sb.append( getReview().getProduct().getName() );
            return sb.toString();
        }
        else
        {
            throw new UnsupportedNotificationType( "Unsupported notification type: " + getType() );
        }
    }
}
