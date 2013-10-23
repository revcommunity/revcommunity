Ext.define('RevCommunity.view.myReviews.MyReviewsPanel' ,{
    extend: 'Ext.Panel',
    alias: 'widget.myreviewspanel',
	bodyPadding: 5,
	width: 250,
	layout: {
	    type: 'hbox',
	    align : 'stretch',
	    pack  : 'start',
	},
	mode:'myReviews',
	title:'Moje recenzje',
	items:[
	       {
	    	   xtype:'userinfopanel',
	    	   style:{
	    		   marginRight:5
	    	   }
	       },
	       {
	    	   xtype:'reviewspanel',
	    	   store:Ext.create('Ext.data.Store',{
	    		    model:'RevCommunity.model.Review',
	    		    autoLoad:true,
				    proxy: {
				        type: 'rest',
				        url : 'rest/reviews/myReviews'
				    }
	    	   })
	       }
	]
});