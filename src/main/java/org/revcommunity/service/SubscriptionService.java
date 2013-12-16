package org.revcommunity.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.revcommunity.model.Product;
import org.revcommunity.model.Review;
import org.revcommunity.model.User;
import org.revcommunity.model.subscription.ProductChannel;
import org.revcommunity.model.subscription.ProductChannelNotification;
import org.revcommunity.model.subscription.ProductNotification;
import org.revcommunity.model.subscription.ProductNotificationType;
import org.revcommunity.model.subscription.ProductSubscription;
import org.revcommunity.model.subscription.UserChannel;
import org.revcommunity.model.subscription.UserChannelNotification;
import org.revcommunity.model.subscription.UserNotification;
import org.revcommunity.model.subscription.UserNotificationType;
import org.revcommunity.model.subscription.UserSubscription;
import org.revcommunity.repo.subscription.ProductChannelNotificationRepo;
import org.revcommunity.repo.subscription.ProductChannelRepo;
import org.revcommunity.repo.subscription.ProductNotificationRepo;
import org.revcommunity.repo.subscription.ProductSubscriptionRepo;
import org.revcommunity.repo.subscription.UserChannelNotificationRepo;
import org.revcommunity.repo.subscription.UserChannelRepo;
import org.revcommunity.repo.subscription.UserNotificationRepo;
import org.revcommunity.repo.subscription.UserSubscriptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SubscriptionService
{
    private static final Logger log = Logger.getLogger( SubscriptionService.class );

    @Autowired
    private UserSubscriptionRepo usr;

    @Autowired
    private UserChannelNotificationRepo ucnr;

    @Autowired
    private ProductChannelNotificationRepo pcnr;

    @Autowired
    private ProductSubscriptionRepo psr;

    @Autowired
    private ProductNotificationRepo pbr;

    @Autowired
    private UserChannelRepo ucr;

    @Autowired
    private ProductChannelRepo pcr;

    @Autowired
    private UserNotificationRepo unr;

    @Autowired
    private ProductNotificationRepo pnr;

    @Autowired
    private UserService us;

    @Autowired
    private ReviewService rs;

    public UserSubscription addUserSubscription( User observer, User subscribed )
    {
        UserSubscription us = new UserSubscription();
        us.setObserver( observer );
        UserChannel uc = ucr.findByChannelOwner( subscribed );
        us.setChannel( uc );
        usr.save( us );
        return us;
    }

    public List<UserSubscription> getUserSubscriptions( User observer )
    {
        return usr.getUserSubscritions( observer );
    }

    public UserChannelNotification createUserChannelNotification( User channelOwner, UserNotificationType type, Review review )
    {
        UserChannel uc = ucr.findByChannelOwner( channelOwner );
        UserChannelNotification ucn = new UserChannelNotification( uc, type, review );
        ucnr.save( ucn );
        List<UserSubscription> subs = ucr.getAllObservers( uc );
        for ( UserSubscription userSubscription : subs )
        {
            log.debug( userSubscription );
            UserNotification un = new UserNotification( userSubscription, ucn );
            unr.save( un );
            userSubscription.setNewNotifications( userSubscription.getNewNotifications() + 1 );
            usr.save( userSubscription );
        }
        return ucn;
    }

    public List<UserNotification> getUserNotifications( UserSubscription userSubscription )
    {
        return unr.getUserNotifications( userSubscription );
    }

    public void clean()
    {
        usr.deleteAll();
        unr.deleteAll();
        psr.deleteAll();
        pnr.deleteAll();
    }

    public ProductSubscription addProductSubscription( User observer, Product subscribed )
    {
        boolean exist = checkProductSubscriptionExist( observer, subscribed );
        if ( exist )
        {
            log.debug( "Użytkownik: " + observer.getUserName() + " obserwuje już produkt: " + subscribed.getName() + " " + subscribed.getNodeId() );
            return null;
        }
        ProductSubscription us = new ProductSubscription();
        us.setObserver( observer );
        ProductChannel uc = pcr.findByChannelProduct( subscribed );
        us.setChannel( uc );
        psr.save( us );
        return us;
    }

    public boolean checkProductSubscriptionExist( User observer, Product subscribed )
    {
        List<ProductSubscription> subs = getProductSubscriptions( observer );
        for ( ProductSubscription sub : subs )
        {
            if ( sub.getChannel().getChannelProduct().getNodeId().equals( subscribed.getNodeId() ) )
            {
                return true;
            }
        }
        return false;
    }

    public List<ProductSubscription> getProductSubscriptions( User observer )
    {
        return psr.getProductSubscritions( observer );
    }

    public ProductChannelNotification createProductChannelNotification( Product product, ProductNotificationType type, Review review )
    {
        ProductChannel uc = pcr.findByChannelProduct( product );
        ProductChannelNotification ucn = new ProductChannelNotification( uc, type, review );
        pcnr.save( ucn );
        List<ProductSubscription> subs = pcr.getAllObservers( uc );
        for ( ProductSubscription userSubscription : subs )
        {
            log.debug( userSubscription );
            ProductNotification un = new ProductNotification( userSubscription, ucn );
            pnr.save( un );
            userSubscription.setNewNotifications( userSubscription.getNewNotifications() + 1 );
            psr.save( userSubscription );
        }
        return ucn;
    }

    public List<ProductNotification> getProductNotifications( ProductSubscription productSubscription )
    {
        return pnr.getProductNotifications( productSubscription );
    }

    public ProductNotification findProductNotification( User user, Review review )
    {
        return pbr.findProductNotification( user, review );
    }

    public UserNotification findUserNotification( User user, Review review )
    {
        return unr.findUserNotification( user, review );
    }

    public void markReviewAsReaded( String userName, Long reviewId )
    {
        User user = us.getUser( userName );
        Review review = rs.getReview( reviewId );
        ProductNotification pn = findProductNotification( user, review );
        if ( pn != null && pn.isReaded() == false )
        {
            pn.setReaded( true );
            pn.getSubscription().decreaseNewNotifications();
            pnr.save( pn );
            psr.save( pn.getSubscription() );
        }
        UserNotification un = findUserNotification( user, review );
        if ( un != null && un.isReaded() == false )
        {
            un.setReaded( true );
            un.getSubscription().decreaseNewNotifications();
            unr.save( un );
            usr.save( un.getSubscription() );
        }
    }

}
