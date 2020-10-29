<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--不要忽略EL表达式--%>
<html>
<head>
    <title>学生信息管理</title>
</head>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet">
<body>
<h3 align="center">学生列表</h3>
<table class="table table-striped table-bordered table-hover ">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>生日</th>
        <th>班级</th>
        <th>操作</th>
    </tr>
    <%--items:要循环的列表，var:循环变量--%>
    <c:forEach items="${studentPage.students}" var="s">
        <tr class="warning">
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.gender}</td>
            <td>
                <fmt:formatDate value="${s.birthday}" pattern="yyyy年MM月dd日"/>
            </td>
            <td>${s.clazz}</td>
            <td><a href="" class="btn btn-success" role="button">修改</a>&ndash;<a href="" role="button"
                                                                                 class="btn btn-success">删除</a></td>
        </tr>
    </c:forEach>
</table>
<div>
    <nav>

        <form action="${Response.getContextPath}?" class="form-inline">
            <c:if test="${studentPage.pageNum!=1}">
                <a href="${Response.getContextPath}?page=1" class="btn btn-primary btn-lg disabled" role="button">首页</a>
            </c:if>
            <c:if test="${studentPage.pageNum==1}">
                <a href="" class="btn btn-primary btn-lg disabled" disabled="disabled" role="button">首页</a>
            </c:if>
            <select name="page" style="height:50px; color: beige ; background-color: #005cbf">
                <c:forEach begin="1" end="${studentPage.pageCount+1}" var="v">
                    <option value="${v}">${v}</option>
                </c:forEach>
            </select>
            <input TYPE="submit" value="跳转" class="btn btn-danger btn-">
            <a href=""></a>
        </form>
    </nav>
</div>
<%--border="1" cellspacing="0" align="center" width="40%"--%>
<%--<div align="center" style="padding-top: 10px">--%>
<%--    <a href="">首页</a>--%>
<%--    <a href="#">上一页</a>--%>
<%--    <a href="#">1</a>--%>
<%--    <a href="#">2</a>--%>
<%--    <a href="#">3</a>--%>
<%--    <a href="#">4</a>--%>
<%--    <a href="#">5</a>--%>
<%--    <a href="#">下一页</a>--%>
<%--    <a href="#">末页</a>--%>
<%--</div>--%>
</body>
</html>