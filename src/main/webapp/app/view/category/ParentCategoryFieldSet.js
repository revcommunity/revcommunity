var objCat = null;
var arrayCat = new Array();

var storeCat = Ext.create('Ext.data.Store', {
	fields : [ 'nodeId', 'name' ],
	proxy : {
		type : 'ajax',
		url : 'rest/categories/parent',
	}

});

Ext.define('RevCommunity.view.category.ParentCategoryFieldSet', {
	extend : 'RevCommunity.view.form.BaseFieldSet',
	alias : 'widget.parentcategoryfieldset',
	title : '',
	layout : 'hbox',

	items : [ {
		fieldLabel : 'Wybierz kategorię nadrzędną',
		labelWidth : 180,
		xtype : 'categorycombo',
		mode : 'onlyParents',
	} ],

	initComponent : function() {

		if (Ext.isEmpty(this.defaults))
			this.defaults = {};

		Ext.apply(this.defaults, {
			margin : '0 5 0 0'
		});

		this.callParent(arguments);
	}

});
