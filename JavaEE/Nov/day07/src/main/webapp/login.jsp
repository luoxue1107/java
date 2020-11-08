<%--
  Created by IntelliJ IDEA.
  User: luo
  Date: 2020/11/7
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--不要忽略EL表达式--%>
<html>
<head>
    <title>职员管理系统</title>
</head>
<link href="css/bootstrap.min.css"  type="text/css" rel="stylesheet">
<body>
<input type="button" onclick="window.open('${pageContext.request.contextPath}/AddEmployee.do')" value="新增员工">
<%--展示信息块 开始--%>
<div style="width: 500px;  padding:30px; ;margin: auto ;">
    <h2 align="center">员工管理</h2>
    <table class="table table-striped table-bordered table-hover ">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>公司</th>
            <th>操作</th>
        </tr>
        <%--items:要循环的列表，var:循环变量--%>
        <c:forEach items="${employeeList}" var="e">
            <tr class="warning">
                <td>${e.id}</td>
                <td>${e.name}</td>
                <td>${e.cname}</td>
                <td><a href="${pageContext.request.contextPath}/setClazzLogin?id=${e.id}" class="btn btn-success" role="button">修改</a>&ndash;<a href="${pageContext.request.contextPath}/delClazz?id=${e.id}" role="button" class="btn btn-success">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
<%--展示信息块 结束--%>
</body>
</html>
