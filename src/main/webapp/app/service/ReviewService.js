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
		}
};