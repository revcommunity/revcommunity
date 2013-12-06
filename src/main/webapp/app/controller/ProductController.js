Ext.define('RevCommunity.controller.ProductController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
			'productform button[action=save]' : {
				click : this.save
			},
			'productlist' : {
				itemclick : this.productItemClick
			}
		});
	},
	productItemClick:function(grid, record, item, index, e, eOpts){
		if (e.target.getAttribute("action") == "review") {
			console.log('review clicked. record data: ');
			console.log(record.data);
		} else if (e.target.getAttribute("action") == "details") {
			this.showDetails(record);
		}else if (e.target.getAttribute("action") == "addReview") {
			this.addReview(record);
		}else if (e.target.getAttribute("action") == "edit") {
			this.showEditForm(record.data);
		}else if (e.target.getAttribute("action") == "delete") {
			this.deleteProduct(grid,record.data);
		}
	},
	deleteProduct:function(grid,product){
		var id=product.nodeId;
		ProductService.deleteProduct(id);
		grid.getStore().load();
	},
	showEditForm:function(product){
		var id=product.nodeId;
		location.href = '#product/edit/' + id;
	},
	save:function(btn){
		var form = btn.up('form');
		var product=form.getProduct();
		var removedImages=form.getRemovedImages();
		log(product);
		form.submit({
			params : {
				product : Ext.encode(product),
				removedImages:Ext.encode(removedImages)
			},
			success: function(f,action) 
		    {
				var prod=Ext.decode(action.response.responseText).message;//zapisany obiekt
				UtilService.showInfo('Produkt został zapisany pomyślnie.',{
					fn:function(){//przekierowanie do widoku produktu
						location.href = '#product/' + prod.nodeId;
					}
				});
		    },
		    failure: function(response) 
		    {
		    	UtilService.showInfo('Błąd przy dodawaniu nowego produktu.');
		    }
		});
	},
	showDetails : function(record) {
		var id = record.data.nodeId;
		location.href = '#product/' + id;
	},
	addReview : function(record) {
		var id = record.data.nodeId;
		location.href = '#reviews/add' + id;
	}
});