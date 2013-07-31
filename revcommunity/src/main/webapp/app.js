Ext.application({
        name:'HelloWorld',
        launch:function(){
            console.log('App created');

            Ext.create('Ext.container.Viewport',{
                layout:'fit',
                items:{
                    title: 'Hello Extjs',
                    html: exec("test/test.do").message
                }
            })
        }
    }
)