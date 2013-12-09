Ext.define('RevCommunity.controller.FilterController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
			'filterform button[action=filter]' : {
				click: this.filter
			},
			'filterform button[action=clear]' : {
				click: this.clear
			}
		});
	},
	filter:function(btn){
		var form=btn.up('form');
		var values=form.getForm().getFieldValues();
		log(values);
		var filters=FilterService.readFilters(values);
		Backbone.history.loadUrl('#products/filter');
		var pl=Ext.getCmp('contentPanel').down('productlist[mode=filter]');
		pl.getStore().load({
			params:{
				categoryId:form.category.nodeId,
				filters:Ext.encode(filters),
				sort:Ext.encode([])
			}
		});
	},
	clear:function(btn){
		var form=btn.up('form');
		form.getForm().reset();
	}
});