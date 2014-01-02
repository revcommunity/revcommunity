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
			border : 0,
			fieldLabel : 'Size',
			title : 'Parametry:',

			width : 600,
			layout : 'vbox',
			items : [],
			margin : '0 10 0 0'
		} ]
	}, {
		xtype : 'button',
		action : 'addParameter',
		text : 'Dodaj nowy parametr',
		margin : '0 0 0 10',
		width : 160
	} ],
	initComponent : function() {

		if (Ext.isEmpty(this.defaults))
			this.defaults = {};

		Ext.apply(this.defaults, {
			allowBlank : false
		});

		this.callParent(arguments);
	}
});
