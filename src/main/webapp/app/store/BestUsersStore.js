Ext.define('RevCommunity.store.BestUsersStore', {
	model : 'RevCommunity.model.User',
	extend : 'Ext.data.Store',
	pageSize : 5,
	proxy : {
		type : 'rest',
		url : 'rest/users/best',
		reader : {
			root : 'content',
			totalProperty : 'totalElements'
		}
	},
});