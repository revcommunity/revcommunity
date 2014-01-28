Ext
		.define(
				'RevCommunity.view.review.NewReviewForm',
				{
					extend : 'Ext.form.Panel',
					alias : 'widget.newreviewform',
					// title : 'Tworzenie recenzji dla: ',
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
								id : 'new-review-category-path-123',
							// fieldLabel : ''
							},
							// {
							// xtype : 'fieldset',
							// layout : 'hbox',
							// items : [ {
							// fieldLabel : 'Nazwa produktu',
							// xtype : 'textfield',
							// name : 'productName',
							// margin : '5 5 5 0',
							// },
							//
							// {
							// xtype : 'button',
							// text : 'Dodaj nowy',
							// action : 'openCreateProductForm',
							// margin : '5 5 5 0',
							// } ]
							//
							// },
							{
								xtype : 'container',
								layout : {
									type : 'hbox',
									align : 'strethch'
								},
								items : [
										{
											xtype : 'container',
											// margin : '5 5 5 0',
											flex : 1,
											// layout : {
											// type: 'vbox',
											// // align: 'center'
											// },
											items : [
													{
														xtype : 'image',
														name : 'productImage',
														src : 'img/empty.jpg',
														margin : '5 5 5 0',
														// maxHeight : 210,
														width : 170,
														flex : 5
													},
													{

														xtype : 'component',
														cls : 'rev-box',
														flex : 1,
														align : 'center',

														// autoEl : {
														// tag : 'div',
														html : '<div style=\'align:center; width:150px;\'>'
																+ '<span>Ocena:  '
																+ '</span><div>'
																+ RatingUtil
																		.getRatingWidget(
																				'new-review-product-rank',
																				0,
																				false)
																+ '</div></div>',
													// }
													} // ]
											// },
											]
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
														emptyText : 'Tutaj wpisz treść, która wyświetli się na liście recenzji'
													},
													{
														xtype : 'textfield',
														name : 'reviewId',
														hidden : true
													},
													{
														xtype : 'revhtmleditor',
														labelAlign : 'top',
														flex : 4,
														name : 'content',
													}, {
														xtype : 'hidden',
														name : 'productId'
													}, {
														xtype : 'hidden',
														name : 'rank',
														value : 4,
													} ]
										},

								]
							},

					],
					buttons : [ {
						text : 'Zapisz',
						action : 'saveReview',
						id : 'savereview',
					}, {
						text : 'Zapisz',
						action : 'saveEditReview',
						id : 'saveeditreview',
						hidden : true
					} ],
					buildCategoryValue : function(product) {
						var category = product.category;
						catId = category.nodeId;
						// var value = category.name;
						// category = category.parent;
						// while (category != null) {
						// value = category.name + ' -> ' + value;
						// category = category.parent;
						// }
						// this.getForm().setValues({
						// category : value
						// });

						CategoryService.loadCategoryPath(catId);
						// FIXME tutaj podalem na sztywo id, można to zrobic
						// lepiej?, końcówka 'bodyEl' sie nie zmeini?
						CategoryService
								.showCategoryPath2('new-review-category-path-123-bodyEl');
					},
					initComponent : function() {
						this.callParent(arguments);
					},
					listeners : {
						afterrender : function() {
							var product = ProductService.get(this.productId);
							this.buildCategoryValue(product);
						},
					}
				});