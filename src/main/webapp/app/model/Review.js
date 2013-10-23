Ext.define('RevCommunity.model.Review', {
    extend: 'Ext.data.Model',
    fields: [
    		'id',
    		'content',
    		'usefulness',
    		'rank',
    		'author',
    		'title',
    		'product'],
     proxy: {
        type: 'rest',
        url : 'rest/reviews'
    }
});