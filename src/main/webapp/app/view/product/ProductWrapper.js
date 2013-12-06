Ext.define('RevCommunity.view.product.ProductWrapper', {
	extend : 'Ext.container.Container',
	alias : 'widget.productwrapper',
	layout : {
		type : 'hbox',
	},
	productData : null,
	items : [ {
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
			cls : 'rev-review-panel',
			bodyPadding : 5,
			collapsible : true,
			collapsed : true,

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
	} ],
	initComponent : function() {
		this.callParent(arguments);
		this.down('reviewspanel').getStore().setProductId(
				this.productData.nodeId);
		this.down('reviewspanel').getStore().load();
		this.down('productpanel').data = this.productData;
		this.down('panel').html = this.productData.description;
	}
});