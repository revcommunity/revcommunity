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
		}
};