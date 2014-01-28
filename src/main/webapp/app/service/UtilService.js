var UtilService={
		dateFormat:'Y-m-d H:i:s',
		exec:function(path,params,cfg){
			var resp=Ext.Ajax.request(Ext.apply({
				url:'rest/'+path,
				async:false,
				params:params
			},cfg)).responseText;
			return Ext.decode(resp);
		},
		execWithMethod:function(path,params,method,cfg){
			var resp=Ext.Ajax.request(Ext.apply({
				url:'rest/'+path,
				async:false,
				params:params,
				method:method
			},cfg)).responseText;
			return Ext.decode(resp);
		},
		execJson:function(path,params){
			var resp=Ext.Ajax.request({
				url:'rest/'+path,
				async:false,
				jsonData:params
			}).responseText;
			return Ext.decode(resp);
		},
		populateTestData:function(){
			UtilService.exec('test/testData');
		},
		cleanDB:function(){
			UtilService.exec('test/clean');
		},
		handleException:function(conn, response, options, eOpts){
			log(response.status);
			if( response.status == 401){
				window.open('auth/login.jsp','_parent');
			}else{
				var resp=Ext.decode(response.responseText);
				log(resp);
			}
			
		},
		showInfo:function(msg,cfg){
			Ext.Msg.show(Ext.apply({
				title: 'Informacja',
			    msg: msg,
			    width: 300,
			    buttons: Ext.Msg.OK,
			    icon: Ext.Msg.INFO
		    },cfg));
		},
		download:function(){
			Ext.Ajax.request({
			    url:'rest/nokaut/download'
			});
		},
		setLastUrl:function(fragment){
			var url="/#"+fragment;
			this.exec("users/last",{
				url:url
			});
		}
};