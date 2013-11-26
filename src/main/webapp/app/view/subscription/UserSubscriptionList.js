Ext.define('RevCommunity.view.subscription.UserSubscriptionList', {
		extend:'Ext.view.View',
	    xtype:'usersubscriptonlist',
	    tpl:TemplateHolder.userSubscriptionList,
	    itemSelector: 'div.rev-user-subscription-item',
	    emptyText: 'Brak powiadomień',
	    selectedItemCls:'rev-user-subscription-item-selected',
	    initComponent:function(){
	    	this.store=Ext.create('RevCommunity.store.UserSubscriptionStore');
		    this.callParent(arguments);
	    }
});