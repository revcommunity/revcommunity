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
			var filterField=this.buildFilterField(f);
			this.add(filterField);
		}
	},
	buildFilterField:function(filter){
		var field={
			fieldLabel:filter.name,
			name:filter.symbol,
			xtype:this.getFilterXType(filter)
		};
		if(filter.type=='list'){
			field.store=filter.values;
		}
		return field;
	},
	getFilterXType:function(filter){
		if(filter.type=='integer'){
			return 'numberfield';
		}
		else if(filter.type=='date'){
			return 'datefield';
		}
		else if(filter.type=='list'){
			return 'combo';
		}
		else if(filter.type=='string'){
			return 'textfield';
		}else{
			throw 'Błąd - nieobsługiwany typ filtra: '+filter.type;
		}
	},
	items:[]
					
});
