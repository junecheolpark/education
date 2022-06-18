<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<title>테스트</title>
</head>
<body>
	<div class="row boxBtn-top">
		<div class="col d-flex justify-content-end">
			<button type="button" id="btnLogout" class="btn btn-danger">로그아웃</button>
			<button class="btn btn-warning" id="toInput" type="button">요청보내기</button>
		</div>
	</div>
	<form id="testForm">
		<input type="text" name="id">
		<input type="text" name="nickname">
		<button type="button" id="btnSubmit">제출</button>
	</form>
	<button type="button" id="getData">데이터가져오기</button>
	<button type="button" id="getDTO">DTO가져오기</button>
	<button type="button" id="getList">List가져오기</button>
	<script>	
		$("#getList").on("click", function(){ // list 타입 데이터 가져오기
			$.ajax({
				url : "/getList.test"
				, type: "get"
				, dataType: "json"
				, success: function(data){
					console.log(data);
					console.log(data[0].seq_board);
					
					for(let dto of data){
						console.log(dto.seq_board+" : "+
								dto.title+" : "+
								dto.content+" : "+
								dto.writer_nickname+" : "+
								dto.writer_id+" : "+
								dto.view_count+" : "+
								dto.written_date);
					}
				}
				, error: function(e){
					console.log(e);
				}
			})
		})
		
		$("#getDTO").on("click", function(){ // dto 타입 데이터 가져오기
			$.ajax({
				url: "/getDTO.test"
				, type: "get"
				, dataType: "json"
				// 서버에서 json형식의 데이터를 보내줬을때 
				// success 안쪽에서 js 객체처럼 다루고 싶으면 dataType: "json" 으로 잡아줌.
				, success: function(data){
					console.log(data);
					console.log(data.seq_board);
					console.log(data.title);
					console.log(data.content);
					console.log(data.writer_nickname);
					console.log(data.writer_id);
					console.log(data.view_count);
					console.log(data.written_date);
				}
				, error: function(e){
					console.log(e);
				}
			})
		})
	
		$("#getData").on("click", function(){ // 요청에 따라 텍스트 데이터 가져오기
			$.ajax({
				url : "/getData.test"
				, type : "get"
				, data : {msg : "goodbye"}
				, dataType: "text" //받아올 데이터의 타입
				, success: function(data){
					console.log(data);
				}
				, error: function(e){
					console.log(e);
				}
			})
		})
	
		$("#btnSubmit").on("click", function(){ // post방식으로 데이터 전송
			// post방식으로 비동기통신 데이터 전송
			// form태그 안의 데이터를 객체 형식으로 변환시켜주는 함수
			let data = $("#testForm").serialize();
			console.log(data);
			
			$.ajax({
				url: "/sendForm.test"
				,type: "post"
				,data: data
				, success: function(){}
				, error: function(e){
					console.log(e);
				}
			})			
		})	
	
		$("#toInput").on("click", function(){ // get방식으로 데이터 전송
			/*
				ajax : 비동기 통신할때 사용하는 라이브러리 
				(전체 페이지의 리로드없이 부분적인 페이지만 서버와 통신하여 리로드할 수 있는 것)							
			*/
			// 1. 요청 보내기
			// 2. get방식으로 데이터 보내기 
			$.ajax({
				url: "/sendMsg.test?msg=Helloworld"
				, type: "get"
				, success: function(){
					
				}
				, error : function(e){
					console.log(e);
				}			
			});			
		})
	
	</script>
</body>
</html>