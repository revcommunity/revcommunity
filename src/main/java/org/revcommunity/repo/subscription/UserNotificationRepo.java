package org.revcommunity.repo.subscription;

import java.util.List;

import org.revcommunity.model.Review;
import org.revcommunity.model.User;
import org.revcommunity.model.subscription.UserNotification;
import org.revcommunity.model.subscription.UserSubscription;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface UserNotificationRepo
    extends GraphRepository<UserNotification>
{

    @Query( "START subscription=node({0}) MATCH subscription-[rel:READ_USER_NOTIF]-noti RETURN rel" )
    public List<UserNotification> getUserNotifications( UserSubscription subscription );

    @Query( "START user=node({0}),review=node({1}) MATCH user-[:HAS_USER_SUBSCRIPTION]->userSub-[notif:READ_USER_NOTIF]-userChannelNotif-[:ABOUT]-review RETURN notif" )
    public UserNotification findUserNotification( User user, Review review );

}
