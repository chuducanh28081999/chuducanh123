<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 8/8/2019
  Time: 2:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>User Table</h1>

<table>
    <tr>
        <td>User Name</td>
        <td>Password</td>
        <td>Level</td>
    </tr>
    <c:forEach items="${table}" var="item">
    <tr>
        <td>${item.userName}</td>
        <td>${item.password}</td>
    </tr>
    </c:forEach>
</table>

</body>
</html>
