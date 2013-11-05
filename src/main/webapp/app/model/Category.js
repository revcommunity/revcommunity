Ext.define('RevCommunity.model.Category', {
    extend: 'Ext.data.Model',
    fields: [
    		'name',
    		'nodeId',
    		'leaf'
    	],
     proxy: {
        type: 'rest',
        url : 'rest/categories'
    }
});