package org.revcommunity.repo.subscription;

import java.util.List;

import org.revcommunity.model.Review;
import org.revcommunity.model.User;
import org.revcommunity.model.subscription.ProductNotification;
import org.revcommunity.model.subscription.ProductSubscription;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ProductNotificationRepo
    extends GraphRepository<ProductNotification>
{

    @Query( "START subscription=node({0}) MATCH subscription-[rel:READ_PRODUCT_NOTIF]-noti RETURN rel" )
    public List<ProductNotification> getProductNotifications( ProductSubscription subscription );

    @Query( "START user=node({0}),review=node({1}) MATCH user-[:HAS_PRODUCT_SUBSCRIPTION]->productSub-[notif:READ_PRODUCT_NOTIF]-productChannelNotif-[:ABOUT]-review RETURN notif" )
    public ProductNotification findProductNotification( User user, Review review );
}
