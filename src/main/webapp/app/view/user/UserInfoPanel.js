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
				    	   fieldCls:'rev-user-name',
				    	   name:'fullName'
				       },
				       {
				    	   xtype:'label',
				    	   style:{
				    		 color:'red',
				    		 fontWeight:'bold'
				    	   },
				    	   text:'Ekspert'
				       },
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
				       }
			   ]
	       },
	       {
	    	   xtype:'basefieldset',
	    	   layout: {
	    		    type: 'vbox',
	    		    align : 'stretch',
	    		    pack  : 'start',
	    	   },
	    	   title:'Subskrybcje',
	    	   items:[ 
	    	           {
				    	   xtype:'label',
				    	   text:'anowak'
				       },
				       {
				    	   xtype:'label',
				    	   text:'madamczyk'
				       }
			   ]
	       },
	       {
	    	   xtype:'basefieldset',
	    	   layout: {
	    		    type: 'vbox',
	    		    align : 'stretch',
	    		    pack  : 'start',
	    	   },
	    	   title:'Obserwowane produkty',
	    	   items:[ 
	    	           {
				    	   xtype:'label',
				    	   text:'Asus'
				       },
				       {
				    	   xtype:'label',
				    	   text:'Galaxy'
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
		this.getForm().setValues(user);
		this.down('image').setSrc(user.image);
	}
});