<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
</head>
<body>
<!--获取服务器 path-->
<form action=${pageContext.request.contextPath}/RequestLine.do?methodName=parsQueryString&" method="get">
    账号
    <input type="text" value="" name="mobile" placeholder="请输入账号:" autocomplete="off"><br>
    密码:<input type="password" value="" name="password" placeholder="请输入密码" autocomplete="off">
    <input type="submit" value="提交">
</form>

<h1>get</h1>
<form action=${pageContext.request.contextPath}/Person.action?" method="get">
    账号:
    <input type="text" value="" name="mobile" placeholder="请输入账号" autocomplete="off"><br>
    密码:<input type="password" value="" name="password" placeholder="请输入密码" autocomplete="off">
    <input hidden type="password" name="methodName" value="loginWithFormByGet" autocomplete="off" readonly>
    <input type="submit" value="提交">
</form>

<h1>post</h1>
<form action=${pageContext.request.contextPath}/Person.action?methodName=loginWithFormByPost&" method="post">
    账号:
    <input type="text" value="" name="mobile" placeholder="请输入账号" autocomplete="off"><br>
    密码:<input type="password" value="" name="password" placeholder="请输入密码" autocomplete="off">
    <input type="submit" value="提交">
</form>

<h1>put</h1>
<form action=${pageContext.request.contextPath}/Person.action?&" method="put">
    账号:
    <input type="text" value="" name="mobile" placeholder="请输入账号:" autocomplete="off"><br>
    密码:<input type="password" value="" name="password" placeholder="请输入密码" autocomplete="off">
    <input hidden type="password" name="methodName" value="addWithFormByPut" autocomplete="off" readonly>
    <input type="submit" value="提交">
</form>
<h1>del</h1>
<form action=${pageContext.request.contextPath}/Person.action?&" method="delete">
    账号:
    <input type="text" value="" name="mobile" placeholder="请输入账号:" autocomplete="off"><br>
    <input hidden type="password" name="methodName" value="delWithFormByDelete" autocomplete="off" readonly>
    <input type="submit" value="提交">
</form>
</body>
