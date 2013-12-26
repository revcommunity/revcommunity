Ext.define('RevCommunity.view.product.ProductWrapper', {
	extend : 'Ext.container.Container',
	alias : 'widget.productwrapper',
	layout : {
		type : 'hbox',
	},
	productData : null,
	initComponent : function() {
		this.items = [ {
			xtype : 'container',
			flex : 1,
			layout : {
				type : 'vbox',
				align : 'stretch',
				pack : 'start',
			},
			items : [ {
				title : 'Opis produktu',
				xtype : 'panel',
				bodyPadding : 5,
				collapsible : true,
				collapsed : true,
				html : this.productData.description,

			}, {
				title : 'Recenzje',
				xtype : 'reviewspanel',
				mode : 'full',
				tools : [ {
					type : 'plus',
					tooltip : 'Dodaj recenzję',
					handler : function(event, toolEl, panel) {
						var id = this.up('productwrapper').productData.nodeId;
						location.href = '#reviews/add' + id;
					}
				} ],
				collapsible : true,
				collapsed : false,
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