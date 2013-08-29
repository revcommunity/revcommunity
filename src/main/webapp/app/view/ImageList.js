Ext.define('RevCommunity.view.ImageList' ,{
    extend: 'Ext.Panel',
    alias: 'widget.imagelist',
    border:false,
    fileChange:function(field){
    		var dv=this.getComponent(0);
    		var file = field.getEl().down('input[type=file]').dom.files[0];
			var reader = new FileReader();
			reader.readAsDataURL(file);
			var panel=this;
			reader.onload = function (oFREvent) {
				  dv.getStore().add({img:oFREvent.target.result});
				  field.hide();
				  if(dv.isHidden()){
    					panel.setTitle('Zdjęcia');
    					dv.show();
				  }
				  panel.addFileField();
			}
    },
	initComponent:function(){
		var store=Ext.create('Ext.data.Store',{
			fields:['img'],
			data:[]
		});
		
		var f=Ext.applyIf({
			xtype:'fileuploadfield'
		},this.initialConfig);
		
		this.items=[
			{
				xtype:'dataview',
				store:store,
				hidden:true,
				cls:'rev-border',
				padding:5,
				style:{
					marginBottom:'5px'
				},
				tpl: new Ext.XTemplate(
				    '<tpl for=".">',
				        '<div style="margin-bottom: 10px;float:left;margin-right:5px;" class="rev-img-wrap">',
				          '<img class="rev-img-list" src="{img}" /><br>',
				          '<div class="rev-box rev-box-button" action="delete">Usuń</div>',
				        '</div>',
				    '</tpl>',
				    '<div style="clear:both;"></div>'
				),
			    itemSelector: 'div.rev-img-wrap',
			    listeners:{
			    	itemclick:function(grid, record, item, index, e, eOpts ){
	            		
	            		if( e.target.getAttribute("action")=="delete" ){
	            			grid.getStore().removeAt(index);
	            			var p=grid.up('panel');
	            			var cmp=p.getComponent(index+1);
	            			p.remove(cmp);
	            		}
	            	}
			    }
			}
		];
		this.callParent(arguments);
		this.addFileField();
	},
	addFileField:function(){
		
		var f=Ext.applyIf({
			xtype:'fileuploadfield'
		},this.initialConfig);
		
		var field=this.add(f);
		
		field.on('change',this.fileChange,this);
	}					
});
