Ext.define('RevCommunity.view.review.ReviewSidePanel',
		{
			extend : 'Ext.form.Panel',
			alias : 'widget.reviewsidepanel',
			bodyPadding : 5,
			border : false,
			width : 250,
			margin : '0 0 0 5',
			buildRatingButtons : function(reviewId) {
				var buttons = [];
				var isDisabled = false;
				isDisabled = UserService.isReviewRated(reviewId);
				buttons.push({
					xtype : 'button',
					text : 'Nieprzydatne',
					flex : 1,
					action : 'unlike',
					disabled : isDisabled,
					scale : 'medium',
					cls : 'rev-red-button',
					margins : {
						right : 1
					},
				});
				buttons.push({
					xtype : 'button',
					text : 'Przydatne',
					flex : 1,
					action : 'like',
					disabled : isDisabled,
					scale : 'medium',
					cls : 'rev-green-button',
					margins : {
						left : 1
					},
				});
				return buttons;
			},
			buildAdminButtons : function() {
				var buttons = [];
				if (UserService.isAdmin() || UserService.isReviewEditable(this.data)) {
					buttons.push({
						xtype : 'editbtn',
						action : 'editReview',
						flex : 1
					});
					buttons.push({
						xtype : 'deletebtn',
						action : 'deleteReview',
						flex : 1
					});
				}
				var buttonsPanel = {
					xtype : 'container',
					name : 'productButtonsPanel',
					border : false,
					cls : 'rev-product-buttons-panel',
					items : buttons,
					layout : {
						type : 'hbox',
						pack : 'start',
						align : 'stretch'
					},
				};
				return buttonsPanel;
			},
			initComponent : function() {
				var buttons = this.buildAdminButtons();
				this.items = [
						{
							xtype : 'component',
							cls : 'rev-list-header',
							autoEl : {
								tag : 'div',
								html : 'Dodano: ' + this.data.dateAddedString,
							}
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
										cls : 'rev-review-usefulness',
										tpl : TemplateHolder.reviewFormUsefulness,
										data : this.data,
									},
									{
										xtype : 'component',
										name : 'usefulnessBar',
										cls : 'rev-review-usefulness',
										tpl : TemplateHolder.reviewFormRank,
										data : this.data,
									}, {
										xtype : 'container',
										layout : {
											type : 'hbox',
										},
										items : this.buildRatingButtons(this.data.nodeId),
									} ]
						}, {
							xtype : 'container',
							layout : {
								type : 'hbox',
							},
							flex : 1,
							margin : '5 0 0 0',
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
										tag : 'a',
										href : UserService.buildUserLink(this.data.author),
										cls : 'rev-user-name',
										cn : this.data.author.fullName
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
								} ]
							}, ]
						}, ];
				this.callParent(arguments);
			}
		});
