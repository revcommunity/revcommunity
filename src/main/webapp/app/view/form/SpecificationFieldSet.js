Ext.define('RevCommunity.view.form.SpecificationFieldSet' ,{
    extend: 'RevCommunity.view.form.BaseFieldSet',
    alias: 'widget.specificationfieldset',
	title:'Specyfikacja',
	getFieldValues:function(){
		var values={};
		var fields=this.items.items;
		for(var i=0;i<fields.length;i++){
			values[fields[i].name]=fields[i].getValue();
		}
		return values;
	},
	setFilters:function(filters){
		for(var i=0;i<filters.length;i++){
			var f=filters[i];
			this.add({
				fieldLabel:f.name,
				name:f.symbol,
				xtype:'textfield'
			});
		}
	},
	items:[]
					
});
