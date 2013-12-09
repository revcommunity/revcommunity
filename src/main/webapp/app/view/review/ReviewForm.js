Ext
		.define(
				'RevCommunity.view.review.ReviewForm',
				{
					extend : 'Ext.container.Container',
					alias : 'widget.reviewform',
					layout : {
						type : 'vbox',
						align : 'stretch'
					},
					bodyPadding : 5,
					initComponent : function() {
						this.data.usefulness = Math.round(this.data.usefulness);
						this.items = [
								{
									xtype : 'panel',
									layout : {
										type : 'hbox'
									},
									title : 'Recenzja produktu',
									bodyPadding : 5,
									items : [
											{
												xtype : 'panel',
												items : [
														{
															xtype : 'panel',
															border : false,
															width : 200,
															tpl : '<div class="rev-overal-mark-out">'
																	+ '<div class="rev-overal-mark-in">{rank}'
																	+    '<div>' + RatingUtil.getRatingWidget('overal',this.data.rank,true) + '</div>'
																	+  '</div>'
																	+ '</div>',
															data : this.data,

														},
														{
															xtype : 'reviewevaluationform',
															width : 200,
														} ]

											},
											{
												xtype : 'panel',
												bodyPadding : 5,
												layout : 'anchor',
												defaults : {
													anchor : '100%'
												},
												items : [
														{
															xtype : 'container',
															layout : {
																type : 'hbox',
															},
															items : [
																	{
																		xtype : 'image',
																		name : 'productImage',
																		src : this.data.product.mainImage,
																		maxHeight : 200,
																		maxWidth : 200,

																	},
																	{
																		xtype : 'form',
																		layout : {
																			type : 'vbox',
																			align : 'stretch',
																		},
																		border : false,
																		flex : 1,
																		items : [
																				{
																					xtype : 'component',
																					cls : 'rev-list-header',
																					autoEl : {
																						tag : 'span',
																						html : this.data.title,
																					}
																				},
																				{
																					xtype : 'component',
																					cls : 'rev-review-content',
																					autoEl : {
																						tag : 'div',
																						html : this.data.content,
																					}
																				} ]
																	} ]
														},
														{
															xtype : 'container',
															layout : {
																type : 'hbox',
															},
															items : [
																	{
																		xtype : 'container',
																		layout : {
																			type : 'vbox',
																			align : 'center',
																		},
																		items : [
																				{
																					xtype : 'image',
																					name : 'userImage',
																					src : this.data.author.image,
																					maxHeight : 120,
																					maxWidth : 120,
																				},
																				{
																					xtype : 'displayfield',
																					name : 'firstName',
																					value : this.data.author.fullName,
																				},
																				{
																					xtype : 'displayfield',
																					name : 'userRank',
																					value : this.data.author.rank,
																				} ]

																	},
																	{
																		xtype : 'container',
																		layout : 'hbox',
																		flex : 1,
																		items : [
																				{
																					xtype : 'container',
																					flex : 1,

																				},
																				{
																					xtype : 'container',
																					layout : {
																						type : 'vbox',
																						align : 'stretch',
																						defaultMargins : {
																							top : (5)
																						}
																					},
																					flex : 1,
																					items : [
																							{
																								xtype : 'component',
																								id : 'usefulnessBar',
																								autoEl : {
																									tag : 'div',
																									cls : 'rev-review-usefulness',
																									html : 'Przydatność:' + this.data.usefulness + '%',
																								}
																							},
																							{
																								xtype : 'container',
																								layout : {
																									type : 'hbox',
																								},
																								items : [
																										{
																											xtype : 'button',
																											text : 'Nieprzydatne',
																											flex : 1,
																											action : 'unlike'
																										},
																										{
																											xtype : 'button',
																											text : 'Przydatne',
																											flex : 1,
																											action : 'like'
																										} ]

																							} ]

																				} ]
																	} ]

														} ],
												flex : 1,
											} ],
									buttons : [ {

										text : 'Edytuj recenzję',
										action : 'saveEditReviewLink'
									} ],
								}, {
									xtype : 'reviewcommentslist',
									reviewNodeId : this.data.nodeId,
								}, {
									xtype : 'form',
									layout : {
										type : 'hbox'
									},
									cls : 'rev-comment-submit-form',
									border : false,
									items : [ {
										xtype : 'textareafield',
										flex : 1,
										cls : 'rev-comment-textarea',
										name : 'text',
									}, {
										xtype : 'container',
										layout : {
											pack : 'center',
											type : 'vbox'
										},
										width : 100,
										height : '100%',
										items : [ {
											xtype : 'button',
											text : 'Opublikuj',
											margin : '0 10 0 0',
											width : '100%',
											action : 'saveComment'
										} ],

									}, {
										xtype : 'hidden',
										name : 'reviewNodeId',
										id : 'reviewNodeId',
										value : this.data.nodeId,
									} ]
								}
						];
						this.callParent();
					}
				});
