<%--
  Created by IntelliJ IDEA.
  User: luo
  Date: 2020/11/12
  Time: 1:45
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--不要忽略EL表达式--%>
<html>
<head>
    <title>text</title>
</head>
<title>Bootstrap 模板</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link href="css/bootstrap.min.css" rel="stylesheet">

<script src="js/jquery.min.js"></script>

</head>
<body>
<div class="page-header">
    <h2 style="margin-left: 30%">查看新闻</h2>
</div>
<div class="container" style="font-family:微软雅黑;">
    <div class="col-md-8 col-md-offset-2" align="center">
        <div class="panel panel-default" align="center">
            <div class="panel-heading" align="center">
            </div>
            <div class="panel-body">
                <h3 align="center">${journalism.synopsis}</h3>
                <p align="center">
                    作者：
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    时间：${journalism.creationTime}
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    浏览量：<span class="badge">${view}</span>
                </p>
            </div>
            <div >
                <p>${texts}</p>
            </div>
        </div>
    </div>
</div>
</body>
</html>
