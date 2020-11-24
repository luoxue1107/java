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
		<title>修改科室信息</title>
	</head>
  
	<body>
		<h1 class="text-center pt-3 pb-3">修改科室信息</h1>
		
		<div class="container">
			<hr>
			<form action="${pageContext.request.contextPath}/setDep?uid=${department.uid}" method="post">
				<div class="form-group row">
					<h4 class="offset-md-3 col-md-2 text-right">修改编号为${department.uid}科室名称：</h4>
					<div class="col-md-4">
						<input type="text" value="${department.name}" class="form-control" id="inputUsername" name="depName" placeholder="">
					</div>
				</div>
				
				<div class="offset-md-5 col-md-4 text-left">
					<button type="submit" class="btn btn-primary">修改</button>
					<a href="${pageContext.request.contextPath}/page02" class="btn btn-outline-primary" role="button">关闭窗口</a>
				</div>
			</form>
		</div>
	</body>
</html>
