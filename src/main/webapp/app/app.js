Ext.application({
    name: 'RevCommunity',
    stores:['ProductStore','ReviewStore','ProductReviewsStore',
            'ReviewEvaluationTestStore',
            'CommentStore',
            ],
controllers:['ProductController','ReviewController','CategoryController','ProductFormController','LoginController'],    
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
    	'product.ReviewsPanel',
    	'user.UserInfoPanel',
    	'review.NewReviewForm',
    	'form.CategoryComboBoxSet',		
    	'review.UserReviewsPanel',
    	'review.ReviewForm',
    	'review.EvaluationForm',
    	'review.CommentsList',
    	'form.CategoryCombo',
    	'form.CategoryComboWithoutLeaf',
    	'login.LoginForm'
    	],
    models:['Product','Review','Category', 'Comment','ReviewRating','User'],    launch: function() {
    	
    	var panel=Ext.widget('container',{    
			id:'contentPanel',
			renderTo:Ext.get('content'),
			layout:'fit',
			calculateWidth:function(){
				var winWidth=Ext.get('logo').getWidth();
				var nav=Ext.get('nav');
				var contentX=nav.getX()+nav.getWidth();
				var width=winWidth-contentX-Ext.get('content').getMargin().right-1;
				this.setWidth(width);
			}
		});
    	panel.calculateWidth();
    	Ext.EventManager.onWindowResize(function(w, h){
    		log('win resize');
    		panel.calculateWidth();
    	});
    	var appRouter = new AppRouter(); // Router initialization 
		Backbone.history.start();
    }
});