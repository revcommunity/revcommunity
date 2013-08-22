Ext.application({
    name: 'RevCommunity',
    stores:['ProductStore','ReviewStore'],
    controllers:['UserController'],
    views:[
    	'form.BaseFieldSet',
    	'form.CategoryFieldSet',
    	'form.ProductInfoFieldSet',
    	'form.SpecificationFieldSet',
    	'form.NewProductForm',
    	'ProductList',
    	'product.ProductPanel',
    	'product.QuickViewPanel',
    	'product.ReviewsPanel',
    	'product.SpecificationPanel'
    ],
    launch: function() {
    	var appRouter = new AppRouter(); // Router initialization 
		Backbone.history.start();
	
    }
});