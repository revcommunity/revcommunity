Ext.define('RevCommunity.view.components.RevHtmlEditor' ,{
    extend: 'Ext.form.HtmlEditor',
    alias: 'widget.revhtmleditor',
	initComponent:function(){
		this.callParent(arguments);
		this.addImageBtn();
	},
	addImageBtn:function(){
		this.getToolbar().add({
			text:'Dodaj zdjecie',
			action:'addPhotoWin'
		});
		this.getToolbar().add({
			text:'Dodaj wideo',
			action:'addVideoWin'
		});
	}
					
});
