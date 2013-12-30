Ext.define('RevCommunity.view.review.ReviewSidePanel', {
	extend : 'Ext.form.Panel',
	alias : 'widget.reviewsidepanel',
	bodyPadding : 5,
	border : false,
	width : 250,
	margin : '0 0 0 5',
	buildButtons : function() {
		var buttons = [];
		if (UserService.isAdmin()) {
			buttons.push({
				xtype : 'editbtn',
				action : 'editProduct',
				flex : 1
			});
			buttons.push({
				xtype : 'deletebtn',
				action : 'deleteProduct',
				flex : 1
			});
		}
		var buttonsPanel = {
			xtype : 'container',
			name : 'productButtonsPanel',
			border : false,
			cls : 'rev-product-buttons-panel',
			items : buttons,
			layout: {
			    type: 'hbox',
			    pack: 'start',
			    align: 'stretch'
			},
		};
		return buttonsPanel;
	},
	initComponent : function() {
		var buttons=this.buildButtons();
		this.items = [
				{
					xtype : 'component',
					cls : 'rev-list-header',
					autoEl : {
						tag : 'div',
						html : 'Dodano: ' + this.data.dateAddedString,
					}
				},

				{
					xtype : 'container',
					border : 0,
					// width : 200,
					tpl : '<div class="rev-overal-mark-out">'
							+ '<div class="rev-overal-mark-in">{rank}'
							+ '<div>'
							+ RatingUtil.getRatingWidget('overal',
									this.data.rank, true) + '</div>' + '</div>'
							+ '</div>',
					data : this.data,
				},
				buttons,
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
								name : 'usefulnessBar',
								cls : 'rev-review-usefulness',
								tpl : new Ext.XTemplate('<div>Przydatność: {usefulness}%</div>'),
								data : this.data,
							}, {
								xtype : 'container',
								layout : {
									type : 'hbox',
								},
								items : [ {
									xtype : 'button',
									text : 'Nieprzydatne',
									flex : 1,
									action : 'unlike',
									scale : 'large',
									cls : 'rev-red-button',
									margins : {
										right : 1
									},
								}, {
									xtype : 'button',
									text : 'Przydatne',
									flex : 1,
									action : 'like',
									scale : 'large',
									cls : 'rev-green-button',
									margins : {
										left : 1
									},
								} ]
							} ]
				}, {
					xtype : 'container',
					layout : {
						type : 'hbox',
					},
					flex : 1,
					items : [ {
						xtype : 'container',
						layout : {
							type : 'vbox',
							align : 'center',
						},
						flex : 1,
						items : [ {
							xtype : 'image',
							name : 'userImage',
							src : this.data.author.image,
							maxHeight : 120,
							maxWidth : 120,
						}, {
							xtype : 'component',
							name : 'firstName',
							autoEl : {
								tag : 'div',
								cls : 'rev-user-name',
								html : this.data.author.fullName
							}
						}, {
							xtype : 'component',
							name : 'userRank',
							autoEl : {
								tag : 'div',
								html : UserService.buildRankString(this.data.author),
							}
						}, {
							xtype : 'hidden',
							name : 'userName',
							value : this.data.author.userName,
						}
						]
					}, ]
				}, ];
		this.callParent(arguments);
	}
});
