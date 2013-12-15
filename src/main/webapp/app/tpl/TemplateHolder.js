var TemplateHolder={
commentsList:new Ext.XTemplate(
'<div class="rev-user-container">',
'	<img src={author.image} class="rev-comments-user-image" ></img>',
'	<div class="rev-user-name-small">{author.fullName}</div>',
'</div>'
),
evaluationForm:new Ext.XTemplate(
'<div class="rev-box rev-evaluation-box">',
'{key}: {value} </br>',
'{[RatingUtil.getRatingWidget(values.key,values.value,true)]}',
'</div>'
),
productList:new Ext.XTemplate(
'<div class="rev-list-header"><span>{name}</span><span style=text-align="right">(Dodano: {dateAddedString})</span></div>',
'<div class="rev-col-wrap">',
'	<img src="{mainImage}" class="rev-img-small rev-col" ></img>',
'	<div>Cena: {priceAvg} zł</div>',
'	<div>Średnia ocena: {rating} ({reviewCount})</div>',
'	<div class="rev-list-links">',
'		<div class="rev-box rev-box-button" action="details">Szczegóły</div>',
'		<div class="rev-box rev-box-button" action="addReview">Dodaj recenzję</div>',
'	 	<tpl if="UserService.isAdmin()">',
'	        <div class="rev-box rev-box-button" action="edit">Edytuj</div>',
'	        <div class="rev-box rev-box-button" action="delete">Usuń</div>',
'	    </tpl>',
'	</div>',
'	',
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
ratingWidget:new Ext.XTemplate(
'<input type="radio" class="rating-input" id="rating-input-1-5"',
'	name="rating-input-1">',
'<label for="rating-input-1-5" class="rating-star"></label>',
'<input type="radio" class="rating-input" id="rating-input-1-4"',
'	name="rating-input-1">',
'<label for="rating-input-1-4" class="rating-star"></label>',
'<input type="radio" class="rating-input" id="rating-input-1-3"',
'	name="rating-input-1">',
'<label for="rating-input-1-3" class="rating-star"></label>',
'<input type="radio" class="rating-input" id="rating-input-1-2"',
'	name="rating-input-1">',
'<label for="rating-input-1-2" class="rating-star"></label>',
'<input type="radio" class="rating-input" id="rating-input-1-1"',
'	name="rating-input-1">',
'<label for="rating-input-1-1" class="rating-star"></label>'
),
reviewsPanelColumn1:new Ext.XTemplate(
'<div class="rev-user-container">',
'	<img src={author.image} class="rev-user-small-image" ></img>',
'	<div class="rev-user-name">{author.fullName}</div>',
'	<div class="rev-user-rank">{author.rank}</div>',
'</div>'
),
reviewsPanelColumn2:new Ext.XTemplate(
'<div class="rev-list-header">',
'	<div style="float:left">{title}</div>',
'	<div style="float:right">{dateAddedString}</div>',
'</div>',
'<div class="rev-reviewList-content">{content}</div> ',
'<div>',
'	<div class="rev-usefulness-progressbar">',
'		<div style="width: {usefulness}%" class="rev-usefulness-inner"></div>',
'	</div>',
'</div>'
),
reviewsPanelColumn3:new Ext.XTemplate(
'<div class="rev-review-mark">{rank}</div>',
'<div style="text-align:center; padding-top:5px">{[RatingUtil.getRatingWidget(values.nodeId,values.rank,true)]}</div>'
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