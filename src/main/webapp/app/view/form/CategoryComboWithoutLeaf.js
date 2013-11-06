Ext.define('RevCommunity.view.form.CategoryComboWithoutLeaf' ,{
	extend: 'Ext.form.ComboBox',
    alias: 'widget.categorycombowithoutleaf',
    displayField:'name',
    valueField:'nodeId',
    triggerAction: 'all',
    parentId:null,
	initComponent:function(){
		
		this.store=Ext.create('Ext.data.Store',{
			model:'RevCommunity.model.Category',
			proxy: {
		        type: 'ajax',
		        url : 'rest/categories/getByParentWithoutLeaf'
		    }
		});
		if(!Ext.isEmpty(this.parentId)){
			this.store.getProxy().setExtraParam('parentId',this.parentId);
		}
		this.callParent(arguments);
	}
					
});