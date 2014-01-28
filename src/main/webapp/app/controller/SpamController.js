Ext.define('RevCommunity.controller.SpamController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
			'spamlistpanel, spamlistpanel' : {
				itemclick : this.messageClick
			},
		});
	},
	messageClick:function(grid, record, item, index, e, eOpts){
		if (e.target.getAttribute("action") == "unspam") {
			this.unspamComment(record,grid);
		}
		else if (e.target.getAttribute("action") == "deleteSpam") {
			this.deleteComment(record,grid);
		}
	},
	deleteComment : function(record,grid) {
		var m = UtilService.execWithMethod('spam/delete/'+record.data.nodeId,{},"DELETE");
		if (m.success == true){
			UtilService.showInfo('Spam został usunięty');
			grid.store.read();
		}else{
			UtilService.showInfo('Wystąpił błąd podczas próby zgłoszenia spamu.');
		}
	},
	unspamComment : function(record,grid) {
		var m = UtilService.exec('spam/unspam',{
			id:Ext.encode(record.data.nodeId)
		});
		if (m.success == true){
			UtilService.showInfo('Komentarz został usuniety z listy spamu.');
			grid.store.read();
		}else{
			UtilService.showInfo('Wystąpił błąd podczas próby zgłoszenia spamu.');
		}
	}
});


var R;