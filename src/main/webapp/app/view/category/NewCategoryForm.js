
var mainPanel = Ext.define('RevCommunity.view.category.NewCategoryForm', {
	extend : 'Ext.form.Panel',
	alias : 'widget.newcategoryform',
	title : 'Nowa kategoria',
	bodyPadding : 5,
	layout : 'anchor',
	url : 'rest/categories',// The form will submit an AJAX request to this URL
							// when submitted
	method : 'POST',
	defaults : {
		anchor : '100%'
	},
	items : [ {
		xtype : 'parentcategoryfieldset'
	}, {
		xtype : 'container',
		layout : {
			type : 'hbox',
			pack : 'end',
			align : 'stretch'
		},
		items : [ {
			xtype : 'categorynamefieldset',
			style : {
				marginRight : '5px'
			},
			flex : 1
		}

		]
	}, {
		xtype : 'container',
		layout : {
			type : 'hbox',
			pack : 'end',
			align : 'stretch'
		},
		items : [ {
			xtype : 'categoryparameters',
			style : {
				marginRight : '5px'
			},
			flex : 1
		}

		]
	}

	],
	buttons : [

	{
		text : 'Zapisz',
		action : 'saveCategory'
	} ]
});
