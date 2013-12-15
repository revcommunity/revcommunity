Ext.define('RevCommunity.model.Comment', {
	extend : 'Ext.data.Model',
	fields : [ 
	           'nodeId',
	           'text',
	           'author',
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
	           ]
});