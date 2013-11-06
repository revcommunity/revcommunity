Ext.define('RevCommunity.view.review.UserReviewsPanel' ,{
    extend: 'Ext.Panel',
    alias: 'widget.userreviewspanel',
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
	initComponent:function(){
		var url=null;
		if(this.mode=='myReviews'){
			url='rest/reviews/my';
		}else{
			url='rest/reviews/user/'+this.userName;
		}
		this.callParent(arguments);
		this.add({
	    	   xtype:'userinfopanel',
	    	   userName:this.userName,
	    	   style:{
	    		   marginRight:5
	    	   }
		});
		this.add({
	    	   xtype:'reviewspanel',
	    	   mode:'noUser',
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
