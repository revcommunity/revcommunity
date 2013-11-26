Ext.define('RevCommunity.model.ProductSubscription', {
    extend: 'Ext.data.Model',
    fields: [
         'nodeId',
         'channel',
         'newNotifications',
         {name:'product',mapping:'channel.channelProduct'}
    ],
    proxy: {
        type: 'rest',
        url : 'rest/subscriptions/products'
    }
});