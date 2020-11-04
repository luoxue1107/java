
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--不要忽略EL表达式--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center" style="padding-top:30px">
    <form action="${pageContext.request.contextPath}/setCourse" method="post">
        <fieldset style="width:20%">
            <legend>&nbsp;修改课程&nbsp;</legend>
            <input type="hidden" name="id" value="${course.id}">
            <div style="padding-top:10px">
                名　称：<input type="text" name="name" value="${course.name}">
            </div>
            <div style="padding-top:15px; padding-bottom:10px">
                <input type="submit" value="修改课程">
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>
