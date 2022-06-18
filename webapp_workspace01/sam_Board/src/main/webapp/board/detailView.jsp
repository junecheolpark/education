<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
	/* 게시글 스타일 영역*/
	.container-board{
		width: 80%;
	}
	.container-board div[class*=row]:not(:first-child){
	    border: 1px solid lightgrey;
	}
	.container-board div[class*=col-2]{
	    display: flex;
	    justify-content: center;
	    align-items: center;
	    font-weight: bold;
	    border-left: 1px solid lightgrey;
	    border-right: 1px solid lightgrey;
	}
	.container-board div[class*=col]:not(.content-board:last-child){
	    display: flex;
	    align-items: center;
	}
	.container-board div[class*=col] > p{
	    margin: 0;
	    padding: 5px;
	}
	.title-board{
	    height: 50px;
	}
	.header-board{
	    height: 50px;
	}
	.content-board{
	    height: 600px;
	}
	/* 게시글 스타일 끝*/
	
	/* 댓글 스타일 */
	.container-reply {
	    margin-top: 10px;
	    margin-bottom: 20px;
		width: 80%;
		border: 1px solid lightgrey;
	}
	.writer-reply{
		font-weight: bold;
	}
	.date-reply{
		color: grey;
		font-size: 12px;
	}
	.body-header-reply:not(:first-child){
		border-top : 1px solid lightgrey;
	}
	.content-reply{
		border: none;
		width: 100%;
	}

	#formReply {
		padding: 0;
	}
	.body-btnAfter-reply{
		display: none;
	}
	/* 댓글 스타일 끝 */
	
	textarea{
		resize: none;
	}
	.form-control[readonly]{
		background-color: transparent;
	}
</style>
</head>
<body>
    <!-- 게시글 영역 -->
    <div class="container container-board">
        <div class="row p-5">
            <h3 class="text-center">상세보기</h3>
        </div>
        <div class="row">
            <div class="col-2 title-board">
                <p>제목</p>
            </div>
            <div class="col-10 title-board">
                <p>${dto.title}</p>
            </div>
        </div>
        <div class="row">
            <div class="col-2 header-board">
                <p>글쓴이</p>
            </div>
            <div class="col-4 header-board">
                <p>${dto.writer_nickname}</p>
            </div>
            <div class="col-2 header-board ">
                <p>작성일</p>
            </div>
            <div class="col-4 header-board">
                <p>${dto.written_date}</p>
            </div>
        </div>
        <div class="row">
            <div class="col-3 header-board">
                <p>첨부파일</p>
            </div>
            <div class="col-3 header-board">
                <p><a href="/download.fi?ori_name=${file.ori_name}&sys_name=${file.sys_name}">${file.ori_name}</a></p>
            </div>
            <div class="col-6 header-board">
            	<img style="width:200px" src="/files/${file.sys_name}">
            </div> 
        </div>
        <div class="row">
            <div class="col-2 content-board">
                <p>내용</p>
            </div>
            <div class="col-10 content-board">
                <p>${dto.content}</p>
            </div>
        </div>
    </div>
	<!-- 게시글 영역 끝-->
	<!-- 댓글 영역 -->
	<div class="container container-reply p-2">
		<div class="row header-reply">
			<div class="col">
				<h5 class="text-center fs-3">댓글</h5>
			</div>
		</div>
        <!-- 댓글 출력 영역 -->
		<div class="row body-reply p-3">
			<c:if test="${empty replyList}"> <%--등록된 댓글이 없다면 --%>
				<div class="col-12">
					<p class="text-center">등록된 댓글이 없습니다.</p>
				</div>
			</c:if>
			<c:if test="${not empty replyList}"> <%--댓글이 있다면--%>
				<c:forEach items="${replyList}" var="reply"> 
					<div class="co1-12 body-header-reply">
						<span class="writer-reply">${reply.writer_nickname}</span>
						<span class="date-reply">${reply.written_date}</span>
					</div>
					<div class="col-9 body-content-reply">
						<textarea class="form-control content-reply" readonly>${reply.content}</textarea>
					</div>
					<c:if test="${reply.writer_id eq loginSession.id}"> <%--댓글작성자 id와 로그인한 사람의 id가 같다면 수정삭제버튼 보이기 --%>
						<div class="col-3 body-btnDefault-reply">
							<button type="button" class="btn btn-warning modify-reply">수정</button>
							<button type="button" class="btn btn-danger delete-reply" value="${reply.seq_reply}">삭제</button>
						</div>
						<div class="col-3 body-btnAfter-reply">
							<button type="button" class="btn btn-secondary cancel-reply">취소</button>
							<button type="button" class="btn btn-primary complete-reply" value="${reply.seq_reply}">완료</button>
						</div>
					</c:if>					
				</c:forEach>				
			</c:if>		
		</div>
        <!-- 댓글 출력 영역 끝-->
        <!-- 댓글 입력 영역 -->
		<form id="formReply" name="formReply">
			<div class="row footer-reply p-2 align-items-center">
				<div class="col d-none">
					<input type="text" value="${dto.seq_board}" name="seq_board">
				</div>
				<div class="col-10">
					<textarea id="inputReply" id="inputReply" class="form-control" name="content"></textarea>
				</div>
				<div class="col-2">
					<button type="button" class="btn btn-success" id="btnSubmitReply">등록</button>
				</div>
			</div>
		</form>
        <!-- 댓글 입력 영역끝 -->
	</div>
	<!-- 댓글 영역 끝 -->
    <!-- 하단 버튼 영역 -->
    <div class="container container-footer">
        <div class="row justify-content-center">
            <div class="col-2">
                <button type="button" class="btn btn-secondary" id="btnBack">뒤로가기</button>
            </div>
            <!--글쓴이와 로그인한 사용자가 같은 경우 수정 삭제 버튼 영역 -->
            <c:if test="${loginSession.id eq dto.writer_id}">
                <div class="col-2">
                    <button type="button" class="btn btn-warning" id="btnModify">수정</button>
                </div>
                <div class="col-2">
                    <button type="button" class="btn btn-danger" id="btnDelete">삭제</button>
                </div>
                <script>
                    $("#btnModify").on("click", function() { // 수정 페이지 요청
                        location.href = "/modify.bo?seq_board=${dto.seq_board}";
                    });
                    $("#btnDelete").on("click",function() { // 삭제 요청
                        let answer = confirm("지금 삭제하시면 복구가 불가합니다. 정말 삭제하시겠습니까?");
                        console.log(answer);
                        if (answer) {
                            location.href = "/deleteProc.bo?seq_board=${dto.seq_board}";
                        }
                    })
                </script>
            </c:if>
            <!-- 수정 삭제 버튼 영역 끝 -->
        </div>
    </div>  
	<script>
		// 댓글 수정 버튼에게 이벤트 부여
		$(".body-reply").on("click", ".modify-reply", function(e){
			$(e.target).parent(".body-btnDefault-reply").css("display", "none"); // 수정삭제 버튼 감추기
			$(e.target).parent().next(".body-btnAfter-reply").css("display", "block"); // 취소완료 버튼 보이기
			// 댓글 수정가능하게끔 readonly 속성 풀어주기 
			$(e.target).parent(".body-btnDefault-reply").prev().children("textarea").attr("readonly", false);
			$(e.target).parent(".body-btnDefault-reply").prev().children("textarea").focus();
		});
		
		// 댓글 수정 완료 버튼을 눌렀을때
		$(".body-reply").on("click", ".complete-reply", function(e){
			// 수정한 내용 (textarea value)
			// 수정한 댓글의 seq (seq_reply)
			// 게시글의 seq (seq_board)
			let seq_reply = $(e.target).val();
			let seq_board = "${dto.seq_board}";
			// 부모의 형제(위쪽으로)요소 중 body-content-reply를 선택하는데 그 중 가장 첫번째 요소 선택
			let content = $(e.target).parent(".body-btnAfter-reply").prevAll(".body-content-reply").first().children("textarea").val();
			
			$.ajax({
				url : "/modifyProc.rp"
				, type : "post"
				, data : {seq_reply: seq_reply, seq_board: seq_board, content: content}
				, success : function(data){
					console.log(data);
					if(data === "fail"){
						alert("댓글 수정에 실패했습니다.");
					}else{
						makeReply(data);
					}
				}, error : function(e){
					console.log(e);
				}
			})
		});
		
		// 댓글 취소 버튼에게 이벤트 부여
		$(".body-reply").on("click", ".cancel-reply", function(e){
			let seq_board = "${dto.seq_board}";
			$.ajax({
				url : "/getReply.rp?seq_board="+seq_board
				, type: "get"
				, success: function(data){
					makeReply(data);
				}, error: function(e){
					console.log(e);
				}
			})
			
		});
		
		// 댓글 삭제 버튼에게 이벤트 부여
		$(".body-reply").on("click", ".delete-reply", function(e){
			let answer = confirm("댓글을 정말 삭제하시겠습니까?");
			if(answer){
				let seq_reply = $(e.target).val();
				
				$.ajax({
					url : "/deleteProc.rp"
					, type : "post"
					, data : {seq_reply: seq_reply, seq_board: "${dto.seq_board}"}
					, success : function(data){
						console.log(data);
						
						if(data === "fail"){
							alert("댓글 삭제에 실패했습니다.");
						}else{ // 댓글 삭제에 성공했다면 댓글 목록을 새롭게 다시 뿌려줌
							makeReply(data);
						}
					}, error : function(e){
						console.log(e);
					}
						
				})
			}
		});	
	
		// 댓글 등록
		$("#btnSubmitReply").on("click", function(){
			if($("#inputReply").val() === ""){ // 댓글 입력창이 비어있다면
				alert("입력된 댓글이 없습니다.");
				return;
			}
			
			// ajax를 이용해서 form 전송
			let data = $("#formReply").serialize(); //전송할 수 있는 데이터로 변환
			console.log(data);
			$("#inputReply").val("");
			
			$.ajax({
				url : "/insert.rp"
				, type : "post"
				, data : data
				// 만약 서버에서 응답해주는 값이 일반 text일 수도 있고
				// json 형식일 수도 있다면 dataType을 명시하지 않는다.
				, success: function(rs){
					console.log(rs);
					if(rs === "fail"){ // 댓글등록에 실패했거나
						alert("댓글 등록에 실패했습니다.");
					}else{ // json형식의 데이터가 넘어오거나(댓글리스트)
						makeReply(rs);
					}
				}, error: function(e){
					console.log(e);
				}
			})
			
		})
		
		function makeReply(rs){
			/* json 형식의 문자열을 JSON.parse()
			함수를 통해서 자바스크립트 객체 형식으로 변환 */
			let list = JSON.parse(rs); // 함수의 매개변수로 받아온 json 형식의 문자열 실제 json 타입으로 변환 
			console.log(list);
			
			// 넘겨받은 최신 댓글 list를 실제 댓글 목록에 다시 뿌려주는 작업 
			$(".body-reply").empty(); // 기존에 있던 댓글 모두 지워주는 작업
			
			// list = []; 댓글이 없는 상황을 만드는 테스트용 코드
			if(list.length == 0){ // 댓글이 없다면 등록된 댓글이 없습니다 띄워주기.
				let p = $("<p>").addClass("text-center").html("등록된 댓글이 없습니다.");
				let div = $("<div>").addClass("col-12");
				div.append(p);
				$(".body-reply").append(div);
			}else{ // 댓글이 있다면 댓글 목록 만들어서 append 해주기
				for(let reply of list){
					// 댓글 타이틀 부분 요소 만들기
					let writer = $("<span>").addClass("writer-reply").html(reply.writer_nickname);
					let date = $("<span>").addClass("date-reply").html(reply.written_date);
					let header = $("<div>").addClass("col-12 body-header-reply");
					header.append(writer, date);
					
					// 댓글 내용 요소 만들기
					let textarea = $("<textarea>").attr({class: "form-control content-reply", readonly: true}).val(reply.content);
					let content = $("<div>").addClass("col-9 body-content-reply");
					content.append(textarea);
					
					$(".body-reply").append(header, content); // 작성자와 같은지 여부 상관없이 댓글은 띄워주기
					
					// 댓글작성자 id와 로그인한 사람의 id가 같다면 수정삭제버튼 요소 만들기
					if(reply.writer_id === "${loginSession.id}"){
						// 수정삭제 버튼 요소
						let modifyBtn = $("<button>").addClass("btn btn-warning modify-reply").html("수정");
						let deleteBtn = $("<button>").addClass("btn btn-danger delete-reply").html("삭제").val(reply.seq_reply);
						let btn1 = $("<div>").addClass("col-3 body-btnDefault-reply");
						btn1.append(modifyBtn, deleteBtn);
						// 취소확인 버튼 요소
						let cancelBtn = $("<button>").addClass("btn btn-secondary cancel-reply").html("취소");
						let completeBtn = $("<button>").addClass("btn btn-primary complete-reply").html("완료").val(reply.seq_reply);
						let btn2 = $("<div>").addClass("col-3 body-btnAfter-reply");
						btn2.append(cancelBtn, completeBtn);
						
						$(".body-reply").append(btn1, btn2); //작성자와 같다면 실제 요소를 html영역에 추가하기 
					}							
				}
			}
		}
		
        // 뒤로가기 버튼 
        $("#btnBack").on("click", function() {
			location.href = "/board.bo";
		});
	</script>
</body>
</html>