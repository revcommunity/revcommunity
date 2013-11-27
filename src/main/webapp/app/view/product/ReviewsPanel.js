Ext.define('RevCommunity.view.product.ReviewsPanel', {
	    title: 'Recenzje',
	    extend:'Ext.grid.Panel',
	    xtype:'reviewspanel',
	    hideHeaders:true,
	    mode:'full',//okresla które kolumny mają być wyswietlane w tabeli
	    //full - wszystkie
	    //noUser - bez informacji o uzytkowniku(przydante w widoku recenzji uzytkownika)
//		    tbar:[
//		        {
//		        	text : 'Dodaj nową recenzję dla tego produktu',
//		        	action : 'addReviewForm'
//		        }
//		          ],
	    viewConfig:{
	    	disableSelection:true,
	    	//overItemCls:'',
	    	enableTextSelection: true
	    },
	    store: 'ProductReviewsStore',
	    cls: 'rev-review-panel',
	    flex: 1,
	    listeners : {
	        itemdblclick: function(dv, record, item, index, e) {
	    		var id = record.data.nodeId;
	    		location.href = '#reviews/' + id;
	        }
	    },
	    initComponent:function(){
	    	this.columns=[
			      {  
	            	xtype: 'templatecolumn', 
			       	flex:1,
			        tpl : new Ext.XTemplate(
			        				'<div class="rev-list-header"><span>{title}</span></div>',
			        				'<div class="rev-reviewList-content">{content}</div>', 
			        				'<div>',
			        				    '<div class="rev-usefulness-progressbar">',
			        						'<div style="width: {usefulness}%" class="rev-usefulness-inner"></div>',
			        					'</div>',
			        				'</div>'
			        )
			       },
			       {  
			       		xtype: 'templatecolumn', 
			       		width: 110, //(90px + 20px padding (left & right))
			        	tpl : new Ext.XTemplate( 			   
			        			   	'<div class="rev-review-mark">{rank}</div>'
			        	)
			       }
			];
	    	if(this.mode=='full'){
	    		 this.columns.unshift({
		            	xtype: 'templatecolumn', 
		            	width: 200,
		            	tpl : new Ext.XTemplate(
			        			'<div class="rev-user-container">',
			        				'<img src={author.image} class="rev-user-small-image" ></img>',
			        				'<div class="rev-user-name">{author.fullName}</div>',
			        				'<div class="rev-user-rank">Amator</div>',
			        			'</div>'
			        	)
		              });
	    	}
	    	this.callParent(arguments);
	    }
});
