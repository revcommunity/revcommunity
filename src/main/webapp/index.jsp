<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>RevCommunity</title>

<link rel="stylesheet" type="text/css"
	href="ext-4/resources/css/ext-all-neptune.css">

<link rel="stylesheet/less" type="text/css" href="css/styles.less" />
<script src="app/lib/less-1.4.2.min.js" type="text/javascript"></script>

<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript" src="ext-4/ext-all-dev.js"></script>
<script type="text/javascript" src="ext-4/locale/ext-lang-pl.js"></script>

<link rel="stylesheet" type="text/css" href="lightbox/css/lightbox.css" />

<script type="text/javascript" src="app/tpl/TemplateHolder.js"></script>

<script type="text/javascript" src="app/lib/jquery.min.js"></script>
<script type="text/javascript" src="app/lib/underscore.js"></script>
<script type="text/javascript" src="app/lib/backbone.js"></script>
<script type="text/javascript" src="app/lib/galleria-1.2.9.min.js"></script>

<script src="lightbox/js/lightbox-2.6.min.js"></script>

<script src="app/config.js" type="text/javascript"></script>
<script type="text/javascript" src="app/routers.js"></script>

<script type="text/javascript" src="app/view/components/Buttons.js"></script>

<!-- Service -->
<script type="text/javascript" src="app/service/UtilService.js"></script>
<script type="text/javascript" src="app/service/ProductService.js"></script>
<script type="text/javascript" src="app/service/ReviewService.js"></script>
<script type="text/javascript" src="app/service/UserService.js"></script>
<script type="text/javascript" src="app/service/CategoryService.js"></script>
<script type="text/javascript" src="app/service/SubscriptionService.js"></script>
<script type="text/javascript" src="app/service/ViewService.js"></script>
<script type="text/javascript" src="app/service/FilterService.js"></script>
<script type="text/javascript" src="app/rating/RatingUtil.js"></script>

<script type="text/javascript" src="app/app.js"></script>
<script type="text/javascript" src="app/globals.js"></script>
</head>
<body>
	<div class="top-bar">
		<div class="top-bar-item" hidden="true" id="top-bar-logout-ref">
			<a href="/revcommunity/j_spring_security_logout">Wyloguj</a>
		</div>
		<div class="top-bar-item" hidden="true" id="top-bar-register-ref">
			<a href="auth/register.jsp">Zarejestruj</a>
		</div>
		<div class="top-bar-item" hidden="true" id="top-bar-login-ref">
			<a href="auth/login.jsp">Zaloguj</a>
		</div>
		<div class="top-bar-item" hidden="true" id="top-bar-admin-panel-ref">
			<a href="#adminPanel/view">Panel administratora</a>
		</div>
		<div class="top-bar-item" hidden="true" id="top-bar-user-panel-ref">
			<a href="#users/me">Moje konto</a>
		</div>
		<div class="top-bar-item" hidden="true" id="top-bar-add-product-ref">
			<a href="#products/new">Dodaj produkt</a>
		</div>
		<div class="top-bar-item" hidden="true" id="top-bar-add-category-ref">
			<a href="#category/new">Dodaj kategorię</a>
		</div>
		<div class="top-bar-item" hidden="true" id="top-bar-my-reviews-ref">
			<a href="#reviews/my">Moje recenzje</a>
		</div>
	</div>
	<div id="logo" class="logo-bar">

		<a href="#" onclick="Backbone.history.loadUrl('#');"><img
			class="rev-logo" src="img/logoLogin.png"></img></a>
	</div>

	<div id="category-path" class="rev-category-path"></div>
	<div id="main" class="main">

		<div id="nav" class="navigation-bar">
			<p class="rev-header">Nawigacja</p>
			<div id="searchfield-div"></div>
			<div id="category-tree-div"></div>
			<div id="filters-div" hidden="true">
				<p class="rev-header">Filtry</p>
			</div>
			<div id="user-subscrptions-div"></div>
			<div id="product-subscrptions-div"></div>
		</div>


		<div id="content" class="content"></div>
	</div>

	<div id="footer-bar" class="footer-bar">
		<div class="api_link_nokaut">
			<A HREF="http://www.nokaut.pl/" TARGET="_blank">Nokaut.pl</A>
		</div>
		<div id="contact" class="contact">
			<p class="footer-header">Kontakt</p>
			<p>kontakt@revcommunity.com</p>
		</div>
	</div>
	<div id="bottom-bar" class="bottom-bar">Copyright 2014 by
		RevCommunity. All Rights Reserved.</div>
</body>
</html>
