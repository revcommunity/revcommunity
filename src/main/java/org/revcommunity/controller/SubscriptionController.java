package org.revcommunity.controller;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.revcommunity.dto.SubscriptionDto;
import org.revcommunity.model.User;
import org.revcommunity.model.subscription.ProductNotification;
import org.revcommunity.model.subscription.ProductSubscription;
import org.revcommunity.model.subscription.UserNotification;
import org.revcommunity.model.subscription.UserSubscription;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.repo.subscription.ProductChannelRepo;
import org.revcommunity.repo.subscription.ProductSubscriptionRepo;
import org.revcommunity.repo.subscription.UserSubscriptionRepo;
import org.revcommunity.service.SubscriptionService;
import org.revcommunity.util.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( "/subscriptions" )
public class SubscriptionController
{

    private static final Logger log = Logger.getLogger( SubscriptionController.class );

    @Autowired
    private SubscriptionService ss;

    @Autowired
    private UserSubscriptionRepo usr;

    @Autowired
    private ProductSubscriptionRepo psr;

    @Autowired
    private UserRepo rr;

    @Autowired
    private ProductChannelRepo pcr;

    @RequestMapping( method = RequestMethod.GET, value = "users" )
    @ResponseBody
    public List<UserSubscription> getUserSubscriptions()
        throws JsonParseException, JsonMappingException, IOException
    {
        User user = rr.findByUserName( SessionUtils.getLoggedUserName() );
        List<UserSubscription> list = ss.getUserSubscriptions( user );
        return list;
    }

    @RequestMapping( method = RequestMethod.GET, value = "products" )
    @ResponseBody
    public List<ProductSubscription> getProductSubscriptions()
        throws JsonParseException, JsonMappingException, IOException
    {
        User user = rr.findByUserName( SessionUtils.getLoggedUserName() );
        List<ProductSubscription> list = ss.getProductSubscriptions( user );
        return list;
    }

    @RequestMapping( method = RequestMethod.GET, value = "users/notifications" )
    @ResponseBody
    public SubscriptionDto getUserNotifications( @RequestParam Long userSubscriptionId )
        throws JsonParseException, JsonMappingException, IOException
    {
        UserSubscription us = usr.findOne( userSubscriptionId );
        List<UserNotification> list = ss.getUserNotifications( us );
        SubscriptionDto dto = new SubscriptionDto();
        dto.setChannel( us.getChannel() );
        dto.setNotification( list );
        return dto;
    }

    @RequestMapping( method = RequestMethod.GET, value = "products/notifications" )
    @ResponseBody
    public SubscriptionDto getProductNotifications( @RequestParam Long productSubscriptionId )
        throws JsonParseException, JsonMappingException, IOException
    {
        ProductSubscription us = psr.findOne( productSubscriptionId );
        List<ProductNotification> list = ss.getProductNotifications( us );
        SubscriptionDto dto = new SubscriptionDto();
        dto.setChannel( us.getChannel() );
        dto.setNotification( list );
        return dto;
    }

}
