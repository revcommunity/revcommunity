var AppRouter = Backbone.Router
		.extend({
			routes : {
				'' : 'home',
				'category/new' : 'newCategory',
				'product/new' : 'newProduct',
				'products/categories/:categoryId' : 'productList',
				'product/:id' : 'product',
				'reviews/new' : 'newReview',
				'reviews/add:id' : 'addReview',
				'reviews/edit:id' : 'editReview',
				'reviews/my' : 'myReviews',
				'reviews/:id' : 'review',
				'reviews/user/:userName' : 'userReviews',
				'auth/login' : 'login',
				'subscriptions/users/notifications/:userSubscriptionId' : 'userNotifications',
				'subscriptions/products/notifications/:productSubscriptionId' : 'productNotifications'
			},
			home : function() {
				console.log("home");
			},
			product : function(id) {
				var product = Ext.ModelManager
						.getModel('RevCommunity.model.Product');
				var thisRouter = this;
				product
						.load(
								id,
								{
									success : function(product) {
										thisRouter.clearPage();

										var panel = Ext.widget('productpanel',
												{
													data : product.data
												});

										var grid = Ext.widget('reviewspanel');

										grid.getStore().setProductId(id);
										grid
												.getStore()
												.load(
														{
															scope : this,
															callback : function(
																	records,
																	operation,
																	success) {
																thisRouter
																		.calculateProductProperties(
																				records,
																				product);
																var wrapper = Ext
																		.widget(
																				'productwrapper',
																				{
																					items : [
																							grid,
																							panel ]
																				});
																Ext
																		.getCmp(
																				'contentPanel')
																		.add(
																				wrapper);
															}
														});

									}
								});
			},
			newProduct : function() {
				this.clearPage();
				var form = Ext.widget('newproductform');
				Ext.getCmp('contentPanel').add(form);
			},
			newCategory : function() {
				this.clearPage();
				var form = Ext.widget('newcategoryform', {});
				Ext.getCmp('contentPanel').add(form);
			},
			productList : function(categoryId) {
				var pl = Ext.getCmp('contentPanel').down('productlist');
				if (Ext.isEmpty(pl)) {
					this.clearPage();
					pl = Ext.widget('productlist');
					Ext.getCmp('contentPanel').add(pl);
				}
				pl.getStore().load({
					params : {
						categoryId : categoryId
					}
				});
			},
			clearPage : function() {
				Ext.getCmp('contentPanel').removeAll();
			},
			addReview : function(id) {
				var product = Ext.ModelManager
						.getModel('RevCommunity.model.Product');
				var thisRouter = this;
				product.load(id, {
					success : function(product) {
						thisRouter.clearPage();

						var panel = Ext.widget('productpanel', {
							data : product.data
						});

						// this.clearPage();
						var form = Ext.widget('newreviewform', {
							productId : product.data.nodeId
						});
						Ext.getCmp('contentPanel').add(form);

						form.getForm().setValues({
							productName : product.data.name
						});
						form.getForm().setValues({
							productId : product.data.nodeId
						});
						var image = form.down('image');
						// var image =
						// form.getForm().findChildByElement('name=productImage');
						image.setSrc(product.data.mainImage);
						// form.getForm().setValues({productImage:product.data.mainImage});

					}
				});
			},
			calculateProductProperties : function(records, product) {

				var count = 0;
				var averageMark;
				var sumOfMarks = 0;

				for ( var r in records) {
					if (records.hasOwnProperty(r)) {
						count++;
						sumOfMarks += records[r].data.rank;
					}
				}

				averageMark = (sumOfMarks / count).toFixed(2);
				Ext.apply(product.data, {
					averageMark : averageMark,
					reviewCount : count
				});
			},
			myReviews : function() {
				this.clearPage();
				var panel = Ext.widget('userreviewspanel', {
					mode : 'myReviews'
				});
				Ext.getCmp('contentPanel').add(panel);
			},
			userReviews : function(userName) {
				this.clearPage();
				var panel = Ext.widget('userreviewspanel', {
					userName : userName
				});
				Ext.getCmp('contentPanel').add(panel);
			},
			review : function(id) {
				this.clearPage();
				var review = Ext.ModelManager
						.getModel('RevCommunity.model.Review');
				review.load(id, {
					success : function(review) {
						var panel = Ext.widget('reviewform', {
							data : review.data
						});
						Ext.getCmp('contentPanel').add(panel);
					}
				});
			},
			login : function() {
				this.clearPage();
				var panel = Ext.widget('loginform', {});
				Ext.getCmp('contentPanel').add(panel);
			},
			userNotifications : function(userSubscriptionId) {
				Ext.getCmp('contentPanel').removeAll();
				Ext.getCmp('contentPanel').add({
					xtype : 'usernotificationlist',
					userSubscriptionId : userSubscriptionId
				});
			},
			productNotifications : function(productSubscriptionId) {
				Ext.getCmp('contentPanel').removeAll();
				Ext.getCmp('contentPanel').add({
					xtype : 'productnotificationlist',
					productSubscriptionId : productSubscriptionId
				});
			},
			editReview : function(id) {
				this.clearPage();

				var review = Ext.ModelManager
						.getModel('RevCommunity.model.Review');
				review.load(id, {
					success : function(review) {
						var idProduct = review.data.product.nodeId;

						var product = Ext.ModelManager
								.getModel('RevCommunity.model.Product');
						var thisRouter = this;
						product.load(idProduct, {
							success : function(product) {

								var panel = Ext.widget('productpanel', {
									data : product.data
								});

								var form = Ext.widget('newreviewform', {
									productId : product.data.nodeId
								});
								Ext.getCmp('contentPanel').add(form);

								form.getForm().setValues({
									productName : product.data.name
								});
								form.getForm().setValues({
									productId : product.data.nodeId
								});
								form.getForm().setValues({
									title : review.data.title
								});
								form.getForm().setValues({
									content : review.data.content
								});
								form.getForm().setValues({
									reviewId : review.data.nodeId
								});
								var b = Ext.getCmp('saveeditreview');
								b.show();
								b = Ext.getCmp('savereview');
								b.hide();

								var image = form.down('image');
								image.setSrc(product.data.mainImage);

							}
						});

					}
				});

				/*
				 * this.clearPage(); var review =
				 * Ext.ModelManager.getModel('RevCommunity.model.Review');
				 * review.load(id, { success : function(review) { var panel =
				 * Ext.widget('reviewform', { data : review.data });
				 * Ext.getCmp('contentPanel').add(panel); } });
				 */
			}
		});
