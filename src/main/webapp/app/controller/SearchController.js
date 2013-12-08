Ext.define('RevCommunity.controller.SearchController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
			'triggerfield[id=searchField]' : {
				triggerclick : this.search,
				keyup:this.searchKeyUp
			}
			
		});
	},
	search:function(field){//usuwa wszystkie combo za podanym
		var value=field.getValue();
		log(value);
		FilterService.filter();
	},
	searchKeyUp:function(field,e){//usuwa wszystkie combo za podanym
		if (e.getKey() == e.ENTER) {
			this.search(field);
		}
	}
});