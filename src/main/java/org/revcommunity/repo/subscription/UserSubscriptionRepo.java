package org.revcommunity.repo.subscription;

import java.util.List;

import org.revcommunity.model.User;
import org.revcommunity.model.subscription.UserChannel;
import org.revcommunity.model.subscription.UserSubscription;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface UserSubscriptionRepo
    extends GraphRepository<UserSubscription>
{
    @Query( "START observer=node({0}) MATCH observer-[:HAS_USER_SUBSCRIPTION]->subscriptions RETURN subscriptions" )
    public List<UserSubscription> getUserSubscritions( User observer );
}
