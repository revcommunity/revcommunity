var AppRouter = Backbone.Router.extend({
	routes : {
		'' : 'home',
		'newProduct' : 'newProduct',
		'newCategory' : 'newCategory',
		'productList' : 'productList',
		'product/:id' : 'product',
		'myReviews':'myReviews'
	},
	home : function() {
		console.log("home");
	},
	product : function(id) {
		var product = Ext.ModelManager.getModel('RevCommunity.model.Product');
		var thisRouter = this;
		product.load(id, {
			success : function(product) {
				thisRouter.clearPage();

				var panel = Ext.widget('productpanel', {
					data : product.data
				});

				var grid = Ext.widget('reviewspanel');

				grid.getStore().setProductId(id);
				grid.getStore().load(
						{
							scope : this,
							callback : function(records, operation, success) {
								thisRouter.calculateProductProperties(records,
										product);
								var wrapper = Ext.widget('productwrapper', {
									items : [ grid, panel ]
								});
								Ext.getCmp('contentPanel').add(wrapper);
							}
						});

			}
		});
	},
	newProduct : function() {
		this.clearPage();
		var form = Ext.widget('newproductform');
		Ext.getCmp('contentPanel').add(form);
	},
	newCategory : function() {
		this.clearPage();
		var form = Ext.widget('newcategoryform', {
		});
		Ext.getCmp('contentPanel').add(form);
	},
	productList : function() {
		this.clearPage();
		var list = Ext.widget('productlist', {
		});
		Ext.getCmp('contentPanel').add(list);
		list.getStore().load();
	},
	clearPage : function() {
//		var childs = Ext.get('content').dom.children;
//		for (var i = 0; i < childs.length; i++) {
//			Ext.getCmp(childs[i].id).destroy();
//		}
		Ext.getCmp('contentPanel').removeAll();
	},
	calculateProductProperties : function(records, product) {

		var count = 0;
		var averageMark;
		var sumOfMarks = 0;

		for ( var r in records) {
			if (records.hasOwnProperty(r)) {
				console.log(records[r]);
				count++;
				sumOfMarks += records[r].data.rank;
			}
		}

		averageMark = (sumOfMarks / count).toFixed(2);
		Ext.apply(product.data, {
			averageMark : averageMark,
			reviewCount : count
		});
	},
	myReviews:function(){
		this.clearPage();
		var panel = Ext.widget('myreviewspanel',{
			mode:'myReviews'
		});
		Ext.getCmp('contentPanel').add(panel);
	}
});
