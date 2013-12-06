var UserService={
		getAll:function(){
			return UtilService.exec('users');
		},
		clear:function(){
			return UtilService.exec('users/clear');
		},
		createTest:function(){
			var user={
					userName:'test',
					reviews:[
					         {
					        	 title:'t1',
					        	 content:'c1'
					         },
					         {
					        	 title:'t1',
					        	 content:'c1'
					         }
					]
			};
			UtilService.execJson('users',user);
		},
		me:null,
		getLoggedUser:function(){
			if(this.me==null)
				this.me=UtilService.exec('users/me');
			return this.me;
		},
		getByUserName:function(userName){
			return UtilService.exec('users/name/'+userName);
		},
		hasRole:function(role){
			return this.getLoggedUser().roles.indexOf(role)!=-1;
		},
		isAdmin:function(){
			return this.hasRole('ROLE_ADMIN');
		},
		isUser:function(){
			return this.hasRole('ROLE_USER');
		},
		isAnonymous:function(){
			if(this.getLoggedUser().userName=='anonymousUser')
				return true;
			return false;
		}
};