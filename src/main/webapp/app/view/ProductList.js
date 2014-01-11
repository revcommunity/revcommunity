Ext.define('RevCommunity.view.ProductList', {
		    title: 'Lista produktów',
		    extend:'Ext.grid.Panel',
		    xtype:'productlist',
		    cls:'rev-product-list',
		    viewConfig:{
		    	 disableSelection:true,
		    	 overItemCls:Ext.baseCSSPrefix + 'grid-row-over',
		    	 enableTextSelection: true
		    },
		    tbar:[
		          {
		        	  xtype:'productsortcombo'
		          },
		          {
		        	xtype:'sortdirection'  
		          }
		          
		    ],
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
		    		pageSize:5,
		    		proxy:Ext.create('Ext.data.proxy.Ajax',{
		    			  type: 'rest',
		    		      url : 'rest/products',
		    		      reader:{
			                   root: 'content',
			                   totalProperty: 'totalElements'
			            }
		    		}),
		    		listeners:{
		    			beforeload:function(store){
		    				Ext.apply(store.getProxy().extraParams,FilterService.currentProductParams);
		    				log(store.getProxy().extraParams);
		    			}
		    		}
		    		
		    		
		    	});
	            if( Ext.isEmpty(this.bbar) ){ 
		            this.bbar=Ext.create('Ext.PagingToolbar', {
		                store: this.store,
		                displayInfo: true,
		                displayMsg: 'Produkty {0} - {1} z {2}',
		                emptyMsg: "Brak produktów"
		            });
	            }
			    this.callParent(arguments);
		    }
});
