Ext.define('RevCommunity.model.ProductNotification', {
    extend: 'Ext.data.Model',
    fields: [
          'channel',
          'notification',
          {name:'product',mapping:'channel.channelProduct'}
         
    ],
    proxy: {
        type: 'rest',
        url : 'rest/subscriptions/products/notifications'
    }
});