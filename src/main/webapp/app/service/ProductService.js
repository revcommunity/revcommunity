var ProductService={
		getAll:function(){
			var products=UtilService.exec('products');
			return products;
		},
		get:function(id){
			var product=UtilService.exec('products/'+id);
			return product;
		}
};