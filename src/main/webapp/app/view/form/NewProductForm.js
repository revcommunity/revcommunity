Ext.define('RevCommunity.view.form.NewProductForm' ,{
    extend: 'Ext.form.Panel',
    alias: 'widget.newproductform',
 	title:'Nowy produkt',
	bodyPadding: 5,
	layout: 'anchor',
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
				fieldLabel:'Opis produktu'
			},{
				xtype:'panel',
				layout:'fit',
				html:'<div id="gallery" style="height:300"><img src="css/img/a.JPG" data-title="My title" data-description="My description"><img src="css/img/b.JPG" data-title="Another title" data-description="My <em>HTML</em> description"></div>'
			}
	],
	listeners:{
		afterrender:function(){
			 Galleria.loadTheme('app/lib/themes/classic/galleria.classic.min.js');
		    Galleria.run('#gallery');
		}
	},
    buttons: [
		   		{
		        	text: 'Podgląd'
		   		}, 
		   		{
		        	text: 'Zapisz'
		   		}, 
		    	{
		        	text: 'Dodaj'
		   		}
	]
});
