Ext.define('RevCommunity.view.form.ProductInfoFieldSet' ,{
    extend: 'RevCommunity.view.form.BaseFieldSet',
    alias: 'widget.productinfofieldset',
	title:'Informacje o produkcie',
	layout: 'anchor',
	items:[
			{
				fieldLabel:'Nazwa produktu'
			},
			{
				fieldLabel:'Producent'
			},
			{
				fieldLabel:'Kod produktu'
			}
	]
});
