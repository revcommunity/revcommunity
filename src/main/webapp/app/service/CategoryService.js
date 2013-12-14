var CategoryService={
		categoryPath:[],
		getAll:function(){
			return UtilService.exec('categories');
		},
		get:function(id){
			return UtilService.exec('categories/'+id);
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
			    renderTo: div,
			    id:'categoryTree'
			});
		},
		deleteCategory:function(id){
			UtilService.exec('categories/'+id,null,
				{
					method:'DELETE'
				}
			);
		},
		showCategoryPath:function(){
//			var tree=Ext.ComponentQuery.query('categorytree')[0];
//			var sels=tree.getSelectionModel().getSelection();
//			if(sels.length==0)
//				return;
//			var rec=sels[0];
//			var pathDiv=Ext.get('category-path');
//			var catUrl=rec.data.nodeId;
//			var catName=rec.data.name;
//			var path=catName;
//			var parent=rec.parentNode;
//			while(parent!=null && parent.isRoot()==false){
//				path=parent.data.name+' -> '+path;
//				parent=parent.parentNode;
//			}
//			log(path);
			var path="";
			for(var i=0;i<this.categoryPath.length;i++){
				var cat=this.categoryPath[i];
				path+='<a href="#products/filter/'+cat.nodeId+'">'+cat.name+'</a> -> ';
			}
			path=path.substr(0,path.length-4);
			log(path);
			Ext.get('category-path').update(path);
		},
		buildCategoryPath:function(rec){
			
			var path=[];
			this.buildPath(rec,path);
			log(path);
//			if(this.categoryPath.length==0)
				this.categoryPath=path;
//			else{
//				path=Ext.Array.remove(path,path[0]);
//				this.categoryPath=this.categoryPath.concat(path);
//			}
			log(this.categoryPath);
		},
		buildPath:function(rec,path){
			if(rec.isRoot())
				return;
			this.buildPath(rec.parentNode,path);
			if(rec.isLeaf())
				return;
			path.push(rec.data);
		},
		selectCategory:function(categoryId){
			log('selectCategory catId: '+categoryId);
			if( Ext.isEmpty(categoryId) ){
				log('categoryId jest puste');
				return;
			}
			var sel=this.loadCategoryPath(categoryId);
			if(sel.leaf==true){
				sel=sel.parent;
			}
			this.showCategoryPath();
			sel.loaded=false;
			sel.expanded=false;
			var tree=Ext.getCmp('categoryTree');
		
			var st=tree.getStore();
			if(tree.categoryId==sel.nodeId)
				return;
			tree.categoryId=sel.nodeId;
			
			st.getRootNode().removeAll();
			sel.text=sel.name;
			sel=st.getRootNode().insertChild(0,sel);
			sel.expand(false,function(){
					log('zaznaczam kategorie '+categoryId);
					var node=st.getNodeById(categoryId);
					log(node);
					tree.getSelectionModel().select(node);
			});
			st.getRootNode().expand();
			
		},
		loadCategoryPath:function(categoryId){//pobiera kategorie wraz z rodzicami i tworzy tablice reprezentującą ścieżke do wybranej kategorii
			log('loadCategoryPath');
			var cat=this.get(categoryId);
			var path=[];
			this.buildPathFromData(cat,path);
			this.categoryPath=path;
			log(this.categoryPath);
			return cat;//zwracam obiekt kategorii pobrany z bazy
		},
		buildPathFromData:function(rec,path){//rekurencyjnie przechodzi do korzenia kategorii i schodząc w głąb tworzy ścieżkę do kategorii
			if(rec==null){
				return;
			}
			this.buildPathFromData(rec.parent,path);
			path.push(rec);
		}
};