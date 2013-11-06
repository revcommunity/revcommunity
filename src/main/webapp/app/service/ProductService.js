var ProductService={
		getAll:function(){
			var products=UtilService.exec('products');
			return products;
		},
		getProductCategories:function(productId){
			var product=UtilService.exec('categories/product',{
				productId:productId
			});
			return product;
		}
};