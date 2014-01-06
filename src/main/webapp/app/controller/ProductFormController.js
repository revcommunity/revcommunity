Ext.define('RevCommunity.controller.ProductFormController', {
	extend : 'Ext.app.Controller',

	init : function() {
		this.control({
			'productform categorycombo' : {
				select : this.selectCategory
			},
			'newcategoryform categorycombo' : {
				select : this.selectCategoryForCat
			}

		});
	},
	removeNextCategoryCombo : function(cmb) {// usuwa wszystkie combo za
												// podanym
		var nextCmb = cmb.next('categorycombo');
		while (nextCmb != null) {
			var tmp = nextCmb.next('categorycombo');
			nextCmb.destroy();
			nextCmb = tmp;
		}
	},
	selectCategory : function(cmb, recs) {
		this.removeNextCategoryCombo(cmb);

		var category = recs[0].data;
		var categoryId = cmb.getValue();
		var specFs = cmb.up('form').down('specificationfieldset');
		if (specFs != null)
			specFs.removeAll();
		if (category.leaf == true) {
			var filters = CategoryService.getFilters(categoryId);
			specFs.setFilters(filters);
			return;
		}

		var a = UtilService.exec('categories/getByParent', {
			parentId : categoryId
		});
		console.log(">>" + a);
		cmb.ownerCt.add({
			xtype : 'categorycombo',
			parentId : categoryId,
			mode : cmb.mode
		});

	},
	selectCategoryForCat : function(cmb, recs) {
		this.removeNextCategoryCombo(cmb);

		var categoryId = cmb.getValue();
		var catObject = UtilService.exec('categories/getByParent', {
			parentId : categoryId
		});
		var countNotLeaf = 0;
		for ( var int = 0; int < catObject.length; int++) {
			var array_element = catObject[int];
			if (array_element['leaf'] == false) {
				countNotLeaf++;
			}
		}

		if (catObject != null && catObject != '' && countNotLeaf > 0) {
			cmb.ownerCt.add({
				xtype : 'categorycombo',
				parentId : categoryId,
				mode : cmb.mode
			});
		}

	},
});