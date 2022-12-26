<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<html lang="en">
<head>
  <meta charset="ISO-8859-1">
  <title>All users</title>
  <link rel="stylesheet"
        href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
        crossorigin="anonymous">
</head>
<body>
<div class="container my-2" align="center">
  <table style="width:80%" border="1"
         class = "table table-striped table-responsive-md">
    <thead>
        <tr>
          <th>Name</th>
          <th>Username</th>
        </tr>
        </thead>
    <c:forEach var="user" items="${users}">
      <tr>
        <td>${user.name}</td>
        <td>${user.userName}</td>
      </tr>
    </c:forEach>
  </table>
  <hr>
  <form action = "returnMainMenu" method = "GET">
      <input type = "submit" class="btn btn-link" value = "Back to the menu"/>
  </form>
</div>
</body>
</html>