Ext.define('RevCommunity.view.product.ReviewsPanel', {
		    title: 'Recenzje',
		    extend:'Ext.grid.Panel',
		    xtype:'reviewspanel',
		    store: 'ReviewStore',
			style:{
				marginRight:'5px'
			},
		    columns: [
		              { text: 'User', xtype: 'templatecolumn', tpl: '{user}', flex: 2 },
		              { text: 'Review', xtype: 'templatecolumn', tpl: '{review}', flex: 10 },
		              { text: 'Rank', xtype: 'templatecolumn', tpl: '{rank}', flex: 1 }
		    ],
		    renderTo: Ext.get('page')
});
