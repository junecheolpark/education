package com.kh.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {
//	클라이언트가 get방식으로 요청을 보내면 doGet 메서드가 실행
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//	request -> 클라이언트가 보낸 데이터를 꺼내는 작업
//	request.getParameter(name값/key값) : name/key 에 해당하는 value 를 String으로 반환
		String msg = request.getParameter("msg");
		System.out.println("doGet : " + msg);
	}

//	클라이언트가 post방식으로 요청을 보내면 doPost 메서드 실행
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String msg = request.getParameter("msg");
		System.out.println("doPost : " + msg);
		
		doGet(request, response);
	}

}
