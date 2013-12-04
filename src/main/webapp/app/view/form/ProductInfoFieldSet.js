Ext.define('RevCommunity.view.form.ProductInfoFieldSet' ,{
    extend: 'RevCommunity.view.form.BaseFieldSet',
    alias: 'widget.productinfofieldset',
	title:'Informacje o produkcie',
	layout: 'anchor',
	items:[
	       	{
	       		xtype:'hidden',
	       		name:'nodeId'
	       	},
			{
				fieldLabel:'Nazwa produktu',
				name:'name'
			},
			{
				fieldLabel:'Producent',
				name:'producer'
			},
			{
				fieldLabel:'Kod produktu',
				name:'productCode'
			}
	],
	initComponent:function(){
	
		if(Ext.isEmpty(this.defaults))
			this.defaults={};
			
		Ext.apply(this.defaults, {
					allowBlank:false
		});
		
		this.callParent(arguments);
	}
});
