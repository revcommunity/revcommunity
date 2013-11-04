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
	userName:null,
	items:[
	       {
	    	   xtype:'userinfopanel',
	    	   style:{
	    		   marginRight:5
	    	   }
	       }
	],
	initComponent:function(){
		var url=null;
		if(this.mode=='myReviews'){
			url='rest/reviews/myReviews';
		}else{
			url='rest/reviews/userReviews/'+this.userName;
		}
		this.callParent(arguments);
		this.add({
	    	   xtype:'reviewspanel',
	    	   store:Ext.create('Ext.data.Store',{
	    		    model:'RevCommunity.model.Review',
	    		    autoLoad:true,
				    proxy: {
				        type: 'rest',
				        url : url
				    }
	    	   })
	       });
	}
});
