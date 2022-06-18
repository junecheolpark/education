package com.kh.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OutputServlet")
public class OutputServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("output servelt 도착!");
		String data = request.getParameter("data");
		System.out.println("data : " + data);
		
	

//	클라이언트가 응답받아야 하는 것은 html 파일
	/* reponse.getWriter() -> PrintWriter
	 *  -> PrintWriter.print() -> 인자값으로 html 코드(태그) 넘겨주면
	 * 응답값을 받은 브라우저가 print 메서드를 통해 넘어온 태ㅔ그들을 분석해 실제 페이지로 출력
	 * */
	PrintWriter out = response.getWriter();
	out.print("<html>Mhead></head><body>Hello Response!</body></html>");
	out.close();

	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
