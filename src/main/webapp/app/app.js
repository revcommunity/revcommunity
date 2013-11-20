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
    	
    	checkIfUserAuthorized();
    	
    	var appRouter = new AppRouter(); // Router initialization 
		Backbone.history.start();
    }
});
	var checkIfUserAuthorized = function(){
		Ext.Ajax.request({
			url : 'rest/users/session',
			method : 'GET',
			success : function(response) {
				
				var j = parseMessageResponse(response);
				var username = j.username;
				console.log(username);
				console.log(ANONYMOUS_USER);
				
				var div = Ext.get('top-bar-user-ref');
				
				var login = Ext.get(LOGIN_REF_ID);
				var reg = Ext.get(REGISTRATION_REF_ID);
				var user  = Ext.get(USERNAME_REF_ID);
				
				if(username != ANONYMOUS_USER){
					console.log('inny niz anonymous');
					login.setHTML('');	
					reg.setHTML('');
					user.setHTML(username);
				}
				else{
					console.log('anonymous');
					login.setHTML('Zaloguj');
					reg.setHTML('Zarejestruj');
					user.setHTML('');
				}
				
			}
		});
	};
	
	var parseMessageResponse = function(res){
		var obj = Ext.decode(res.responseText);
		var j = Ext.decode(obj.message);
		return j;	
	}
	
