var TemplateHolder={
bestUsersList:new Ext.XTemplate(
'<tpl for=".">',
'	<div class="rev-best-user-wrap">',
'	<div class="rev-best-user-img"><img src="{image}"></div>',
'	<a href="{[UserService.buildUserLink(values)]}">{fullName}</a>',
'	<div>{[UserService.buildRankString(values)]}</div>',
'	</div>',
'</tpl>'
),
commentsListContent:new Ext.XTemplate(
'<div class="rev-list-header">',
'	<span style="float:left">Dodano: {dateAddedString}</span>',
'	<span style="float:right" action="submitSpam" class="rev-spam-submit">Zgłoś spam!</span> ',
'</div>',
'<div class="rev-comment-content">{text}</div>'
),
commentsListUser:new Ext.XTemplate(
'<div class="rev-user-container">',
'	<img src={author.image} class="rev-comments-user-image" ></img>',
'	<div class="rev-user-name-small">',
'		<a href="{[UserService.buildUserLink(values.author)]}">{author.fullName}</a>',
'	</div>',
'</div>'
),
evaluationForm:new Ext.XTemplate(
'<div class="rev-box rev-evaluation-box">',
'{key}: {value} </br>',
'{[RatingUtil.getRatingWidget(values.key,values.value,true)]}',
'</div>'
),
productList:new Ext.XTemplate(
'',
'<div class="rev-col-wrap">',
'	',
'	<img src="{mainImage}" class="rev-img-small rev-col" ></img>',
'	<div class="rev-product-info">',
'		<div class="rev-title" action="details">{name}</div>',
'		<div class="rev-list-item">Kategoria: <a href="#products/filter/{category.nodeId}">{category.name}</a></div>',
'		<div class="rev-list-item">Cena: {priceAvg} zł</div>',
'	</div>',
'	<div class="rev-product-rating">',
'		<div>{[RatingUtil.getRatingWidget(Ext.id(),values.rating,true)]}</div>',
'		<div>Średnia ocena: {rating} ({reviewCount})</div>',
'	</div>',
'</div>'
),
productNotificationList:new Ext.XTemplate(
'<tpl for=".">',
'<div class="rev-hd-username"><a href="#products/{product.nodeId}">{product.Name}</a></div>',
'	<tpl for="notification">',
'	    <div class="rev-user-notification-item">',
'		    ',
'	      	<span class="rev-notification-title">',
'		      	<tpl if="readed == false">',
'			          <span class="rev-new-label">Nowość!</span>',
'			    </tpl>',
'		    	{notification.message}',
'		   	</span>',
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
rankInfo:new Ext.XTemplate(
'<div class="rev-rank-info">',
'	<span>__user_rank__</span>',
'<!--     <img src="img/help.png" class="rev-rank-info-img" /> -->',
'</div>'
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
reviewFormRank:new Ext.XTemplate(
'<div>Przydatność recenzji:</div>',
'<div class="rev-usefulness-label">{usefulness}%</div>'
),
reviewFormUsefulness:new Ext.XTemplate(
'<div>Ocena produktu:</div>',
'<div class="rev-overal-mark">{rank}</div>',
'{[RatingUtil.getRatingWidget("overal", values.rank, true)]}'
),
reviewsPanelContent:new Ext.XTemplate(
'<div class="rev-col-wrap">',
'	<div class="rev-product-info">',
'		<div class="rev-title" action="details">{title}</div>',
'		<div class="rev-list-item" >',
'			Produkt: <a href="#products/{product.nodeId}">{product.name}</a>',
'		</div>',
'		<div class="rev-list-item">',
'			<div class="rev-list-label">Ocena produktu:</div>',
'			<div>{[RatingUtil.getRatingWidget(values.nodeId,values.rank,true)]}</div>',
'		</div>',
'		<div class="rev-list-item">',
'			<div class="rev-list-label">Przydatność:</div>',
'			<div class="rev-progressbar-outer"> ',
'				<div class="rev-progressbar-label">{[Math.round(values.usefulness)]}%</div>',
'				<div style="width: {usefulness}%" class="rev-progressbar-inner"></div>',
'			</div>',
'		</div>',
'	</div>',
'</div>'
),
reviewsPanelContentProductMode:new Ext.XTemplate(
'<div class="rev-col-wrap">',
'	<div class="rev-product-info">',
'		<div class="rev-title" action="details">{title}</div>',
'		<div class="rev-list-item">',
'			<div class="rev-list-label">Ocena produktu:</div>',
'			<div>{[RatingUtil.getRatingWidget(values.nodeId,values.rank,true)]}</div>',
'		</div>',
'		<div class="rev-list-item">',
'			<div class="rev-list-label">Przydatność:</div>',
'			<div class="rev-progressbar-outer"> ',
'				<div class="rev-progressbar-label">{[Math.round(values.usefulness)]}%</div>',
'				<div style="width: {usefulness}%" class="rev-progressbar-inner"></div>',
'			</div>',
'		</div>',
'	</div>',
'</div>'
),
reviewsPanelProductImage:new Ext.XTemplate(
'<img src="{product.mainImage}" class="rev-img-small"></img>'
),
reviewsPanelUser:new Ext.XTemplate(
'	<div class="rev-user-container-mini">',
'		<img src="{author.image}" class="rev-author-mini-img" ></img>',
'		<div class="rev-author-mini-name">',
'			<a href="{[UserService.buildUserLink(values.author)]}">{author.fullName}</a>',
'		</div>',
'		<div class="rev-author-mini-rank">{[UserService.buildRankString(values.author)]}</div>',
'	</div>'
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
userRankDescription:new Ext.XTemplate(
'<p> Ranga użytkownika uzależniona jest od liczby napisanych przez niego recenzji i ich przydatności.<br />',
'	Wyróżniamy następujące rangi:</p>',
'<ul>',
'	<li>Niekompetenty</li>',
'	<li>Niezaufany</li>',
'	<li>Przeciętny</li>',
'	<li>Godny zaufania</li>',
'	<li>Ekspert</li>',
'</ul>',
'<p>Początkowo, recenzent posiada rangę &quot;Przeciętny&quot;.</p>',
'<p>Liczby znajdujące się obok rangi użytkownika informują kolejno o liczbie pozytywnych głosów, a także łącznej liczbie głosów oddanych na recenzje użytkownika.</p>'
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