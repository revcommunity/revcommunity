Ext.application({
    name: 'RevCommunity',
    stores:['ProductStore','ReviewStore','ProductReviewsStore',
             'CommentStore','UserSubscriptionStore','UserNotificationStore','ProductSubscriptionStore',
             'ProductNotificationStore', 'BestUsersStore'
            ],
	controllers:['ProductController','ReviewController','CategoryController',
	             'ProductFormController','RevHtmlEditorController','LoginController',
	             'SubscriptionController','CategoryTreeController',
	             'SearchController','FilterController','SortController','UserController'],    
	views:[
	    	'form.BaseFieldSet',
	    	'form.CategoryFieldSet',
	    	'form.ProductInfoFieldSet',
	    	'form.SpecificationFieldSet',
	    	'product.ProductForm',
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
	    	'review.CommentsList',
	    	'review.ReviewSidePanel',
	    	'form.CategoryCombo',
	    	'form.CategoryComboWithoutLeaf',
	    	'components.RevHtmlEditor',
	    	'subscription.UserSubscriptionList',
	    	'subscription.UserNotificationList',
	    	'subscription.ProductSubscriptionList',
	    	'subscription.ProductNotificationList',
	    	'RevCommunity.view.category.CategoryTree',
	    	'start.StartPanel',
	    	'start.BestUsersList',
	    	'user.UserPanel',
	    	'search.FilterForm',
	    	'search.ActiveFiltersPanel',
	    	'components.ProductSortCombo',
	    	'components.ReviewSortCombo',
	    	'components.SortDirection'
	],
    models:['Product','Review','Category', 'Comment','ReviewRating','User','UserSubscription','UserNotification','ProductSubscription',
            'ProductNotification'
            ],
    launch: function() {
    	
    	this.initExceptionHandler();
    	this.initSearchField();
    	this.initContentPanel();
    	ViewService.showTopMenu();
    	SubscriptionService.showSubscriptions();
    	CategoryService.showCategoryTree();
    	
    	new AppRouter(); // Router initialization 
		Backbone.history.start();
    },
    initExceptionHandler:function(){//dodaje listener na zdarzeniu wystąpienia błędu podczas zapytania Ajax
    	Ext.Ajax.on('requestexception', function(conn, response, options, eOpts) {
    	    UtilService.handleException(conn, response, options, eOpts);
    	});
    },
    initContentPanel:function(){//Tworzy komponent Ext.Panel w którym będą renderowane wszystkie widoki
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
    	panel.calculateWidth();//obliczanie szerokości komponentu tak aby dostosowywał się do szerokości okna
    	Ext.EventManager.onWindowResize(function(w, h){
    		log('win resize');
    		panel.calculateWidth();
    	});
    },
    initSearchField:function(){
    	var panel=Ext.widget('container',{    
			renderTo:Ext.get('searchfield-div'),
			id:'searchPanel',
			layout:'fit',
			cls:'rev-search-panel',
			items:[
				{   
					xtype:'triggerfield',
					id:'searchField',
					enableKeyEvents :true,
					emptyText:'Szukaj...',
					triggerCls:'x-form-search-trigger',
					onTriggerClick:function(e){
						var me = this;
						me.fireEvent("triggerclick", me, e);
					}
				}
			]
		});
    }
});
	
