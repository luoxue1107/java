<%--
  Created by IntelliJ IDEA.
  User: luo
  Date: 2020/10/30
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加教室信息</title>
</head>
<body>
<div style=" width: 500px;  padding:30px; margin: auto ;border:1px solid #000000; background-color: #005cbf">

<form action="${pageContext.request.contextPath}/addClazz?" method="post" padding-top:1px ;padding-left: 147px">
    <h3 align="center">输入教室名添加</h3>
    <input type="text" name="name" value="" >
    <input type="submit" value="提交">
</form>
</div>
</body>
</html>
