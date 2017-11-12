<%--
  Created by IntelliJ IDEA.
  User: shund
  Date: 12.11.2017
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    <title>User data</title>
</head>
<body>
    <c:if test="${not empty requestScope.userList}">
        <table border="5">
            <c:forEach items="${requestScope.userList}" var="user">
                <tr>
                    <td><c:out value="${user.name}"/></td>
                    <td><c:out value="${user.surname}"/></td>
                    <td><c:out value="${user.phoneNumber}"/></td>
                    <td><c:out value="${user.email}"/></td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <c:if test="${empty requestScope.userList}">
        <c:out value="The search has not given any results!"/>
    </c:if>
</body>
</html>
