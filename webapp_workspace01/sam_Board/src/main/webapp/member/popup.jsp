<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<title>아이디 중복확인</title>
</head>
<body>
	<form id="checkIdForm" action="/checkId.mem" method="get">
		<div class='container'>
			<div class="row m-3 justify-content-center">
				<div class="col-6 m-2">
					<input type="text" class="form-control" id="id" value="${id}" name="id" placeholder="id 입력">
				</div>
				<div class="col-3 m-2">
					<button type="button" class='btn btn-success' id="checkId">중복확인</button>
				</div>
			</div>
			<div class="row m-2 justify-content-start">
				<div class="col-4">
					<span>확인결과 : </span>
				</div>
				<div class="col-8">
					<c:if test="${rs eq 'ok'}">
						<span>사용 가능한 아이디입니다.</span>
					</c:if>
					<c:if test="${rs eq 'no'}">
						<span>사용 불가한 아이디입니다.</span>
					</c:if>
				</div>
			</div>
			<div class="row m-2 justify-content-center">
				<div class="col-4 d-flex justify-content-end">
					<button type="button" class="btn btn-primary" id="useBtn" disabled>사용</button>
				</div>
				<div class="col-4 d-flex justify-content-start">
					<button type="button" class="btn btn-secondary" id="cancelBtn">취소</button>
				</div>
			</div>
		</div>
	</form>
	<script>
		// 중복확인 버튼을 눌렀을 때 id값이 유효한 값이 체크 후에 서버로 중복확인 요청
		$("#checkId").on("click", function(){
			let regexId = /[a-zA-Z0-9_]{6,12}/;
			if(!regexId.test($("#id").val())){
				alert("형식에 맞지 않는 아이디입니다.");
				return; // return 을 만나면 그 즉시 함수가 종료 
			}
			$("#checkIdForm").submit();
		})	
	
		let useBtn = document.getElementById("useBtn");
	
		console.log("${rs}");
		if("${rs}" === "ok"){ // 사용 가능한 아이디라면
			useBtn.disabled = false; // disabled 속성 해지
		}else{
			useBtn.disabled = true; // disabled 속성 적용 
		}
		
	
		useBtn.onclick = function(){ // 사용버튼 클릭	
			let regexId = /[a-zA-Z0-9_]{6,12}/;
			if(!regexId.test($("#id").val())){
				alert("형식에 맞지 않는 아이디입니다.");
				useBtn.disabled = true;
				return; // return 을 만나면 그 즉시 함수가 종료 
			}
			
			// 1. 팝업창을 열어줬던 부모창(opener)의 id input칸에 사용자가 입력한 id를 전달.
			// 2. 팝업창을 닫음.
			// 왼쪽은 부모창(회원가입)의 id input요소     오른쪽은 팝업창의 id input요소 
			opener.document.getElementById("id").value = document.getElementById("id").value;
			self.close(); // 내 자신 창을 닫겠다. 
		}
		
		document.getElementById("cancelBtn").onclick = function(){
			self.close(); // 취소버튼 클릭 시 팝업 창닫기
		}
	</script>
</body>
</html>