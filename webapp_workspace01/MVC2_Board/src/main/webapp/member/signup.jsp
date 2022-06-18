<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
    <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
    <title>회원가입</title>
</head>
<body>
    <div class="container w-50">
		<form id="signupForm" action="/signupProc.mem" method="post">
            <div class="row">
                <div class="col-12 mb-5 d-flex justify-content-center">
                    <h2>회원가입</h2>
                </div>
            </div>
            <div class="row p-2">
                <div class="col-12">
                    <label for="id" class="form-label">아이디</label>
                </div>
                <div class="col-8 mb-2">
                    <input type="text" class="form-control" id="id" name="id" readonly>
                </div>
                <div class="col-4 mb-2">
                    <button type="button" id="checkIdBtn" class="btn btn-warning w-100">아이디 확인</button>
                </div>
            </div>
            <div class="row p-2">
                <div class="col-12 ">
                    <label for="password" class="form-label">비밀번호</label>
                </div>
                <div class="col-12 mb-2">
                    <input type="password" class="form-control" id="pw" name="pw">
                </div>
            </div>
            <div class="row p-2">
                <div class="col-12 ">
                    <label for="pwCheck" class="form-label">비밀번호 확인</label>
                </div>
                <div class="col-12 mb-2">
                    <input type="password" class="form-control" id="pwCheck">
                </div>
            </div>
            <div class="row p-2">
                <div class="col-12 ">
                    <label for="nickname" class="form-label">닉네임</label>
                </div>
                <div class="col-12 mb-2">
                    <input type="text" class="form-control" id="nickname" name="nickname">
                </div>
            </div>
            <div class="row p-2">
                <div class="col-12"><label for="phone" class="form-label">휴대폰 번호</label></div>
                <div class="col-4 mb-2">
                    <select class="form-select" id="phone1">
                        <option value="010" selected>010</option>
                        <option value="011">011</option>
                        <option value="016">016</option>
                        <option value="017">017</option>
                        <option value="018">018</option>
                        <option value="019">019</option>
                     </select>
                </div>
                <div class="col-4 mb-2">
                    <input type="text" class="form-control" id="phone2">
                </div>
                <div class="col-4 mb-2">
                    <input type="text" class="form-control" id="phone3">
                </div>
                <div class="col d-none">
                	<input type="text" id="phone" name="phone">
                </div>
            </div>
            <div class="row p-2">
                <div class="col">
                    <input type="text" class="form-control" id="postCode" name="postCode" placeholder="우편번호">
                </div>
                <div class="col">
                    <button type="button" class="btn btn-primary w-100" id="btnPostCode">우편번호 찾기</button>
                </div>
            </div>
            <div class="row p-2">
                <div class="col">
                    <input type="text" class="form-control" id="roadAddr" name="roadAddr" placeholder="도로명주소">
                </div>
            </div>
            <div class="row p-2">
                <div class="col mb-2">
                    <input type="text" class="form-control" id="detailAddr" name="detailAddr" placeholder="상세주소">
                </div>
                <div class="col mb-2">
                    <input type="text" class="form-control" id="extraAddr" name="extraAddr" placeholder="읍/면/동">
                </div>
            </div>
            <div class="row justify-content-center">
                <div class="col-4 d-flex justify-content-end">
                    <button type="button" class="btn btn-secondary" id="cancelBtn">취소</button>
                </div>
                <div class="col-4 d-flex justify-content-start">
                    <button type="button" class="btn btn-primary" id="submitBtn">가입</button>
                </div>
            </div>			
		</form>
	</div>
	<script>
	
		// 가입 버튼을 눌렀을때 유효성 검사 후 form 제출
		$("#submitBtn").on("click", function(){
			let regexPw = /[a-zA-Z0-9~!@#$%^&*]{6,20}/; // 비밀번호 정규식
			let regexNickname = /[a-zA-Z0-9ㄱ-힣]{4,8}/; // 닉네임 정규식
			let regexPhone = /[0-9]{11}/; // 휴대전화 정규식
			
			// phone번호 합쳐주는 작업
			// select박스에서 선택된 값을 가져오는 방법(selected된 옵션의 value값 가져옴)
			let phone = $("#phone1 option:selected").val() + $("#phone2").val() + $("#phone3").val();
			$("#phone").val(phone);
			
			
			// 유효성 검사
			if($("#id").val() === ""){
				alert("아이디를 입력해 주세요.");
				return;
			}else if(!regexPw.test($("#pw").val())){
				alert("형식에 맞지않는 비밀번호입니다.");
				return;
			}else if($("#pwCheck").val() !== $("#pw").val()){
				alert("비밀번호와 비밀번호 확인창의 값이 일치하지 않습니다.");
				return;
			}else if(!regexNickname.test($("#nickname").val())){
				alert("형식에 맞지않는 닉네임입니다.");
				return;
			}else if(!regexPhone.test(phone)){ // 숫자 데이터에 대한 별도의 형변환이 필요없음
				alert("형식에 맞지않는 휴대폰번호입니다.");
				return;
			}else if($("#postCode").val() === "" || $("#roadAddr").val() === ""){ // 빈값확인
				alert("주소를 입력해 주세요.");
				return;
			}
			
			// form 제출
			document.getElementById("signupForm").submit();
		})
		
		// 아이디 확인 버튼 누르면 팝업창 띄우기
		document.getElementById("checkIdBtn").onclick = function(){
			// 팝업창을 띄우기 위해 필요한 3가지 값 
			// 1. jsp 경로값 (팝업창을 꾸며주는 jsp 별도로 필요)
			// 2. 팝업창의 이름값 
			// 3. 팝업창의 크기, 위치
			let url = "/idCheckPopup.mem";
			let name = "아이디 중복검사";
			let option = "width=600, height=300, left=500, top=300";
			window.open(url, name, option);
		}
	
		// 다음 우편번호 api 띄우기
		$("#btnPostCode").on("click", function(){
			new daum.Postcode({
	            oncomplete: function(data) {
	                var roadAddr = data.roadAddress; // 도로명 주소 변수
	                var extraRoadAddr = ''; // 참고 항목 변수

	                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
	                    extraRoadAddr += data.bname;
	                }
	                // 건물명이 있고, 공동주택일 경우 추가한다
	                if(data.buildingName !== '' && data.apartment === 'Y'){
	                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
	                }
	                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
	                if(extraRoadAddr !== ''){
	                    extraRoadAddr = ' (' + extraRoadAddr + ')';
	                }

	                // 우편번호와 주소 정보를 해당 필드에 넣는다.
	                $("#postCode").val(data.zonecode);
	                $("#roadAddr").val(roadAddr);
	                
	                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
	                if(roadAddr !== ''){
	                	$("#extraAddr").val(extraRoadAddr);
	                } else {
	                	$("#extraAddr").val("");
	                }
	            }
	        }).open();
		})
	</script>
</body>
</html>