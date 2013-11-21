<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
    <title>RevCommunity</title>

    <link rel="stylesheet" type="text/css" href="ext-4/resources/css/ext-all-neptune.css">
    
    <link rel="stylesheet/less" type="text/css" href="css/styles.less" />
    
    <script src="app/lib/less-1.4.2.min.js" type="text/javascript"></script>
    
	<link rel="stylesheet" type="text/css" href="css/style.css" />
    <script type="text/javascript" src="ext-4/ext-all-dev.js"></script>
    
    <script type="text/javascript" src="app/tpl/TemplateHolder.js"></script>
    
   	<script type="text/javascript" src="app/lib/jquery.min.js"></script>
	<script type="text/javascript" src="app/lib/underscore.js"></script>
	<script type="text/javascript" src="app/lib/backbone.js"></script>
	<script type="text/javascript" src="app/lib/galleria-1.2.9.min.js"></script>
	
	<script src="app/config.js" type="text/javascript"></script>
	<script type="text/javascript" src="app/routers.js"></script>
	
	<!-- Service -->
	<script type="text/javascript" src="app/service/UtilService.js"></script>
	<script type="text/javascript" src="app/service/ProductService.js"></script>
	<script type="text/javascript" src="app/service/ReviewService.js"></script>
	<script type="text/javascript" src="app/service/UserService.js"></script>
	<script type="text/javascript" src="app/service/CategoryService.js"></script>
	<script type="text/javascript" src="app/service/SubscriptionService.js"></script>
	
	
	
    <script type="text/javascript" src="app/app.js"></script>
    <script type="text/javascript" src="app/globals.js"></script>
</head>
<body>
	<div class="top-bar">
		<div class="top-bar-item" ><a id="top-bar-logout-ref" href="/revcommunity/j_spring_security_logout" >Wyloguj</a></div>
		<div class="top-bar-item" ><a id="top-bar-reg-ref" href="auth/register.jsp" >Zarejestruj</a></div>
		<div class="top-bar-item" ><a id="top-bar-login-ref" href="auth/login.jsp" >Zaloguj</a></div>
		<div class="top-bar-item" </div><a id="top-bar-user-ref" href="/revcommunity/user/panel"></a></div>
	</div>
	<div id="logo"  class="logo-bar" >
		<div>RevCommunity</div>
	</div>

	<div id="main" class="main">
	
		<div id="nav" class="navigation-bar">
			<p class="navigation-header">Nawigacja</p>
			<ul class="navigation-list">
				<li class="navigation-list-item"><a href="#newProduct" >Dodaj produkt</a></li>
				<li class="navigation-list-item"><a href="#productList" >Lista produktów</a></li>
				<li class="navigation-list-item"><a href="#newCategory" >Dodaj kategorię</a></li>
				<li class="navigation-list-item"><a href="#reviews/my" >Moje recenzje</a></li>
			</ul>
			<div id="user-subscrptions-div">
				
			</div>
		</div>
		
		
		<div id="content" class="content" ></div>
	</div>

	<div id="footer-bar" class="footer-bar">
		<div id="contact" class="contact">
			<p class="footer-header">Kontakt</p>
			<p>kontakt@revcommunity.com</p>
		</div>
	</div>
	<div id="bottom-bar" class="bottom-bar">Copyright 2013 by RevCommunity. All Rights Reserved.</div>
</body>
</html>
