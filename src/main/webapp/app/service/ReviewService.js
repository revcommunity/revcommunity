var ReviewService={
		createTestReviews:function(){
			for(var i=0;i<10;i++){
				var r={
						title:'rev'+i,
						content:'revContent'+i
				};
				this.save(r);
			}
		},
		save:function(review){
			UtilService.exec('reviews',{
				review:Ext.encode(review)
			});
		},
		getAll:function(){
			return UtilService.exec('reviews');
		},
		getMyReviews:function(){
			return UtilService.exec('reviews/myReviews');
		},
		countReviewRatings:function(review){
			return UtilService.exec('reviews/countReviewRatings/' + review.nodeId);
		},
		deleteReview:function(id){
			UtilService.exec('reviews/'+id,null,
				{
					method:'DELETE'
				}
			);
		},
		isReviewEditable : function(review) {
			var result = false;
			var loggedUser = UserService.getLoggedUser();
			if (review.author.userName == loggedUser.userName) {
				if (this.countReviewRatings(review) == 0) {
					result = true;
				}
			}
			return result;
		}

};