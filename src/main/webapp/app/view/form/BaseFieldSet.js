Ext.define('RevCommunity.view.form.BaseFieldSet' ,{
    extend: 'Ext.form.FieldSet',
    alias: 'widget.basefieldset',
	defaultType:'textfield',
	padding:'10 10 10 10',
	initComponent:function(){
	
		if(Ext.isEmpty(this.defaults))
			this.defaults={};
			
		Ext.apply(this.defaults, {
					labelWidth:150
		});
		
		this.callParent(arguments);
	}
					
});
