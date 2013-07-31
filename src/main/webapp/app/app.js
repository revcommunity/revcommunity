Ext.application({
    name: 'RevCommunity',
    launch: function() {
    	Ext.Msg.alert('Test','Hello');
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: [
                {
                    title: 'Hello',
                    html : 'Test'
                }
            ]
        });
    }
});