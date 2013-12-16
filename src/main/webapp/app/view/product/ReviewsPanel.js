Ext.define('RevCommunity.view.product.ReviewsPanel', {
	    title: 'Recenzje',
	    extend:'Ext.grid.Panel',
	    xtype:'reviewspanel',
	    hideHeaders:true,
	    mode:'full',//okresla które kolumny mają być wyswietlane w tabeli
	    //full - wszystkie
	    //noUser - bez informacji o uzytkowniku(przydante w widoku recenzji uzytkownika)
	    viewConfig:{
	    	disableSelection:true,
	    	overItemCls:'',
	    	enableTextSelection: true
	    },
	    store: 'ProductReviewsStore',
	    cls: 'rev-review-panel',
	    flex: 1,
//	    listeners : {
//	        itemdblclick: function(dv, record, item, index, e) {
//	    		var id = record.data.nodeId;
//	    		location.href = '#reviews/' + id;
//	        }
//	    },
	    initComponent:function(){
	    	this.columns=[
			      {  
	            	xtype: 'templatecolumn', 
			       	flex:1,
			        tpl :TemplateHolder.reviewsPanelColumn2,
			       },
			       {  
			       		xtype: 'templatecolumn', 
			       		width: 110, //(90px + 20px padding (left & right))
			        	tpl : TemplateHolder.reviewsPanelColumn3,
			       }
			];
	    	if(this.mode=='full'){
	    		 this.columns.unshift({
		            	xtype: 'templatecolumn', 
		            	width: 200,
		            	tpl : TemplateHolder.reviewsPanelColumn1,
		              });
	    	}
	    	if(this.mode=='newest'){
	    		this.store=Ext.create('RevCommunity.store.ReviewStore',{
	    			pageSize:5,
	    			proxy: {
	    		        type: 'rest',
	    		        url : 'rest/reviews/find',
	    		        reader:{
	 		                   root: 'content',
	 		                   totalProperty: 'totalElements'
	 		            }
	    		    }
	    		});
	    	}else{
//	    		this.store=Ext.create('RevCommunity.store.ProductReviewsStore');
	    	}
	    	this.callParent(arguments);
	    }
});
