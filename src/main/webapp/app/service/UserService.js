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
			}
			UtilService.execJson('users',user);
		}
}