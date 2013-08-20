Ext.application({
    name: 'RevCommunity',
    stores:['ProductStore'],
    controllers:['UserController'],
    views:[
    	'form.BaseFieldSet',
    	'form.CategoryFieldSet',
    	'form.ProductInfoFieldSet',
    	'form.SpecificationFieldSet',
    	'form.NewProductForm',
    	'ProductList'
    ],
    launch: function() {
    	var appRouter = new AppRouter(); // Router initialization 
		Backbone.history.start();
	
    }
});