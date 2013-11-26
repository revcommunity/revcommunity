package org.revcommunity.model.subscription;

import org.neo4j.graphdb.Direction;
import org.revcommunity.model.Review;
import org.revcommunity.model.User;
import org.revcommunity.model.subscription.exception.UnsupportedNotificationType;
import org.revcommunity.util.LinkBuilder;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class ProductChannelNotification
    extends AbstractNotification
{
    private ProductNotificationType type;

    @RelatedTo( type = "HAS_PRODUCT_CHANNEL", direction = Direction.INCOMING )
    private ProductChannel channel;

    ProductChannelNotification()
    {
        super();
    }

    public ProductChannelNotification( ProductChannel channel, ProductNotificationType type, Review review )
    {
        super();
        this.channel = channel;
        this.setType( type );
        this.setReview( review );
    }

    @Override
    protected String buildMessage()
    {
        if ( getType() == ProductNotificationType.NEW_REVIEW )
        {
            Long reviewId = getReview().getNodeId();
            String reviewLink = LinkBuilder.buildReviewLink( reviewId, "recenzję" );

            String productName = getReview().getProduct().getName();
            Long productId = getReview().getProduct().getNodeId();
            String productLink = LinkBuilder.buildProductLink( productId, productName );
            User author = getReview().getAuthor();
            String userLink = LinkBuilder.buildUserLink( author.getUserName(), author.getFullName() );
            StringBuilder sb = new StringBuilder( "Dodano nową " );
            sb.append( reviewLink );
            sb.append( " dla produktu " );
            sb.append( productLink );
            sb.append( ". Autor: " );
            sb.append( userLink );
            return sb.toString();
        }
        else
        {
            throw new UnsupportedNotificationType( "Unsupported notification type: " + getType() );
        }
    }

    public ProductNotificationType getType()
    {
        return type;
    }

    public void setType( ProductNotificationType type )
    {
        this.type = type;
    }
}
