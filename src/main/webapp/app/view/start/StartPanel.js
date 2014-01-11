Ext.define('RevCommunity.view.start.StartPanel', {
	extend : 'Ext.Panel',
	alias : 'widget.startpanel',
	bodyPadding : 5,
	border : false,
	bodyCls : 'rev-startpanel',
	layout: {
	    type: 'vbox',
	    align : 'stretch',
	    pack  : 'start',
	},
	items : [ {
		xtype : 'container',
		layout : 'hbox',
		items : [ {
			title : 'Najnowsze produkty',
			xtype : 'productlist',
			mode : 'newest',
			width : '50%',
			style : {
				marginRight : 5
			}
		}, {
			title : 'Najnowsze recenzje',
			xtype : 'reviewspanel',
			width : '50%',
			mode : 'newest'
		}
		]
	},
	{
		xtype : 'panel',
		name : 'usersPanel',
		cls:'rev-best-users-panel',
		title : 'Polecani użytkownicy', 
		items :[{
			xtype : 'bestuserslist',
		}],
		
	}

	],
	load : function() {
		this.down('productlist').getStore().sort('dateAdded', 'DESC');
		this.down('reviewspanel').getStore().sort('dateAdded', 'DESC');
	},
	initComponent : function() {
		this.callParent(arguments);
		var store = this.down('[name=usersPanel]').down('bestuserslist').getStore();
//		this.down('[name=usersPanel]').addDocked([{
//			xtype: 'pagingtoolbar',
//	        store: store,
//	        dock: 'bottom',
//            displayInfo: true,
//            displayMsg: '{0} - {1} z {2}',
//		}]);
		
	}
});
