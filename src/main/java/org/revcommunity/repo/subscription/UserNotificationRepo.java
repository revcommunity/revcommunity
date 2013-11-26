package org.revcommunity.repo.subscription;

import java.util.List;

import org.revcommunity.model.subscription.UserNotification;
import org.revcommunity.model.subscription.UserSubscription;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface UserNotificationRepo
    extends GraphRepository<UserNotification>
{

    @Query( "START subscription=node({0}) MATCH subscription-[rel:READ_USER_NOTIF]-noti RETURN rel" )
    public List<UserNotification> getUserNotifications( UserSubscription subscription );

}
