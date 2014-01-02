var global_nr_parameters = 0;
var global_nr_values = 0;
var global_active_parameters = 0;
var global_category_id_leaf = null;
var listGlobal = [];

var dataList = Ext.create('Ext.data.Store', {
	fields : [ 'val', 'name' ],
	data : [ {
		"val" : "INTEGER",
		"name" : "Liczba"
	}, {
		"val" : "DATE",
		"name" : "Data"
	}, {
		"val" : "STRING",
		"name" : "Tekst"
	}, {
		"val" : "LIST",
		"name" : "Lista"
	} ]
});

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
									'button[action=addValueOfParameter]' : {
										click : this.addValueOfParameter
									},
									'newcategoryform button[action=saveCategory]' : {
										click : this.saveCategory
									},
									'newcategoryform categorycombo' : {
										select : this.categorycombo
									},
									'newcategoryform combobox' : {
										select : this.comboboxSelect
									},
									'newcategoryform button[action=menagerValueParam]' : {
										click : this.menagerValueParam
									},
									'button[action=delete_ValueOfParameter]' : {
										click : this.delete_ValueOfParameter
									},
									'button[action=ok_ValueOfParameter]' : {
										click : this.ok_ValueOfParameter
									},
								});
					},
					addParameter : function(btn) {
						global_nr_parameters++;
						var form = btn.up('form');
						var fc = form.down('basefieldset[name=radio_1]');
						fc.add({
							xtype : 'container',
							layout : 'hbox',
							margin : '0 0 10 0',
							items : [
									{
										xtype : 'textfield',
										fieldLabel : '',
										name : 'param_field_'
												+ global_nr_parameters,
										margin : '0 10 0 0',
										editable : true
									},
									{
										xtype : 'combobox',
										name : 'combo_param_field_'
												+ global_nr_parameters,
										store : dataList,
										value : dataList.getAt(0).get('val'),
										queryMode : 'local',
										displayField : 'name',
										valueField : 'val',
									},
									{
										xtype : 'button',
										action : 'menagerValueParam',
										text : 'Dodaj Wartość',
										name : 'add_ListValue_'
												+ global_nr_parameters,
										margin : '0 0 0 10',
										hidden : true
									} ]
						});

						global_active_parameters = global_nr_parameters;

					},
					comboboxSelect : function(combo) {
						var nr = combo.name;
						nr = nr.replace("combo_param_field_", "");
						var form = combo.up('form');
						var fc;
						if (parseInt(nr)) {
							fc = form.down('button[name=add_ListValue_' + nr
									+ ']');
						}
						if (combo.value == "LIST") {
							if (fc)
								fc.show();
						} else {
							if (fc)
								fc.hide();
						}

					},
					ok_ValueOfParameter : function(btn) {
						var form = btn.up("[name=windowPopup]");

						for ( var int = 0; int < listGlobal.length; int++) {
							if (listGlobal[int][0] == global_active_parameters) {
								listGlobal[int] = [];
							}
						}

						for ( var i = 0; i <= global_nr_values; i++) {
							var fc = form.down('[name=valOfParameters_'
									+ global_active_parameters + '_' + i + ']');
							if (fc && fc.value != null && fc.value != '') {
								listGlobal.push([ global_active_parameters,
										fc.value ]);
							}
						}
						form.hide();
					},
					categorycombo : function(com) {

						global_category_id_leaf = com.getValue();
						if (global_category_id_leaf != null) {
							var form = com.up('form');
							var fc = form.down('categorynamefieldset');
							fc.show();
							fc = form.down('categoryparameters');
							fc.show();
							Ext.getCmp('save_cat_button').setDisabled(false);

						}
					},

					addValueOfParameter : function(btn) {
						var nr = btn.name;
						nr = nr.replace("add_value_parameter_", "");
						if (parseInt(nr)) {
							global_active_parameters = nr;
						} else {
							console.log("button error");
						}
						var form = btn.up("[name=windowPopup]");

						global_nr_values++;
						var fc = form.down('[name=paramText_'
								+ global_active_parameters + ']');

						fc.add({
							xtype : 'basefieldset',
							layout : {
								type : 'hbox',
								align : 'stretch'
							},
							border : 0,
							padding : '0 0 0 0',
							items : [
									{

										xtype : 'textfield',
										width : 250,
										fieldLabel : '',
										name : 'valOfParameters_'
												+ global_active_parameters
												+ '_' + global_nr_values
									}, {
										xtype : 'button',
										action : 'delete_ValueOfParameter',
										text : 'Usuń',
										name : 'delete_ValueOfParameter',
										margin : '0 0 0 10'
									} ]
						});

					},

					saveCategory : function(btn) {
						var form = btn.up('form');
						var fr = form.getForm().getFieldValues();

						var arrayCategory = new Array();

						arrayCategory['name'] = fr.name;

						arrayCategory['parentId'] = global_category_id_leaf;
						if (global_category_id_leaf == null) {
							UtilService.showInfo('Wybierz kategorię nadrzędną');
							return;
						}
						if (fr.name == null || fr.name == '') {
							UtilService.showInfo('Podaj nazwę nowej kategorii');
							return;
						}

						var list = [];

						for ( var i = 1; i <= global_nr_parameters; i++) {

							var valuesList = [];
							for ( var j = 0; j < listGlobal.length; j++) {
								if (listGlobal[j][0] == i) {
									if (listGlobal[j][1] != null
											&& listGlobal[j][1] != '') {
										valuesList.push(listGlobal[j][1]);
									}
								}
							}

							if (fr['combo_param_field_' + i] !== "LIST") {
								valuesList = null;
							}

							if (fr['param_field_' + i] != null
									&& fr['param_field_' + i] != '') {
								list.push({
									name : fr['param_field_' + i],
									values : valuesList,
									type : fr['combo_param_field_' + i]
								});
							}
						}
						if (fr.lastcategoryfield) {// is leaf
							Ext.Ajax
									.request({
										url : 'rest/categories/add_leaf',
										jsonData : {
											name : arrayCategory['name'],
											parentId : arrayCategory['parentId'],
											filters : list,
										},
										method : 'POST',
										success : function(response) {
											UtilService
													.showInfo('Dodano pomyślnie nową kategorię');
											location.href = '#category/new';

										},
										failure : function(response) {
											UtilService
													.showInfo("Błąd przy dodawaniu nowej kategori");
											location.href = '#category/new';
										}
									});
						} else {
							Ext.Ajax
									.request({
										url : 'rest/categories/add_group',
										jsonData : {
											name : arrayCategory['name'],
											parentId : arrayCategory['parentId'],
											filters : list,
										},
										method : 'POST',
										success : function(response) {
											UtilService
													.showInfo('Dodano pomyślnie nową kategorię');
											location.href = '#category/new';

										},
										failure : function(response) {
											UtilService
													.showInfo("Błąd przy dodawaniu nowej kategori");
											location.href = '#category/new';
										}
									});
						}
					},

					menagerValueParam : function(btn) {
						var nr = btn.name;
						nr = nr.replace("add_ListValue_", "");
						if (parseInt(nr)) {
							global_active_parameters = nr;
						} else {
							console.log("button error");
						}
						var form = btn.up('form');

						var paramName = form.down('[name=param_field_'
								+ global_active_parameters + ']').value;
						if (paramName == null || paramName == '') {
							paramName = '';
						}

						var win = Ext
								.create(
										'Ext.window.Window',
										{
											title : 'Lista wartości parametru '
													+ paramName,
											name : 'windowPopup',
											height : 270,
											autoScroll : true,
											width : 380,
											layout : 'vbox',
											border : 0,
											items : [
													{
														xtype : 'basefieldset',
														name : 'paramText_'
																+ global_active_parameters,
														border : 0,

														margin : '10 10 10 10 ',
														layout : 'vbox',
														items : [

														]
													},
													{
														xtype : 'basefieldset',
														layout : {
															type : 'hbox',
															align : 'stretch'
														},
														border : 0,
														padding : '0 0 0 10',
														items : [
																{
																	xtype : 'button',
																	action : 'addValueOfParameter',
																	width : 250,
																	text : 'Dodaj Wartości',
																	name : 'add_value_parameter_'
																			+ global_active_parameters,
																	margin : '0 0 0 10'
																},
																{
																	xtype : 'button',
																	action : 'ok_ValueOfParameter',
																	text : 'Zapisz',
																	name : 'ok_ValueOfParameter',
																	margin : '0 0 0 10'
																} ]
													} ]
										}).show();

						var fc = win.down('[name=paramText_'
								+ global_active_parameters + ']');
						var contValues = 0;
						for ( var int = 0; int < listGlobal.length; int++) {
							if (listGlobal[int][0] == global_active_parameters) {
								global_nr_values++;
								contValues++;
								fc
										.add({
											xtype : 'basefieldset',
											layout : {
												type : 'hbox',
												align : 'stretch'
											},
											border : 0,
											padding : '0 0 0 0',
											items : [
													{
														xtype : 'textfield',
														fieldLabel : '',
														width : 250,
														name : 'valOfParameters_'
																+ global_active_parameters
																+ '_'
																+ global_nr_values,
														value : listGlobal[int][1]
													},
													{
														xtype : 'button',
														action : 'delete_ValueOfParameter',
														text : 'Usuń',
														name : 'delete_ValueOfParameter',
														margin : '0 0 0 10'
													} ]
										});

							}
						}

						if (contValues == 0) {
							global_nr_values++;
							fc.add({
								xtype : 'basefieldset',
								layout : {
									type : 'hbox',
									align : 'stretch'
								},
								name : 'nameValueOfParam' + global_nr_values,
								border : 0,
								padding : '0 0 0 0',
								items : [
										{
											xtype : 'textfield',
											fieldLabel : '',
											width : 250,
											name : 'valOfParameters_'
													+ global_active_parameters
													+ '_' + global_nr_values
										}, {
											xtype : 'button',
											action : 'delete_ValueOfParameter',
											text : 'Usuń',
											name : 'delete_ValueOfParameter',
											margin : '0 0 0 10'
										} ]
							});
						}
					},
					delete_ValueOfParameter : function(btn) {
						var fc = btn.up('basefieldset');
						fc.down('textfield').value = '';
						fc.hide();
					},
				});
