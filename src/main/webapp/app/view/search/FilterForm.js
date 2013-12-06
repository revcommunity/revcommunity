Ext.define('RevCommunity.view.search.FilterForm' ,{
    extend: 'Ext.form.Panel',
    alias: 'widget.filterform',
 	title:'Filtry',
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
			text: 'Filtruj',
			action:'filter'
		},{
			text:'Czyść',
			action:'clear'
		}	
	],
	initComponent:function(){
		this.callParent(arguments);
	}
});
