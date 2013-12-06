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
    		'filters',
    		'dateAdded',
    		{
    			name:'dateAddedString',
    			persist:false,
    			convert:function(v,model){
    				var date=model.data.dateAdded;
    				if(Ext.isEmpty(date))
    					return "";
    				var d=Ext.Date.format(new Date(date),UtilService.dateFormat);
    				log(d);
    				return d;
    			}
    		},
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
    			name:'filterValues',
    			convert:function(v,model){
    				try{
	    				var filters=model.data.category.filters;
	    				var filterValues=model.data.filters;
	    				var values=[];
	    				for(var i=0;i<filters.length;i++){
	    					var name=filters[i].name;
	    					var symbol=filters[i].symbol;
	    					var value=this.getFilterValue(filterValues,symbol);
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
    			},
    			getFilterValue:function(filterValues,sym){
    				for(var i=0;i<filterValues.length;i++){
    					if(filterValues[i].symbol==sym)
    						return filterValues[i].value;
    				}
    				return null;
    			}
    		}
    	],
     proxy: {
        type: 'rest',
        url : 'rest/products'
    }
});