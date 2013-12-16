Ext.define('Review.view.components.AddBtn' ,{
    extend: 'Ext.button.Button',
    alias: 'widget.addbtn',
	text: 'Dodaj',
	iconCls: 'btn-add'
});

Ext.define('Review.view.components.EditBtn' ,{
    extend: 'Ext.button.Button',
    alias: 'widget.editbtn',
	text: 'Edytuj',
	iconCls: 'btn-edit'
});
Ext.define('Review.view.components.DeleteBtn' ,{
    extend: 'Ext.button.Button',
    alias: 'widget.deletebtn',
	text: 'Usuń',
	iconCls: 'btn-delete'
});
Ext.define('Review.view.components.WatchBtn' ,{
    extend: 'Ext.button.Button',
    alias: 'widget.watchbtn',
	text: 'Obserwuj'
});