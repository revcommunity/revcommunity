Ext.define('RevCommunity.store.SpamStore', {
	extend:'Ext.data.Store',
	model:'RevCommunity.model.Comment',
    proxy: {
        type: 'rest',
        url : 'rest/spam'
    }
});