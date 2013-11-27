var CategoryService={
		getAll:function(){
			return UtilService.exec('categories');
		},
		populate:function(){
			UtilService.exec('test/createCategories');
		},
		getByParent:function(parentId){
			return UtilService.exec('categories/getByParent',{
				parentId:parentId
			});
		},
		getFilters:function(categoryId){
			return UtilService.exec('categories/getFilters',{
				categoryId:categoryId
			});
		},
		showCategoryTree:function(){
			var div=Ext.get('category-tree-div');
			var tree=Ext.widget('categorytree', {
			    renderTo: div
			});
		}
		
};