Ext.define('RevCommunity.store.ProductReviewsStore', {
	extend : 'Ext.data.Store',
	model : 'RevCommunity.model.Review',
	pageSize:5,
	proxy : {
		type : 'rest',
		url : 'rest/reviews/productReviews/',
		reader : {
			root : 'content',
			totalProperty : 'totalElements'
		}
	},
	setProductId : function(productId) {
		this.proxy.url = "rest/reviews/productReviews/" + productId;
	},
	sorters : [ {
		property : 'usefulness',
		direction : 'DESC',
	} ]
});