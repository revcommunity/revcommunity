var ProductService={
		getAll:function(){
			var products=UtilService.exec('products');
			return products;
		},
		get:function(id){
			var product=UtilService.exec('products/'+id);
			return product;
		},
		deleteProduct:function(id){
			UtilService.exec('products/'+id,null,
				{
					method:'DELETE'
				}
			);
		},
		showProductList:function(){//dodaje do głównego panelu liste produktów jeżeli nie jest już wyświetlona
			var pl=Ext.getCmp('contentPanel').down('productlist[mode=filter]');
			if(Ext.isEmpty(pl)){
				AppRouter.prototype.clearPage();
				pl = Ext.widget('productlist',{
					mode:'filter'
				});
				Ext.getCmp('contentPanel').add(pl);
			}
		}
};