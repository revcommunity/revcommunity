var TemplateHolder={
productList:new Ext.XTemplate(
'<div class="rev-list-header"><span>{name}</span></div>',
'<div class="rev-col-wrap">',
'	<img src="{mainImage}" class="rev-img-small rev-col" ></img>',
'	<div class="rev-border rev-container">',
'			<p>Producent: {producer}</p>',
'			<p>Kod produktu: {productCode}</p>',
'	</div>',
'	<div class="rev-border rev-container-fit">{description}</div>',
'</div>',
'<div class="rev-list-links">',
'	<div class="rev-box">Cena: 100 zł{price}</div>',
'	<div class="rev-box">Średnia ocena: 4.5{rating}</div>',
'	<div class="rev-box">Liczba recenzji: {reviewCount}</div>',
'	<div class="rev-box rev-box-button" action="details">Szczegóły</div>',
'	<div class="rev-box rev-box-button" action="addReview">Dodaj recenzję dla tego produktu</div>',
'</div>'
),
userNotificationList:new Ext.XTemplate(
'<tpl for=".">',
'    <div class="rev-user-notification-item">',
'      <span>{notification.message}</span>',
'    </div>',
'</tpl>'
),
userSubscriptionList:new Ext.XTemplate(
'<tpl for=".">',
'    <div class="rev-user-subscription-item">',
'      <span>{channel.channelOwner.fullName} ({newNotifications})</span>',
'    </div>',
'</tpl>'
)
};