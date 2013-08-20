Ext.define('RevCommunity.controller.UserController', {
    extend: 'Ext.app.Controller',

    init: function() {
        this.control({
            'newproductform button[action=save]': {
                click: this.save
            }
        });
    },
    save:function(btn){
    	var form=btn.up('form');
    	console.log(form.getForm().getValues());
    }
});