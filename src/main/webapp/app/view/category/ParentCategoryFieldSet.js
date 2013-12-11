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
	title : 'Wybór kategorii',
	layout : 'hbox',

	items : [ {
		fieldLabel:'Wybierz kategorie',
		xtype:'categorycombo',
		mode:'onlyParents'
	},/*{
		xtype : 'container',
		defaultType : 'checkboxfield',
		width : 200,
		items : [ {
			boxLabel : 'Kategoria nadrzędna',
			name : 'parentCategory',
			inputValue : '1',
			checked : false
		} ]
	}, {
		fieldLabel : 'wybrano:',
		name : 'parent_category',
		xtype : 'combobox',
		store : storeCat,
		valueField : 'nodeId',
		displayField : 'name',

		editable : false

	}, {
		name : 'child_category_1',
		xtype : 'combobox',
		store : [],
		valueField : 'nodeId',
		displayField : 'name',
		autoSelect : true,
		forceSelection : true
	}, {
		name : 'child_category_2',
		xtype : 'combobox',
		store : [],
		valueField : 'nodeId',
		displayField : 'name',
		autoSelect : true,
		forceSelection : true
	}*/ ],
	initComponent : function() {

		if (Ext.isEmpty(this.defaults))
			this.defaults = {};

		Ext.apply(this.defaults, {
			margin : '0 5 0 0'
		});

		this.callParent(arguments);
	}

});
