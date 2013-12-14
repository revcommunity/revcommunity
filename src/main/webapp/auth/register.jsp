<%@ page contentType="text/html; charset=utf-8" %>
<head>
	<title>RevCommunity - Login</title>
	
	<!-- Co to daje ? Tomek-->
	<link rel="stylesheet/less" type="text/css" href="../css/styles.less" />
	
	<script src="../app/lib/less-1.4.2.min.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="../css/login-page.css" />
	
	<script type="text/javascript" src="../ext-4/ext-all-dev.js"></script>
	
	<script type="text/javascript" src="../ext-4/jquery.js"></script>
	<script type="text/javascript" src="../ext-4/verify.js"></script>
	
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
					,failure: function(form, action) {
						console.log("blad podczas rejestracji");
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
						<input type="text" value="" maxlength="255" name="firstName" data-validate="required,alphaNumeric,revMin(3),revMax(15)"/>
					</div>
					<div class="rev-form-field">
						<label>Nazwisko</label>
						<br>
						<input type="text" value="" maxlength="255" name="lastName" data-validate="required,alphaNumeric,revMin(3),revMax(20)"/>
					</div>
					<div class="rev-form-field">
						<label>E-mail</label>
						<br>
						<input type="text" value="" maxlength="255" name="email" data-validate="required,email">
					</div>
					<div class="rev-form-field">
						<label>Login</label>
						<br>
						<input type="text" value="" maxlength="255" name="userName" data-validate="required,alphaNumeric,revMin(5),revMax(15)">
					</div>
					<div class="rev-form-field">
						<label>Haslo</label>
						<br>
						<input type="password" id="pass" value="" maxlength="255" name="password" data-validate="required,revMin(6),revMax(15)">
					</div>
					<div class="rev-form-field">
						<label>Powtorz haslo</label>
						<br>
						<input type="password" value="" maxlength="255" name="password1" data-validate="myRule"> 
					</div>
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



