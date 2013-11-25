package org.revcommunity.repo.subscription;

import org.revcommunity.model.subscription.ProductSubscription;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ProductSubscriptionRepo
    extends GraphRepository<ProductSubscription>
{
}
