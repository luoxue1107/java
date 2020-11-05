
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center" style="padding-top:30px">
    <form action="${pageContext.request.contextPath}/addCourse" method="post">
        <fieldset style="width:20%">
            <legend>&nbsp;新增课程&nbsp;</legend>
            <div style="padding-top:10px">
                名　称：<input type="text" name="name" value="">
            </div>
            <div style="padding-top:15px; padding-bottom:10px">
                <input type="submit" value="新增课程">
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>
