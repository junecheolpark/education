package com.kh.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.dao.MessageDAO;
import com.kh.dto.MessageDTO;


@WebServlet("/toOutput.proc")
public class ToOutput extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// DAO를 통해서 DB에 접속해 tbl_msg 테이블의 모든 행 ;
		MessageDAO dao = new MessageDAO();
		try {
			ArrayList<MessageDTO> list = dao.selectAll();
			//출력
			for(MessageDTO dto : list){
				System.out.println(dto.toString());
			}
			// 문서/인코딩 타입
			response.setContentType("text/html; charset=utf-8");
			//html table 로 데이터를 뿌려주는 작업
			PrintWriter out = response.getWriter();
			out.write("<html");
			out.write("<head>");
			out.write("<style>");
			out.write("*{border: 1px solid black}");
			out.write("table{ width: 400px; height: 300px; text-align:center}");
			out.write("</style>");
			out.write("</head>");
			out.write("<body>");
			out.write("<table>");
			out.write("<tr>"
					+"<th>Nickname</th>"
					+"<th>Message</th>"
					+"</tr>"
					);
			for(MessageDTO dto : list) {
				out.write("<tr>"
						+"<td>" + dto.getNickname() + "</td>"
						+"<td>" + dto.getMessage() + "</td>"
						+"</tr>");
			}
//			삭제
			out.write("<tr>"
					+ "<form action='/delete.proc' method='post'>"
					+ "<td colspan=2>"
					+"<input type='text' name='nickname' placeholder='삭제할 닉네임 입력'>"
					+"<button type='submit'>삭제</button>"
					+"</td>"
					+"</form>"
					+ "</tr>"
					);
//			수정
			out.write("<tr>");
			out.write("<form action='/update.proc' method='post'>");
			out.write("<td colspan=2>"
					+ "<input type='text' name='nickname' placeholder='수정할 닉네임 입력'><br>"
					+ "<textarea name='message' placeholder='수정할 메세지 입력'></textarea><br>"
					+ "<button type='submit'>수정</button>"
					+ "</td>");
			out.write("</form>)");
			out.write("</tr>");
//			뒤로가기
			out.write("<tr>"
					+ "<td colspan=2>"
					+"<button id='btnBack' type='button'>back</button>"
					+"</<td>"
					+ "</tr>");
			out.write("</table>");
			
			out.write("<script>");
			out.write("document.getElementById('btnBack').onclick = function(){");
			out.write("location.href = '/index.html';");
			out.write("}");
			out.write("</script>");
			
			out.write("</body>");
			out.write("</html");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
