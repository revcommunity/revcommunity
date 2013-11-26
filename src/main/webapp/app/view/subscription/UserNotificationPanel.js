Ext.define('RevCommunity.view.subscription.UserNotificationPanel', {
		extend:'Ext.Container',
	    xtype:'usernotificationpanel',
	    cls:'rev-user-subscription-panel',
	    initComponent:function(){
		    this.callParent(arguments);
		    var subscription=this.subscription;
		    var user=subscription.channel.channelOwner;
			this.add({
				xtype:'label',
				
			});
			var list = Ext.widget('usernotificationlist', {
				cls:'rev-usernotificationlist'
			});
			this.add(list);
			list.getStore().getProxy().setExtraParam('userSubscriptionId',subscription.nodeId);
			list.getStore().load();
	    }
});