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
	mode:'all',
	userName:null,
	initComponent:function(){
		var url=null;
		if(this.mode=='myReviews'){
			url='rest/reviews/my';
			this.title = 'Moje recenzje';
		}else{
			url='rest/reviews/user/'+this.userName;
			var u = UserService.getByUserName(this.userName);
			this.title = 'Recenzje użytkownika ' + u.fullName;
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
	    	   mode:'user',
	    	   store:Ext.create('Ext.data.Store',{
	    		    model:'RevCommunity.model.Review',
	    		    autoLoad:true,
	    		    pageSize:Rev.pageSize,
				    proxy: {
				        type: 'rest',
				        url : url,
						reader : {
							root : 'content',
							totalProperty : 'totalElements'
						}
				    },
					sorters : [ {
						property : 'usefulness',
						direction : 'DESC',
					} ],
	    	   })
	       });
	}
});
