package org.revcommunity.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.revcommunity.model.Review;
import org.revcommunity.model.User;
import org.revcommunity.model.subscription.ProductNotification;
import org.revcommunity.model.subscription.UserChannel;
import org.revcommunity.model.subscription.UserChannelNotification;
import org.revcommunity.model.subscription.UserNotificationType;
import org.revcommunity.model.subscription.UserSubscription;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.repo.subscription.UserChannelNotificationRepo;
import org.revcommunity.repo.subscription.UserChannelRepo;
import org.revcommunity.service.ReviewService;
import org.revcommunity.service.SubscriptionService;
import org.revcommunity.util.TestHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( { "classpath*:applicationContext-test.xml" } )
public class SubscriptionTest
{
    private static final Logger log = Logger.getLogger( SubscriptionTest.class );

    @Autowired
    private Neo4jTemplate tpl;

    @Autowired
    private UserRepo ur;

    @Autowired
    private TestHelper th;

    @Autowired
    private SubscriptionService ss;

    @Autowired
    private UserChannelRepo ucr;

    @Autowired
    private UserChannelNotificationRepo ucnr;

    @Autowired
    private ReviewService rs;

    @Test
    @Transactional
    public void createUserWithChannel()
    {
        User observer = th.createUser( "observer" );
        assertNotNull( observer );
        UserChannel uc = ucr.findByChannelOwner( observer );
        assertNotNull( uc );
    }

    @Test
    @Transactional
    public void addUserSubscription()
    {
        User observer = th.createUser( "observer" );
        User channelOwner = th.createUser( "subscribed" );
        ss.addUserSubscription( observer, channelOwner );

        List<UserSubscription> subs = ss.getUserSubscriptions( observer );
        assertEquals( 1, subs.size() );
        assertEquals( 0, subs.get( 0 ).getNewNotifications() );
    }

    @Test
    @Transactional
    public void createUserChannelNotification()
    {
        User observer = th.createUser( "observer" );
        User channelOwner = th.createUser( "subscribed" );
        ss.addUserSubscription( observer, channelOwner );

        List<UserSubscription> subs = ss.getUserSubscriptions( observer );
        assertEquals( 1, subs.size() );
        assertEquals( 0, subs.get( 0 ).getNewNotifications() );

        Review review = th.createReview( channelOwner );

        UserChannelNotification ucn = ss.createUserChannelNotification( channelOwner, UserNotificationType.NEW_REVIEW, review );
        assertNotNull( ucn );
        subs = ss.getUserSubscriptions( observer );
        assertEquals( 1, subs.size() );
        assertEquals( 1, subs.get( 0 ).getNewNotifications() );

    }

    @Test
    @Transactional
    public void aa()
    {
        User u = ur.findByUserName( "admin" );
        Review r = rs.getReview( 4095L );
        try
        {
            ProductNotification pn = ss.findProductNotification( u, r );
            log.debug( pn );
        }
        catch ( Exception e )
        {
            log.error( e, e );
        }
        log.debug( "end" );
    }

}
