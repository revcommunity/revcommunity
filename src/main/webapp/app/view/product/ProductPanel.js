Ext.define('RevCommunity.view.product.ProductPanel' ,{
    extend: 'Ext.form.Panel',
    alias: 'widget.productpanel',
	bodyPadding: 5,
	border: false,
	width: 250,
	tpl: new Ext.XTemplate(
			'<div class="rev-list-header"><span>{name}</span></div>',
			'<img src="{mainImage}" class="rev-img-details">',
			'<div class="rev-product-boxes">',
			   '<div class="rev-boxes">',
			      '<div class="rev-box">{reviewCount} recenzji</div>',
			      '<div class="rev-box">Srednia ocena: {rating}</div>',
			   '</div>',
			   '<div class="rev-boxes">',
			      '<div class="rev-box">Cena: {priceAvg} zł</div>',
			      '<div class="rev-box">F</div>',
			  '</div>',
			'</div>',
			  '<div class="rev-product-spec rev-border">',
			  	'<p>Producent: {producer}</p>',
			  	'<p>Kod produktu: {productCode}</p>',
			  '</div>'	  
	)
});
