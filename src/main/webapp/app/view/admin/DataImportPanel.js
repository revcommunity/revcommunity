Ext.define('RevCommunity.view.admin.DataImportPanel', {
	extend : 'Ext.form.Panel',
	alias : 'widget.dataimportpanel',
	xtype : 'dataimportpanel',
	bodyPadding : 5,
	layout : {
		type : 'vbox',
	},
	items : [],
	initComponent : function() {
		
		resp = UtilService.exec('/remoteImport/mainCategories');
		
		len = resp.length;
		vals = [];
		for(var i=0; i< len ; i++){
			cat = resp[i];
			vals.push({
				boxLabel: cat.name,
	            name: 'category',
	            inputValue: cat.remoteId
			});
		}
		
		this.items = [{
			 xtype: 'checkboxgroup',
        	 fieldLabel: 'Kategorie',
        	 name: 'checkBoxCategories',
        	 width: 700,
        	 flex : 5,
             columns: 3,
             vertical: true,
             items: vals
		},{
			xtype : 'numberfield',
			flex : 1,
			margin : '20 0 0 0',
			fieldLabel : 'Liczba produktów z każdej kategori \'liść\'',
			labelWidth : 250,
			minValue : -1,
			value : 1,
			editable : false,
			name : 'limit'
		}];
		
		this.buttons = [ {
			text : 'Rozpocznij import',
			action : 'beginImport',
			id : 'beginImport',
		},
		{
			text : 'Pobierz główne kategorie',
			action : 'downloadMainCategories',
			id : 'downloadmaincategories',
		}];
		
		this.callParent(arguments);
	}
});