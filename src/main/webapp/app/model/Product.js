Ext.define('RevCommunity.model.Product', {
    extend: 'Ext.data.Model',
    fields: [
    		'name',
    		'producer',
    		'nodeId',
    		'productCode',
    		'category',
    		'priceAvg',
    		'rating',
    		'keys',
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
    		},
    		{
    			name:'filters',
    			convert:function(v,model){
    				try{
	    				var filters=model.data.category.filters;
	    				var keys=model.data.keys;
	    				var values=[];
	    				for(var i=0;i<filters.length;i++){
	    					var name=filters[i].name;
	    					var symbol=filters[i].symbol;
	    					var value=keys[symbol];
	    					values.push({
	    						name:name,
	    						value:value
	    					});
	    				}
	    				return values;
    				}catch(e){
    					log('error'+e);
    					return [];
    				}
    			}
    		}
    	],
     proxy: {
        type: 'rest',
        url : 'rest/products'
    }
});