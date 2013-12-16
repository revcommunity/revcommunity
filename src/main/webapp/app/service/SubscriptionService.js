var SubscriptionService={
		subscribedProducts:[],//lista id produktów które subskrybuje zalogowany użytkownik sluzy do ukrywania przycisku obserwuj
		subscribedProductsLoaded:false,
		getAll:function(){
			var subscriptions=UtilService.exec('subscriptions');
			return subscriptions;
		},
		showUserSubscriptionsBar:function(){
			var div=Ext.get('user-subscrptions-div');
			var list=Ext.widget('usersubscriptonlist', {
			    renderTo: div,
			    id:'userSubscriptionList'
			});
			list.getStore().load();
		},
		showProductSubscriptionsBar:function(){
			var div=Ext.get('product-subscrptions-div');
			var list=Ext.widget('productsubscriptonlist', {
			    renderTo: div,
			    id:'productSubscriptionList'
			});
			list.getStore().load({
				scope:this,
				callback:function(recs){
					this.subscribedProducts=[];
					for(var i=0;i<recs.length;i++){
						this.subscribedProducts.push(recs[i].data.channel.channelProduct.nodeId);
					}
					this.subscribedProductsLoaded=true;
				}
			});
		},
		showSubscriptions:function(){
			if(UserService.hasRole('ROLE_USER')){
				SubscriptionService.showUserSubscriptionsBar();
		    	SubscriptionService.showProductSubscriptionsBar();
			}
		},
		subscribeProduct:function(productId){
			var msg=UtilService.exec('subscriptions/products/add',
				{
					productId:productId
				}
			);
			Ext.getCmp('productSubscriptionList').getStore().load();
			return msg.message;
		},
		subscribeUser:function(userName){
			var msg=UtilService.exec('subscriptions/users/add',
				{
					userName:userName
				}
			);
			Ext.getCmp('userSubscriptionList').getStore().load();
			return msg.message;
		},
		isProductSubscribed:function(pId){
			if(!this.subscribedProductsLoaded){
				var msg=UtilService.exec('subscriptions/products/subscribed',
						{
							productId:pId
						}
					);
				if(msg.message==true)
					return true;
				return false;
			}
			if( this.subscribedProducts.indexOf(pId)!=-1 ){
				return true;
			}
			return false;
		},
		markReviewAsReaded:function(reviewId){
			var msg=UtilService.exec('subscriptions/read',
					{
						reviewId:reviewId
					}
				);
			Ext.getCmp('userSubscriptionList').getStore().load();
			Ext.getCmp('productSubscriptionList').getStore().load();
		}
};