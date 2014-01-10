Ext.define('RevCommunity.view.review.ReviewForm', {
	extend : 'Ext.container.Container',
	alias : 'widget.reviewform',
	layout : {
		type : 'vbox',
		align : 'stretch'
	},
	onRender : function() {
		this.callParent();
		var id = this.data.product.nodeId;
		$('.clickableTitle').bind('click', function() {
			location.href = '#products/' + id;
		});
	},
	initComponent : function() {
		this.data.usefulness = Math.round(this.data.usefulness);
		this.items = [
				{
					xtype : 'container',
					flex : 1,
					layout : {
						type : 'hbox',
					},
					items : [
							{
								xtype : 'panel',
								flex : 1,
								title : 'Recenzja produktu '
										+ '<span class="clickableTitle">'
										+ this.data.product.name + '</span>',
								items : [ {
									xtype : 'panel',
									bodyPadding : {
									//	top : 10,
										right : 10
									},
									layout : 'anchor',
									defaults : {
										anchor : '100%'
									},
									border : 0,
									items : [ {
										xtype : 'container',
										layout : {
											type : 'hbox',
										},
										items : [ {
											xtype : 'form',
											layout : {
												type : 'vbox',
												align : 'stretch',
											},
											border : false,
											flex : 1,
											items : [ {
												xtype : 'component',
												autoEl : {
													tag : 'h1',
													html : this.data.title,
												}
											}, {
												xtype : 'component',
												cls : 'rev-review-content',
												autoEl : {
													tag : 'div',
													html : this.data.content,
												}
											} ]
										} ]
									}, ],
									flex : 1,
								} ],
							}, {
								xtype : 'reviewsidepanel',
								data : this.data,
							} ]
				},

				{
					xtype : 'reviewcommentslist',
					reviewNodeId : this.data.nodeId,
					margin : '10 255 0 0',
				}, {
					xtype : 'form',
					layout : {
						type : 'hbox'
					},
					margin : '0 255 0 0',
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
						value : this.data.nodeId,
					} ]
				} ];
		this.callParent();
	}
});
