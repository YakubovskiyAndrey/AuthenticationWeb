<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="ISO-8859-1">
  <title>User authentication</title>
  <link rel="stylesheet"
        href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
        crossorigin="anonymous">
</head>
<body>
<div class="container" align="center">
  <form action = "showHomePage" method = "POST">
    <h2>Please, sign in</h2>
    <br>
    <input type = "text" name = "userName" class="form-control mb-4 col-4"
           placeholder = "Username"/>
    <input type = "password" name = "password" class="form-control mb-4 col-4"
           placeholder = "Password"/>
    <input type = "submit" class="btn btn-info" value = "Sign in"/>
    <div style="color: red">${error}</div>
  </form>
  <div class="container"></div>
</div>
</body>
</html>