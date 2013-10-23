var AppRouter = Backbone.Router.extend({
<<<<<<< HEAD
    routes: {
    	'': 'home',
    	'newProduct':'newProduct',
    	'newCategory':'newCategory',
    	'productList':'productList',
    	'product/:id':'product',
    	'newReview': 'newReview',
    	'addReview/:id' : 'addReview',
    	'myReviews':'myReviews'
    },
    home : function()
    {
    	console.log("home");
    },
 	product:function(id){ 		
 		var product = Ext.ModelManager.getModel('RevCommunity.model.Product');
 		var thisRouter = this;
 		product.load(id, {
 		    success: function(product) { 	
 		    	thisRouter.clearPage(); 	
 		 		
 		    	var panel=Ext.widget('productpanel',{
 		 			data: product.data
 				});
 		 		
 		 		var grid = Ext.widget('reviewspanel');
		 		 
		 		grid.getStore().setProductId(id);
		 		grid.getStore().load({
		 		    scope   : this,
		 		    callback: function(records, operation, success) {
		 		    	thisRouter.calculateProductProperties(records, product);		 		    	
				 		var wrapper=Ext.widget('productwrapper',{
		 					items : [grid, panel]
				 		});
		 		    }
		 		});
		 		
 		    }
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
 	newReview:function(){
 		this.clearPage();
 		var form=Ext.widget('newreviewform',{
			renderTo:Ext.get('page')
		});	
 	},
 	clearPage:function(){
 		var childs=Ext.get('page').dom.children;
 		for(var i=0;i<childs.length;i++){
 			Ext.getCmp(childs[i].id).destroy();
 		}
 	},
 	addReview:function(id){ 		
 		var product = Ext.ModelManager.getModel('RevCommunity.model.Product');
 		var thisRouter = this;
 		product.load(id, {
 		    success: function(product) { 	
 		    	thisRouter.clearPage(); 	
 		 		
 		    	var panel=Ext.widget('productpanel',{
 		 			data: product.data
 				});
 		 		
 		    	//this.clearPage();
 		 		var form=Ext.widget('newreviewform',{
 					renderTo:Ext.get('page')
 				});
 		    	
		 		form.getForm().setValues({productName:product.data.name});
		 		form.getForm().setValues({productId:product.data.nodeId});
		 		var image = form.down('image');
		 		//var image = form.getForm().findChildByElement('name=productImage');
		 		image.setSrc(product.data.mainImage);
		 		//form.getForm().setValues({productImage:product.data.mainImage});
 		    }
 		});
 	},
   calculateProductProperties: function(records, product){
  
	   var count = 0;
	   var averageMark;
	   var sumOfMarks = 0;
	   
	   for(var r in records) {
		    if (records.hasOwnProperty(r)) {
		    	console.log(records[r]);
		    	count++;
		    	sumOfMarks += records[r].data.rank;
		    }
		  }
	   
	   averageMark = (sumOfMarks/count).toFixed(2);
	   Ext.apply(product.data, {
		   averageMark: averageMark,
		   reviewCount: count
		});
	},
	myReviews:function(){
		this.clearPage();
		var panel = Ext.widget('myreviewspanel');
		Ext.getCmp('contentPanel').add(panel);
	}
});
