Ext.define('RevCommunity.store.ReviewStore', {
	extend : 'Ext.data.Store',
	pageSize:Rev.pageSize,
	model : 'RevCommunity.model.Review',
	remoteSort:true
});