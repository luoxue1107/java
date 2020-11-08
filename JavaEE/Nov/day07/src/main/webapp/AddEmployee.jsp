<%--
  Created by IntelliJ IDEA.
  User: luo
  Date: 2020/11/8
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--不要忽略EL表达式--%>
<html>
<head>
    <title>添加员工</title>
</head>
<link href="css/bootstrap.min.css"  type="text/css" rel="stylesheet">
<body>
<div align="center" style="padding-top:30px" >
    <h3>添加员工</h3>
    <form action="${pageContext.request.contextPath}/AddEmployee" method="post">
        <div class="col-lg-12">
        <hr width="40%">
        姓 名：<input type="text" name="name" value="" style="height:22px;width: 100px">
        </div>
        <hr width="40%">
        <div class="col-lg-12">
        公 司：<select name="cid" style="width:100px;height:22px">
        <c:forEach items="${companyList}" var="r">
        <option value="${r.id}">${r.name}
            </c:forEach>
    </select>
        </div>
        <hr width="40%">
        <div class="col-lg-12">
        职 位：<select name="rid" style="width:100px;height:22px">
        <c:forEach items="${roleList}" var="r">
        <option value="${r.id}">${r.name}
            </c:forEach>
    </select>
        </div>
        <hr width="40%">
        <input type="submit" value="注册用户">
    </form>
</div>
</body>
</html>
