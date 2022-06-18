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

<title>output</title>
<style>
table {
	width: 400px;
	height: 300px;
	text-align: center
}
</style>
</head>
<body>
	<table class="table table-hover tbl_msg">

		<thead>
			<tr>
				<th scope="col">No</th>
				<th scope="col">ID</th>
				<th scope="col">POST</th>
				<th scope="col">buttons</th>
			</tr>
		</thead>

		<tbody>
			<%-- <c:if test="${list == null}}"> --%>
			<%-- ==,eq 같다 / ne 같지않다 --%>

			<%--<c:if test="${list.size() == 0}">--%>
			<%-- ><c:if test="${empty list}">
			<!--비어있으면 true/false 숫자값은 == != -->
				<tr>
					<td colspan=3>보여줄 메세지가 없습니다.</td>
				</tr>
			</c:if>
			<c:if test="${not empty list}">
				<c:forEach items="${list}" var="dto">
					<tr>
						<td>${dto.getNo()}</td>
						<td>${dto.getId()}</td>
						<td>${dto.getPost()}</td>
					</tr>
				</c:forEach>
			</c:if>
			--%
			
			<%-- <c: choose>
					<c:when test=''> == if 문과 똑같은 역할
					</c:when>
					<c:when test=''> == else if 문과 똑같은 역할
					
					</c:when>
					
					<c:otherwise> == else 와 같은 역할
					
					</c:otherwise>
				 --%>
			<c:choose>
				<c:when test='${empty list}'>
					<tr>
						<td colspan=4 scope="row">보여줄메세지가 없습니다</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach items="${list}" var="dto">
						<tr>
							<td scope="row">${dto.getNo()}</td>
							<td>${dto.getId()}</td>
							<td>${dto.getPost()}</td>
							<td>
								<button type="button" class="btn btn-danger deleteBtn"
									value="${dto.getNo()}">삭제</button>
								<button type="button" class="btn btn-info modifyBtn"
									value="${dto.getNo()}">수정</button>
							</td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
			
			<%-- 뒤로가기 --%>
			<tr>
				<td colspan=4 scope="row">
					<button id="btnBack" type="button">Back</button>
				</td>
			</tr>
		</tbody>
	</table>
	<script>
		//수정버튼을 눌렀을때
		$(".tbl_msg").on("click", ".modifyBtn", function(){
			let no = $(this).val();
			location.href = "/modify.post?no=" + no;
		});
	
		//삭제버튼을 눌렀을때
		$(".tbl_msg").on("click", ".deleteBtn", function() {
			let seq = $(this).val();
			// 버튼이 눌렀을때 그 행에 대한 no(버튼value) 값가져오기

			// form 동적 생성
			let deleteForm = $("<form></form>");
			// form 속성 - action, method
			deleteForm.attr("action", "/delete.post");
			deleteForm.attr("method", "post");
			//데이터를 전송하기위해 form에 input 태그를 추가
			deleteForm.append($("<input>", {
				type : "text",
				name : "no",
				value : seq
			})) //value는 let no 지정해준값
			$("body").append(deleteForm);
			// body 요소에 form 요소를 실제로 추가
			$(deleteForm).appendTo("body").css("display", "none");
			// 스크립트 영역에서 만든 deleteForm 을 즉시 submit
			deleteForm.submit()

		});

		//뒤로가기버튼
		document.getElementById('btnBack').onclick = function() {
			location.href = '/index.jsp';
		}
	</script>
</body>
</html>