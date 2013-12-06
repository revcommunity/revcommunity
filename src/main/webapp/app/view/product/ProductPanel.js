Ext.define('RevCommunity.view.product.ProductPanel', {
	extend : 'Ext.form.Panel',
	alias : 'widget.productpanel',
	bodyPadding : 5,
	border : false,
	width : 250,
	initComponent : function() {
		log(this.data);
		this.items = [
				{
					xtype : 'component',
					cls : 'rev-list-header',
					autoEl : {
						tag : 'div',
						html : this.data.name,
					}
				},
				{
					xtype : 'image',
					src : this.data.mainImage,
					height : 200,
					maxWidth : 240,
				},
				{
					xtype : 'container',
					layout : {
						type : 'hbox',
						pack : 'center',
					},
					items : [
							{
								xtype : 'component',
								cls : 'rev-box',
								flex : 1,
								autoEl : {
									tag : 'div',
									html : 'Ocena: ' + this.data.rating + ' ('
											+ this.data.reviewCount + ')',
								}
							},
							{
								xtype : 'component',
								cls : 'rev-box',
								flex : 1,
								margin : '0,0,0,0', // overwrite rev-box class
								autoEl : {
									tag : 'div',
									html : 'Cena: ' + this.data.priceAvg
											+ ' zł',
								}
							} ]
				},
				{
					xtype : 'panel',
					margin : '5, 0, 0, 0',
					tpl : '<tpl for="filters"><p>{name}: {value}</p></tpl>',
					data : this.data,
				}, ];
		this.callParent(arguments);
	}
});
