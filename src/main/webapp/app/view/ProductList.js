Ext.define('RevCommunity.view.ProductList', {
		    title: 'Lista produktów',
		    extend:'Ext.grid.Panel',
		    xtype:'productlist',
		    cls:'rev-product-list',
		    viewConfig:{
		    	disableSelection:true,
		    	 overItemCls:'',
		    	 enableTextSelection: true
		    },
		    hideHeaders:true,
		    initComponent:function(){
		    	this.columns=[
			        {  
			        	xtype: 'templatecolumn', 
			       		flex:1,
			       		tpl:   TemplateHolder.productList
			       	}
			    ];
		    	this.store=Ext.create('RevCommunity.store.ProductStore',{
		    		proxy:Ext.create('Ext.data.proxy.Ajax',{
		    			  type: 'rest',
		    		      url : 'rest/products/categories'
		    		})
		    	});
			    this.callParent(arguments);
		    }
});
