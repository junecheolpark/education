<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<title>Home</title>
<style>
.boxInput>input {
	width: 30%;
	margin: 5px;
}
</style>
</head>
<body>
	<c:choose>
		<c:when test="${not empty loginSession}">
			<div class="container">
				<div class="row">
					<div class="col">
						<h2> ${loginSession.nickname}님 환영합니다.</h2>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<button type="button" id="btnLogout" class="btn btn-dark">로그아웃</button>
					</div>
					<div class="col">
						<button type="button" id="btnMypage" class="btn btn-warning">마이페이지</button>
					</div>
					<div class="col">
						<button type="button" id="btnBoard" class="btn btn-success">게시판</button>
					</div>
					<div class="col">
						<button type="button" class="btn btn-danger">회원탈퇴</button>
					</div>
				</div>				
			</div>
			<script>
				$("#btnMypage").on("click", function(){ // 마이페이지 요청
					location.href = "/myPage.mem";
				});
				$("#btnLogout").on("click", function(){ // 로그아웃 요청
					location.href = "/logoutProc.mem";
				});
				$("#btnBoard").on("click", function(){ // 게시판 요청
					location.href = "/board.bo?curPage=1";
				})
			</script>
		</c:when>
		<c:otherwise>
			<c:if test="${rs eq false}">
				<script>
					alert("로그인 실패");
				</script>
			</c:if>
			<form id="loginForm" action="/loginProc.mem" method="post">
				<div class="container">
					<div class="row">
						<div class="col d-flex justify-content-center">
							<h2>Board</h2>
						</div>
					</div>
					<div class="row">
						<div class="col-12 boxInput d-flex justify-content-center">
							<input type="text" class="form-control" id="id" name="id"
								placeholder="id 입력" value="abc123">
						</div>
						<div class="col-12 boxInput d-flex justify-content-center">
							<input type="password" class="form-control" id="pw" name="pw"
								placeholder="pw 입력" value="abc123">
						</div>
					</div>
					<div class="row">
						<div class="col d-flex justify-content-center">
							<input type="checkbox" id="rememberId" class="form-check">
							아이디 기억하기 
						</div>
					</div>
					<div class="row justify-content-center">
						<div class="col-4 d-flex justify-content-end">
							<button type="button" id="loginBtn" class="btn btn-primary">로그인</button>
						</div>
						<div class="col-4 d-flex justify-content-start">
							<button type="button" id="signupBtn" class="btn btn-info">회원가입</button>
						</div>
					</div>
				</div>
			</form>
			<script>
				// 로그인 버튼을 눌렀을때 값이 비어있지 않다면 submit
				$("#loginBtn").on("click", function() {
					if ($("#id").val() === "" || $("#pw").val() === "") {
						alert("아이디 혹은 비밀번호를 정확히 입력하세요.");
						return;
					}
					$("#loginForm").submit();
				})
				// 회원가입 페이지 이동
				document.getElementById("signupBtn").onclick = function() {
					location.href = "/toSignup.mem";
				}
			</script>
		</c:otherwise>
	</c:choose>
</body>
</html>