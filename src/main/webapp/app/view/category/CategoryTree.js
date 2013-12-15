Ext.define('RevCommunity.view.category.CategoryTree', {
    extend: 'Ext.tree.Panel',
    xtype: 'categorytree',
    rootVisible:false,
    collapsible:true,
    title:'Kategorie',
    id:'categoryTree',
    cls:'rev-category-tree',
    categoryId:null,
    loadBase:function(filterAfterLoad){//ładuje główne kategorie i czyści ścieżkę kategorii, wykorzystywane przy przejściu do strony głównej
    		log('loadBase');
    		this.categoryId=null;
    		var tree=this;
    		this.getStore().load({
    			callback:function(st){
    				tree.getStore().getRootNode().expand();
    	    		Ext.get('category-path').update('');
    	    		if(filterAfterLoad)
    	    			FilterService.filter();
    			}
    		});
    		FilterService.hideFilterForm();
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
//        var link=(window.location.href.substr(window.location.href.lastIndexOf('#')+1));
        if( window.location.href.indexOf('products/filter')!=-1 ){
        	this.loadBase();
        }
        
    }
});