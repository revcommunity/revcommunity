package org.revcommunity.repo.subscription;

import java.util.List;

import org.revcommunity.model.subscription.ProductNotification;
import org.revcommunity.model.subscription.ProductSubscription;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ProductNotificationRepo
    extends GraphRepository<ProductNotification>
{

    @Query( "START subscription=node({0}) MATCH subscription-[rel:READ_PRODUCT_NOTIF]-noti RETURN rel" )
    public List<ProductNotification> getProductNotifications( ProductSubscription subscription );
}
