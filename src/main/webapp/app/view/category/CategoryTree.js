Ext.define('RevCommunity.view.category.CategoryTree', {
    extend: 'Ext.tree.Panel',
    xtype: 'categorytree',
    rootVisible:false,
    cls:'rev-category-tree',
    initComponent: function() {
    	this.store=Ext.create('Ext.data.TreeStore',{
			model:'RevCommunity.model.Category',
	    	root: {
                nodeId:null
            },
			proxy: {
		        type: 'ajax',
		        url : 'rest/categories/getByParent'
		    },
		    nodeParam:'parentId'
		});
        this.callParent();
    }
});