Ext.define('RevCommunity.view.form.CategoryComboBoxSet' ,{
	extend: 'Ext.form.FieldSet',
	defaultType:'combobox',
    alias: 'widget.categorycomboboxset',
	title:'Wybór kategorii',
	layout:'hbox',

	items:[
			{
				fieldLabel:'Kategoria',
			},
			{
				xtype : 'combobox',
				name:'firstCombo'	
			},
			{
				xtype : 'combobox',
				name:'secondCombo',	
			},
	],
	initComponent:function(){
		
		if(Ext.isEmpty(this.defaults))
			this.defaults={};
			
		Ext.apply(this.defaults, {
					margin:'0 5 5 0'
		});
		
		this.callParent(arguments);
	}
					
});
