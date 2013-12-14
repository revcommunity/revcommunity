var FilterService={
		getFilterForm:function(category){
			var form=Ext.getCmp('filterForm');
			if(Ext.isEmpty(form)){
				form=Ext.widget('filterform',{    
					id:'filterForm',
					renderTo:Ext.get('filters-div')
				});
			}
			form.category=category;
			form.removeAll();
			return form;
		},
		hideFilterForm:function(){
			Ext.get('filters-div').hide();
		},
		loadFilters:function(category){
			var filters=category.filters;
			if(filters.length==0)
				this.hideFilterForm();
			else
				Ext.get('filters-div').show();
			var form=this.getFilterForm(category);
			
			for(var i=0;i<filters.length;i++){
				form.add(this.buildFilterField(filters[i]));
			}
			this.validateActiveFilters(filters);
		},
		buildFilterField:function(filter){
			var field={
				fieldLabel:filter.name,
				name:filter.symbol,
				xtype:this.getFilterXType(filter),
				filter:filter
			};
			if(filter.type=='list'){
				field.store=filter.values;
			}
			return field;
		},
		getFilterXType:function(filter){
			if(filter.type=='integer' || filter.type=='float'){
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
				throw 'Blad - nieobsługiwany typ filtra: '+filter.type;
			}
		},
		readFilters:function(values){
			var filters=[];
			for(var i in values){
				if(values.hasOwnProperty(i)){
					if( Ext.isEmpty(values[i]) )
						continue;
					filters.push({
						symbol:i,
						value:values[i]
					});
				}
			}
			return filters;
		},
		getFilterValues:function(){
			var form=Ext.getCmp('filterForm');
			if(form!=null){
				var values=form.getForm().getFieldValues();
				return this.readFilters(values);
			}
			return [];
		},
		getSearchFieldValue:function(){
			var query=Ext.getCmp('searchField').getValue();
			return query;
		},
		getSelectedCategoryId:function(){
			var sels=Ext.getCmp('categoryTree').getSelectionModel().getSelection();
			if(sels.length==0)
				return null;
			var category=sels[0].data;
			return category.nodeId;
		},
		filter:function(){
			var filters=this.getFilterValues();
			var query=this.getSearchFieldValue();
			var categoryId=this.getSelectedCategoryId();
			var url='#products/filter/'+categoryId;
			//Backbone.history.loadUrl(url);
//			if(Backbone.history.fragment==url){
//				log('przeladowuje'+url);
//				Backbone.history.loadUrl(url);
//			}
//			else{
//				log('zmieniam link '+url);
//				Backbone.history.navigate(url);
//			}
			var pl=Ext.getCmp('contentPanel').down('productlist[mode=filter]');
			pl.getStore().load({
				params:{
					categoryId:categoryId,
					filters:Ext.encode(filters),
					query:query,
					sort:Ext.encode([])
				}
			});
			this.showActiveFilters();
		},
		getActiveFilterFields:function(){//pobiera aktywne pola filtrowania czyli takie które są uzupełnione(niepuste)
			var form=Ext.getCmp('filterForm');
			var activeFields=[];
			if(form!=null){
				var fields=form.getForm().getFields().items;
				
				for(var i=0;i<fields.length;i++){
					if( !Ext.isEmpty( fields[i].getValue() ) ){
						activeFields.push(fields[i]);
					}
				}
			}
			return activeFields;
		},
		showActiveFilters:function(){//wyświetla aktywne pola filtrowania czyli takie które są uzupełnione(niepuste) na listą produktów
			var activeFields=this.getActiveFilterFields();
			if( Ext.isEmpty(activeFields))
				return;
			this.buildActiveFiltersPanel(activeFields);
		},
		buildActiveFiltersPanel:function(activeFields){
			var cp=Ext.getCmp('contentPanel');
			var afp=cp.down('activefilterspanel');
			if(afp!=null)
				cp.remove(afp);
			cp.insert(0,{
				xtype:'activefilterspanel',
				fields:activeFields
			});
		},
		validateActiveFilters:function(filters){
			var cp=Ext.getCmp('contentPanel');
			var afp=cp.down('activefilterspanel');
			if(afp!=null)
				afp.destroy();
			//TODO Sprzwdzić czy ustawione filtry są w wybranej kategorii
//			var afp=Ext.ComponentQuery.query('activefilterspanel')[0];
//			var afpFields=afp.query('field');
//			var invalidFields=[];
//			for(var i=0;i<afpFields.length;i++){
//			}
		}
};