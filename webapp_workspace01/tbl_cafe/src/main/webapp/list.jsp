<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"
	integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin="anonymous"></script>
<title>list</title>
<style>
table {
	width: 400px;
	height: 300px;
	text-align: center
}
</style>
</head>
<body>
<table class="table table-hover tbl_cafe">

		<thead>
			<tr>
				<th scope="col">번호</th>
				<th scope="col">이름</th>
				<th scope="col">가격</th>
				<th scope="col">수정</th>
				<th scope="col">삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test='${empty list}'>
					<tr>
						<td colspan=5 scope="row">보여줄 메세지가 없습니다</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach items="${list}" var="dto">
						<tr>
							<td scope="row">${dto.getProduct_id()}</td>
							<td>${dto.getProduct_name()}</td>
							<td>${dto.getProduct_price()}</td>
							<td>
								<button type="button" class="btn btn-info modifyBtn"
									value="${dto.getProduct_id()}">수정</button>
							</td>
							<td>
								<button type="button" class="btn btn-danger deleteBtn"
									value="${dto.getProduct_id()}">삭제</button>
							</td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
				<form action="select" method="post">
					<tr>
						<td colspan=3 scope="row">
							<input type"text" name="product_name" placeholder="메뉴 이름으로 검색"> 
						</td>
						<td>
							<button type="button" class="btn btn-danger deleteBtn">검색</button> 
						</td>
					</tr>
				</form>
		</tbody>

</body>
</html>