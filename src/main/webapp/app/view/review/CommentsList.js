Ext
		.define(
				'RevCommunity.view.review.CommentsList',
				{
					data : null,
					title : 'Komentarze',
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
					initComponent : function() {
						var store = Ext.create('Ext.data.Store', {
							autoLoad : true,
							data : this.data,
							model : 'RevCommunity.model.Comment',
							proxy : {
								type : 'memory',
								reader : {
									type : 'json',
									root : 'comments'
								}
							}
						});
						this.store = store;
						this.callParent(arguments);
					}
				});
