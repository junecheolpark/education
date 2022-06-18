<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
	*{box-sizing:border-box}
	.row{
		border: 1px solid lightgrey;
	}
	.row:nth-child(1){
		height: 150px;
	}
	.row:nth-child(2){
		height: 500px;
	}
    .title{
        padding: 10px;
        text-align: center;
    }
    .boxBtn{
        height: 10%;
    }
	.container{
		width: 80%;
        height: 100%;
		padding: 10px;
	}
    form, table{
        height: 100%;
        text-align: center;
    }
    tr:first-child{
        height: 10%;
    }
    input{
        width: 100%;
        height: 100%;
    }
	textarea{
		width: 100%;
        height: 100%;
		resize: none;
	}
    .boxBtn{
        text-align: center;
    }
</style>
</head>
<body>
    <div class="title">
        <h3>정보수정</h3>
    </div>
    <form id="modifyForm" action="/modifyProc.bo" method="post">
	    <div class="container">
	    	<div class="row">
	    		<div class="col-2 d-flex justify-content-center align-items-center">
	    			<h4>제목</h4>
	    		</div>
	    		<div class="col-10 p-2">
	    			<input type="text" class="form-control" id="title" name="title" value="${dto.title}">
	    		</div>
	    		<div class="col-10 p-2 d-none">
	    			<input type="text" class="form-control" name="seq_board" value="${dto.seq_board}">
	    		</div>
	    	</div>
	    	<div class="row">
	    		<div class="col-2 d-flex justify-content-center align-items-center">
	    			<h4>내용</h4>
	    		</div>
	    		<div class="col-10 p-2">
	    			<textarea id="content" class="form-control" id="content" name="content">${dto.content }</textarea>
	    		</div>
	    	</div>
	    </div>
    </form>
    <div class="boxBtn">
        <button type="button" class="btn btn-secondary" id="btnBack">뒤로가기</button>
        <button type="button" class="btn btn-primary" id="btnComplete">수정완료</button>
    </div>

    <script>
    $("#btnComplete").on("click", function(){
		// 만약 제목을 입력하지 않았다면 title "제목없음" 이라는 타이틀 값을 넣어줌.
		if($("#title").val() === ""){
			$("#title").val("제목없음");
		}
		// 내용이 비어있으면 내용을 입력하세요.
		if($("#content").val() === ""){
			alert("내용을 입력하세요.");
			$("#content").focus();
			return;
		}
		$("#modifyForm").submit();
	})
	 $("#btnBack").on("click", function(){
		 location.href = "/detailView.bo?seq_board=${dto.seq_board}";
	 })
    </script>
</body>
</html>