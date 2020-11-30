<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--不要忽略EL表达式--%>
<html lang="en">
	<head>
		<!-- Required meta tags -->
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Bootstrap CSS -->
		<link rel="stylesheet" href="../css/bootstrap.min.css">
		<!-- Optional JavaScript -->
		<!-- jQuery first, then Popper.js, then Bootstrap JS -->
		<script src="../js/jquery.min.js"></script>
		<script>
			function search01(){$("#from01").submit();}
		</script>
		<script>
			function search02() {
				$("#from02").submit();
			}
		</script>
		<title>购物车</title>
	</head>

	<body>
		<h1 class="text-center pt-3 pb-3">购物车</h1>
		<hr>
		<div class="container">
			<div class="offset-md-2 col-md-8">
				<div class="row">
					<div class="col-md-10">
						<form class="form-inline" id="from01" action="${pageContext.request.contextPath}/productLogin.action" method="post">
							<div class="form-group">
								<label>排序方式：</label>
								<label>
									<select class="form-control form-control-sm" name="id">
										<option value="0" ${id==0?"selected":""}>总价降序</option>
										<option value="1" ${id==1?"selected":""}>总价升序</option>
										<option value="2" ${id==2?"selected":""}>单价降序</option>
										<option value="3" ${id==3?"selected":""}>单价升序</option>
									</select>
									&nbsp;&nbsp;
								</label>
								<button type="button" onclick="search01()" class="btn btn-sm btn-outline-secondary">排序</button>
							</div>
						</form>
					</div>
				</div>
				<form id="form02" action="${pageContext.request.contextPath}/delCart" name="item" method="post">

					<div class="form-group">
					<button type="submit" class="btn btn-sm btn-outline-secondary">批量删除</button>
					</div>
					<table class="table table-bordered">
						<thead>
							<tr>
								<th>选择</th>
								<th>商品</th>
								<th>单价</th>
								<th>数量</th>
								<th>总价</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${doctor}" var="d">
							<tr>
								<td class="text-center">
									<label>
										<input type="checkbox" class="form-check-input" name="item" value="${d.id}">
									</label>
								</td>
								<td>${d.name}</td>
								<td>${d.price}</td>
								<td>${d.number}</td>
								<td>${d.count}</td>
								<td>
									<a href="${pageContext.request.contextPath}/gotoProductNumber.action?id=${d.id}">修改数量</a>
								</td>
							</tr>
						</c:forEach>
							<tr>
								<td colspan="4" align="center">
									总价
								</td>
								<td colspan="2">
									${sum}&nbsp;元
								</td>
							</tr>
						</tbody>
					</table>
				</form>
			</div>
		</div>
	</body>
</html>
