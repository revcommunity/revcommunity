
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>RevCommunity - Login</title>
	
	<!-- Co to daje ? Tomek-->
	<link rel="stylesheet/less" type="text/css" href="../css/styles.less" />
	
	<script src="../app/lib/less-1.4.2.min.js" type="text/javascript"></script>
	
	<link rel="stylesheet" type="text/css" href="../css/login-page.css" />
	
<body>
	<div class="rev-login-div">
		<div class="rev-login-form-content">
			<div class="rev-login-form-div">
				<form class="rev-login-form" method="POST" action="/revcommunity/j_spring_security_check">
					<div class="rev-form-field">
						<label>Email</label>
						<br>
						<input type="text" value="" maxlength="255" name="j_username">
					</div>
					<div class="rev-form-field">
						<label>Password</label>
						<br>
						<input type="password" value="" maxlength="255" name="j_password">
					</div>
					<div class="rev-form-field rev-submit-button">
						<button type="submit" tabindex="0">Login</button>
					</div>
					<a class="rev-form-href" href="/revcommunity/auth/register.jsp">No Account? Sign up</a>
					<span>|</span>
					<a class="rev-form-href" href="">Forgot password?</a>
				</form>
			</div>
			<div class="rev-logo"></div>
		</div>
		<span class="bottom-bar">Copyright 2013 by RevCommunity. All Rights Reserved.</span>
	</div>
</body>
</html>



