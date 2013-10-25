var objCat = null;
var arrayCat = new Array();

var storeCat = Ext.create('Ext.data.Store', {
	fields : [ 'nodeId', 'name' ],
	proxy : {
		type : 'ajax',
		url : 'rest/categories',		
	}
	
});



/*
 * Ext.Ajax.request({ url : 'rest/categories', async: false, success:
 * function(response, opts) { objCat = Ext.decode(response.responseText); //
 * console.log(objCat[0].name); // console.dir(objCat); for ( var int = 0; int <
 * objCat.length; int++) { var array_element = objCat[int]; arrayCat[int] =
 * array_element['name']; console.log("el:"+arrayCat[int]); }
 *  }, failure: function(response, opts) { console.log('server-side failure with
 * status code ' + response.status); }, method : 'GET' });
 */

Ext.define('RevCommunity.view.category.ParentCategoryFieldSet', {
	extend : 'RevCommunity.view.form.BaseFieldSet',
	alias : 'widget.parentcategoryfieldset',
	title : 'Wybór kategorii',
	layout : 'hbox',

	items : [ {
		fieldLabel : 'Wybierz kategorie',
		name : 'parent_category',
		xtype : 'combobox',
		store : storeCat,
		valueField : 'nodeId',
		displayField : 'name',
		autoSelect : true,
		forceSelection : true

	}, {
		name : 'child_category_1',
		xtype : 'combobox',
		store : storeCat,
		valueField : 'nodeId',
		displayField : 'name',
		autoSelect : true,
		forceSelection : true
	}, {
		name : 'child_category_2',
		xtype : 'combobox',
		store : storeCat,
		valueField : 'nodeId',
		displayField : 'name',
		autoSelect : true,
		forceSelection : true
	} ],
	initComponent : function() {
		/*
		 * Ext.Ajax.request({ url : 'rest/categories', async: false, success:
		 * function(response, opts) { objCat =
		 * Ext.decode(response.responseText); // console.log(objCat[0].name);
		 * console.dir(objCat); }, failure: function(response, opts) {
		 * console.log('server-side failure with status code ' +
		 * response.status); }, method : 'GET' });
		 */

		if (Ext.isEmpty(this.defaults))
			this.defaults = {};

		Ext.apply(this.defaults, {
			margin : '0 5 0 0'
		});

		this.callParent(arguments);
	}

});
