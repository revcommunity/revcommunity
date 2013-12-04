Ext.define('RevCommunity.controller.ProductFormController', {
	extend : 'Ext.app.Controller',

	init : function() {
		this.control({
			'productform categorycombo' : {
				select : this.selectCategory
			},
			'categoryform categorycombo' : {
				select : this.selectCategoryForCategory
			},
			'categoryform categorycombowithoutleaf' : {
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
		specFs.removeAll();
		if( category.leaf==true ){
			var filters=CategoryService.getFilters(categoryId);
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