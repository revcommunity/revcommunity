Ext
		.define(
				'RevCommunity.view.review.NewReviewForm',
				{
					extend : 'Ext.form.Panel',
					alias : 'widget.newreviewform',
					title : 'Tworzenie recenzji',
					bodyPadding : 5,
					layout : 'anchor',
					url : 'rest/reviews',
					method : 'POST',
					productId : null,
					defaults : {
						anchor : '100%'
					},
					items : [
							{
								xtype : 'displayfield',
								name : 'category',
								fieldLabel : 'Kategoria'
							},
							{
								xtype : 'fieldset',
								layout : 'hbox',
								items : [ {
									fieldLabel : 'Nazwa produktu',
									xtype : 'textfield',
									name : 'productName',
									margin : '5 5 5 0',
								},

								{
									xtype : 'button',
									text : 'Dodaj nowy',
									action : 'openCreateProductForm',
									margin : '5 5 5 0',
								} ]

							},
							{
								xtype : 'container',
								layout : {
									type : 'hbox',
									align : 'strethch'
								},
								items : [
										{
											xtype : 'image',
											name : 'productImage',
											src : 'img/empty.jpg',
											margin : '5 5 5 0',
											maxHeight : 210,
											maxWidth : 170,
											flex : 1
										},
										{
											xtype : 'container',
											flex : 5,
											margin : '5 5 5 0',
											layout : {
												type : 'vbox',
												pack : 'end',
												align : 'stretch'
											},
											items : [
													{
														xtype : 'textfield',
														name : 'title',
														value : 'Tutaj wpisz treść, która wyświetli się na liście recenzji'
													}, {
														xtype : 'textfield',
														name : 'reviewId',
														hidden : true
													}, {
														xtype : 'htmleditor',
														labelAlign : 'top',
														flex : 4,
														name : 'content',
													}, {
														xtype : 'hidden',
														name : 'productId'
													} ]
										},

								]
							},

					],
					buttons : [ {
						text : 'Podgląd'
					}, {
						text : 'Zapisz',
						action : 'saveReview',
						id : 'savereview',
					}, {

						text : 'Aktualizuj',
						action : 'saveEditReview',
						id : 'saveeditreview',
						hidden : true
					}, {
						text : 'Opublikuj'
					} ],
					buildCategoryValue : function(product) {
						var category = product.category;
						var value = category.name;
						category = category.parent;
						while (category != null) {
							value = category.name + ' -> ' + value;
							category = category.parent;
						}
						this.getForm().setValues({
							category : value
						});
					},
					initComponent : function() {
						var product = ProductService
								.getProductCategories(this.productId);

						this.callParent(arguments);
						this.buildCategoryValue(product);
					}
				});
