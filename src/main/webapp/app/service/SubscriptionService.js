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
		},
		showProductSubscriptionsBar:function(){
			var div=Ext.get('product-subscrptions-div');
			var list=Ext.widget('productsubscriptonlist', {
			    renderTo: div
			});
			list.getStore().load();
		},
		showSubscriptions:function(){
			if(UserService.hasRole('ROLE_USER')){
				SubscriptionService.showUserSubscriptionsBar();
		    	SubscriptionService.showProductSubscriptionsBar();
			}
		}
};