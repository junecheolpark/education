package com.kh.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/IntroServlet")
// 클라이언트가 요청 url을 보내면 WAS 그 url 값을 본인이 가지고 있는 서블릿과 비교를 함.
// 서블릿의 어노테이션 안쪽의 String 값과 클라이언트가 요청한 url 값 비교
// Request, Response 객체를 생성해서 url 값과 일치하는 servlet 한테 전달
public class IntroServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("서블릿 도착!");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
