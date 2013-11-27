package org.revcommunity.repo.subscription;

import java.util.List;

import org.revcommunity.model.User;
import org.revcommunity.model.subscription.ProductSubscription;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ProductSubscriptionRepo
    extends GraphRepository<ProductSubscription>
{

    @Query( "START observer=node({0}) MATCH observer-[:HAS_PRODUCT_SUBSCRIPTION]->subscriptions RETURN subscriptions" )
    public List<ProductSubscription> getProductSubscritions( User observer );
}
