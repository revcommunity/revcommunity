Ext.define('RevCommunity.model.Product', {
    extend: 'Ext.data.Model',
    fields: [
    		'name',
    		'producer',
    		'nodeId',
    		'productCode',
    		'category',
    		'priceAvg',
    		{
    			name:'reviewCount',
    			type:'integer'
    		},
    		'description',
    		{
	    		name:'mainImage',
	    		type:'string', 
	    		convert:function(v){
	    			if(Ext.isEmpty(v))
	    				return "img/empty.jpg";
	    			else 
	    				return v;
	    		}
    		}
    	],
     proxy: {
        type: 'rest',
        url : 'rest/products'
    }
});