package org.revcommunity.service;

import java.util.List;

import org.revcommunity.model.Review;
import org.revcommunity.model.User;
import org.revcommunity.model.subscription.UserChannelNotification;
import org.revcommunity.model.subscription.UserNotification;
import org.revcommunity.model.subscription.UserNotificationType;
import org.revcommunity.model.subscription.UserSubscription;

public interface SubscriptionService
{

    public UserSubscription addUserSubscription( User observer, User subscribed );

    // public ProductSubscription addProductSubscription( User observer, Product subscribed );

    public List<UserSubscription> getUserSubscriptions( User observer );

    // public List<ProductSubscription> getProductSubscriptions( User observer );

    public UserChannelNotification createUserChannelNotification( User channelOwner, UserNotificationType type, Review review );

    // public void sendProductNotification( User subscribed, ProductNotificationType type );

    public List<UserNotification> getUserNotifications( UserSubscription userSubscription );

    public void clean();

    // public List<ProductNotification> getProductNotifications( ProductSubscription productSubscription );
}
