Ext.define('RevCommunity.model.UserSubscription', {
    extend: 'Ext.data.Model',
    fields: [
         'nodeId',
         'channel',
         'newNotifications'
    ],
    proxy: {
        type: 'rest',
        url : 'rest/subscriptions'
    }
});