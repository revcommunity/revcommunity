Ext.define('RevCommunity.controller.RevHtmlEditorController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
			'revhtmleditor toolbar button[action=addPhotoWin]' : {
				click : this.addPhotoWin
			},
			'revhtmleditor toolbar button[action=addVideoWin]' : {
				click : this.addVideoWin
			},
			'window[name=photoWin] button[action=addPhoto]':{
				click:this.addPhoto
			},
			'window[name=videoWin] button[action=addVideo]':{
				click:this.addVideo
			}
		});
	},
	addPhoto:function(btn){
		var win=btn.up('window');
		var editor=win.editor;
		var url=win.down('field[name=url]').getValue();
		editor.insertAtCursor('<img src="'+url+'" ></img>');
		win.close();
	},
	addPhotoWin:function(btn){
		var editor=btn.up('revhtmleditor');
		Ext.widget('window', {
			name:'photoWin',
			title:'Dodaj zdjecie',
			editor:editor,
			autoHeight:true,
		    autoWidth:true,
		    constrain:true,
			layout:'fit',
			autoShow:true,
			items:[
			       {
			    	   xtype:'textfield',
			    	   margin:5,
			    	   fieldLabel:'Link',
			    	   name:'url'
			       }
			],
			buttons:[
			         {
			        	 text:'Dodaj',
			        	 action:'addPhoto'
			         },
			         {
			        	 text:'Anuluj',
			        	 handler:function(btn){
			        		 btn.up('window').close();
			        	 }
			         }
			]
		
		});
	},
	addVideo:function(btn){
		var win=btn.up('window');
		var editor=win.editor;
		var url=win.down('field[name=url]').getValue();
		editor.insertAtCursor('<iframe width="420" height="345" src="'+url+'"></iframe>');
		win.close();
	},
	addVideoWin:function(btn){
		var editor=btn.up('revhtmleditor');
		Ext.widget('window', {
			name:'videoWin',
			title:'Dodaj wideo',
			editor:editor,
			autoHeight:true,
		    autoWidth:true,
		    constrain:true,
			layout:'fit',
			autoShow:true,
			items:[
			       {
			    	   xtype:'textfield',
			    	   margin:5,
			    	   fieldLabel:'Link',
			    	   name:'url'
			       }
			],
			buttons:[
			         {
			        	 text:'Dodaj',
			        	 action:'addVideo'
			         },
			         {
			        	 text:'Anuluj',
			        	 handler:function(btn){
			        		 btn.up('window').close();
			        	 }
			         }
			]
		
		});
	}
});