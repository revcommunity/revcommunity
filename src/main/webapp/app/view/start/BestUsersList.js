Ext.define('RevCommunity.view.start.BestUsersList', {
	extend : 'Ext.view.View',
	title : 'Polecani użytkownicy',
	xtype : 'bestuserslist',
	emptyText : 'Brak użytkowników',
	tpl : TemplateHolder.bestUsersList,
	itemSelector : 'div.rev-best-user',
	store : 'BestUsersStore',
	initComponent : function() {
		this.callParent(arguments);
		this.store.loadPage(1);
	}
});