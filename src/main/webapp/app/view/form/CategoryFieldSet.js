Ext.define('RevCommunity.view.form.CategoryFieldSet' ,{
    extend: 'RevCommunity.view.form.BaseFieldSet',
    alias: 'widget.categoryfieldset',
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
