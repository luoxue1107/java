<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--不要忽略EL表达式--%>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script typeof=""></script>
    <title>修改医生信息</title>
</head>

<body>
<h1 class="text-center pt-3 pb-3">修改编号${doctor.uid}号医生信息</h1>

<div class="container">
    <hr>
    <form action="${pageContext.request.contextPath}/setDoc?uid=${doctor.uid}" method="post">
        <div class="form-group row">
            <h4 class="offset-md-3 col-md-2 text-right">姓　名：</h4>
            <div class="col-md-4">
                <input type="text" name="name" value="${doctor.name}" class="form-control" id="inputUsername" >
            </div>
        </div>
        <div class="form-group row">
            <h4 class="offset-md-3 col-md-2 text-right">生　日：</h4>
            <div class="col-md-4">
                <input type="text" name="birthday" value="${doctor.birthday}" class="form-control" id="inputPassword" placeholder="">
            </div>
        </div>

        <div class="form-group row">
            <h4 class="offset-md-3 col-md-2 text-right">性　别：</h4>
            <div class="col-md-4">
                <select class="form-control" name="gender" id="sel1">
                    <c:if test="${doctor.gender==1}">
                        <option value="0">女</option>
                        <option value="1" selected>男</option>
                    </c:if>
                    <c:if test="${doctor.gender==0}">
                        <option value="1">男</option>
                        <option value="0" selected>女</option>
                    </c:if>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <h4 class="offset-md-3 col-md-2 text-right">科　室：</h4>
            <div class="col-md-4">
                <select class="form-control" name="did" id="">
                    <c:forEach items="${department}" var="t">
                        <c:if test="${t.uid == doctor.did}">
                        <option value="${t.uid}" selected>${t.name}</option>
                        </c:if>
                        <c:if test="${t.uid != doctor.did}">
                            <option value="${t.uid}" >${t.name}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <h4 class="offset-md-3 col-md-2 text-right">身份证：</h4>
            <div class="col-md-4">
                <input type="text" name="id" value="${doctor.id_Card}" class="form-control" placeholder="身份证">
            </div>
        </div>
        <div class="offset-md-5 col-md-4 text-left">
            <button type="submit" class="btn btn-primary">修改</button>
        </div>
    </form>
</div>
</body>
</html>
