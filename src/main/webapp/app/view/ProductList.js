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
		    mode:'categories',
		    hideHeaders:true,
		    initComponent:function(){
		    	this.columns=[
			        {  
			        	xtype: 'templatecolumn', 
			       		flex:1,
			       		tpl:   TemplateHolder.productList
			       	}
			    ];
		    	var url='rest/products/categories';
		    	if(this.mode=='all'){
		    		url='rest/products';
		    	}else if(this.mode=='newest'){
		    		url='rest/products/newest';
		            this.store=Ext.create('RevCommunity.store.ProductStore',{
			    		pageSize:33,
			    		sorters:[],
			    		proxy:Ext.create('Ext.data.proxy.Ajax',{
			    			  type: 'rest',
			    		      url : url,
			    		      reader:{
				                   root: 'content',
				                   totalProperty: 'totalElements'
				            }
			    		})
			    	});
		    	}else if(this.mode=='find'){
		    		url='rest/products/find';
		            this.store=Ext.create('RevCommunity.store.ProductStore',{
			    		pageSize:3,
			    		proxy:Ext.create('Ext.data.proxy.Ajax',{
			    			  type: 'rest',
			    		      url : url,
			    		      reader:{
				                   root: 'content',
				                   totalProperty: 'totalElements'
				            }
			    		})
			    	});
		    	}else{
		    		this.store=Ext.create('RevCommunity.store.ProductStore',{
			    		proxy:Ext.create('Ext.data.proxy.Ajax',{
			    			  type: 'rest',
			    		      url : url
			    		})
			    	});
		    	}
		    	
			    this.callParent(arguments);
		    }
});
