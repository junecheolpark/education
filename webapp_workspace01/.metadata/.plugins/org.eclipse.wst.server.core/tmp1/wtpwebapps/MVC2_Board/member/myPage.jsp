<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script
	src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<title>회원가입</title>
</head>
<body>
	<div class="container w-50">
		<form id="modifyForm" action="/modifyProc.mem" method="post">
			<div class="row">
				<div class="col-12 mb-5 d-flex justify-content-center">
					<h2>마이페이지</h2>
				</div>
			</div>
			<div class="row p-2">
				<div class="col-12">
					<label for="id" class="form-label">아이디</label>
				</div>
				<div class="col-8 mb-2">
					<input type="text" class="form-control" id="id" name="id"
						value="${dto.getId()}" readonly>
				</div>
			</div>
			<div class="row p-2">
				<div class="col-12 ">
					<label for="nickname" class="form-label">닉네임</label>
				</div>
				<div class="col-12 mb-2">
					<input type="text" class="form-control" id="nickname"
						name="nickname" value="${dto.getNickname()}" readonly>
				</div>
			</div>
			<div class="row p-2">
				<div class="col-12">
					<label for="phone" class="form-label">휴대폰 번호</label>
				</div>
				<div class="col-4 mb-2">
					<select class="form-select" id="phone1" readonly>
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="016">016</option>
						<option value="017">017</option>
						<option value="018">018</option>
						<option value="019">019</option>
					</select>
				</div>
				<div class="col-4 mb-2">
					<input type="text" class="form-control" id="phone2" readonly>
				</div>
				<div class="col-4 mb-2">
					<input type="text" class="form-control" id="phone3" readonly>
				</div>
				<div class="col d-none">
					<input type="text" id="phone" name="phone">
				</div>
			</div>
			<div class="row p-2">
				<div class="col">
					<input type="text" class="form-control" id="postCode"
						name="postCode" value="${dto.getPostCode()}" placeholder="우편번호"
						readonly>
				</div>
				<div class="col">
					<button type="button" class="btn btn-primary w-100"
						id="btnPostCode" disabled>우편번호 찾기</button>
				</div>
			</div>
			<div class="row p-2">
				<div class="col">
					<input type="text" class="form-control" id="roadAddr"
						name="roadAddr" value="${dto.getRoadAddr()}" placeholder="도로명주소"
						readonly>
				</div>
			</div>
			<div class="row p-2">
				<div class="col mb-2">
					<input type="text" class="form-control" id="detailAddr"
						name="detailAddr" value="${dto.getDetailAddr()}"
						placeholder="상세주소" readonly>
				</div>
				<div class="col mb-2">
					<input type="text" class="form-control" id="extraAddr"
						name="extraAddr" value="${dto.getExtraAddr()}" placeholder="읍/면/동"
						readonly>
				</div>
			</div>
			<div class="row justify-content-center btn-before">
				<div class="col-4 d-flex justify-content-end">
					<button type="button" class="btn btn-secondary" id="backBtn">뒤로가기</button>
				</div>
				<div class="col-4 d-flex justify-content-start">
					<button type="button" class="btn btn-primary" id="modifyBtn">수정</button>
				</div>
			</div>
			<div class="row justify-content-center btn-after d-none">
				<div class="col-4 d-flex justify-content-end">
					<button type="button" class="btn btn-secondary" id="cancelBtn">취소</button>
				</div>
				<div class="col-4 d-flex justify-content-start">
					<button type="button" class="btn btn-primary" id="completeBtn">완료</button>
				</div>
			</div>
		</form>
	</div>
	<script>
		// 뒤로가기버튼을 눌렀을때 index로 돌아가기
		$("#backBtn").on("click", function() {
			location.href = "/";
		});
		// 수정버튼을 눌렀을때
		$("#modifyBtn").on("click", function() {
			$("input").not("#id").attr("readonly", false); // 아이디를 제외한 input readonly 제거
			$("#btnPostCode").attr("disabled", false); // 우편번호찾기 버튼에 걸린 disabled 제거
			$(".btn-before").css("display", "none"); // 기존의 버튼들 감춰주기
			$(".btn-after").removeClass("d-none"); // 취소, 완료버튼 보여주기
		});

		// 수정화면에서 취소 버튼을 눌렀을때 
		$("#cancelBtn").on("click", function() {
			location.href = "/myPage.mem";
		});
		
		// 수정완료버튼 눌렀을 때 
		$("#completeBtn").on("click", function(){
			// 닉네임, 전화번호, 주소 빈값/유효한 값인지 확인 
			let regexNickname = /[a-zA-Z0-9ㄱ-힣]{4,8}/; // 닉네임 정규식
			let regexPhone = /[0-9]{11}/; // 휴대전화 정규식
			
			// phone번호 합쳐주는 작업
			// select박스에서 선택된 값을 가져오는 방법(selected된 옵션의 value값 가져옴)
			let phone = $("#phone1 option:selected").val() + $("#phone2").val() + $("#phone3").val();
			$("#phone").val(phone);
			
			
			// 유효성 검사
			if(!regexNickname.test($("#nickname").val())){
				alert("형식에 맞지않는 닉네임입니다.");
				return;
			}else if(!regexPhone.test(phone)){ // 숫자 데이터에 대한 별도의 형변환이 필요없음
				alert("형식에 맞지않는 휴대폰번호입니다.");
				return;
			}else if($("#postCode").val() === "" || $("#roadAddr").val() === ""){ // 빈값확인
				alert("주소를 입력해 주세요.");
				return;
			}
			
			$("#modifyForm").submit();
		})
		

		// 휴대폰 번호 셋팅
		let phone = "${dto.getPhone()}";
		let phone1 = phone.slice(0, 3);
		let phone2 = phone.slice(3, 7);
		let phone3 = phone.slice(7);

		// 셀렉트 박스에 default selected값 주기
		$("#phone1").val(phone1).prop("selected", true);
		$("#phone2").val(phone2);
		$("#phone3").val(phone3);

		// 다음 우편번호 api 띄우기
		$("#btnPostCode").on("click",function() {new daum.Postcode({
			oncomplete : function(data) {
			var roadAddr = data.roadAddress; // 도로명 주소 변수
			var extraRoadAddr = ''; // 참고 항목 변수

											if (data.bname !== ''
													&& /[동|로|가]$/g
															.test(data.bname)) {
												extraRoadAddr += data.bname;
											}
											// 건물명이 있고, 공동주택일 경우 추가한다
											if (data.buildingName !== ''
													&& data.apartment === 'Y') {
												extraRoadAddr += (extraRoadAddr !== '' ? ', '
														+ data.buildingName
														: data.buildingName);
											}
											// 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
											if (extraRoadAddr !== '') {
												extraRoadAddr = ' ('
														+ extraRoadAddr + ')';
											}

											// 우편번호와 주소 정보를 해당 필드에 넣는다.
											$("#postCode").val(data.zonecode);
											$("#roadAddr").val(roadAddr);

											// 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
											if (roadAddr !== '') {
												$("#extraAddr").val(
														extraRoadAddr);
											} else {
												$("#extraAddr").val("");
											}
										}
									}).open();
						})
	</script>
</body>
</html>