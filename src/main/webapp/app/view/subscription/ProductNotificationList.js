Ext.define('RevCommunity.view.subscription.ProductNotificationList', {
		extend:'Ext.view.View',
	    xtype:'productnotificationlist',
	    tpl:TemplateHolder.productNotificationList,
	    itemSelector: 'rev-user-subscription-item',
	    emptyText: 'Brak powiadomień',
	    selectedItemCls:'rev-user-subscription-item-selected',
	    itemCls:'rev-user-subscription-item',
	    cls:'rev-usernotificationlist',
	    singleSelect : true,
	    initComponent:function(){
	    	this.store=Ext.create('RevCommunity.store.ProductNotificationStore');
	    	this.store.getProxy().setExtraParam('productSubscriptionId',this.productSubscriptionId);
	    	this.store.load();
		    this.callParent(arguments);
	    }
});