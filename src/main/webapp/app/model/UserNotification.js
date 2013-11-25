Ext.define('RevCommunity.model.UserNotification', {
    extend: 'Ext.data.Model',
    fields: [
         'nodeId',
         'notification',
         'readed'
         
    ],
    proxy: {
        type: 'rest',
        url : 'rest/subscriptions/notifications'
    }
});