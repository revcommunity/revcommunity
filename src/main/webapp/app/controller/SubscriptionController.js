Ext.define('RevCommunity.controller.SubscriptionController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
				'usersubscriptonlist' : {
					itemclick :this.userSubscriptionItemClick
				},
				'productsubscriptonlist' : {
					itemclick :this.productSubscriptionItemClick
				}
		});
	},
	userSubscriptionItemClick:function(view,rec,item,idx){
		log(rec.data);
		var userSubscriptionId=rec.data.nodeId;
		window.open('#subscriptions/users/notifications/'+userSubscriptionId,'_parent');
	},
	productSubscriptionItemClick:function(view,rec,item,idx){
		log(rec.data);
		var productSubscriptionId=rec.data.nodeId;
		window.open('#subscriptions/products/notifications/'+productSubscriptionId,'_parent');
	}
});