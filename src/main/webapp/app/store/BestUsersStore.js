Ext.define('RevCommunity.store.BestUsersStore', {
	model : 'RevCommunity.model.User',
	extend : 'Ext.data.Store',
	proxy : {
		type : 'rest',
		url : 'rest/users/best',
	},
});