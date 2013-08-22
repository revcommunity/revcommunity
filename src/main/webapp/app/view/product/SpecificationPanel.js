var description = '<p>Obiektyw: <strong> 18-105 mm</strong></p><p>Ilosc megapikseli: <strong>16,2 Mpix</strong></p><p>Podglad kadru na LCD: <strong>Tak</strong></p>';

Ext.define('RevCommunity.view.product.SpecificationPanel' ,{
    extend: 'Ext.form.Panel',
    alias: 'widget.specificationpanel',
	title: 'Specyfikacja',
	html: description,
	bodyPadding: 5
});
