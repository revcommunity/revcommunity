Ext.define('RevCommunity.view.search.FilterForm' ,{
    extend: 'Ext.form.Panel',
    alias: 'widget.filterform',
	bodyPadding: 5,
	cls:'rev-search-panel',
	autoHeight:true,
    defaults: {
        anchor: '100%',
        xtype:'textfield',
        labelAlign:'top'
    },
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
