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
			items : [],
			margin : '0 10 10 0'
		},

		{
			xtype : 'button',
			action : 'addValueOfParameter',
			text : 'Dodaj Wartość',
			name : 'add_value_parameter',
			hidden : true,
			margin : '10 0 0 10'
		},

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
