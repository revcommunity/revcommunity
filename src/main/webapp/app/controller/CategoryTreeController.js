Ext.define('RevCommunity.controller.CategoryTreeController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
			'categorytree' : {
				itemclick : this.categorySelect
			}
		});
	},
	categorySelect:function(view,rec){
		log('categorySelect: '+rec.data.nodeId);
		var category=rec.data;
		var url='#products/filter/'+category.nodeId;
		Backbone.history.navigate(url);
		Backbone.history.loadUrl(url);
	}
});