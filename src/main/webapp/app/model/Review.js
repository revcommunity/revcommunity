Ext.define('RevCommunity.model.Review', {
    extend: 'Ext.data.Model',
    fields: [
    		'nodeId',
    		'content',
    		'usefulness',
    		'rank',
    		'author',
    		'title',
    		'product',
    		'comments',
    		],
     proxy: {
        type: 'rest',
        url : 'rest/reviews'
    }
});