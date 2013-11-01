Ext.define(
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
						console.log(this.data);
						
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
																	+ '<div class="rev-overal-mark-in">{rank}</div>'
																	+ '</div>',
															data : this.data,

														},
														{
															xtype : 'reviewevaluationform',
															width : 200,
														}
														]

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
																		src : 'img/empty.jpg',
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
																					 xtype: 'component',
																					 cls : 'rev-review-content',
																					  autoEl: {
																						  tag: 'div',
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
																					src : 'img/empty.jpg',
																					maxHeight : 120,
																					maxWidth : 120,
																				},
																				{
																					xtype : 'displayfield',
																					name : 'firstName',
																					value : this.data.author.userName,
																				},
																				{
																					xtype : 'displayfield',
																					name : 'userRank',
																					value : 'Amator',
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
																								tpl : '<div class=rev-review-usefulness>Przydatność: {usefulness}%</div>',
																								data : this.data,
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
																											flex : 1
																										},
																										{
																											xtype : 'button',
																											text : 'Przydatne',
																											flex : 1
																										} ]

																							} ]

																				} ]
																	} ]

														} ],
												flex : 1,
											} ]
								},
								 {
								 xtype : 'reviewcommentslist'
								 },
								{
									xtype : 'form',
									layout : {
										type : 'hbox'
									},
									cls : 'rev-comment-submit-form',
									border : false,
									items : [
											{
												xtype : 'textareafield',
												flex : 1,
												cls : 'rev-comment-textarea',

											},
											{
												xtype : 'container',
												width : 150,
												html : '<div id="commentSubmitButton" class="rev-box rev-box-button">Opublikuj</div>',

											} ]
								}

						];

						this.callParent();
					}
				});
