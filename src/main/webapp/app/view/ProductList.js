Ext.define('RevCommunity.view.ProductList', {
		    title: 'Lista produktów',
		    extend:'Ext.grid.Panel',
		    xtype:'productlist',
		    viewConfig:{
		    	disableSelection:true,
		    	 overItemCls:'',
		    	 enableTextSelection: true
		    },
		    hideHeaders:true,
		    store: 'ProductStore',

		    initComponent:function(){
		    	this.columns=[
			        {  
			        	xtype: 'templatecolumn', 
			       		flex:1,
			       		tpl:   TemplateHolder.productList
			       	}
			    ]
			    this.callParent(arguments);
		    }
});
