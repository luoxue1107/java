<%--
  Created by IntelliJ IDEA.
  User: luo
  Date: 2020/10/30
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--不要忽略EL表达式--%>
<html>
<head>
    <title>添加教室信息</title>
</head>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet">
<body>
<div  class="" style=" margin:10% 10%; margin-left:10%; padding: 10% 10% ;  height: 800px; padding-left: 10%; border:1px solid #000000; text-align: center;">
<form action="${pageContext.request.contextPath}/addClazz?" method="post">
    <h3 >输入教室名添加</h3>
    <input type="text" name="name" value="">
    <br>
    <br>
    <input type="submit" value="提交" class=" btn btn-primary">
</form>
</div>
</body>
</html>
