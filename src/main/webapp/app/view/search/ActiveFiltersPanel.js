Ext.define('RevCommunity.view.search.ActiveFiltersPanel' ,{
    extend: 'Ext.Panel',
    alias: 'widget.activefilterspanel',
	bodyPadding: 5,
	cls:'rev-active-filters-panel',
	layout:'hbox',
	autoHeight:true,
	isEmpty:function(){
		if(this.items.length==0)
			return true;
		else
			return false;
	},
	removeFilter:function(field){
		var btn=field.next();
//		var field=btn.prev();
		var panel=btn.up('activefilterspanel');
		field.parent.reset();
		panel.remove(field);
		panel.remove(btn);
		FilterService.filter();
		if(panel.isEmpty()){
			panel.destroy();
		}
	},
	initComponent:function(){
		this.callParent(arguments);
		var fields=this.fields;
		for(var i=0;i<fields.length;i++){
			var field=FilterService.buildFilterField(fields[i].filter);
			field.value=fields[i].getValue();
			field.parent=fields[i];
			field.listeners={
				change:this.onValueChange	
			};
			var btn=Ext.widget('ux-img',{
					src:'css/img/delete.png',
					cls:'rev-remove-filter-btn',
					overCls:'rev-remove-filter-btn-over',
					action:'removeFilter'
			});
			this.add([field,btn]);
			
		}
	},
	onValueChange:function(field,newVal){
		field.parent.setValue(newVal);
		FilterService.filter();
	}
});

Ext.define('Ux.Img', {
    extend : 'Ext.Img',
    xtype  : 'ux-img',

    onRender : function() {
        this.callParent(arguments);

        this.imgEl.on('click', this.onClick, this);
    },

    onClick : function(e, t) {
        this.fireEvent('click', this, e, t);
    }
});
