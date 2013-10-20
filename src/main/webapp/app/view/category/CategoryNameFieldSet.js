Ext.define('RevCommunity.view.category.CategoryNameFieldSet' ,{
    extend: 'RevCommunity.view.form.BaseFieldSet',
    alias: 'widget.categorynamefieldset',
	title:'Nazwa nowej kategorii',
	layout: 'anchor',
	items:[
			{
				fieldLabel:'Nazwa',
				name:'name'
			}
	],
	initComponent:function(){
	
		if(Ext.isEmpty(this.defaults))
			this.defaults={};
			
		Ext.apply(this.defaults, {
					allowBlank:false
		});
		
		this.callParent(arguments);
	}
});
