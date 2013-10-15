var AppRouter = Backbone.Router.extend({
    routes: {
    	'': 'home',
    	'newProduct':'newProduct',
    	'newCategory':'newCategory',
    	'productList':'productList',
    	'product':'product'
    },
    home : function()
    {
    	console.log("home");
    },
 	product:function(){
 		this.clearPage();
 		var panel=Ext.widget('productpanel',{
			renderTo:Ext.get('page')
		});	
 	},
 	newProduct:function(){
 		this.clearPage();
 		var form=Ext.widget('newproductform',{
			renderTo:Ext.get('page')
		});	
 	},
 	newCategory:function(){
 		this.clearPage();
 		var form=Ext.widget('newcategoryform',{
			renderTo:Ext.get('page')
		});	
 	},
 	productList:function(){
 		this.clearPage();
 		var list=Ext.widget('productlist',{
			renderTo:Ext.get('page')
		});	
		list.getStore().load();
 	},
 	clearPage:function(){
 		var childs=Ext.get('page').dom.children;
 		for(var i=0;i<childs.length;i++){
 			Ext.getCmp(childs[i].id).destroy();
 		}
 	}
   
});
