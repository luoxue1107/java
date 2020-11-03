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
<%--展示信息块 开始--%>
<div style="width: 800px;  padding:30px; ;margin: auto ;">
     <h2 align="center">学生信息管理</h2>
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
</div>
<%--展示信息块 结束--%>

<%--操作块 开始--%>
<div class="">
<%--    分页栏开始--%>
    <nav style="margin-left: 40%">
<%-- 首页和上一页判断是否是当前页面 开始--%>
        <c:choose>
            <c:when test="${studentPage.pageNum!=1}">
                <a href="${pageContext.request.contextPath}/studentLogin?page=1" class="btn btn-primary btn-sm "
                   role="button">首页</a>
                <a href="${pageContext.request.contextPath}/studentLogin?page=${studentPage.pageNum-1}" class="btn btn-primary btn-sm "
                   role="button">&lArr;</a>
            </c:when>
            <c:otherwise> <a href="" class="btn btn-primary btn-sm disabled" role="button">首页</a>
                <a href="" class="btn btn-primary btn-sm disabled " role="button">&lArr;</a></c:otherwise>
        </c:choose>
<%--    结束首页和上一页 结束--%>

<%--   用ForEach 生成页码  加判断 如果当前页 加特殊样式  开始--%>
        <c:forEach begin="1" end="${studentPage.pageCount+1}" var="v">
            <c:choose>
                <c:when test="${studentPage.pageNum!=v}">
                    <a href="${pageContext.request.contextPath}/studentLogin?page=${v}" class="btn btn-primary btn-sm "
                       role="button">${v}</a></c:when>
                <c:otherwise><a href="${pageContext.request.contextPath}/studentLogin?page=${v}" class="btn btn-primary btn-sm disabled"
                                role="button">${v}</a></c:otherwise>
            </c:choose>
        </c:forEach>
<%--   ForEach 循环 结束--%>

<%--    尾页和下一页样式 并判断当前页是否是最后一页 开始 --%>
        <c:choose>
            <c:when test="${studentPage.pageNum!=studentPage.pageCount+1}">
                <a href="${pageContext.request.contextPath}/studentLogin?page=${studentPage.pageNum+1}" class="btn btn-primary btn-sm "
                   role="button">&rArr;</a>
            <a href="${pageContext.request.contextPath}/studentLogin?page=${studentPage.pageCount+1}" class="btn btn-primary btn-sm"
               role="button">尾页</a>
            </c:when>
            <c:otherwise>
                <a href="" class="btn btn-primary btn-sm disabled"
                   role="button">&rArr;</a>
                <a href="" class="btn btn-primary btn-sm disabled" disabled="disabled"
                   role="button">尾页</a>
            </c:otherwise>
        </c:choose>
<%--        结束尾页和下一页 结束 --%>
    </nav>
<%--    分页栏结束--%>
</div>
<div style=" position: fixed; margin: 0;  top:5px; right: 5px ">
    <a href=""  class="btn btn-danger " role="button">添加学生</a>
</div>
<%--操作块 结束 --%>
</body>
</html>