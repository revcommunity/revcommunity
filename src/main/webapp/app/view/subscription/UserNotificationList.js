Ext.define('RevCommunity.view.subscription.UserNotificationList', {
		extend:'Ext.view.View',
	    xtype:'usernotificationlist',
	    tpl:TemplateHolder.userNotificationList,
	    itemSelector: 'div.rev-user-notification-item',
	    emptyText: 'Brak powiadomień',
	    viewConfig:{
	    	 overItemCls:'rev-user-notification-item-selected',
	    },
	    initComponent:function(){
	    	this.store=Ext.create('RevCommunity.store.UserNotificationStore');
		    this.callParent(arguments);
	    }
});