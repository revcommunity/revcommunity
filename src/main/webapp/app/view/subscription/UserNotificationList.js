Ext.define('RevCommunity.view.subscription.UserNotificationList', {
		extend:'Ext.view.View',
	    xtype:'usernotificationlist',
	    tpl:TemplateHolder.userNotificationList,
	    itemSelector: 'rev-user-subscription-item',
	    emptyText: 'Brak powiadomień',
	    selectedItemCls:'rev-user-subscription-item-selected',
	    itemCls:'rev-user-subscription-item',
	    cls:'rev-usernotificationlist',
	    singleSelect : true,
	    initComponent:function(){
	    	this.store=Ext.create('RevCommunity.store.UserNotificationStore');
	    	this.store.getProxy().setExtraParam('userSubscriptionId',this.userSubscriptionId);
	    	this.store.load();
		    this.callParent(arguments);
	    }
});