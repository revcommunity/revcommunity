Ext.define('RevCommunity.controller.FilterController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
			'filterform button[action=filter]' : {
				click: this.filter
			},
			'filterform button[action=clear]' : {
				click: this.clear
			},
			'activefilterspanel image[action=removeFilter]':{
				click:this.removeFilter
			}
		});
	},
	removeFilter:function(btn){
		var afp=btn.up('activefilterspanel');
		var field=btn.prev();
		afp.removeFilter(field);
	},
	filter:function(btn){
		FilterService.filter();
	},
	clear:function(btn){
		var form=btn.up('form');
		form.getForm().reset();
		FilterService.clearActiveFilters();
		FilterService.filter();
	}
});