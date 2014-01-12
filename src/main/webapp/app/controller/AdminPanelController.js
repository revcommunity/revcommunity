Ext.define('RevCommunity.controller.AdminPanelController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
			'dataimportpanel button[action=beginImport]' : {
				click : this.beginImport
			},
			'dataimportpanel button[action=downloadMainCategories]' : {
				click : this.downloadMainCategories
			}
		});
	},
	beginImport : function(btn) {
		var form = btn.up('form');
		a = form;
		var checkBox = form.child('checkboxgroup[name=checkBoxCategories]');
		val = checkBox.getValue();
		catIds = val.category;
		
		limitField = form.child('numberfield[name=limit]');
		limit = limitField.getValue();
		form.setLoading(true);
		
		//pobieranie
		this.asyncRequest(form,'remoteImport/downloadWithId','POST',{
			ids : catIds,
			limit : limit
		});
	},
	downloadMainCategories : function(btn) {
		var form = btn.up('form');
		form.setLoading(true);
		this.asyncRequest(form,'remoteImport/downloadMain','POST',{});
	},
	asyncRequest:function(form,url,method, params){
		Ext.Ajax.request({
			url : 'rest/'+url,
			method : method,
			params : params,
			success : function(response) {
				form.setLoading(false);
				re = eval('(' + response.responseText + ')');
				if(re.success == true){
					UtilService.showInfo('Pobrano główne kategorie');
				}else{
					UtilService.showInfo("Błąd podczas pobierania głównych kategori");
				}
				location.reload();
			}
		});
	}
});

var a;