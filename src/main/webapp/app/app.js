Ext.application({
    name: 'RevCommunity',
    stores:['ProductStore','ReviewStore'],
    controllers:['ProductController'],
    views:[
    	'form.BaseFieldSet',
    	'form.CategoryFieldSet',
    	'form.ProductInfoFieldSet',
    	'form.SpecificationFieldSet',
    	'form.NewProductForm',
    	'ImageList',
    	'ProductList',
    	'product.ProductPanel',
    	'product.QuickViewPanel',
    	'product.ReviewsPanel',
    	'product.SpecificationPanel',
    	'category.NewCategoryForm',
    	'category.CategoryNameFieldSet',
    	'category.ParentCategoryFieldSet'
    ],
    models:['Product'],
    launch: function() {
    	var appRouter = new AppRouter(); // Router initialization 
		Backbone.history.start();
	
    }
});