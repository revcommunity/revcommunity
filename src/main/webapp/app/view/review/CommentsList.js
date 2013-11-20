Ext
		.define(
				'RevCommunity.view.review.CommentsList',
				{
					reviewNodeId : null,
					title : 'Komentarze do recenzji',
					extend : 'Ext.grid.Panel',
					xtype : 'reviewcommentslist',
					hideHeaders : true,
					viewConfig : {
						disableSelection : true,
						enableTextSelection : true,
						overItemCls : ''
					},
					columns : [
							{
								xtype : 'templatecolumn',
								width : 120,
								tpl : new Ext.XTemplate(
										'<div class="rev-user-container">',
										'<img src={author.image} class="rev-comments-user-image" ></img>',
										'<div class="rev-user-name-small">{author.fullName}</div>',
										'</div>')
							},
							{
								xtype : 'templatecolumn',
								flex : 1,
								tpl : new Ext.XTemplate(
										'<div class="rev-comment-content">{text}</div>')
							},
							{
								xtype : 'templatecolumn',
								width : 150,
								tpl : new Ext.XTemplate(
										'<div class="rev-box rev-box-button">ZGŁOŚ SPAM</div>')
							} ],
					store : 'CommentStore',
					initComponent : function() {
						this.callParent(arguments);
						this.store.setReviewNodeId(this.reviewNodeId);
						this.store.load();
					}
				});
