Ext.define('RevCommunity.view.user.UserPanel' ,{
    extend: 'Ext.form.Panel',
    alias: 'widget.userpanel',
	bodyPadding: 5,
	width: 200,
	layout: {
		    type: 'hbox',
		    align : 'stretch',
		    pack  : 'start',
	},
	title:'Informacje o koncie',
	userName:null,
	items:[
	       {
	    	   xtype:'basefieldset',
	    	   flex:1,
	    	   name:'userInfoFieldSet',
	    	   layout: {
	    		    type: 'hbox',
	    		    align : 'left',
	    		    pack  : 'start'
	    	   },
	    	   title:'Profil użytkownika',
	    	   items:[ 
	    	           {
	    	        	 xtype:'container',
	    	        	 layout:'vbox',
	    	        	 items:[
		    	        	       { 
	    					    	   xtype:'image',
	    					    	   name:'image',
	    					    	   imgCls:'rev-user-image'
	    					       },
	    					       { 
	    					    	   xtype:'button',
	    					    	   action:'changeImage',
	    					    	   text:'Zmień'
	    					       }
	    			      ]
	    	           },
	    	           {
	    	        	 xtype:'container',
	    	        	 items:[
			    	           {
						    	   xtype:'displayfield',
						    	   fieldLabel:'Imię i nazwisko',
						    	   name:'fullName'
						       },
						       {
						    	   xtype:'displayfield',
						    	   fieldLabel:'Email',
						    	   name:'email'
						       },
						       {
						    	   fieldLabel:'Ranga',
						    	   xtype:'displayfield',
						    	   name : 'rank',
						       }
						  ]
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