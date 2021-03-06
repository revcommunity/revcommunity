Ext.define('RevCommunity.view.category.CategoryNameFieldSet', {
	extend : 'RevCommunity.view.form.BaseFieldSet',
	alias : 'widget.categorynamefieldset',
	title : '',
	layout : {
		type : 'hbox',
		align : 'stretch'
	},
	items : [ {
		fieldLabel : 'Nazwa kategorii',
		name : 'name',
	}, {
		xtype : 'container',
		defaultType : 'checkboxfield',
		margin : '0 0 0 20',
		items : [ {
			boxLabel : 'Kategoria końcowa',
			name : 'lastcategoryfield',
			inputValue : '1',
			checked : true
		} ]
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
