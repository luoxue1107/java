<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--不要忽略EL表达式--%>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <title>医生列表</title>
</head>
<body>
<h1 class="text-center pt-3 pb-3">医生列表</h1>
<div class="container">
    <div class="offset-md-2 col-md-8">
        <div class="row">
            <div class="col-md-10">
                <form action="${pageContext.request.contextPath}/page01" class="form-inline" method="post">
                    <div class="form-group">
                        <c:set var="selected" value=""/>
                        <label>科室查询：</label>
                        <select class="form-control form-control-sm" name="title">
                            <option  value="0">全部科室</option>
                            <c:forEach items="${departments}" var="t">
                                <c:if test="${t.uid == title}">
                                    <option value="${t.uid}" selected>${t.name}</option>
                                </c:if>
                                <c:if test="${t.uid != title}">
                                    <option value="${t.uid}">${t.name}</option>
                                </c:if>
                            </c:forEach>
                        </select>
                        <button type="submit" class="btn btn-sm btn-outline-secondary">查询</button>
                    </div>
                </form>
            </div>
            <div class="col-md-2">
                <form class="form-inline">
                    <div class="form-group">
                        <a href="${pageContext.request.contextPath}/addDocLogin" class="btn btn-sm btn-outline-secondary" role="button">新增医生</a>
                    </div>
                </form>
            </div>
        </div>
        <hr>
        <form>
            <table class="table table-striped table-bordered table-hover">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>姓名</th>
                    <th>性别</th>
                    <th>年龄</th>
                    <th>科室</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${doctor}" var="r">
                    <tr>
                        <td>${r.uid}</td>
                        <td>${r.name}</td>
                        <td>
                            <c:if test="${r.gender == 0}">
                                大波浪
                            </c:if>
                            <c:if test="${r.gender  == 1}">
                                锡纸烫
                            </c:if>
                        </td>
                        <td>
                           ${r.age}
                        </td>
                        <c:forEach items="${departments}" var="t">
                        <c:if test="${r.did==t.uid}">
                            <td>${t.name}</td>
                        </c:if>
                        </c:forEach>
                        <td>
                            <a href="${pageContext.request.contextPath}/setDocLogin?id=${r.uid}">修改</a> /
                            <a href="${pageContext.request.contextPath}/deleteDoc?id=${r.uid}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </form>
    </div>
</div>
</div>
<%--操作块 开始--%>
<div class="">
    <%--    分页栏开始--%>
    <nav style="margin-left: 40%">
        <%-- 首页和上一页判断是否是当前页面 开始--%>
        <c:choose>
            <c:when test="${pages.pageNum!=1}">
                <a href="${pageContext.request.contextPath}/page01?title=${title}&page=1" class="btn btn-primary btn-sm "
                   role="button">首页</a>
                <a href="${pageContext.request.contextPath}/page01?title=${title}&page=${pages.pageNum-1}"
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
                    <a href="${pageContext.request.contextPath}/page01?title=${title}&page=${v}"
                       class="btn btn-primary btn-sm "
                       role="button">${v}</a></c:when>
                <c:otherwise><a href="${pageContext.request.contextPath}/page01?page=${v}"
                                class="btn btn-primary btn-sm disabled"
                                role="button">${v}</a></c:otherwise>
            </c:choose>
        </c:forEach>
        <%--   ForEach 循环 结束--%>

        <%--    尾页和下一页样式 并判断当前页是否是最后一页 开始 --%>
        <c:choose>
            <c:when test="${pages.pageNum!=pages.pageCount}">
                <a href="${pageContext.request.contextPath}/page01?title=${title}&page=${pages.pageNum+1}"
                   class="btn btn-primary btn-sm "
                   role="button">&rArr;</a>
                <a href="${pageContext.request.contextPath}/page01?title=${title}&page=${pages.pageCount+1}"
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
