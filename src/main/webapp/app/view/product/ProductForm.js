Ext.define('RevCommunity.view.product.ProductForm' ,{
    extend: 'Ext.form.Panel',
    alias: 'widget.productform',
 	title:'Nowy produkt',
	bodyPadding: 5,
	layout: 'anchor',
	url:'rest/products',
	method:'POST',
    defaults: {
        anchor: '100%'
    },
    getProduct:function(){
    	var form=this;
    	var values = form.getForm().getFieldValues();
		var product= new RevCommunity.model.Product(values).data;
    	var categoryCombo=form.down('categorycombo:last');
		var specFs=form.down('specificationfieldset');
		var values=specFs.getFieldValues();
		product.filters=FilterService.readFilters(values);
		product.category={
				nodeId:categoryCombo.getValue()
		};
		var images=this.down('imagelist').getSavedImages();
		product.images=images;
		return product;
    },
    getRemovedImages:function(){
    	return this.down('imagelist').getRemovedImages();
    },
    items: [
	    	{
				xtype:'categoryfieldset'
			},
			{
				xtype:'container',
				layout: {
				    type: 'hbox',
				    pack: 'end',
				    align: 'stretch'
				},
				items:[
					{
						xtype:'productinfofieldset',
						style:{
							marginRight:'5px'
						},
						flex:1
					},
					{
						xtype:'specificationfieldset',
						flex:1
					}
				]
			},
			{
				xtype:'revhtmleditor',
				labelAlign:'top',
				name:'description',
				height:500,
				fieldLabel:'Opis produktu'
			},{
				xtype:'imagelist',
				fieldLabel:'Dodaj zdjęcie',
				name:'images',
				width:500,
				buttonText: 'Przeglądaj...'
			}
	],
    buttons: [
		{
			text: 'Zapisz',
			action:'save'
		}	
	],
	initComponent:function(){
		this.callParent(arguments);
		if(this.mode=='edit'){
			this.loadProduct(this.productId);
		}
	},
	loadProduct:function(productId){
		var product=ProductService.get(productId);
		this.product=product;
		this.loadFilters(product);
		this.getForm().setValues(product);
		this.getForm().setValues(product.keys);//wartosci filtrów
		this.down('imagelist').setImages(product.images);
	},
	loadFilters:function(product){
		var category=product.category;
		var catCmb=this.down('categorycombo');
		while(category!=null){
			var parentId=null;
			if(category.parent==null){
				break;
			}
			else{
				parentId=category.parent.nodeId;
			}
			var cmb=catCmb.ownerCt.insert(1,{
				xtype:'categorycombo',
				parentId:parentId
			});
			cmb.getStore().add(category);
			cmb.setValue(category.nodeId);
			category=category.parent;
		}
		catCmb.getStore().add(category);
		catCmb.setValue(category.nodeId);
		var specFs=this.down('specificationfieldset');
		var filters=CategoryService.getFilters(product.category.nodeId);
		specFs.setFilters(filters);
	}
});
