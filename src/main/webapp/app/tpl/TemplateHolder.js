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
'	<div class="rev-box">Średnia ocena: 4.5{rating}({reviewCount})</div>',
'	<div class="rev-box rev-box-button" action="details">Szczegóły</div>',
'	<div class="rev-box rev-box-button" action="addReview">Dodaj recenzję</div>',
' 	<tpl if="UserService.isAdmin()">',
'        <div class="rev-box rev-box-button" action="edit">Edytuj</div>',
'    </tpl>',
'</div>'
),
productNotificationList:new Ext.XTemplate(
'<tpl for=".">',
'<div class="rev-hd-username"><a href="#products/{product.nodeId}">{product.Name}</a></div>',
'	<tpl for="notification">',
'	    <div class="rev-user-notification-item">',
'	      <span class="rev-notification-title">{notification.message}</span>',
'	      <br>',
'	      <img src="{notification.review.product.mainImage}" class="rev-notification-image"/>',
'	      <div class="rev-notification-desc">{notification.review.content}</div>',
'	    </div>',
'	</tpl>',
'</tpl>'
),
productSubscriptionList:new Ext.XTemplate(
'<p class="rev-header">Obserwowane produkty</p>',
'<tpl for=".">',
'    <div class="rev-user-subscription-item">',
'      <img src="{product.mainImage}" width="18"/><span>{channel.channelProduct.name} ({newNotifications})</span>',
'    </div>',
'</tpl>'
),
userNotificationList:new Ext.XTemplate(
'<tpl for=".">',
'<div class="rev-hd-username"><a href="#reviews/user/{user.userName}">{user.fullName}</a></div>',
'	<tpl for="notification">',
'	    <div class="rev-user-notification-item">',
'	      <span class="rev-notification-title">{notification.message}</span>',
'	      <br>',
'	      <img src="{notification.review.product.mainImage}" class="rev-notification-image"/>',
'	      <div class="rev-notification-desc">{notification.review.content}</div>',
'	    </div>',
'	</tpl>',
'</tpl>'
),
userSubscriptionList:new Ext.XTemplate(
'<p class="rev-header">Subskrupcje</p>',
'<tpl for=".">',
'    <div class="rev-user-subscription-item">',
'      <img src="{user.image}" width="18"/><span>{user.fullName} ({newNotifications})</span>',
'    </div>',
'</tpl>'
)
};