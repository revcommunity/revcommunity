Ext
                .define(
                                'RevCommunity.view.review.NewReviewForm',
                                {
                                        extend : 'Ext.form.Panel',
                                        alias : 'widget.newreviewform',
                                        //title : 'Tworzenie recenzji dla: ',
                                        bodyPadding : 5,
                                        layout : 'anchor',
                                        url : 'rest/reviews',
                                        method : 'POST',
                                        productId : null,
                                        defaults : {
                                                anchor : '100%'
                                        },
                                        items : [
                                                        {
                                                                xtype : 'displayfield',
                                                                name : 'category',
                                                                id: 'new-review-category-path-123',
                                                                //fieldLabel : ''
                                                        },
//                                                        {
//                                                                xtype : 'fieldset',
//                                                                layout : 'hbox',
//                                                                items : [ {
//                                                                        fieldLabel : 'Nazwa produktu',
//                                                                        xtype : 'textfield',
//                                                                        name : 'productName',
//                                                                        margin : '5 5 5 0',
//                                                                },
//
//                                                                {
//                                                                        xtype : 'button',
//                                                                        text : 'Dodaj nowy',
//                                                                        action : 'openCreateProductForm',
//                                                                        margin : '5 5 5 0',
//                                                                } ]
//
//                                                        },
                                                        {
                                                                xtype : 'container',
                                                                layout : {
                                                                        type : 'hbox',
                                                                        align : 'strethch'
                                                                },
                                                                items : [
                                                                                {
                                                                                        xtype : 'image',
                                                                                        name : 'productImage',
                                                                                        src : 'img/empty.jpg',
                                                                                        margin : '5 5 5 0',
                                                                                        maxHeight : 210,
                                                                                        maxWidth : 170,
                                                                                        flex : 1
                                                                                },
                                                                                {
                                                                                        xtype : 'container',
                                                                                        flex : 5,
                                                                                        margin : '5 5 5 0',
                                                                                        layout : {
                                                                                                type : 'vbox',
                                                                                                pack : 'end',
                                                                                                align : 'stretch'
                                                                                        },
                                                                                        items : [
                                                                                                        {
                                                                                                                xtype : 'textfield',
                                                                                                                name : 'title',
                                                                                                                emptyText : 'Tutaj wpisz treść, która wyświetli się na liście recenzji'
                                                                                                        }, {
                                                                                                                xtype : 'textfield',
                                                                                                                name : 'reviewId',
                                                                                                                hidden : true
                                                                                                        }, {
                                                                                                                xtype : 'revhtmleditor',
                                                                                                                labelAlign : 'top',
                                                                                                                flex : 4,
                                                                                                                name : 'content',
                                                                                                        }, {
                                                                                                                xtype : 'hidden',
                                                                                                                name : 'productId'
                                                                                                        },{
                                                                                                            	xtype : 'hidden',
                                                                                                            	name : 'rank',
                                                                                                            	value : 4,
                                                                                                        } ]
                                                                                },

                                                                ]
                                                        },

                                        ],
                                        buttons : [ {
                                                text : 'Zapisz',
                                                action : 'saveReview',
                                                id : 'savereview',
                                        } ],
                                        buildCategoryValue : function(product) {
                                                var category = product.category;
                                                catId = category.nodeId;
//                                                var value = category.name;
//                                                category = category.parent;
//                                                while (category != null) {
//                                                        value = category.name + ' -> ' + value;
//                                                        category = category.parent;
//                                                }
//                                                this.getForm().setValues({
//                                                        category : value
//                                                });
                                                
                                                CategoryService.loadCategoryPath(catId);
                                                //FIXME tutaj podalem na sztywo id, można to zrobic lepiej?, końcówka 'bodyEl' sie nie zmeini?
                                                CategoryService.showCategoryPath2('new-review-category-path-123-bodyEl');
                                        },
                                        initComponent : function() {
                                                this.callParent(arguments);
                                        },
                                        listeners: {
                                            afterrender: function(){
                                            	var product = ProductService.get(this.productId);
                                            	this.buildCategoryValue(product);
                                            },
                                        }
                                });