Ext.define('RevCommunity.controller.ProductFormController', {
	extend : 'Ext.app.Controller',

	init : function() {
		this.control({
			'newproductform categorycombo' : {
				select : this.selectCategory
			},
			'newcategoryform categorycombo' : {
				select : this.selectCategoryForCategory
			},
			'newcategoryform categorycombowithoutleaf' : {
				select : this.selectCategoryForCategory
			}
			
		});
	},
	removeNextCategoryCombo:function(cmb){//usuwa wszystkie combo za podanym
		var nextCmb=cmb.next('categorycombo');
		while(nextCmb!=null){
			var tmp=nextCmb.next('categorycombo');
			nextCmb.destroy();
			nextCmb=tmp;
		}
	},
	selectCategory:function(cmb,recs){
		this.removeNextCategoryCombo(cmb);
		
		var category=recs[0].data;
		var categoryId=cmb.getValue();
		var specFs=cmb.up('form').down('specificationfieldset');
		if( category.leaf==true ){
			var filters=CategoryService.getFilters(categoryId);
			specFs.setFilters(filters);
			return;
		}else{
			specFs.removeAll();
		}
		cmb.ownerCt.add({
			xtype:'categorycombo',
			parentId:categoryId
		});
	},
	selectCategoryForCategory:function(cmb,recs){	
		var category=recs[0].data;
		var categoryId=cmb.getValue();

		global_category_id_leaf = category.nodeId;
		if( category.leaf==true ){			
			return;
		}
		cmb.ownerCt.add({
			xtype:'categorycombowithoutleaf',
			parentId:categoryId
		});
	}
});