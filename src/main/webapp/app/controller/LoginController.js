Ext.define('RevCommunity.controller.LoginController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
			'loginform button[action=loginAction]': {
				click : this.loginAction
			}
		});
	},
	loginAction : function(btn) {
		var form = btn.up('form');
		var values = form.getForm().getValues();
		//var values = form.getForm().getFieldValues();
		
		console.log(values.userName);
		console.log(values.password);
		
		Ext.Ajax.request({
			url:'/revcommunity/j_spring_security_check',
			method:'POST',
			params : {
				'j_username' : values.userName,
				'j_password' : values.password
			}
		});
	}
});