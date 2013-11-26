Ext.define('RevCommunity.model.UserSubscription', {
    extend: 'Ext.data.Model',
    fields: [
         'nodeId',
         'channel',
         'newNotifications',
         {name:'user',mapping:'channel.channelOwner'}
    ],
    proxy: {
        type: 'rest',
        url : 'rest/subscriptions/users'
    }
});