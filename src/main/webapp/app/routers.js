var AppRouter = Backbone.Router.extend({
    routes: {
    	'': 'home',
    	'newProduct':'newProduct',
    	'productList':'productList'
    },
    home : function()
    {
    	console.log("home");
    },
 	newProduct:function(){
 		this.clearPage();
 		var form=Ext.widget('newproductform',{
			renderTo:Ext.get('page')
		});	
 	},
 	productList:function(){
 		this.clearPage();
 		var list=Ext.widget('productlist',{
			renderTo:Ext.get('page')
		});	
 	},
 	clearPage:function(){
 		var childs=Ext.get('page').dom.children;
 		for(var i=0;i<childs.length;i++){
 			Ext.getCmp(childs[i].id).destroy();
 		}
 	}
   
});