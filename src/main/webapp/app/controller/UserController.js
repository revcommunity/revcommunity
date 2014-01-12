Ext
		.define(
				'RevCommunity.controller.UserController',
				{
					extend : 'Ext.app.Controller',
					init : function() {
						this.control({
							'userpanel button[action=updateUserInfo]' : {
								click : this.updateUserInfo
							}
						});
					},
					updateUserInfo : function(btn) {
						var form = btn.up('form');
						// var f = form.getForm();
						var values = form.getForm().getFieldValues();

						userData = {
							nodeId : values['nodeId'],
							firstName : values['firstName'],
							lastName : values['lastName'],
							email : values['email']
						};

						values['userData'] = JSON.stringify(userData);

						form.getForm().setValues(values);

						if (form.isValid()) {
							form
									.submit({
										url : 'rest/users/update',
										waitMsg : 'Aktualizacja danych użytkownika...',
										success : function(response) {
											UtilService
													.showInfo('Pomyślnie zaktualizaowano dane użytkownika');
											// odswiezam
											location.reload();

										},
										failure : function(response) {
											UtilService
													.showInfo("Błąd podczas aktualizacji danych użytkownika");
											location.href = '#users/my';
										}
									});
						}

					},

				});