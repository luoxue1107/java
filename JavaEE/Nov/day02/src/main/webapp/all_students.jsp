
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--不要忽略EL表达式--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3 align="center">学生列表</h3>

<div style="padding-left: 30%; padding-bottom: 5px">
    <input type="button" onclick="window.open('${pageContext.request.contextPath}/gotoAddStudent')" value="新增学生">
</div>

<table border="1" cellspacing="0" align="center" width="40%">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>生日</th>
        <th>课程</th>
        <th>操作</th>
    </tr>
    <%--items:要循环的列表，var:循环变量--%>
    <c:forEach items="${students}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.gender}</td>
            <td>
                <fmt:formatDate value="${s.birthday}" pattern="yyyy年MM月dd日"/>
            </td>
            <td>
                <c:forEach items="${s.courses}" var="c">
                    ${c.name}<br>
                </c:forEach>
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/getCourses?id=${s.id}" target="_blank">选课</a> /
                <a href="${pageContext.request.contextPath}/gotoSetStudent?id=${s.id}" target="_blank">修改</a> /
                <a href="${pageContext.request.contextPath}/delStudent?id=${s.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
