<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Đăng nhập</title>
</head>
<body>
<div class="container">
    <!-- <h1 class="form-heading">login Form</h1> -->
    <div class="login-form">
        <div class="main-div">
            <c:if test="${not empty message}">
                <div class="alert alert-${alert}">
                        ${message}
                </div>
            </c:if>
            <form:form action="/home" id="loginFrom" method="POST" modelAttribute="register">
                <div class="form-group">
                    <input type="text" class="form-control" id="username" name="username"
                           placeholder="Tên đăng nhập">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" id="password" name="password"
                           placeholder="Mật khẩu">
                </div>
                <button type="submit" class="btn btn-primary">Đăng nhập</button>
<%--                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>