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
		<title>新增医生</title>
	</head>
  
	<body>
		<h1 class="text-center pt-3 pb-3">新增医生</h1>
		
		<div class="container">
			<hr>
			<form action="${pageContext.request.contextPath}/addDoc" method="post">
				<div class="form-group row">
					<h4 class="offset-md-3 col-md-2 text-right">姓　名：</h4>
					<div class="col-md-4">
						<input type="text"  name="name" class="form-control" id="inputUsername" placeholder="姓名">
					</div>
				</div>
				<div class="form-group row">
					<h4 class="offset-md-3 col-md-2 text-right">生　日：</h4>
					<div class="col-md-4">
						<input type="Date" name="birthday" class="form-control" id="inputPassword" placeholder="生日">
					</div>
				</div>
				<div class="form-group row">
					<h4 class="offset-md-3 col-md-2 text-right">性　别：</h4>
					<div class="col-md-4">
						<select class="form-control" name="gender" id="sel1">
							<option value="1">男</option>
							<option value="0">女</option>
						</select>
					</div>
				</div>
				<div class="form-group row">
					<h4 class="offset-md-3 col-md-2 text-right">科　室：</h4>
					<div class="col-md-4">
						<select class="form-control" name="did" id="">
							<c:forEach items="${departments}" var="t">
							<option value="${t.uid}">${t.name}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="form-group row">
					<h4 class="offset-md-3 col-md-2 text-right">身份证：</h4>
					<div class="col-md-4">
						<input type="text" name="id" class="form-control"  placeholder="身份证">
					</div>
				</div>
				<div class="offset-md-5 col-md-4 text-left">
					<button type="submit" class="btn btn-primary">新增医生</button>
				</div>
			</form>
		</div>
	</body>
</html>
