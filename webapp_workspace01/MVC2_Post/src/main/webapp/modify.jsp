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

<title>modify</title>
</head>
<style>
	textarea{ width:300px; height: 200px;}
	/*
	#no{
	display : none;}
	*/
</style>
<body>
	<form id="modifyForm" action="/modyfyProc.post" method="post" >
	<div id="no">
		<input type="text" name="no" value="${dto.getNo()}">
	</div>
	<div>
		<p>id : </p>
		<input type="text" name="id" value="${dto.getId()}">	
	</div>
	<div>
		<p>post : </p>
		<textarea name="post" value="${dto.getPost()}"></textarea>
	</div>
		<button id="completeBtn" type="button">보내기</button>
	</form>

<script>

	//수정완료 버튼을 클릭하면 "정말 수정하시겠습니까?" 알림창을 띄워주고 만약 
	//"확인"을 누르면 서버로 form 제출  "취소"를 누르면 제출 x
	$("#completeBtn").on("click", function(){
		let answer = confirm("정말 수정하시겠습니까?");
				
		if(answer){//확인버튼을 눌렀다면
			$("#modifyForm").submit();
			
		}
	});

</script>

</body>
</html>