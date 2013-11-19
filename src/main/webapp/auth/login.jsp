
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="Language" content="pl" />

	<title>RevCommunity - Login</title>
	
	<!-- Co to daje ? Tomek-->
	<link rel="stylesheet/less" type="text/css" href="../css/styles.less" />
	
	<script src="../app/lib/less-1.4.2.min.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="../css/login-page.css" />
	
<body>
<div class="content_main">
	<div class="rev-login-div">
			<div class="rev-login-form-div">
				<form class="rev-login-form" method="POST" action="/revcommunity/j_spring_security_check">
					<div class="rev-form-field">
						<label>Login</label>
						<br>
						<input type="text" value="" maxlength="255" name="j_username">
					</div>
					<div class="rev-form-field">
						<label>Haslo</label>
						<br>
						<input type="password" value="" maxlength="255" name="j_password">
					</div>
					<div class="rev-form-field rev-submit-button">
						<button type="submit" tabindex="0">Zaloguj</button>
					</div>
					
				</form>
			
			</div>
			<div class="login-image"></div>
			<div class="foget_link">
			<a class="rev-form-href" href="/revcommunity/auth/register.jsp">Zarejestruj sie</a>
					<span>|</span>
					<a class="rev-form-href" href="">Zapomniales hasla?</a>
		</div>
	</div>
	</div>
	<div class="footer">
	<span class="bottom-bar">Copyright 2013 by RevCommunity. All Rights Reserved.</span>
	</div>
</body>
</html>



