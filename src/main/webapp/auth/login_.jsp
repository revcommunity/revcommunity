<html>
<head>
<title>Security</title>
</head>
<body>

	<form method="POST" action="/revcommunity/j_spring_security_check">
		<table border="1">
			<tbody>
				<tr>
					<td>Login:</td>
					<td><input type="text" name="j_username" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="j_password" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Zaloguj" /></td>
				</tr>
			</tbody>
		</table>
		<a href="/revcommunity/j_spring_security_logout">Wyloguj</a>
	</form>

</body>
</html>



