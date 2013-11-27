Ext.define('RevCommunity.controller.CategoryTreeController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
			'categorytree' : {
				select : this.categorySelect
			}
		});
	},
	categorySelect:function(tree,rec){
		var category=rec.data;
		log(category);
		window.open('#products/categories/'+category.nodeId,'_parent');
	}
});