<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Output</title>
</head>
<body>

	<%-- EL(Expression Language)
		: servlet(controller)로부터 넘겨받은 request안에 있는 값을 꺼내서 
		사용하기 위해 필요한 언어
		
		 ${key} : controller에서 setting 해줬던 key 값을 ${}안에 너기면
	 	-> 그 key 값에 해당하는 값이 반환
	 	!!!**  주석처리시 오류남
	 	--%>

	<%-- 데이터 전달
	 <input type="text" value="${temp}">
	 <input type="text" value="${number}">
	 --%>

	<%-- 객체단위의 데이터 전달
	  ${dto}<br>
	 ${dto.getId()}<br>
	 ${dto.getNickname()}<br>
	 ${dto.getMessage()}
	  --%>


	<%-- 
	 	배열/리스트 for문 돌리기 위해서 라이브러리 추가
	 	JSTL(Jsp / Java Tag Library
	 	-> script 영역이 아닌곳에서 for문/ if문을 사용할 수 있게해줌
	 	
	 	-> JSTL 라이브러리 다운로드 후 프로젝트에 추가
	 	-> 라이브러리 사용하려는 jsp 파일 내에서 import 작업
	 	 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	 	 
	 	 forEach -> 자바의 forEach와 동일하게 동작함
	 	 items -> for문을 돌릴 리스트/배열
	 	 var -> 리스트/배열 각 인덱스에 담겨 있는 인스턴스를 담을 변수명
	 	 <c:forEach items="${list}" var="dto">
	 	 </c:forEach>
	  --%>

	<%-- 객체배열 / 리스트 단위의 데이터 전달 --%>
	
	${list}
	<table border=1 align=center>
	<tr>
		<th>ID</th>
		<th>Nickname</th>
		<th>Message</th>
	</tr>
	
	<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.getId()}</td>
			<td>${dto.getNickname()}</td>
			<td>${dto.getMessage()}}</td>
		</tr>
	</c:forEach>
	
	</table>
	

</body>
</html>