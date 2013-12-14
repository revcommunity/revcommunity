Ext.define('RevCommunity.view.category.CategoryTree', {
    extend: 'Ext.tree.Panel',
    xtype: 'categorytree',
    rootVisible:false,
    collapsible:true,
    title:'Kategorie',
    id:'categoryTree',
    cls:'rev-category-tree',
    categoryId:null,
    loadBase:function(){//ładuje główne kategorie i czyści ścieżkę kategorii, wykorzystywane przy przejściu do strony głównej
    	if(this.categoryId==null){
    		log('loadBase');
    		this.getStore().getRootNode().expand();
    		Ext.get('category-path').update('');
    	}
    },
    initComponent: function() {
    	this.store=Ext.create('Ext.data.TreeStore',{
			model:'RevCommunity.model.Category',
			autoLoad:false,
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