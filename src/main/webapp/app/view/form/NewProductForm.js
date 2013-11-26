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
    getProduct:function(){
    	var form=this;
    	var values = form.getForm().getFieldValues();
		var product= new RevCommunity.model.Product(values).data;
    	var categoryCombo=form.down('categorycombo:last');
		var specFs=form.down('specificationfieldset');
		product.keys=specFs.getFieldValues();
		product.category={
				nodeId:categoryCombo.getValue()
		};
		return product;
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
				xtype:'revhtmleditor',
				labelAlign:'top',
				name:'description',
				height:500,
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
		        	text: 'Zapisz',
		        	action:'save'
		   		}
	]
});
