Ext.define('RevCommunity.controller.ProductFormController', {
	extend : 'Ext.app.Controller',

	init : function() {
		this.control({
			'newproductform categorycombo' : {
				select : this.selectCategory
			},
//			'newcategoryform categorycombo' : {
//				select : this.selectCategoryForCategory
//			},
			'newcategoryform categorycombowithoutleaf' : {
				select : this.selectCategoryForCategory
			}
			
		});
	},
	selectCategory:function(cmb,recs){
		var category=recs[0].data;
		var categoryId=cmb.getValue();
	
		if( category.leaf==true ){
			var filters=CategoryService.getFilters(categoryId);
			var specFs=cmb.up('form').down('specificationfieldset');
			specFs.setFilters(filters);
			return;
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