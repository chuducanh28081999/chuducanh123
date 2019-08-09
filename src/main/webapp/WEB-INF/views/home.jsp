<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<h1>Đây là trang home</h1>--%>
<%--<c:forEach items="${model}" var="item">--%>
<%--    <h1>${item.id}</h1>--%>
<%--    <h1>${item.description}</h1>--%>
<%--    <h1>${item.name}</h1>--%>
<%--</c:forEach>--%>
<%--<c:forEach var="model" items="${models}">--%>
<%--    <a href="/web/${model.id}">--%>
<%--        ${model.name}--%>
<%--    </a>--%>
<%--    <br/>--%>

<%--    --%>
<%--</c:forEach>--%>

<form action="/admin/home" method="POST">
    <input placeholder="ten dang nhap" name="userName">
    <button type="submit">An vao day</button>
</form>
<h1>Home Here boiz!!</h1>
</body>
</html>
