Ext.define('RevCommunity.view.review.EvaluationForm', {
	extend : 'Ext.grid.Panel',
	xtype : 'reviewevaluationform',
	hideHeaders : true,
	viewConfig : {
		disableSelection : true,
		enableTextSelection : true,
		overItemCls : ''
	},
	cls: 'rev-no-border-grid',
	border: 0,
	store : 'ReviewEvaluationTestStore',
	columns : [ {
		xtype : 'templatecolumn',
		width : 200,
		tpl : TemplateHolder.evaluationForm,
	} ],
});
