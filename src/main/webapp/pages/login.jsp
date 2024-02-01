<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добро пожаловать</title>
</head>
<body>
<h1>Введите логин и пароль</h1>
<br/>
<form action="controller">
    <input type="hidden" name="command" value="login"/>
    Login:  <input type="text" name="login" value=""/>
    <br/>
    Password:  <input type="password" name="password" value=""/>
    <br/>
    <br/>
    <input type="submit" name="submitButton" value="Login!"/>
    <br/>
    ${incorrect_login_or_password}
</form>
</body>
</html>
