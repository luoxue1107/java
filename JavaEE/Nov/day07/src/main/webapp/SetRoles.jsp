<%--
  Created by IntelliJ IDEA.
  User: luo
  Date: 2020/11/8
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--不要忽略EL表达式--%>
<html>
<head>
    <title>设置职位</title>
</head>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet">
<body>
<div  align="center" class="col-lg-12">

    <form action="${pageContext.request.contextPath}/SetRole.do?eid=${id}" method="post">
        <%--展示信息块 开始--%>
        <div style="width: 400px; padding:30px; ;margin: auto ;">
            <h2 align="center">职 位 设 置</h2>
            <hr width="60%">
            <table class="table table-striped table-bordered table-hover ">
                <tr>
                    <th><input type="checkbox" id="checkboxAll"></th>
                    <th>职位</th>
                </tr>
                <%--items:要循环的列表，var:循环变量--%>
                <c:forEach items="${roleList}" var="r">
                    <tr class="warning">
                        <td>
                            <c:set var="checked" value=""/>
                            <c:forEach items="${ridList}" var="rid">
                                <c:if test="${r.id == rid}">
                                    <c:set var="checked" value="checked"/>
                                </c:if>
                        </c:forEach>
                                    <input type="checkbox" class="checkbox"name="rid" value="${r.id}" ${checked}/>
                        </td>
                        <td>${r.name}</td>
                    </tr>
                </c:forEach>
            </table>
            <input type="submit" value="提交修改">
        </div>
    </form>
</div>
</body>
</html>