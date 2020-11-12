<%--
  Created by IntelliJ IDEA.
  User: luo
  Date: 2020/11/8
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--不要忽略EL表达式--%>
<html>
<head>
    <title>设置</title>
</head>
<body>
<div align="center" style="padding-top:30px">
    <h3>设置员工信息</h3>
    <form action="${pageContext.request.contextPath}/" method="post">
        <div class="col-lg-12">
            <p>编号${employee.id}</p>
            <hr width="40%">
            姓 名：<input type="text" name="name" value="${employee.name}" style="height:22px;width: 100px">
        </div>
        <hr width="40%">

        <div class="col-lg-12">
            公 司：<select name="cid" style="width:100px;height:22px">
            <c:forEach items="${companyList}" var="c">
            <c:if test="${c.id==employee.cid}">
                <option value="${c.id}" selected>${c.name}
            </c:if>
                <c:if test="${c.id!=employee.cid}">
                <option value="${c.id}">${c.name}
                </c:if>
                </c:forEach>
                </select>
        </div>
        <hr width="40%">
        <input type="submit" value="设置完成">
    </form>
</div>
</body>
</html>
