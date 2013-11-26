Ext.define('RevCommunity.model.UserNotification', {
    extend: 'Ext.data.Model',
    fields: [
          'channel',
          'notification',
          {name:'user',mapping:'channel.channelOwner'}
         
    ],
    proxy: {
        type: 'rest',
        url : 'rest/subscriptions/notifications'
    }
});