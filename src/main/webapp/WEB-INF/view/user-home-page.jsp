<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
  <meta charset="ISO-8859-1">
  <title>Home page</title>
  <link rel="stylesheet"
        href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
        crossorigin="anonymous">
</head>
<body>
<div class="container my-2" align="center">
  <h3>Welcome to the main menu</h3>
  <form action = "allUsers" method = "GET">
    <input type = "submit" class="btn btn-success" value = "Show all users"/>
  </form>
  <br>
  <form action = "redirectLogin" method = "GET">
    <input type = "submit" class="btn btn-info" value = "Logout"/>
  </form>
</div>
</body>
</html>