<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add</title>
</head>
<body>
	<form action="/input.cafe" method="post">
	<div>
		<p>product_name : </p>
		<input type="text" name="product_name">	
	</div>
	<div>
		<p>product_price : </p>
		<textarea name="product_price"></textarea>
	</div>
		<button id="btnBack" type="button">뒤로가기</button>
		<button type="submit">등록하기</button>
	</form>
	<script>
	document.getElementById("btnBack").onclick = function(){
		location.href = "/index.jsp";
	}
	</script>
</body>
</html>