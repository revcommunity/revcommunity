Ext.define('RevCommunity.model.Review', {
    extend: 'Ext.data.Model',
    fields: [
    		'id',
    		'content',
    		'usefulness',
    		'rank',
    		'authorName',
    		'productId'],
     proxy: {
        type: 'rest',
        url : 'rest/reviews'
    }
});