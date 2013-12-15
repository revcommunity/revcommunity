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
				tpl : TemplateHolder.commentsList,
			},
			{
				xtype : 'templatecolumn',
				flex : 1,
				tpl : new Ext.XTemplate(
						'<div class="rev-list-header">'
						+ '<span style="float:left">Dodano: {dateAddedString}</span>'
						+ '<span style="float:right" action="submitSpam" class="rev-spam-submit">Zgłoś spam!</span>' 
						+ '</div>' 
						+ '<div class="rev-comment-content">{text}</div>')
			},
 ],
	store : 'CommentStore',
	initComponent : function() {
		this.callParent(arguments);
		this.store.setReviewNodeId(this.reviewNodeId);
		this.store.load();
	}
});
