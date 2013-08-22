var img = '<img src="css/img/b.JPG" alt="sample picture" width="200" height="150" />';
var description = ' <p>'+img+'</p><p>55 recenzji</p><p>Srednia ocena <strong>4</strong></p><p>cena: <strong>908-1233 PLN</strong></p>';


Ext.define('RevCommunity.view.product.QuickViewPanel', {
		    title: 'Nazwa produktu',
		    extend:'Ext.form.Panel',
		    bodyPadding: 5,
		    alias: 'widget.quickviewpanel',
			html: description
});