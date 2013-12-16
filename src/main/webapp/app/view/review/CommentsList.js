Ext.define('RevCommunity.view.review.CommentsList', {
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
				tpl : TemplateHolder.commentsListUser,
			},
			{
				xtype : 'templatecolumn',
				flex : 1,
				tpl : TemplateHolder.commentsListContent,
			},
 ],
	store : 'CommentStore',
	initComponent : function() {
		this.callParent(arguments);
		this.store.setReviewNodeId(this.reviewNodeId);
		this.store.load();
	}
});
