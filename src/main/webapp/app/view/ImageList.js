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
				  dv.getStore().add({img:oFREvent.target.result,saved:false});
				  field.hide();
				  if(dv.isHidden()){
					  	panel.showPhotoPanel();
				  }
				  panel.addFileField();
			};
    },
    getSavedImages:function(){
    	var images=[];
    	var st=this.down('dataview').getStore();
    	for(var i=0;i<st.getCount();i++){
    		var rec=st.getAt(i).data;
    		if(rec.saved==true){
    			images.push(rec.img);
    		}
    	}
    	return images;
    },
    removedImages:[],
    getRemovedImages:function(){
    	return this.removedImages;
    },
    setImages:function(images){
    	if( Ext.isEmpty(images))
    		return;
    	var dv=this.down('dataview');
    	var imgs=[];
    	for(var i=0;i<images.length;i++){
    		imgs.push({
    			img:images[i],
    			saved:true
    		});
    	}
    	dv.getStore().loadData(imgs);
    	this.showPhotoPanel();
    },
    showPhotoPanel:function(){
    	var panel=this;
    	panel.setTitle('Zdjęcia');
		if( panel.getHeader()!=null){
			panel.getHeader().show();
		}
		this.down('dataview').show();
	},
    hidePhotoPanel:function(){
    	var panel=this;
		if( panel.getHeader()!=null){
			panel.getHeader().hide();
		}
		panel.down('dataview').hide();
		panel.setBorder(false);
	},
	initComponent:function(){
		var store=Ext.create('Ext.data.Store',{
			fields:['img','saved'],
			data:[]
		});
		var me=this;
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
	            			
	            			if(record.data.saved){
	            				me.removedImages.push(record.data.img);
	            			}
	            			else{
		            			var p=grid.up('panel');
		            			var cmp=p.getComponent(index+1);
		            			p.remove(cmp);
	            			}
	            			if(grid.getStore().getCount()==0){
	            				grid.up('panel').hidePhotoPanel();
	            			}
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
