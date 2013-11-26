package org.revcommunity.repo.subscription;

import org.revcommunity.model.subscription.ProductNotification;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ProductNotificationRepo
    extends GraphRepository<ProductNotification>
{
}
