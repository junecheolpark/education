<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>input</title>
</head>
<style>
	textarea{ width:300px; height: 200px;}
</style>
<body>
	<form action="/input.post" method="post">
	<div>
		<p>id : </p>
		<input type="text" name="id">	
	</div>
	<div>
		<p>post : </p>
		<textarea name="post"></textarea>
	</div>
		<button type="submit">보내기</button>
	</form>



</body>
</html>