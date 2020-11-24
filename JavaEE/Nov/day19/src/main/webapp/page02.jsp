<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--不要忽略EL表达式--%>
<html lang="zh-cn">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <title>科室列表</title>
</head>
<body>
<h1 class="text-center pt-3 pb-3">科室列表</h1>
<div class="container">
    <div class="row-cols-lg-12">
        <div class="pl-2">
        </div>
        <form id="from1" action="${pageContext.request.contextPath}/deleteAll" method="post">
            <a href="${pageContext.request.contextPath}/addDepLogin" class="btn btn-sm btn-outline-secondary" role="button">新添科室</a>
            <button type="submit" class="btn btn-sm btn-outline-secondary">批量删除</button>
            <hr>
            <table class="table table-striped table-bordered table-hover">
                <thead>
                <tr>
                    <th>选择</th>
                    <th>编号</th>
                    <th>科室</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${departmentList}" var="d">
                    <tr>
                        <td class="text-center">
                            <input type="checkbox" class="form-check-input" name="office" value="${d.uid}">
                        </td>
                        <td>${d.uid}</td>
                        <td>${d.name}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/setDepLogin?uid=${d.uid}" class="btn btn-primary btn-sm" role="button">修改</a> -
                            <a href="${pageContext.request.contextPath}/delDep?uid=${d.uid}" class="btn btn-primary btn-sm" role="button">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </form>
    </div>
</div>
</body>
</html>