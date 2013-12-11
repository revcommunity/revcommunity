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
    			name:'dateAddedString',
    			persist:false,
    			convert:function(v,model){
    				var date=model.data.dateAdded;
    				if(Ext.isEmpty(date))
    					return "";
    				var d=Ext.Date.format(new Date(date),UtilService.dateFormat);
    				return d;
    			}
    		},
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