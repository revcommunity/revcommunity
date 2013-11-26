package org.revcommunity.dto;

import java.util.List;

import org.revcommunity.model.subscription.AbstractChannel;
import org.revcommunity.model.subscription.AbstractNotification;

public class SubscriptionDto
{

    private AbstractChannel channel;

    private List notification;

    public AbstractChannel getChannel()
    {
        return channel;
    }

    public void setChannel( AbstractChannel channel )
    {
        this.channel = channel;
    }

    public List getNotification()
    {
        return notification;
    }

    public void setNotification( List notification )
    {
        this.notification = notification;
    }

}
