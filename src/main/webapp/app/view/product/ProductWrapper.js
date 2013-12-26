Ext.define('RevCommunity.view.product.ProductWrapper', {
	extend : 'Ext.container.Container',
	alias : 'widget.productwrapper',
	layout : {
		type : 'hbox',
	},
	productData : null,
	initComponent : function() {
		this.items = [ {
			xtype : 'tabpanel',
			flex : 1,
			items : [ {
				title : 'Opis produktu',
				xtype : 'panel',
				bodyPadding : 5,
				html : this.productData.description,

			}, {
				title : 'Recenzje',
				xtype : 'reviewspanel',
				mode : 'product',
			} ]
		}, {
			xtype : 'productpanel',
			data : this.productData,
		} ];
		this.callParent(arguments);
		this.down('reviewspanel').getStore().setProductId(
				this.productData.nodeId);
		this.down('reviewspanel').getStore().load();
		}
});