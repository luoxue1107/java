<%--
  Created by IntelliJ IDEA.
  User: luo
  Date: 2020/10/30
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--不要忽略EL表达式--%>
<html>
<head>
    <title>教室信息管理</title>
</head>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet">
<body>
<%--展示信息块 开始--%>
<div style="width: 500px;  padding:30px; ;margin: auto ;">
    <h2 align="center">教室信息管理</h2>
    <table class="table table-striped table-bordered table-hover ">
        <tr>
            <th>编号</th>
            <th>教室</th>
            <th>操作</th>
        </tr>
        <%--items:要循环的列表，var:循环变量--%>
        <c:forEach items="${clazzList}" var="c">
            <tr class="warning">
                <td>${c.id}</td>
                <td>${c.name}</td>
                <td><a href="" class="btn btn-success" role="button">修改</a>&ndash;<a href="" role="button" class="btn btn-success">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
<%--展示信息块 结束--%>
<div style=" position: fixed; margin: 0;  top:5px; right: 5px ">
    <a href="${pageContext.request.contextPath}/addClazzLogin"  class="btn btn-danger " role="button">添加教室</a>
</div>
</body>
</html>
