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
		var userSubscriptionId=rec.data.nodeId;
		window.open('#subscriptions/notifications/'+userSubscriptionId,'_parent');
	}
});