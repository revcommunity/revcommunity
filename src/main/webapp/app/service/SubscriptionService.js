var SubscriptionService={
		getAll:function(){
			var subscriptions=UtilService.exec('subscriptions');
			return subscriptions;
		},
		showUserSubscriptionsBar:function(){
			var div=Ext.get('user-subscrptions-div');
			var list=Ext.widget('usersubscriptonlist', {
			    renderTo: div
			});
			list.getStore().load();
		}
};