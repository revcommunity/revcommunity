Ext.define('RevCommunity.view.form.NewProductForm' ,{
    extend: 'Ext.form.Panel',
    alias: 'widget.newproductform',
 	title:'Nowy produkt',
	bodyPadding: 5,
	layout: 'anchor',
	url:'rest/products',
	method:'POST',
    defaults: {
        anchor: '100%'
    },
    items: [
	    	{
				xtype:'categoryfieldset'
			},
			{
				xtype:'container',
				layout: {
				    type: 'hbox',
				    pack: 'end',
				    align: 'stretch'
				},
				items:[
					{
						xtype:'productinfofieldset',
						style:{
							marginRight:'5px'
						},
						flex:1
					},
					{
						xtype:'specificationfieldset',
						flex:1
					}
				]
			},
			{
				xtype:'htmleditor',
				labelAlign:'top',
				name:'description',
				fieldLabel:'Opis produktu'
			},{
				xtype:'imagelist',
				fieldLabel:'Dodaj zdjęcie',
				name:'images',
				width:500,
				buttonText: 'Przeglądaj...'
			}
	],
    buttons: [
		   		{
		        	text: 'Podgląd'
		   		}, 
		   		{
		        	text: 'Zapisz',
		        	action:'save'
		   		}, 
		    	{
		        	text: 'Dodaj'
		   		}
	]
});
