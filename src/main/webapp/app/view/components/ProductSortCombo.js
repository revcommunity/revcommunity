Ext.define('RevCommunity.view.components.ProductSortCombo' ,{
	extend: 'Ext.form.ComboBox',
    alias: 'widget.productsortcombo',
    displayField:'name',
    valueField:'property',
    triggerAction: 'all',
    value:'dateAdded',
    buildStore:function(){
    	return Ext.create("Ext.data.Store",{
    		fields:['name','property'],
    		data:[
    		      {
    		    	  name:'Ocena',
    		    	  property:'rating'
    		      },
    		      {
    		    	  name:'Cena',
    		    	  property:'priceAvg'
    		      },
    		      {
    		    	  name:'Data dodania',
    		    	  property:'dateAdded'
    		      }
    		]
    	});
    },
    initComponent:function(){
    	this.store=this.buildStore();
    	this.callParent(arguments);
    }
});
