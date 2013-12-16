Ext.define('RevCommunity.controller.ProductController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
			'productform button[action=save]' : {
				click : this.save
			},
			'productlist' : {
				itemclick : this.productItemClick
			},
			'productpanel panel[name=productButtonsPanel] button[action=addReview]':{
				click:this.addReview
			},
			'productpanel panel[name=productButtonsPanel] button[action=editProduct]':{
				click:this.editProduct
			},
			'productpanel panel[name=productButtonsPanel] button[action=deleteProduct]':{
				click:this.deleteProduct
			},
			'productpanel panel[name=productButtonsPanel] button[action=watchProduct]':{
				click:this.watchProduct
			}
		});
	},
	productItemClick:function(grid, record, item, index, e, eOpts){
		this.showDetails(record);
	},
	deleteProduct:function(btn){
		var data=btn.up('productpanel').data;
		ProductService.deleteProduct(data.nodeId);
		location.href = '#';
		UtilService.showInfo("Produkt został usunięty pomyślnie");
	},
	editProduct:function(btn){
		var id=btn.up('productpanel').data.nodeId;
		location.href = '#products/edit/' + id;
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
						location.href = '#products/' + prod.nodeId;
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
		location.href = '#products/' + id;
	},
	addReview : function(btn) {
		var data=btn.up('productpanel').data;
		location.href = '#reviews/add' + data.nodeId;
	},
	watchProduct : function(btn) {
		var data=btn.up('productpanel').data;
		var added=SubscriptionService.subscribeProduct(data.nodeId);
		btn.hide();
		if(added==true){
			UtilService.showInfo(data.name+' został dodany do obserwowanych produktów');
		}
		else{
			UtilService.showInfo('Już obserwujesz produkt: '+data.name);
		}
	}
});