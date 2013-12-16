Ext.define('RevCommunity.controller.SubscriptionController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
				'usersubscriptonlist' : {
					itemclick :this.userSubscriptionItemClick
				},
				'productsubscriptonlist' : {
					itemclick :this.productSubscriptionItemClick
				},
				'userinfopanel button[action=subscribeUser]' : {
					click :this.subscribeUser
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
	},
	subscribeUser:function(btn){
		var userPanel=btn.up('userinfopanel');
		var userName=userPanel.userName;
		if(Ext.isEmpty(userName))
			return;
		SubscriptionService.subscribeUser(userName);
	}
});