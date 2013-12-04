var UtilService={
		exec:function(path,params){
			var resp=Ext.Ajax.request({
				url:'rest/'+path,
				async:false,
				params:params
			}).responseText;
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
		}
};