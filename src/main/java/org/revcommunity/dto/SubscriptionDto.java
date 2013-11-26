package org.revcommunity.dto;

import java.util.List;

import org.revcommunity.model.subscription.AbstractChannel;
import org.revcommunity.model.subscription.UserNotification;

public class SubscriptionDto
{

    private AbstractChannel channel;

    private List<UserNotification> notification;

    public AbstractChannel getChannel()
    {
        return channel;
    }

    public void setChannel( AbstractChannel channel )
    {
        this.channel = channel;
    }

    public List<UserNotification> getNotification()
    {
        return notification;
    }

    public void setNotification( List<UserNotification> notification )
    {
        this.notification = notification;
    }

}
