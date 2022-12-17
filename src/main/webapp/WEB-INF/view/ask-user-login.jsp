<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
  <meta charset="ISO-8859-1">
  <title>User authentication</title>
  <link rel="stylesheet"
        href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
        crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h2>Please, enter your login and password</h2>

    <br>

    <form action = "showHomePage" method = "get">

    <input type = "text" name = "login"
        placeholder = "Write your login"/>

    <br><br>

    <input type = "text" name = "password"
        placeholder = "Write your password"/>

    <br><br>

    <input type = "submit" class="btn btn-info col-2" value = "Login"/>

    </form>
    Exist = ${result}
 <div class="container">
</body>
</html>