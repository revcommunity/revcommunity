Ext.define('RevCommunity.model.Category', {
    extend: 'Ext.data.Model',
    fields: [
		'name',
		'nodeId',
		'filters',
		{name:'text',mapping:'name'}
	 ],
     idProperty:'nodeId',
     proxy: {
        type: 'rest',
        url : 'rest/categories'
    }
});