Ext.define('RevCommunity.view.admin.SpamListPanel', {
	extend : 'Ext.grid.Panel',
	alias : 'widget.spamlisttpanel',
	xtype : 'spamlistpanel',
	viewConfig : {
		disableSelection : true,
		enableTextSelection : true,
		overItemCls : ''
	},
	hideHeaders : true,
	bodyPadding : 5,
	layout : {
		type : 'vbox',
	},
	items : [],
	viewConfig : {
		disableSelection : true,
		enableTextSelection : true,
		overItemCls : ''
	},
	columns : [
//			{
//				xtype : 'templatecolumn',
//				width : 120,
//				tpl : TemplateHolder.commentsListUser,
//			},
			{
				xtype : 'templatecolumn',
				flex : 1,
				tpl : TemplateHolder.commentsListContentInAdminPanel,
			},
 ],
	store : 'SpamStore',
	initComponent : function() {
		this.callParent(arguments);
		console.log(this.store);
		this.store.load();
	}
});