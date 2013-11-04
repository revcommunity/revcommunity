Ext.define('RevCommunity.view.review.CommentsList',
		{
					title : 'Komentarze',
					extend : 'Ext.grid.Panel',
					xtype : 'reviewcommentslist',
					hideHeaders : true,
					viewConfig : {
						disableSelection : true,
						enableTextSelection : true,
						overItemCls : ''
					},
					store : 'ReviewCommentsTestStore',
					columns : [
							{
								xtype : 'templatecolumn',
								width : 100,
								tpl : new Ext.XTemplate(
										'<div class="rev-user-container">',
										'<img src="img/empty.jpg" class="rev-comments-user-image" ></img>',
										'<div class="rev-user-name">{username}</div>',
										'</div>')
							},
							{
								xtype : 'templatecolumn',
								flex : 1,
								tpl : new Ext.XTemplate(
										'<div class="rev-comment-content">{comment}</div>')
							},
							{
								xtype : 'templatecolumn',
								width : 150,
								tpl : new Ext.XTemplate(
										'<div class="rev-box rev-box-button">ZGŁOŚ SPAM</div>')
							} ]

				});
