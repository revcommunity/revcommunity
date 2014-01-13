Ext.define('RevCommunity.controller.ReviewController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
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
			'reviewsidepanel button[action=editReview]' : {
				click : this.editReview
			},
			'reviewsidepanel button[action=deleteReview]' : {
				click : this.deleteReview
			},
			'reviewcommentslist, reviewspanel' : {
				itemclick : this.reviewItemClick
			},
		});
	},
	
	reviewItemClick:function(grid, record, item, index, e, eOpts){
		if (e.target.getAttribute("action") == "submitSpam") {
			this.submitSpam(record);
		}
		else if (e.target.getAttribute("action") == "details") {
			this.showDetails(record);
		}
	},
	
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
		
		//pobieram ocene produktu wystawiona przez autora
		rank = RatingUtil.getChecked('new-review-product-rank');
		
		r.rank = rank;
		
		var encoded = Ext.encode(r);
		Ext.Ajax.request({
			url : 'rest/reviews',
			method : 'POST',
			params : {
				review : encoded
			},
			success : function(response) {
				UtilService.showInfo('Pomyślnie dodano nową recenzję');
				location.href = '#reviews/my';
			},
			failure : function(response) {
				UtilService.showInfo("Błąd przy dodawaniu nowej recenzji");
				location.href = '#reviews/my';
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
				UtilService.showInfo('Pomyślnie edytowano recenzję');
				window.location.reload();

			},
			failure : function(response) {
				UtilService.showInfo("Błąd przy edycji recenzji");
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
				UtilService.showInfo('Komentarz został zapisany pomyślnie.',{
					fn:function(){
						form.down('textareafield').setValue('');
						grid.getStore().load();
					}
				});
			},
		    failure: function(response) 
		    {
		    	UtilService.showInfo('Zapis komentarza zakończył się niepowodzeniem');
		    }
		});
	},
	saveReviewRating : function(btn) {
		var btn2 = null;
		var positive = new Boolean();
		if (btn.action == 'like') {
			positive = true;
			btn2 = btn.prev('button');
		} else {
			positive = false;
			btn2 = btn.next('button');
		}

		var reviewRating = new RevCommunity.model.ReviewRating();
		reviewRating.data.positive = positive;
		var reviewNodeId = Ext.ComponentQuery.query('[name=reviewNodeId]')[0].value;
		var userName = Ext.ComponentQuery.query('[name=userName]')[0].value;

		Ext.Ajax.request({
			url : 'rest/reviews',
			method : 'POST',
			params : {
				rating : Ext.encode(reviewRating.data),
				reviewNodeId : reviewNodeId,
			},
			success : function(response) {
				var value = Ext.JSON.decode(response.responseText).message;
				var dataToSet = new Object();
				dataToSet.usefulness = Math.round(value);
				var bar = Ext.ComponentQuery.query('[name=usefulnessBar]')[0];
				bar.update(dataToSet);
				btn.setDisabled(true);
				btn2.setDisabled(true);
				
				var u = UserService.getByUserName(userName);
				var newRank = UserService.buildRankString(u);
				Ext.ComponentQuery.query('[name=userRank]')[0].el.update(newRank);
			}
		});

	},
	deleteReview:function(btn){
		var review = Ext.ComponentQuery.query('[name=reviewNodeId]')[0].up('reviewform').data;
		if(ReviewService.isReviewEditable(review) || UserService.isAdmin()){
			ReviewService.deleteReview(review.nodeId);
			location.href = '#';
			UtilService.showInfo("Recenzja została pomyślnie usunięta.");
		}else{
			UtilService.showInfo("Nie można usunąć recenzji na którą oddano głos.");
		}
	},
	editReview : function(btn) {
		var review = Ext.ComponentQuery.query('[name=reviewNodeId]')[0].up('reviewform').data;
		if(ReviewService.isReviewEditable(review) || UserService.isAdmin()){
			location.href = '#reviews/edit' + review.nodeId;
		}else{
			UtilService.showInfo("Nie można edytować recenzji na którą oddano głos.");
		}
	},
	submitSpam : function(record) {
		var m = UtilService.exec('comments',{
			id:Ext.encode(record.data.nodeId)
		});
		if (m.success == true){
			UtilService.showInfo('Komentarz został zgłoszony jako spam.');
		}else{
			UtilService.showInfo('Wystąpił błąd podczas próby zgłoszenia spamu.');
		}
	},
	showDetails : function(record){
		var id = record.data.nodeId;
		location.href = '#reviews/' + id;
	}
});