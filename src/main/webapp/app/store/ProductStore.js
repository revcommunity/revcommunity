Ext.define('RevCommunity.store.ProductStore', {
	    fields:['name','userName', 'model','description'],
	    extend:'Ext.data.Store',
	    autoLoad:true,
	    proxy: {
	        type: 'ajax',
	        url:'http://localhost:8080/core/test/users.do',
	        reader: {
	            type: 'json',
	            root: 'items'
	        }
	    }
});