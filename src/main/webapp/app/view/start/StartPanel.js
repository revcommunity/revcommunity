Ext.define('RevCommunity.view.start.StartPanel' ,{
    extend: 'Ext.Panel',
    alias: 'widget.startpanel',
	bodyPadding: 5,
	border: false,
	bodyCls:'rev-startpanel',
	layout:'hbox',
	items:[
	      {
	    	  title:'Najnowsze produkty',
	    	  xtype:'productlist',
	    	  mode:'newest',
	    	  width:'50%',
	    	  style:{
	    		  marginRight:5
	    	  }
	      },
	      {
	    	  title:'Najnowsze recenzje',
	    	  xtype:'reviewspanel',
	    	  width:'50%',
	    	  mode:'newest'
	      }
	],
	initComponent:function(){
		this.callParent(arguments);
		this.down('productlist').getStore().load();
		this.down('reviewspanel').getStore().load();
	}
});
