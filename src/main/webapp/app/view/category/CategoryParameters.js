Ext.define('RevCommunity.view.category.CategoryParameters', {
	extend : 'RevCommunity.view.form.BaseFieldSet',
	alias : 'widget.categoryparameters',
	layout : 'anchor',
	name : 'panel_param',
	items : [ {
		xtype : 'container',
		layout : 'hbox',
		name : 'category_param',
		items : [ {
			xtype : 'basefieldset',
			name : 'radio_1',

			fieldLabel : 'Size',
			title : 'Parametry',
			defaultType : 'radiofield',
			defaults : {
				flex : 1
			},
			width : 300,
			layout : 'vbox',
			items : []
		}, {
			xtype : 'button',
			action : 'addValueOfParameter',
			text : 'Dodaj Wartość',
		}

		]
	}, {
		xtype : 'button',
		action : 'addParameter',
		text : 'Dodaj parametr',
	}

	],
	initComponent : function() {

		if (Ext.isEmpty(this.defaults))
			this.defaults = {};

		Ext.apply(this.defaults, {
			allowBlank : false
		});

		this.callParent(arguments);
	}
});
