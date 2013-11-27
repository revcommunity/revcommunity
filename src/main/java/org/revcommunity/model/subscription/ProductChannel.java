package org.revcommunity.model.subscription;

import org.neo4j.graphdb.Direction;
import org.revcommunity.model.Product;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class ProductChannel
    extends AbstractChannel
{
    @Fetch
    @RelatedTo( type = "CHANNEL_PRODUCT", direction = Direction.INCOMING )
    private Product channelProduct;

    public Product getChannelProduct()
    {
        return channelProduct;
    }

    public void setChannelProduct( Product channelProduct )
    {
        this.channelProduct = channelProduct;
    }

}
