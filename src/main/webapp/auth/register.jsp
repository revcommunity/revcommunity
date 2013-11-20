
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

	<title>RevCommunity - Login</title>
	
	<!-- Co to daje ? Tomek-->
	<link rel="stylesheet/less" type="text/css" href="../css/styles.less" />
	
	<script src="../app/lib/less-1.4.2.min.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="../css/login-page.css" />
	
	<script type="text/javascript" src="../ext-4/ext-all-dev.js"></script>
	
	<script type="text/javascript">
    
			var form = Ext.getElementById('registration-form');
			var vals = form.getForm().getFieldValues();
			form.submit(function () {
 
				Ext.Ajax.request({
					url : 'rest/users',
					method : 'POST',
					params : {
						user : vals
					}
				});
            })
 
     </script>
	
<body>
<div class="content_main_registration">
	<div class="rev-registration-div">
			<div class="rev-login-form-div">
				<form id="registration-form" class="rev-login-form" method="POST" action="/revcommunity/rest/users">
				<div class="rev-form-field">
						<label>Imie</label>
						<br>
						<input type="text" value="" maxlength="255" name="firstName">
					</div>
					<div class="rev-form-field">
						<label>Nazwisko</label>
						<br>
						<input type="text" value="" maxlength="255" name="lastName">
					</div>
					<div class="rev-form-field">
						<label>Login</label>
						<br>
						<input type="text" value="" maxlength="255" name="userName">
					</div>
					<div class="rev-form-field">
						<label>Haslo</label>
						<br>
						<input type="password" value="" maxlength="255" name="password">
					</div>
					<!-- 					<div class="rev-form-field">
						<label>Powtorz haslo</label>
						<br>
						<input type="password" value="" maxlength="255" name="password1"> 
					</div>-->
					<div class="rev-form-field-registration rev-submit-button">
						<button type="submit" tabindex="0">Zarejestruj sie</button>
					</div>
					
				</form>
			
			</div>
			<div class="login-image"></div>
		
	</div>
	</div>
	<div class="footer">
	<span class="bottom-bar">Copyright 2013 by RevCommunity. All Rights Reserved.</span>
	</div>
</body>
</html>



