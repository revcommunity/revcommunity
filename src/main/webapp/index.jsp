<html>
<head>
    <title>Hello</title>

    <link rel="stylesheet" type="text/css" href="ext-4/resources/css/ext-all-neptune.css">
    <script type="text/javascript" src="ext-4/ext-all-dev.js"></script>
    <script type="text/javascript" src="app/app.js"></script>
</head>
<body>

<form method="POST" action="/j_spring_security_check">
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
    <a href="/j_spring_security_logout" >Wyloguj</a>
</form>

</body>
</html>