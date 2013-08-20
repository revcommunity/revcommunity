Ext.application({
    name: 'RevCommunity',
    views:[
    	'form.BaseFieldSet',
    	'form.CategoryFieldSet',
    	'form.ProductInfoFieldSet',
    	'form.SpecificationFieldSet',
    	'form.NewProductForm'
    ],
    launch: function() {
    	var appRouter = new AppRouter(); // Router initialization 
		Backbone.history.start();

    }
});