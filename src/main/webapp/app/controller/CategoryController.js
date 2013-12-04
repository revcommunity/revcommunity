var global_nr_parameters = 0;
var global_nr_values = 0;
var global_active_parameters = 0;
var global_category_id_leaf = null;

Ext
		.define(
				'RevCommunity.controller.CategoryController',
				{
					extend : 'Ext.app.Controller',
					init : function() {

						this
								.control({
									'newcategoryform button[action=addParameter]' : {
										click : this.addParameter
									},
									'newcategoryform button[action=addValueOfParameter]' : {
										click : this.addValueOfParameter
									},
									'newcategoryform radiofield' : {
										change : this.changeRadio
									},
									'newcategoryform button[action=saveCategory]' : {
										click : this.saveCategory
									},

									'newcategoryform textfield' : {
										focus : this.changeTextField
									},
									'newcategoryform checkboxfield' : {
										change : this.changeLastcategoryfield
									},

								});
					},
					addParameter : function(btn) {
						global_nr_parameters++;
					
						var form = btn.up('form');
						var fc = form.down('basefieldset[name=radio_1]');
						fc.add({
							xtype : 'textfield',
							fieldLabel : '',
							name : 'param_field_' + global_nr_parameters
						});
						var fc2 = form.down('container[name=category_param]');
						fc2.insert(1, {
							xtype : 'basefieldset',
							title : 'Typ',
							fieldLabel : 'Typ',
							defaultType : 'radiofield',
							name : 'parametrs_types_' + global_nr_parameters,
							layout : 'vbox',
							items : [ {
								boxLabel : 'Liczba',
								name : 'param_type_' + global_nr_parameters,
								inputValue : 'INTEGER',
								id : 'radio1_' + global_nr_parameters,
								checked : true

							}, {
								boxLabel : 'Data',
								name : 'param_type_' + global_nr_parameters,
								inputValue : 'DATE',
								id : 'radio2_' + global_nr_parameters,
							}, {
								boxLabel : 'Tekst',
								name : 'param_type_' + global_nr_parameters,
								inputValue : 'STRING',
								id : 'radio3_' + global_nr_parameters,
							}, {
								boxLabel : 'Lista',
								name : 'param_type_' + global_nr_parameters,
								inputValue : 'LIST',
								id : 'radio4_' + global_nr_parameters,

							} ]
						});

						var fc2 = form.down('container[name=category_param]');
						global_nr_values++;
					
						fc2.insert(2, {

							xtype : 'basefieldset',
							name : 'paramText_' + global_nr_parameters,
							title : 'Wartości',
							defaultType : 'textfield',
							defaults : {
								flex : 1
							},

							layout : 'vbox',
							items : [ {

								xtype : 'textfield',
								fieldLabel : '',
								name : 'valOfParameters_'
										+ global_nr_parameters + '_'
										+ global_nr_values
							}

							]
						});
						global_active_parameters = global_nr_parameters;
						hide_show(btn);
						hide_param(btn);

					},

					addValueOfParameter : function(btn) {
						global_nr_values++;
						

						var form = btn.up('form');
						var fc = form.down('container[name=paramText_'
								+ global_active_parameters + ']');
						fc.add({

							xtype : 'textfield',
							fieldLabel : '',
							name : 'valOfParameters_'
									+ global_active_parameters + '_'
									+ global_nr_values

						});

					},

					changeRadio : function(radio) {
						if (Ext.getCmp('radio4_' + global_active_parameters)
								.getValue()) {
							hide_show(radio);

						} else {
							hide_param(radio);
						}

					},

					saveCategory : function(btn) {
						var form = btn.up('form');
						var fr = form.getForm().getFieldValues();
						
						var arrayCategory = new Array();

						arrayCategory['name'] = fr.name;

						arrayCategory['parentId'] = global_category_id_leaf;

						var list = [];

						for ( var i = 1; i <= global_nr_parameters; i++) {
							var valuesList = [];
							for ( var j = 1; j <= global_nr_values; j++) {
								if (fr['valOfParameters_' + i + '_' + j]) {
									valuesList.push(fr['valOfParameters_' + i
											+ '_' + j]);
								}
							}
							if (fr['param_type_' + i] !== "LIST") {
								valuesList = null;
							}
							list.push({
								name : fr['param_field_' + i],
								values : valuesList,
								type : fr['param_type_' + i]

							});
						}

						if (fr.lastcategoryfield) {// is leaf
							Ext.Ajax.request({
								url : 'rest/categories/add_leaf',
								jsonData : {
									name : arrayCategory['name'],
									parentId : arrayCategory['parentId'],
									filters : list,
								},
								method : 'POST',
								success: function(response) 
							    {
									alert('Dodano pomyślnie nową kategorię');
									window.location.reload();
									

							    },
							    failure: function(response) 
							    {
							        alert("Błąd przy dodawaniu nowej kategori");
							        window.location.reload();
							    }
							});
						} else {
							Ext.Ajax.request({
								url : 'rest/categories/add_group',
								jsonData : {
									name : arrayCategory['name'],
									parentId : arrayCategory['parentId'],
									filters : list,
								},
								method : 'POST'
							});
						}

					},

					changeTextField : function(panel) {
						
						var nr = panel.getName();
						nr = nr.replace("param_field_", "");

						if (parseInt(nr)) {
							global_active_parameters = nr;
							hide_show(panel);

						} else return;
						if (Ext.getCmp('radio4_' + global_active_parameters)
								.getValue() == false) {
							hide_param(panel);
						}

					},

					changeLastcategoryfield : function(panel) {
					}

				});

function hide_show(panel) {
	var form = panel.up('form');
	var fc;
	for (i = 1; i <= global_nr_parameters; i++) {
		fc = form.down('container[name=paramText_' + i + ']');
		if (fc)
			fc.hide();

		fc = form.down('container[name=parametrs_types_' + i + ']');
		if (fc)
			fc.hide();
	}
	fc = form
			.down('container[name=paramText_' + global_active_parameters + ']');
	fc2 = form.down('container[name=parametrs_types_'
			+ global_active_parameters + ']');

	if (fc) {
		fc.show(); // aktywny
		fc2.show();
		fc = form.down('button[action=addValueOfParameter]');
		if (fc)
			fc.show();
	}
}

function hide_param(panel) {
	var form = panel.up('form');
	var fc;
	for (i = 1; i <= global_nr_parameters; i++) {
		fc = form.down('container[name=paramText_' + i + ']');
		if (fc)
			fc.hide();

	}
	fc = form.down('button[action=addValueOfParameter]');
	if (fc)
		fc.hide();

}