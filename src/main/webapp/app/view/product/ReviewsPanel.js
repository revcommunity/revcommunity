Ext.define('RevCommunity.view.product.ReviewsPanel', {
		    title: 'Recenzje',
		    extend:'Ext.grid.Panel',
		    xtype:'reviewspanel',
		    store: 'ProductReviewsStore',
			style:{
				paddingRight:'5px'
			},
		    width: 650,    
		    columns: [
				        {  
				        	xtype: 'templatecolumn', 
				       		flex:1,
				        	tpl : new Ext.XTemplate( 
				        			'<div class="rev-review-wrapper">',
				        			   '<div class="rev-user-container">',
				        				'<img src="css/img/b.JPG" class="rev-user-small-image" ></img>',
				        				'<div class="rev-user-name">{authorName}</div>',
				        				'<div class="rev-user-rank">Amator</div>',
				        			   '</div>',
				        			   
				        			   '<div class="rev-review-container ">',
				        				'<div class="rev-review-content">{content}</div>',
				        				'<div>',
				        				    '<div class="rev-usefulness-progressbar">',
				        						'<div style="width: {usefulness}%" class="rev-usefulness-inner"></div>',
				        					'</div>',
				        				'</div>',
				        			   '</div>',
				        			   '<div class="rev-review-mark">',
				        			   '{rank}',
				        			   '</div>',
				        			'</div>'		
				        	)
				       	}
				    ]
		   
});
