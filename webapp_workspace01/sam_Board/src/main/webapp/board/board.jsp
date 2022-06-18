<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<title>게시글 목록</title>
<style>
	.container{
		width: 90%;
		padding: 10px;
	}
	th, td{
		text-align: center;
	}
	td:nth-child(2){
		text-align: left;
	}
	a{
		text-decoration: none;
		font-weight: bold;
		color: black;
	}
	.boxBtn-bottom{
		text-align: center;
	}
</style>
</head>
<body>
	<div class="container">
		<div class="row boxBtn-top">
			<div class="col d-flex justify-content-end">
				<button type="button" id="btnLogout" class="btn btn-danger">로그아웃</button>
				<button class="btn btn-warning" id="btnWrite" type="button">글쓰기</button>
			</div>
	    </div>
	    <div class="row m-2">
	    	<div class="col-9 d-flex justify-content-end">
	    		<input type="text" id="searchKeyword" class="form-control" placeholder="제목 입력">
	    	</div>
	    	<div class="col-3 d-flex justify-content-center">
	    		<button type="button" id="searchBtn" class="btn btn-info">검색</button>
	    	</div>
	    </div>
	</div>
    
	<div class="container">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th class="col-md-1">글번호</th>
					<th class="col-md-5">제목</th>
					<th class="col-md-2">글쓴이</th>
					<th class="col-md-3">작성일</th>
					<th class="col-md-1">조회수</th>
				</tr>
			</thead>
			<tbody class="body-board">
				<c:choose>
					<c:when test="${list.size() == 0}">
						<tr>
							<td colspan=5>등록된 게시글이 없습니다.</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach items="${list}" var="dto">
							<tr>
								<td>${dto.seq_board}</td>
								<td><a href="/detailView.bo?seq_board=${dto.seq_board}">${dto.title}</a></td>
								<td>${dto.writer_nickname}</td>
								<td>${dto.written_date}</td>
								<td>${dto.view_count}</td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
	</div>
	
	<nav>
	  <ul class="pagination justify-content-center">
	  	<c:if test="${naviMap.needPrev eq true}">
	  		 <li class="page-item"><a class="page-link" href="/board.bo?curPage=${naviMap.startNavi-1}">Prev</a></li>
	  		 <%-- 현재 6페이지에 있는 상태에서 이전 버튼을 클릭했음 ->  5페이지로 이동 --%>
	  	</c:if>
	    
	    <c:forEach var="pageNum" begin="${naviMap.startNavi}" end="${naviMap.endNavi}" step="1">
	    	<li class="page-item"><a class="page-link" href="/board.bo?curPage=${pageNum}">${pageNum}</a></li>
	    </c:forEach>
	    
	    <c:if test="${naviMap.needNext eq true}">
	    	 <li class="page-item"><a class="page-link" href="/board.bo?curPage=${naviMap.endNavi+1}">Next</a></li>
	    </c:if>	    
	  </ul>
	</nav>
	
    <div class="boxBtn-bottom">
        <button class="btn btn-success" id="btnHome" type="button">홈으로</button>
    </div>
    
    <script>
    	$("#searchBtn").on("click", function(){ // 검색 버튼 클릭 시
    		// 검색어키워드 값을 가져오기
    		let searchKeyword = $("#searchKeyword").val();
    		console.log(searchKeyword);
    		// /searchProc.bo?searchKeyword=...
    		$.ajax({
    			url: "/searchProc.bo?searchKeyword="+searchKeyword
    			, type: "get"
    			, dataType: "json"
    			, success: function(data){
    				$(".body-board").empty(); // 기존 게시글 목록 모두 삭제
    				if(data.length == 0){ // 검색된 결과가 없다면
    					let tr = $("<tr>");
    					let td = $("<td colspan=5>").html("검색된 게시글이 없습니다.");
    					tr.append(td);
    					$(".body-board").append(tr);
    				}else{ // 검색된 결과가 있다면
    					for(let dto of data){ // 배열을 for문을 돌리면서 객체 하나씩 꺼내서 dto에 담기 
    						let tr = $("<tr>");
    						let td1 = $("<td>").html(dto.seq_board);
    						let anchor = $("<a>").attr("href", "/detailView.bo?seq_board="+dto.seq_board).html(dto.title);
    						let td2 = $("<td>").append(anchor);
    						let td3 = $("<td>").html(dto.writer_nickname);
    						let td4 = $("<td>").html(dto.written_date);
    						let td5 = $("<td>").html(dto.view_count);
    						tr.append(td1, td2, td3, td4, td5);
    						$(".body-board").append(tr);
    					}   					
    				}	
    			}, error: function(e){
    				console.log(e);
    			}
    		});
    		$.ajax({
    			url: "/searchProc.bo?searchKeyword="+searchKeyword
    			, type: "post"
    			, dataType: "json"
    			, success: function(data){
    				console.log()
    			}, error: function(e){
    				console.log(e);
    			}
    		});
    		
    	})
    	/* A요소를 기준으로 
    	A.empty() -> A라는 요소를 기준으로 모든 하위요소를 삭제 = A요소는 유지 
    	A.remove() -> A라는 요소 자체를 삭제 -> 그에따라 하위요소도 모두 함께 삭제 */
    
    	const btnHome = document.getElementById("btnHome");
    	const btnWrite = document.getElementById("btnWrite");
    	const btnLogout = document.getElementById("btnLogout");
    	
    	btnHome.addEventListener("click", function(e){
    		location.href = "/";
    	});
    	
    	btnWrite.addEventListener("click", function(e){
    		location.href="/write.bo";
    	})
    	
    	// 로그아웃
		btnLogout.addEventListener("click", function(e){
			location.href = "/logoutProc.mem";
		});
    </script>
</body>
</html>