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
//		var tree=view.ownerCt;
//		var st=tree.getStore();
//		CategoryService.buildCategoryPath(rec);
//		CategoryService.showCategoryPath();
//		log(category);
//		FilterService.filter();
//		FilterService.loadFilters(category);
//		this.showCategoryPath(rec);
//		if(rec.isLeaf()==false){
////			rec.data.loaded=false;
////			rec.data.expanded=false;
//			st.getRootNode().removeAll();
//			rec=st.getRootNode().insertChild(0,rec.data);
//			rec.expand();
//		}
		//this.removeOtherCategories(rec,view.ownerCt);
		//rec.expand();
	},
	showCategoryPath:function(rec){
		var pathDiv=Ext.get('category-path');
		var catUrl=rec.data.nodeId;
		var catName=rec.data.name;
		var path=catName;
		var parent=rec.parentNode;
		while(parent!=null){
			path=parent.data.name+'->'+path;
			parent=parent.parentNode;
		}
		
	},
	removeOtherCategories:function(rec,tree){
		var catToRemove=[];
		var sib=rec.previousSibling;
		while(sib!=null && sib.isRoot()==false){
			catToRemove.push(sib);
			sib=sib.previousSibling;
		}
		sib=rec.nextSibling;
		while(sib!=null && sib.isRoot()==false){
			catToRemove.push(sib);
			sib=sib.nextSibling;
		}
		log(catToRemove);
		for(var i=0;i<catToRemove.length;i++){
			catToRemove[i].remove();
		}
	}
});