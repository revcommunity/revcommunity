var FilterService={
		//---------------FORMULARZ FILTROWNIA(POD DRZEWEM KATEGORII) -----------------------------------
		prepareFilterForm:function(category){//przygotowuje formularz filtrów do załadowania filtrów wybranej kategorii
			//tworzy formularz filtrów jeżeli nie istnieje. Usuwa wszystkie jego pola.
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
		clearFilterForm:function(){//czyści pola formularza filtrów i ukrywa div z filtrami
			Ext.get('filters-div').hide();
			var form=Ext.getCmp('filterForm');
			if(!Ext.isEmpty(form)){
				form.getForm().reset();
			}
		},
		loadFilters:function(category){//ładuje formularz filtrowania z odpowiednimi polami dla wybranej kategorii
			var filters=category.filters;
			if(filters.length==0)
				this.clearFilterForm();
			else
				Ext.get('filters-div').show();
			var form=this.prepareFilterForm(category);
			filters.sort(this.compareFilters);//sortuje pola po nazwie
			for(var i=0;i<filters.length;i++){
				form.add(this.buildFilterField(filters[i]));
			}
			this.validateActiveFilters(form);
		},
		compareFilters:function(filter1,filter2){//komparator filtrów, do sortowania filtrów po nazwie
			if (filter1.name < filter2.name)
			     return -1;
			  if (filter1.name > filter2.name)
			    return 1;
			  return 0;
		},
		buildFilterField:function(filter){//tworzy pojedyncze pole filtrowania o odpowiednim typie
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
		getFilterXType:function(filter){//pobiera odpowiedni xtype dla pola filtrowania
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
		readFilters:function(values){//pobiera wartości formularza filtrowania w odpowiedniej formie
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
		getFilterValues:function(){//pobiera wartości formularza filtrowania w odpowiedniej formie
			var form=Ext.getCmp('filterForm');
			if(form!=null){
				var values=form.getForm().getFieldValues();
				return this.readFilters(values);
			}
			return [];
		},
		//-----------------------------
		//------------NIEZALEŻNE FUNKCJE
		getSearchFieldValue:function(){//pobiera wartość z pola wyszukiwania(nad drzewem kategorii)
			var query=Ext.getCmp('searchField').getValue();
			return query;
		},
		getSelectedCategoryId:function(){//pobiera id kategorii zaznaczonej w drzewie kategorii
			var sels=Ext.getCmp('categoryTree').getSelectionModel().getSelection();
			if(sels.length==0)
				return null;
			var category=sels[0].data;
			return category.nodeId;
		},
		filter:function(){//filtruje produkty
			//wyświetla listę produktów, filtruje na podstawie wartości wpisanych w formularzy filtrowania,
			//wartości w polu wyszukiwania, oraz zaznaczonej kategorii w drzewie
			//wyświetla aktywne filtry(niepuste z formularza filtrowania) nad listą produktów
			ProductService.showProductList();
			var filters=this.getFilterValues();
			var query=this.getSearchFieldValue();
			var categoryId=this.getSelectedCategoryId();
			var pl=Ext.getCmp('contentPanel').down('productlist[mode=filter]');
			this.currentProductParams={
				categoryId:categoryId,
				filters:Ext.encode(filters),
				query:query,
				sort:Ext.encode([])
			};
			pl.getStore().load({
				params:this.currentProductParams
			});
			this.showActiveFilters();
		},
		currentProductParams:{},
		//---------------------AKTYWNE FILTRY (nad listą produktów)-----------------
		getActiveFilterFields:function(){//pobiera aktywne pola filtrowania(z formularza filtrowania) czyli takie które są uzupełnione(niepuste)
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
		showActiveFilters:function(){//wyświetla aktywne pola filtrowania czyli takie które są uzupełnione(niepuste) nad listą produktów
			var activeFields=this.getActiveFilterFields();
			if( Ext.isEmpty(activeFields))
				return;
			this.buildActiveFiltersPanel(activeFields);
		},
		buildActiveFiltersPanel:function(activeFields){//tworzy panel aktywnych filtrów
			var cp=Ext.getCmp('contentPanel');
			var afp=cp.down('activefilterspanel');
			if(afp!=null)
				cp.remove(afp);
			cp.insert(0,{
				xtype:'activefilterspanel',
				fields:activeFields
			});
		},
		validateActiveFilters:function(form){//funkcja jest wywoływana przy przejściu do innej kategorii
			//jej zadaniem jest sprawdzenie czy aktywne filtry(te które są wyświetlone nad listą produktów)
			//są dostępne w wybranej kategorii, jeżeli tak w formularzu filtrowania ustawiana jest odpowiednia wartość
			//jeżeli nie to niedostępne filtry są usuwane z panelu aktywnych filtrów
			log('validateActiveFilters');
			var afp=this.getActiveFiltersPanel();
			if(afp==null)
				return;
			var afpFields=afp.query('field');
			var afpFieldsToRemove=[];
			for(var i=0;i<afpFields.length;i++){
				var name=afpFields[i].name;
				var formField=form.down('field[name='+name+']');
				if( !Ext.isEmpty(formField) ){
					formField.setValue(afpFields[i].getValue());
				}
				else{
					afpFieldsToRemove.push(afpFields[i]);
				}
			}
			for(var i=0;i<afpFieldsToRemove.length;i++){
				afp.removeFilter(afpFieldsToRemove[i]);
			}
		},
		getActiveFiltersPanel:function(){//pobiera panel aktywnych filtrów
			var cp=Ext.getCmp('contentPanel');
			var afp=cp.down('activefilterspanel');
			return afp;
		},
		clearActiveFilters:function(){//usuwa panel aktywnych filtrów
			log('clearActiveFilters');
			var cp=Ext.getCmp('contentPanel');
			var afp=cp.down('activefilterspanel');
			if(afp!=null)
				afp.destroy();
		}
};