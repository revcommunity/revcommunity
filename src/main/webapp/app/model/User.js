Ext.define('RevCommunity.model.User', {
    extend: 'Ext.data.Model',
    fields: [
    		'userName',
    		'password',
    		'rank',
    		{
    			name:'nodeId',
    			convert:function(v){
    				if(Ext.isEmpty(v)){
    					return null;
    				}
    				return v;
    			}
    		},
    		{
    			name:'firstName',
    			convert:function(v){
    				if(Ext.isEmpty(v)){
    					return null;
    				}
    				return v;
    			}
    		},
    		{
    			name:'lastName',
    			convert:function(v){
    				if(Ext.isEmpty(v)){
    					return null;
    				}
    				return v;
    			}
    		},
    		{
    			name:'roles',
    			convert:function(v){
    				if(Ext.isEmpty(v)){
    					return null;
    				}
    				return v;
    			}
    		},
    		{
    			name:'image',
    			convert:function(v){
    				if(Ext.isEmpty(v)){
    					return null;
    				}
    				return v;
    			}
    		},
    		'positiveReviewRatingsCount',
    		'reviewRatingsCount',
    ],
    proxy: {
        type: 'rest',
        url : 'rest/users'
    }
});