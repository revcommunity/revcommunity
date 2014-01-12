Ext.define('RevCommunity.view.user.UserInfoPanel' ,{
    extend: 'Ext.form.Panel',
    alias: 'widget.userinfopanel',
	bodyPadding: 5,
	width: 200,
	layout: {
		    type: 'vbox',
		    align : 'stretch',
		    pack  : 'start',
	},
	title:'Użytkownik',
	userName:null,
	items:[
	       {
	    	   xtype:'basefieldset',
	    	   name:'userInfoFieldSet',
	    	   layout: {
	    		    type: 'vbox',
	    		    align : 'center',
	    		    pack  : 'start'
	    	   },
	    	   title:'Profil użytkownika',
	    	   items:[ 
	    	           { 
				    	   xtype:'image',
				    	   name:'image',
				    	   imgCls:'rev-user-small-image'
				       },
	    	           {
				    	   xtype:'displayfield',
				    	   fieldCls:'rev-user-name-small',
				    	   name:'fullName'
				       },
				       {
				    	   xtype:'displayfield',
				    	   name : 'extendedRank',
				       },/*
				       {
				    	   xtype:'button',
				    	   width:150,
				    	   style:{
				    		 marginTop:'5px'  
				    	   },
				    	   text:'Statystyki konta'
				       },
				       {
				    	   xtype:'button',
				    	   width:150,
				    	   style:{
					    		 marginTop:'5px'  
				    	   },
				    	   text:'Ustawienia konta'
				       },*/
				       {
				    	   xtype:'button',
				    	   width:150,
				    	   name: 'botton-subscribe',
				    	   style:{
					    		 marginTop:'5px'  
				    	   },
				    	   action:'subscribeUser',
				    	   text:'Subskrybuj'
				       }
			   ]
	       }
	],
	initComponent:function(){
		var user=null;
		if(Ext.isEmpty(this.userName)){
			user=UserService.getLoggedUser();
		}else{
			user=UserService.getByUserName(this.userName);
		}

		this.callParent(arguments);
		var extendedRank = UserService.buildRankString(user);
		user.extendedRank = extendedRank;
		this.getForm().setValues(user);
		this.down('image').setSrc(user.image);

		if (user.nodeId==UserService.getLoggedUser().nodeId){
			var btn = this.down('button[name=botton-subscribe]');
			btn.hide();
		}
		
	}
});