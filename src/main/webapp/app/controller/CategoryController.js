var global_nr_parameters = 0;
var global_nr_values = 0;
var global_active_parameters = 0;

Ext.define('RevCommunity.controller.CategoryController', {
	extend : 'Ext.app.Controller',
	init : function() {

		this.control({
			'newcategoryform button[action=addParameter]' : {
				click : this.addParameter
			},
			'newcategoryform button[action=addValueOfParameter]' : {
				click : this.addValueOfParameter
			},
			'newcategoryform basefieldset[name=radio_1] radiofield' : {
				change : this.temp
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
		console.log('global_nr_parameters' + global_nr_parameters);
		var form = btn.up('form');
		var fc = form.down('basefieldset[name=radio_1]');
		// var fr = form.getForm().findField('name_parameters');
		fc.add({
			xtype : 'textfield',
			fieldLabel : '',
			name : 'param_field_' + global_nr_parameters
		/*
		 * boxLabel : fr.getValue(), name : 'size', inputValue : fr.getValue() /*
		 * id : 'radio7'
		 */
		});

		var fc2 = form.down('container[name=kaziu_param]');
		global_nr_values++;
		console.log('global_nr_values' + global_nr_values);
		fc2.insert(1, {

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
				name : 'valOfParameters_' + global_nr_parameters + '_'
						+ global_nr_values
			}

			]

		});
		global_active_parameters = global_nr_parameters;
		hide_show(btn);

	},

	addValueOfParameter : function(btn) {
		global_nr_values++;
		console.log('global_nr_values' + global_nr_values);

		var form = btn.up('form');
		var fc = form.down('container[name=paramText_'
				+ global_active_parameters + ']');
		// var fr = form.getForm().findField('name_parameters');
		fc.add({

			xtype : 'textfield',
			fieldLabel : '',
			name : 'valOfParameters_' + global_active_parameters + '_'
					+ global_nr_values

		})

	},

	temp : function(radio) {
		// alert(radio.getValue());
		var form = radio.up('form');
		var fc = form.down('basefieldset[name=radio_2]');
		// fc.hide();
		// fc.show();

	},
	saveCategory : function(btn) {
		var form = btn.up('form');
		var fr = form.getForm().getFieldValues();
		console.log(fr);
		/*
		 * Ext.Ajax.request({ url:'rest/categories', jsonData:{ name: fr.name, },
		 * method:'POST' });
		 */
	},

	changeTextField : function(panel) {

		// global_active_parameters
		var nr = panel.getName();
		nr = nr.replace("param_field_", "");
		console.log("FOCUS:" + nr);

		if (parseInt(nr)) {
			global_active_parameters = nr;
			hide_show(panel);
			

		}

	},
	
	changeLastcategoryfield:function(panel){
	//alert("lastcategoryfield");
	//console.log(panel.getValue());
		var form = panel.up('form');
		fc = form.down('container[name=panel_param]');
		if(panel.getValue()==false){
			
			
			fc.hide();
		}else{
			fc.show();
		}
	}

});

function hide_show(panel){
	var form = panel.up('form');
	var fc;
	for (i = 1; i <= global_nr_parameters; i++) {
		fc = form.down('container[name=paramText_' + i + ']');
		fc.hide();
	}
	    fc = form.down('container[name=paramText_'
			+ global_active_parameters + ']');
	    fc.show(); // aktywny
}