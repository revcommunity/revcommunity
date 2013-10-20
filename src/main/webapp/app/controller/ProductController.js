Ext.define('RevCommunity.controller.ProductController', {
	extend : 'Ext.app.Controller',

	init : function() {
		this.control({
			'newproductform button[action=save]' : {
				click : this.save
			},
			'productlist' : {
				itemclick : function(grid, record, item, index, e, eOpts) {

					if (e.target.getAttribute("action") == "review") {
						console.log('review clicked. record data: ');
						console.log(record.data);
					} else if (e.target.getAttribute("action") == "details") {
						this.showDetails(record);
					}

				}
			}
		});
	},
	save : function(btn) {
		var form = btn.up('form');
		var values = form.getForm().getFieldValues();
		var product = new RevCommunity.model.Product(values);
		form.submit({
			params : {
				product : Ext.encode(product.data)
			}
		});
	},
	showDetails : function(record) {
		var id = record.data.nodeId;
		location.href = '#product/' + id;
	}
});