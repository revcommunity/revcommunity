Ext.define('RevCommunity.view.product.ProductPanel' ,{
    extend: 'Ext.form.Panel',
    alias: 'widget.productpanel',
	//bodyPadding: 5,
	layout: {
	    type: 'hbox',
	    pack: 'end',
	    align: 'stretch'
	},
	items:[
			{
				xtype:'reviewspanel',
				flex:3
			},
			{

				xtype:'container',
				layout: {
				    type: 'vbox',
				    pack: 'end',
				    align: 'stretch'
				},
				items:[
					{
						xtype:'quickviewpanel'
					},
					{
						xtype:'specificationpanel'
					}
				]
			
			}
		]
});
