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
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet">
<body>
<%--展示信息块 开始--%>
<div style=" padding:30px; ;margin: auto ;">
    <h2 align="center">员工管理</h2>
    <table class="table table-striped table-bordered table-hover ">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>公司</th>
            <th>职位</th>
            <th>操作</th>
        </tr>
        <%--items:要循环的列表，var:循环变量--%>
        <c:forEach items="${employeeList}" var="e">
            <tr class="warning">
                <td>${e.id}</td>
                <td>${e.name}</td>
                <td>${e.cname}</td>
                <td>
                    <c:forEach items="${e.rnames}" var="r">
                        <p>${r}</p>
                    </c:forEach>
                </td>
                <td>
                    <a href="${pageContext.request.contextPath}/SetRolesLogin?id=${e.id}"
                       class="btn btn-success btn-sm" role="button">职位</a>&ndash;
                    <a href="${pageContext.request.contextPath}/SetEmployee.do?id=${e.id}"
                       class="btn btn-success btn-sm" role="button">修改</a>&ndash;
                    <a href="${pageContext.request.contextPath}/deleteEmployee?id=${e.id}"
                       class="btn btn-success btn-sm" role="button">删除</a></td>
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
            <c:when test="${pages.pageNum!=1}">
                <a href="${pageContext.request.contextPath}/login.do?page=1" class="btn btn-primary btn-sm "
                   role="button">首页</a>
                <a href="${pageContext.request.contextPath}/login.do?page=${pages.pageNum-1}"
                   class="btn btn-primary btn-sm "
                   role="button">&lArr;</a>
            </c:when>
            <c:otherwise> <a href="" class="btn btn-primary btn-sm disabled" role="button">首页</a>
                <a href="" class="btn btn-primary btn-sm disabled " role="button">&lArr;</a></c:otherwise>
        </c:choose>
        <%--    结束首页和上一页 结束--%>

        <%--   用ForEach 生成页码  加判断 如果当前页 加特殊样式  开始--%>
        <c:forEach begin="1" end="${pages.pageCount}" var="v">
            <c:choose>
                <c:when test="${pages.pageNum!=v}">
                    <a href="${pageContext.request.contextPath}/login.do?page=${v}" class="btn btn-primary btn-sm "
                       role="button">${v}</a></c:when>
                <c:otherwise><a href="${pageContext.request.contextPath}/login.do?page=${v}"
                                class="btn btn-primary btn-sm disabled"
                                role="button">${v}</a></c:otherwise>
            </c:choose>
        </c:forEach>
        <%--   ForEach 循环 结束--%>

        <%--    尾页和下一页样式 并判断当前页是否是最后一页 开始 --%>
        <c:choose>
            <c:when test="${pages.pageNum!=pages.pageCount}">
                <a href="${pageContext.request.contextPath}/login.do?page=${pages.pageNum+1}"
                   class="btn btn-primary btn-sm "
                   role="button">&rArr;</a>
                <a href="${pageContext.request.contextPath}/login.do?page=${pages.pageCount+1}"
                   class="btn btn-primary btn-sm"
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
    <a href="${pageContext.request.contextPath}/AddEmployee.do" class="btn btn-primary btn-danger "
       role="button">新增员工</a>
</div>
</body>
</html>
