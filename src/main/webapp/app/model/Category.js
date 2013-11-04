Ext.define('RevCommunity.model.Category', {
    extend: 'Ext.data.Model',
    fields: [
    		'name'
    		
    	],
     proxy: {
        type: 'rest',
        url : 'rest/categories'
    }
});