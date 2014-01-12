Ext.define('RevCommunity.view.user.UserPanel', {
	extend : 'Ext.form.Panel',
	alias : 'widget.userpanel',
	bodyPadding : 5,
	method : 'POST',
	width : 200,
	layout : {
		type : 'hbox',
		align : 'stretch',
		pack : 'start',
	},
	title : 'Informacje o koncie',
	userName : null,
	renderTo: Ext.getBody(),
	items : [ 
    {
		xtype : 'basefieldset',
		flex : 1,
		name : 'userInfoFieldSet',
		layout : {
			type : 'hbox',
			align : 'left',
			pack : 'start'
		},
		title : 'Profil użytkownika',
		items : [ {
			xtype : 'container',
			layout : 'vbox',
			padding : '0 5 0 0',
			items : [ {
				xtype : 'image',
				name : 'image',
				imgCls : 'rev-user-small-image'
			}, 
			{
		        xtype: 'filefield',
		        name: 'image',
		        fieldLabel: '',
		        labelWidth: 15,
		        msgTarget: 'side',
		        maxWidth : '150',
		        allowBlank: true,
		        anchor: '50%',
		        buttonText: 'Zmień'
		    },
			]
		}, {
			xtype : 'container',
			items : [ {
				xtype : 'displayfield',
				fieldLabel : 'Login',
				name : 'userName'
			}, {
				xtype : 'textfield',
				fieldLabel : 'Imię',
				name : 'firstName'
			}, {
				xtype : 'textfield',
				fieldLabel : 'Nazwisko',
				name : 'lastName'
			}, {
				xtype : 'textfield',
				fieldLabel : 'Email',
				name : 'email'
			}, {
				fieldLabel : 'Ranga',
				xtype : 'displayfield',
				name : 'rank',
			}, {
				xtype : 'hiddenfield',
				name : 'nodeId'
			},{
				xtype : 'hiddenfield',
				name : 'userData'
			}, ]
		} ],

	} 
    ],
	buttons : [ {
		text : 'Zapisz zmiany',
		action : 'updateUserInfo',
		id : 'updateuserinfo',
	} ],
	initComponent : function() {
		var user = null;
		if (Ext.isEmpty(this.userName)) {
			user = UserService.getLoggedUser();
		} else {
			user = UserService.getByUserName(this.userName);
		}
		this.callParent(arguments);
		this.getForm().setValues(user);
		this.down('image').setSrc(user.image);
	}
});