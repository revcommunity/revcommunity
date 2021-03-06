var UserService = {
	getAll : function() {
		return UtilService.exec('users');
	},
	clear : function() {
		return UtilService.exec('users/clear');
	},
	createTest : function() {
		var user = {
			userName : 'test',
			reviews : [ {
				title : 't1',
				content : 'c1'
			}, {
				title : 't1',
				content : 'c1'
			} ]
		};
		UtilService.execJson('users', user);
	},
	me : null,
	getLoggedUser : function() {
		if (this.me == null)
			this.me = UtilService.exec('users/me');
		return this.me;
	},
	getByUserName : function(userName) {
		return UtilService.exec('users/name/' + userName);
	},
	hasRole : function(role) {
		return this.getLoggedUser().roles.indexOf(role) != -1;
	},
	isAdmin : function() {
		return this.hasRole('ROLE_ADMIN');
	},
	isUser : function() {
		return this.hasRole('ROLE_USER');
	},
	isAnonymous : function() {
		if (this.getLoggedUser().userName == 'anonymousUser')
			return true;
		return false;
	},
	buildRankString : function(user) {
		var rank = user.rank.concat(" (", user.positiveReviewRatingsCount, "/", user.reviewRatingsCount, ")");
		return TemplateHolder.rankInfo.html.replace("__user_rank__", rank);
	},
	isReviewRated : function(reviewId) {
		var m = UtilService.exec('users/rated/', {
			reviewId : reviewId
		});
		return m.message;
	},
	buildUserLink : function(user) {
		return '#reviews/user/'.concat(user.userName);
	},
	registerRankClickEvent : function() {
		Ext.live('.rev-rank-info', 'click', function() {
			var win = Ext.widget('window', {
				title : 'Rangi użytkowników',
				closeAction : 'hide',
				width : 400,
				height : 350,
				minHeight : 350,
				layout : 'fit',
				resizable : true,
				modal : true,
				bodyPadding : 5,
				html : TemplateHolder.userRankDescription.html,
			});
			win.show();
		});
	},
};