<%--
  Created by IntelliJ IDEA.
  User: shund
  Date: 10.11.2017
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Input name/surname field</title>
  </head>
  <body>
    <form action="FrontController" method="get">
      <input type="hidden" name="command" value="users_name_surname_search"/>

      Name:<br/>
      <input type="text" name="name" value=""/><br/>

      Surname:<br/>
      <input type="text" name="surname" value=""/><br/>

      <input type="submit" value="find"/><br/>
    </form>
  </body>
</html>
