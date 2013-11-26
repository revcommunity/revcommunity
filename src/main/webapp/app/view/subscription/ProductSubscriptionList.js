Ext.define('RevCommunity.view.subscription.ProductSubscriptionList', {
		extend:'Ext.view.View',
	    xtype:'productsubscriptonlist',
	    tpl:TemplateHolder.productSubscriptionList,
	    itemSelector: 'div.rev-user-subscription-item',
	    emptyText: 'Brak powiadomień',
	    selectedItemCls:'rev-user-subscription-item-selected',
	    initComponent:function(){
	    	this.store=Ext.create('RevCommunity.store.ProductSubscriptionStore');
		    this.callParent(arguments);
	    }
});