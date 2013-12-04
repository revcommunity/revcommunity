Ext.define('RevCommunity.controller.ReviewController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({/*
						 * 'reviewspanel button[action=addReview]' : { click :
						 * this.addReview },
						 */
			'newreviewform button[action=openCreateProductForm]' : {
				click : this.showNewProductForm
			},
			'newreviewform button[action=saveReview]' : {
				click : this.saveReview
			},
			'newreviewform button[action=saveEditReview]' : {
				click : this.saveEditReview
			},
			'reviewform button[action=saveComment]' : {
				click : this.saveComment
			},
			'reviewform button[action=like]' : {
				click : this.saveReviewRating
			},
			'reviewform button[action=unlike]' : {
				click : this.saveReviewRating
			},
			'reviewform button[action=saveEditReviewLink]' : {
				click : this.saveEditReviewLink
			},
		});
	},
	// addReviewForm : function() {
	// location.href = '#addReview';
	// },
	showNewProductForm : function() {
		location.href = '#product/new';
	},
	saveReview : function(btn) {

		var form = btn.up('form');
		var values = form.getForm().getFieldValues();
		var product = Ext.ModelManager.getModel('RevCommunity.model.Product');

		values.author = null;
		// tutaj mam juz obciete, niepotrzebne pola
		var review = new RevCommunity.model.Review(values);
		var r = review.data;
		r.product = {
			nodeId : values.productId
		};

		var encoded = Ext.encode(r);
		Ext.Ajax.request({
			url : 'rest/reviews',
			method : 'POST',
			params : {
				review : encoded
			},
			success : function(response) {
				alert('Dodano pomyślnie nową recenzję');
				window.location.reload();

			},
			failure : function(response) {
				alert("Błąd przy dodawaniu nowej recenzji");
				window.location.reload();
			}
		});
	},
	saveEditReview : function(btn) {

		var form = btn.up('form');
		var values = form.getForm().getFieldValues();
		var product = Ext.ModelManager.getModel('RevCommunity.model.Product');

		values.author = null;
		var review = new RevCommunity.model.Review(values);
		var r = review.data;
		r.product = {
			nodeId : values.productId
		};
		r.nodeId = values.reviewId;

		var encoded = Ext.encode(r);
		Ext.Ajax.request({
			url : 'rest/reviews/edit',
			method : 'POST',
			params : {
				review : encoded
			},
			success : function(response) {
				alert('Pomyślnie edytowano recenzję');
				window.location.reload();

			},
			failure : function(response) {
				alert("Błąd przy edycji recenzji");
				window.location.reload();
			}
		});
	},
	saveComment : function(btn) {
		var form = btn.up('form');
		var values = form.getForm().getFieldValues();
		values.author = UserService.getLoggedUser();
		var comment = new RevCommunity.model.Comment(values);

		var grid = form.up('container').down('reviewcommentslist');

		Ext.Ajax.request({
			url : 'rest/comments',
			method : 'POST',
			params : {
				comment : Ext.encode(comment.data),
				reviewNodeId : values.reviewNodeId,
			},
			success : function(response) {
				grid.getStore().load();
			}
		});
	},
	saveReviewRating : function(btn) {
		var positive = new Boolean();
		if (btn.action == 'like') {
			positive = true;
		} else {
			positive = false;
		}

		var reviewRating = new RevCommunity.model.ReviewRating();
		reviewRating.data.positive = positive;
		var reviewNodeId = Ext.getCmp('reviewNodeId').value;

		Ext.Ajax.request({
			url : 'rest/reviews',
			method : 'POST',
			params : {
				rating : Ext.encode(reviewRating.data),
				reviewNodeId : reviewNodeId,
			},
			success : function(response) {
				log(Ext.JSON.decode(response.responseText));
				var value = Ext.JSON.decode(response.responseText).message;
				log(value);
				var dataToSet = new Object();
				dataToSet.usefulness = Math.round(value);
				Ext.getCmp('usefulnessBar').update(dataToSet);
			}
		});

	},
	saveEditReviewLink : function(btn) {
		var reviewNodeId = Ext.getCmp('reviewNodeId').value;
		location.href = '#reviews/edit' + reviewNodeId;

	},
});