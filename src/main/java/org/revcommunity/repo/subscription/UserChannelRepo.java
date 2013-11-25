package org.revcommunity.repo.subscription;

import java.util.List;

import org.revcommunity.model.User;
import org.revcommunity.model.subscription.UserChannel;
import org.revcommunity.model.subscription.UserSubscription;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface UserChannelRepo
    extends GraphRepository<UserChannel>
{
    public UserChannel findByChannelOwner( User channelOwner );

    @Query( "START channel=node({0}) MATCH channel<-[:SUBSCRIBE]->observers RETURN observers" )
    public List<UserSubscription> getAllObservers( UserChannel channel );
}
