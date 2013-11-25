package org.revcommunity.model.subscription;

import org.neo4j.graphdb.Direction;
import org.revcommunity.model.Product;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class ProductSubscription
    extends AbstractChannel
{
    @RelatedTo( type = "IS_SUBSCRIBED", direction = Direction.INCOMING )
    private Product subscribed;

    public Product getSubscribed()
    {
        return subscribed;
    }

    public void setSubscribed( Product subscribed )
    {
        this.subscribed = subscribed;
    }
}
