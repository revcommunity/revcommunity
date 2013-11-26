package org.revcommunity.service;

import java.util.List;

import org.revcommunity.model.Product;
import org.revcommunity.model.Review;
import org.revcommunity.model.User;
import org.revcommunity.model.subscription.ProductChannelNotification;
import org.revcommunity.model.subscription.ProductNotification;
import org.revcommunity.model.subscription.ProductNotificationType;
import org.revcommunity.model.subscription.ProductSubscription;
import org.revcommunity.model.subscription.UserChannelNotification;
import org.revcommunity.model.subscription.UserNotification;
import org.revcommunity.model.subscription.UserNotificationType;
import org.revcommunity.model.subscription.UserSubscription;

public interface SubscriptionService
{

    public UserSubscription addUserSubscription( User observer, User subscribed );

    public List<UserSubscription> getUserSubscriptions( User observer );

    public UserChannelNotification createUserChannelNotification( User channelOwner, UserNotificationType type, Review review );

    public List<UserNotification> getUserNotifications( UserSubscription userSubscription );

    public ProductSubscription addProductSubscription( User observer, Product subscribed );

    public List<ProductSubscription> getProductSubscriptions( User observer );

    public ProductChannelNotification createProductChannelNotification( Product product, ProductNotificationType type, Review review );

    public List<ProductNotification> getProductNotifications( ProductSubscription productSubscription );

    public void clean();
}
