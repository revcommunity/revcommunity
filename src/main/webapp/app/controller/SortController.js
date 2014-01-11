Ext.define('RevCommunity.controller.SortController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
			'productsortcombo' : {
				select : this.productSortChange
			},
			'sortdirection':{
				click:this.productSortDirChange
			}
		});
	},
	
	productSortDirChange:function(btn){
		btn.swap();
		this.productSortChange(btn.prev());
	},
	productSortChange:function(cmb){
		var grid=cmb.up('grid');
		var dir=cmb.next().direction;
		grid.getStore().sort([{
			property:cmb.getValue(),
			direction:dir
		}]);
	}
});