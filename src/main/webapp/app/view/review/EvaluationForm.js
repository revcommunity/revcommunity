Ext.define('RevCommunity.view.review.EvaluationForm', {
	extend : 'Ext.grid.Panel',
	xtype : 'reviewevaluationform',
	hideHeaders : true,
	viewConfig : {
		disableSelection : true,
		enableTextSelection : true,
		overItemCls : ''
	},
	store : 'ReviewEvaluationTestStore',
	columns : [ {
		xtype : 'templatecolumn',
		width : 200,
		tpl : new Ext.XTemplate(
				'<div class="rev-box rev-evaluation-box">{key}: {value}</div>')
	} ]

});
