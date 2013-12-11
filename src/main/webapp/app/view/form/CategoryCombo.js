Ext.define('RevCommunity.view.form.CategoryCombo' ,{
	extend: 'Ext.form.ComboBox',
    alias: 'widget.categorycombo',
    displayField:'name',
    valueField:'nodeId',
    triggerAction: 'all',
    mode:'all',
    parentId:null,
	initComponent:function(){
		var url='rest/categories/getByParent';
		if(this.mode=='onlyParents')
			url='rest/categories/getByParentWithoutLeaf';
		this.store=Ext.create('Ext.data.Store',{
			model:'RevCommunity.model.Category',
			proxy: {
		        type: 'ajax',
		        url : url
		    }
		});
		if(!Ext.isEmpty(this.parentId)){
			this.store.getProxy().setExtraParam('parentId',this.parentId);
		}
		this.callParent(arguments);
	}
					
});
