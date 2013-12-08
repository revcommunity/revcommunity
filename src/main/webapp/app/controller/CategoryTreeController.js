Ext.define('RevCommunity.controller.CategoryTreeController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
			'categorytree' : {
				itemclick : this.categorySelect
			}
		});
	},
	categorySelect:function(tree,rec){
		var category=rec.data;
		log(category);
		FilterService.filter();
		FilterService.loadFilters(category);
	}
});