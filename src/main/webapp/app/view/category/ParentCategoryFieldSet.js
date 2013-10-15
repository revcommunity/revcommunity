Ext.define('RevCommunity.view.category.ParentCategoryFieldSet' ,{
    extend: 'RevCommunity.view.form.BaseFieldSet',
    alias: 'widget.parentcategoryfieldset',
	title:'Wybór kategorii',
	layout:'hbox',
	
	items:[
			{
				fieldLabel:'Wybierz kategorie',
				name:'ppp'
			},
			{
				name:'xx'	
			},
			{
				name:'xsadx'	
			}
	],
	initComponent:function(){
		
		if(Ext.isEmpty(this.defaults))
			this.defaults={};
			
		Ext.apply(this.defaults, {
					margin:'0 5 0 0'
		});
		
		this.callParent(arguments);
	}
					
});
