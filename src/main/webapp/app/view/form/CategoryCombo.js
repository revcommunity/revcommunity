Ext.define('RevCommunity.view.form.CategoryCombo' ,{
	extend: 'Ext.form.ComboBox',
    alias: 'widget.categorycombo',
    displayField:'name',
    valueField:'nodeId',
    triggerAction: 'all',
    parentId:null,
	initComponent:function(){
		
		this.store=Ext.create('Ext.data.Store',{
			model:'RevCommunity.model.Category',
			proxy: {
		        type: 'ajax',
		        url : 'rest/categories/getByParent'
		    }
		});
		if(!Ext.isEmpty(this.parentId)){
			this.store.getProxy().setExtraParam('parentId',this.parentId);
		}
		this.callParent(arguments);
	}
					
});
