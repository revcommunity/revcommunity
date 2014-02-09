Ext.define('RevCommunity.view.components.ReviewSortCombo' ,{
	extend: 'RevCommunity.view.components.ProductSortCombo',
    alias: 'widget.reviewsortcombo',
    buildStore:function(){
    	return Ext.create("Ext.data.Store",{
    		fields:['name','property'],
    		data:[
    		      {
    		    	  name:'Przydatność',
    		    	  property:'usefulness'
    		      },
    		      {
    		    	  name:'Data dodania',
    		    	  property:'dateAdded'
    		      }
    		]
    	});
    }
});
