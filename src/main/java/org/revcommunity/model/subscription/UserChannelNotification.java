package org.revcommunity.model.subscription;

import org.neo4j.graphdb.Direction;
import org.revcommunity.model.Review;
import org.revcommunity.model.subscription.exception.UnsupportedNotificationType;
import org.revcommunity.util.LinkBuilder;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class UserChannelNotification
    extends AbstractNotification
{
    private UserNotificationType type;

    @RelatedTo( type = "HAS_USER_CHANNEL", direction = Direction.INCOMING )
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
            Long reviewId = getReview().getNodeId();
            String reviewLink = LinkBuilder.buildReviewLink( reviewId, "recenzję" );

            String productName = getReview().getProduct().getName();
            Long productId = getReview().getProduct().getNodeId();
            String productLink = LinkBuilder.buildProductLink( productId, productName );

            String userLink = LinkBuilder.buildUserLink( channel.getChannelOwner().getUserName(), channel.getChannelOwner().getFullName() );
            StringBuilder sb = new StringBuilder();
            sb.append( userLink );
            sb.append( " dodał(a) nową " );
            sb.append( reviewLink );
            sb.append( " dla produktu " );
            sb.append( productLink );
            return sb.toString();
        }
        else
        {
            throw new UnsupportedNotificationType( "Unsupported notification type: " + getType() );
        }
    }
}
