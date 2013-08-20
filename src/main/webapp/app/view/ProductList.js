Ext.define('RevCommunity.view.ProductList', {
		    title: 'Lista produktów',
		    extend:'Ext.grid.Panel',
		    xtype:'productlist',
		    hideHeaders:true,
		    store: 'ProductStore',
		    columns: [
		        {  
		        	xtype: 'templatecolumn', 
		       		flex:1,
		       		tpl:   '<p> {userName} </p>'
		       	}
		    ],
		    renderTo: Ext.get('page')
});
