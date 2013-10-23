Ext.define('RevCommunity.view.product.ReviewsPanel', {
		    title: 'Recenzje',
		    extend:'Ext.grid.Panel',
		    xtype:'reviewspanel',
		    hideHeaders:true,
		    viewConfig:{
		    	disableSelection:true,
		    	overItemCls:'',
		    	enableTextSelection: true
		    },
		    store: 'ProductReviewsStore',
		    cls: 'rev-review-panel',
		    flex: 1,
		    columns: [
		              {
		            	xtype: 'templatecolumn', 
		            	width: 150,
		            	tpl : new Ext.XTemplate(   
			        			'<div class="rev-user-container">',
			        				'<img src="img/empty.jpg" class="rev-user-small-image" ></img>',
			        				'<div class="rev-user-name">{authorName}</div>',
			        				'<div class="rev-user-rank">Amator</div>',
			        			'</div>'
			        	)
		              },
				      {  
		            	xtype: 'templatecolumn', 
				       	flex:1,
				        tpl : new Ext.XTemplate( 			   
				        				'<div class="rev-review-content">{content}</div>',
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
				    ]
		   
});
