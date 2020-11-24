<%--
  Created by IntelliJ IDEA.
  User: luo
  Date: 2020/11/11
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--不要忽略EL表达式--%>
<html>
<head>
    <meta charset="UTF-8">
    <title>新闻页面</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- 引入Bootstrap核心文件 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

</head>

<body>
<div class="container" style="font-family:微软雅黑;font-size:larger">
    <div class="page-header">
        <h2 align="center">新闻列表</h2>
    </div>


        <form action="${pageContext.request.contextPath}/login.do?" class="" method="post">
            <div class="form-group">
                新闻标题：
                <input type="text" class="form-control" name="title" value="${title}" style="width: 100px;">
            </div>
            <div class="form-group">
                发布时间：
                <input type="text" class="form-control" name="initialTime"value="${initialTime}" style="width: 200px ;">
                <input type="text" class="form-control" name="lastMinute" value="${lastMinute}" style="width: 200px ;">
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-success btn-sm " role="button">查询</button>
            </div>
        </form>

    <div>
    <table class="table table-striped table-bordered table-hover">
        <thead>
        <tr align="center">
            <td>新闻编号</td>
            <td>新闻标题</td>
            <td>作者</td>
            <td>创建时间</td>
            <td>浏览量</td>
            <td>操作</td>
        </tr>
        </thead>
        <c:forEach items="${pages.journalismList}" var="j">
            <tr class="warning">
                <td>${j.id}</td>
                <td>${j.synopsis}</td>
                <td>
                    <c:forEach items="${authorList}" var="a">
                        <c:if test="${j.aid == a.id}">
                            ${a.name}
                        </c:if>
                    </c:forEach>
                </td>
                <td>${j.creationTime}</td>
                <td>${j.view}</td>
                <td><a href="${pageContext.request.contextPath}/index.text?jid=${j.id}" target="_blank">查看新闻</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    </div>
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
                        <a href="${pageContext.request.contextPath}/login.do?page=${v}"
                           class="btn btn-primary btn-sm "
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
</body>
</html>
