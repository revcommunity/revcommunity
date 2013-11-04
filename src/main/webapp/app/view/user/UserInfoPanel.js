Ext.define('RevCommunity.view.user.UserInfoPanel' ,{
    extend: 'Ext.Panel',
    alias: 'widget.userinfopanel',
	bodyPadding: 5,
	width: 250,
	layout: {
		    type: 'vbox',
		    align : 'stretch',
		    pack  : 'start',
	},
	title:'Użytkownik',
	items:[
	       {
	    	   xtype:'basefieldset',
	    	   layout: {
	    		    type: 'vbox',
	    		    align : 'stretch',
	    		    pack  : 'start',
	    	   },
	    	   title:'Profil użytkownika',
	    	   items:[ 
	    	           {
				    	   xtype:'label',
				    	   text:'login'
				       },
				       {
				    	   xtype:'label',
				    	   text:'Ekspert'
				       },
				       {
				    	   xtype:'button',
				    	   text:'Statystyki konta'
				       },
				       {
				    	   xtype:'button',
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
				    	   text:'login1'
				       },
				       {
				    	   xtype:'label',
				    	   text:'login2'
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
	      
	]
});