Ext.define('RevCommunity.view.login.LoginForm' ,{
    extend: 'Ext.form.Panel',
    alias: 'widget.loginform',
    xtype: 'login-form',
    title: 'Login',
    url:'rest/users',
    method:'POST',
    frame:true,
    width: 320,
    bodyPadding: 10,
    
    defaultType: 'textfield',
    defaults: {
        anchor: '100%'
    },
    
    items: [
        {
            allowBlank: false,
            fieldLabel: 'Login',
            name: 'userName',
            emptyText: 'user name'
        },
        {
            allowBlank: false,
            fieldLabel: 'Password',
            name: 'password',
            emptyText: 'password',
            inputType: 'password'
        }
    ],
    
    buttons: [
        { 
        	text:'Register'
        	 
        },
        { 
        	text:'Login',
        	action:'loginAction'
        }
    ]
});
