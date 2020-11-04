
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--不要忽略EL表达式--%>
<html>
<head>
    <title>课程列表</title>
</head>
<body>
<h3 align="center">课程列表</h3>

<div style="padding-left: 40%; padding-bottom: 5px">
    <input type="button" onclick="window.open('${pageContext.request.contextPath}/gotoAddCourse')" value="新增课程">
</div>

<table border="1" cellspacing="0" align="center" width="20%">
    <tr>
        <th>编号</th>
        <th>名称</th>
        <th>操作</th>
    </tr>
    <%--items:要循环的列表，var:循环变量--%>
    <c:forEach items="${courses}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>
                <a href="${pageContext.request.contextPath}/gotoSetCourse?id=${c.id}" target="_blank">修改</a> /
                <a href="${pageContext.request.contextPath}/delCourse?id=${c.id}">删除</a>
            </td>
        </tr>

    </c:forEach>
</table>
</body>
</html>
