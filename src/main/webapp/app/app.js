Ext.application({
    name: 'RevCommunity',
    stores:['ProductStore','ReviewStore','ProductReviewsStore'],
    controllers:['ProductController','CategoryController'],
    views:[
    	'form.BaseFieldSet',
    	'form.CategoryFieldSet',
    	'form.ProductInfoFieldSet',
    	'form.SpecificationFieldSet',
    	'form.NewProductForm',
    	'ImageList',
    	'ProductList',
    	'product.ProductPanel',
    	'category.NewCategoryForm',
    	'category.CategoryNameFieldSet',
    	'category.ParentCategoryFieldSet',
    	'category.CategoryParameters',
    	'product.ProductWrapper',
    	'product.ReviewsPanel'
    ],
    models:['Product','Review','Category'],
    launch: function() {
    	var appRouter = new AppRouter(); // Router initialization 
		Backbone.history.start();
	
    }
});