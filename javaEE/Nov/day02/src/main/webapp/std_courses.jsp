
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center" style="padding-top:30px">
    <form action="${pageContext.request.contextPath}/setRelation?id=${id}" method="post">
        <fieldset style="width:10%">
            <legend>&nbsp;选课&nbsp;</legend>
            <div style="padding-top:10px; padding-bottom:10px" align="left">
                <c:forEach items="${courses}" var="c">
                    <c:set var="status" value=""/> <%--定义一个变量status--%>

                    <c:forEach items="${cids}" var="i">
                        <%--如果当前课程学生已选修则将值置为checked--%>
                        <c:if test="${i == c.id}">
                            <c:set var="status" value="checked"/>
                        </c:if>
                    </c:forEach>

                    <input type="checkbox" name="course" value="${c.id}" ${status}>&nbsp;${c.name}<br>
                </c:forEach>
            </div>
        </fieldset>
        <div style="padding-top:15px; padding-bottom:10px">
            <input type="submit" value="提交">
        </div>
    </form>
</div>
</body>
</html>
