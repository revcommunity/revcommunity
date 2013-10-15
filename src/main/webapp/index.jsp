<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
    <title>RevCommunity</title>

    <link rel="stylesheet" type="text/css" href="ext-4/resources/css/ext-all-neptune.css">
    
  <link rel="stylesheet" type="text/css" href="css/style.css" />
    <script type="text/javascript" src="ext-4/ext-all-dev.js"></script>
    
   	<script type="text/javascript" src="app/lib/jquery.min.js"></script>
	<script type="text/javascript" src="app/lib/underscore.js"></script>
	<script type="text/javascript" src="app/lib/backbone.js"></script>
	<script type="text/javascript" src="app/lib/galleria-1.2.9.min.js"></script>
	<script type="text/javascript" src="app/routers.js"></script>
	
    <script type="text/javascript" src="app/app.js"></script>
</head>
<body>

<div class="top-bar"><a href="auth/login.jsp" >Zaloguj</a></div>
<div class="top-bar"><a href="auth/register.jsp" >Zarejestruj</a></div>
<div class="top-bar"><a href="/revcommunity/j_spring_security_logout" >Wyloguj</a></div>
	<div id="header"  class="blue-wrap" >
		
		<div id="logo">
		RevCommunity
				<!--  <img src="css/img/apps.png" id="p1" class="pics" /> -->
		</div>
	</div>
	<div id="wrap">
		
			<div id="main">
				<div id="nav">
					<p class="menu">Nawigacja</p>
					<ul class="list position">
						<li class="position"><a href="#newProduct" >Dodaj produkt</a></li>
						<li class="position"><a href="#productList" >Lista produktów</a></li>
						<li class="position"><a href="#product" >Widok produktu</a></li>
						<li class="position"><a href="#newCategory" >Dodaj kategorię</a></li>
					</ul>
				</div>
				<div id="content" >
					<div id="page" >	
	

					</div>
				</div>
			</div>
			
	</div>
	<div id="footer-wrap" class="blue-wrap">
		<div id="under-footer-left">
			<p class="footer-header">Kontakt</p>
			<p>kontakt@revcommunity.com</p>
		</div>
	</div>
	<div id="footer">Copyright 2013 by RevCommunity. All Rights Reserved.</div>
</body>
</html>