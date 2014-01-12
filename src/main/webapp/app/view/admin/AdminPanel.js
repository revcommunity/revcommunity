Ext.define('RevCommunity.view.admin.AdminPanel', {
	extend : 'Ext.form.Panel',
	alias : 'widget.adminpanel',
	bodyPadding : 5,
	layout : {
		type : 'hbox',
	},
	productData : null,
	initComponent : function() {
		this.items = [ {
			xtype : 'tabpanel',
			flex : 1,
			items : [ {
				title : 'Import danych',
				bodyPadding : 5,
				xtype : 'dataimportpanel'

			}, {
				title : 'Lista komentarzy'
			} ]
		}, 
		];
		this.callParent(arguments);
		}
});