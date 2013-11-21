Ext.define('RevCommunity.controller.SubscriptionController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
				'usersubscriptonlist' : {
					itemclick :this.userSubscriptionItemClick
				}
		});
	},
	userSubscriptionItemClick:function(view,rec,item,idx){
		log(rec.data);
		Ext.getCmp('contentPanel').removeAll();
		var list = Ext.widget('usernotificationlist', {
		});
		Ext.getCmp('contentPanel').add(list);
		list.getStore().getProxy().setExtraParam('userSubscriptionId',rec.data.nodeId);
		list.getStore().load();
	}
});