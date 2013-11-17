Ext.define('RevCommunity.controller.ReviewController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({/*
			'reviewspanel button[action=addReview]' : {
				click : this.addReview
			},*/
			'newreviewform button[action=openCreateProductForm]': {
				click : this.showNewProductForm
			},
			'newreviewform button[action=saveReview]': {
				click : this.saveReview
			}
		});
	},
//	addReviewForm : function() {
//		location.href = '#addReview';
//	},
	showNewProductForm : function() {
		location.href = '#newProduct';
	},
	saveReview : function(btn) {
		var form = btn.up('form');
		var values = form.getForm().getFieldValues();
		var product = Ext.ModelManager.getModel('RevCommunity.model.Product');

		
//		//FIXME pozniej trzeb te nulle usunac, na razie nie mmay dostepu do tych obiektow
		values.author = null;
		//tutaj mam juz obciete, niepotrzebne pola
		var review = new RevCommunity.model.Review(values);
		var r = review.data;
		r.product = {
				nodeId: values.productId
		};
		
		var encoded = Ext.encode(r);
		Ext.Ajax.request({
			url:'rest/reviews',
			method:'POST',
			params : {
				review : encoded
			}
		});
	}
});