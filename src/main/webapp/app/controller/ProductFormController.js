Ext.define('RevCommunity.controller.ProductFormController', {
	extend : 'Ext.app.Controller',

	init : function() {
		this.control({
			'newproductform categorycombo' : {
				select : this.selectCategory
			}
		});
	},
	selectCategory:function(cmb,recs){
		var category=recs[0].data;
		var categoryId=cmb.getValue();
		log('catId: '+categoryId);
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
	}
});