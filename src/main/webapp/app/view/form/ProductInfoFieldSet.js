Ext.define('RevCommunity.view.form.ProductInfoFieldSet' ,{
    extend: 'RevCommunity.view.form.BaseFieldSet',
    alias: 'widget.productinfofieldset',
	title:'Informacje o produkcie',
	layout: 'anchor',
	items:[
	       	{
	       		xtype:'hidden',
	       		name:'nodeId',
	       		value:null
	       	},
			{
				fieldLabel:'Nazwa produktu',
				name:'name'
			},
			{
				fieldLabel:'Cena',
				name:'priceAvg',
				xtype:'numberfield'
			},
			{
				hidden:true,
				name:'mainImage',
				xtype:'hidden'
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
