Ext.define('RevCommunity.view.product.ReviewsPanel', {
	title : 'Recenzje',
	extend : 'Ext.grid.Panel',
	xtype : 'reviewspanel',
	hideHeaders : true,
	mode : 'product',// okresla które kolumny mają być wyswietlane
	// product - widok produktu
	// newest - widok startowy
	// user - statystyki usera
	viewConfig : {
		disableSelection : true,
		overItemCls : Ext.baseCSSPrefix + 'grid-row-over',
		enableTextSelection : true
	},
	 tbar:[
          {
        	  xtype:'reviewsortcombo'
          },
          {
        	xtype:'sortdirection'  
          }
          
    ],
	store : 'ProductReviewsStore',
	flex : 1,
	USER_COL_WIDTH : 150,
	IMG_COL_WIDTH : 110,
	initComponent : function() {
		this.columns = [];
		if (this.mode == 'newest') {
			this.columns.push({
				xtype : 'templatecolumn',
				flex : 1,
				tpl : TemplateHolder.reviewsPanelContent,
			});
			this.columns.push({
				xtype : 'templatecolumn',
				width : this.USER_COL_WIDTH,
				tpl : TemplateHolder.reviewsPanelUser,
			});
			this.columns.unshift({
				xtype : 'templatecolumn',
				width : this.IMG_COL_WIDTH,
				tpl : TemplateHolder.reviewsPanelProductImage,
			});
			this.store = Ext.create('RevCommunity.store.ReviewStore', {
				pageSize : 5,
				proxy : {
					type : 'rest',
					url : 'rest/reviews/find',
					reader : {
						root : 'content',
						totalProperty : 'totalElements'
					}
				}
			});
		} else if (this.mode == 'user') {
			this.columns.push({
				xtype : 'templatecolumn',
				flex : 1,
				tpl : TemplateHolder.reviewsPanelContent,
			});
			this.columns.unshift({
				xtype : 'templatecolumn',
				width : this.IMG_COL_WIDTH,
				tpl : TemplateHolder.reviewsPanelProductImage,
			});
		} else if (this.mode == 'product') {
			this.columns.push({
				xtype : 'templatecolumn',
				flex : 1,
				tpl : TemplateHolder.reviewsPanelContentProductMode,
			});
			this.columns.push({
				xtype : 'templatecolumn',
				width : this.USER_COL_WIDTH,
				tpl : TemplateHolder.reviewsPanelUser,
			});
		}
		if( Ext.isEmpty(this.bbar) ){ 
            this.bbar=Ext.create('Ext.PagingToolbar', {
                store: this.store,
                displayInfo: true,
                displayMsg: 'Recenzje {0} - {1} z {2}',
                emptyMsg: "Brak recenzji"
            });
        }
		this.callParent(arguments);
	}
});
