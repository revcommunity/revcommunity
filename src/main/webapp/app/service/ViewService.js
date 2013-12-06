var ViewService={
	showTopMenu:function(){//wyświetla odpowiednie przyciski na górnej belce
		var anonymousItems=['login','register'];
		var userItems=['logout','user-panel','my-reviews'];
		var adminItems=userItems.concat(['add-product','add-category']);
		if(UserService.isAnonymous()){
			this.showTopMenuItems(anonymousItems);
		}else if(UserService.isAdmin()){
			this.showTopMenuItems(adminItems);
		}else if(UserService.isUser()){
			this.showTopMenuItems(userItems);
		}
	},
	showTopMenuItems:function(items){
		for(var i=0;i<items.length;i++){
			Ext.get('top-bar-'+items[i]+'-ref').show();
		}
	}
};