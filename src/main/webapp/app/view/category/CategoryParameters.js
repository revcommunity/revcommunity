Ext.define('RevCommunity.view.category.CategoryParameters', {
	extend : 'RevCommunity.view.form.BaseFieldSet',
	alias : 'widget.categoryparameters',
	layout : 'anchor',
	name: 'panel_param',
	items : [ {
		xtype : 'container',
		layout : 'hbox',
		name : 'kaziu_param',
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
			items : [ /*{
				boxLabel : 'Procesor',
				name : 'size',
				inputValue : 'm',
				id : 'radio1'

			}*/ ]
		},/* {
			xtype : 'basefieldset',
			name : 'radio_2',
			title : 'Parametry1',
			defaultType : 'textfield',
			defaults : {
				flex : 1
			},

			layout : 'vbox',
			items : [ {

				xtype : 'textfield',
				fieldLabel : '',
				name : 'valOfParameters'
			}, {

				xtype : 'textfield',
				fieldLabel : '',
				name : 'valOfParameters2'
			}

			]
		}, {
			xtype : 'basefieldset',
			name : 'radio_3',
			title : 'Parametry2',
			defaultType : 'textfield',
			defaults : {
				flex : 1
			},

			layout : 'vbox',
			items : [ {

				xtype : 'textfield',
				fieldLabel : '',
				name : 'valOfParameters'
			}, {

				xtype : 'textfield',
				fieldLabel : '',
				name : 'valOfParameters2'
			}

			]
		},*/ {
			xtype : 'button',
			action : 'addValueOfParameter',
			text : 'Dodaj Wartość',
		}

		]
	},
/*
	{
		fieldLabel : 'Nazwa nowego parametru:',
		name : 'name_parameters'
	}, */{
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
