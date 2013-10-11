Ext.define('RevCommunity.store.ProductReviewsStore', {
	extend:'Ext.data.Store',
	model:'RevCommunity.model.Review',
    proxy: {
        type: 'rest',
        url : 'rest/reviews/productReviews/'
    },
    setProductId:function(productId){
    	this.proxy.url="rest/reviews/productReviews/"+productId;
    },
});