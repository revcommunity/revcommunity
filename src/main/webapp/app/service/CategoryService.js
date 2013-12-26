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
		showCategoryTree:function(){//dodaje drzewo kategorii do odpowiedniego diva
			var div=Ext.get('category-tree-div');
			Ext.widget('categorytree', {
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
		showCategoryPath:function(){//tworzy ścieżkę do kategorii która zostanie wyświetlona na nawigacją
			var path='<a href="#products/filter">Wszystkie</a> - ';
			for(var i=0;i<this.categoryPath.length;i++){
				var cat=this.categoryPath[i];
				path+='<a href="#products/filter/'+cat.nodeId+'">'+cat.name+'</a> - ';
			}
			path=path.substr(0,path.length-4);
			log('Ścieżka kategorii: '+path);
			Ext.get('category-path').update(path);
		},
		showCategoryPath2:function(domElementId){//tworzy ścieżkę do kategorii która zostanie wyświetlona na nawigacją
			var path='<a href="#products/filter">Wszystkie</a> - ';
			for(var i=0;i<this.categoryPath.length;i++){
				var cat=this.categoryPath[i];
				path+='<a href="#products/filter/'+cat.nodeId+'">'+cat.name+'</a> - ';
			}
			path=path.substr(0,path.length-4);
			log('Ścieżka kategorii: '+path);
			Ext.get(domElementId).update(path);
		},
		selectCategory:function(categoryId){//odpowiada za przeładowanie drzewa kategorii tak aby została wyświetlona tylko kategoria
			//którą wybraliśmy wraz z jej podkategoriami
			//tworzy również ścieżkę do kategorii i wyświetla ją nad nawigacją
			log('selectCategory catId: '+categoryId);
			var tree=Ext.getCmp('categoryTree');
			if( Ext.isEmpty(categoryId) ){
				log('categoryId jest puste');
				tree.loadBase(true);
				return;
			}
			var sel=this.loadCategoryPath(categoryId);
			FilterService.loadFilters(sel);
			tree.selectedCategory=categoryId;
			if(sel.leaf==true){
				sel=sel.parent;//jeżeli wybraliśmy kategorie liścia to w drzewie kategorii wyświetlamy 
				//wszystkie kategorie z kategorii rodzica wybranego liścia
				//ponieważ liść nie ma dzieci i nie ma sensu w drzewie wyświtlać tylko jednej pozycji
			}
			this.showCategoryPath();
		
			var st=tree.getStore();
			if(tree.categoryId==sel.nodeId){
				this.selectCategoryNode(tree,categoryId);
				FilterService.filter();
				return;//jeżeli w drzewie jest już załadowana odpowiednia kategoria to nic nie trzeba zmieniać
			}
			
			tree.categoryId=sel.nodeId;
			
			
			st.getRootNode().removeAll();
			sel.text=sel.name;
			sel=st.getRootNode().insertChild(0,sel);
			sel.expand(false,function(){
				this.selectCategoryNode(tree,categoryId);
			},this);
			st.getRootNode().expand();
		},
		selectCategoryNode:function(tree,categoryId){//zaznacza wybrana kategorie(tylko ja podswietla)
			log('zaznaczam kategorie '+categoryId);
			var st=tree.getStore();
			var node=st.getNodeById(categoryId);
			tree.getSelectionModel().select(node);
			FilterService.filter();
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