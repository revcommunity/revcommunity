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
    		'dateAdded',
    		{
    			name:'comments',
    			convert:function(v){
    				if(Ext.isEmpty(v)){
    					return null;
    				}
    				return v;
    			}
    		}
    ],
    proxy: {
        type: 'rest',
        url : 'rest/reviews'
    }
});