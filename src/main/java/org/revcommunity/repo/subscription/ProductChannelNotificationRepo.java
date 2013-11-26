package org.revcommunity.repo.subscription;

import org.revcommunity.model.subscription.ProductChannelNotification;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ProductChannelNotificationRepo
    extends GraphRepository<ProductChannelNotification>
{
}
