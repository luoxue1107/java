<%--
  Created by IntelliJ IDEA.
  User: luo
  Date: 2020/11/1
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--不要忽略EL表达式--%>
<html>
<head>
    <title>修改信息</title>
</head>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet">
<body>
<form action="${pageContext.request.contextPath}/setClazz?" method="post">
    编号:<input type="text" value="${id}" name="id">
    新名称:<input type="text" value="" name="name" >
    <input type="submit"value="提交" role="button" class="btn btn-primary btn-lg">
</form>
</body>
</html>
