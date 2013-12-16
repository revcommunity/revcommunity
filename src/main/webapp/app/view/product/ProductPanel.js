Ext.define('RevCommunity.view.product.ProductPanel', {
	extend : 'Ext.form.Panel',
	alias : 'widget.productpanel',
	bodyPadding : 5,
	border : false,
	width : 250,
	onRender : function() {
		this.callParent();
		RatingUtil.addRatingLabel('productRank',this.data.rating, this.data.reviewCount);
	},
	initComponent : function() {
		this.items = [ {
			xtype : 'component',
			cls : 'rev-list-header',
			autoEl : {
				tag : 'div',
				html : this.data.name,
			}
		}, {
			xtype : 'image',
			src : this.data.mainImage,
			height : 200,
			maxWidth : 240,
		}, {
			xtype : 'container',
			layout : {
				type : 'hbox',
				pack : 'center',
				align : 'stretch',
			},
			items : [ {
				xtype : 'component',
				cls : 'rev-box',
				flex : 1,
				autoEl : {
					tag : 'div',
					html : RatingUtil.getRatingWidget('productRank',this.data.rating,true),
				}
			}, {
				xtype : 'component',
				cls : 'rev-box',
				flex : 1,
				margin : '0,0,0,0', // overwrite rev-box class
				autoEl : {
					tag : 'div',
					html : '<span>Cena: ' + this.data.priceAvg + (this.data.priceAvg=="-"?"":" zł") + '</span>',
				}
			} ]
		}, {
			xtype : 'panel',
			margin : '5, 0, 0, 0',
			tpl : '<tpl for="filterValues"><p>{name}: {value}</p></tpl>',
			data : this.data,
		}, ];
		this.callParent(arguments);
	}
});
