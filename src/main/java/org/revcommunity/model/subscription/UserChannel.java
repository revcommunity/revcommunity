package org.revcommunity.model.subscription;

import org.neo4j.graphdb.Direction;
import org.revcommunity.model.User;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class UserChannel
    extends AbstractChannel
{
    @Fetch
    @RelatedTo( type = "CHANNEL_OWNER", direction = Direction.INCOMING )
    private User channelOwner;

    public User getChannelOwner()
    {
        return channelOwner;
    }

    public void setChannelOwner( User channelOwner )
    {
        this.channelOwner = channelOwner;
    }

}
