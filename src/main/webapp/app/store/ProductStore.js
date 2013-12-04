Ext.define('RevCommunity.store.ProductStore', {
	model : 'RevCommunity.model.Product',
	extend : 'Ext.data.Store',
	sorters : [ {
		property : 'rating',
		direction : 'DESC',
	} ],
});