package com.intro.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.intor.dao.MessageDTO;
import com.intor.dto.MessageDAO;

@WebServlet("/insert")
public class InsertController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 요청값에 대한 인코딩 처리
		request.setCharacterEncoding("utf-8");
		System.out.println("insert 서블릿 입장!");
		String nickname = request.getParameter("nickname");
		String message = request.getParameter("message");
		
		System.out.println(nickname + " : " + message);
		
		MessageDAO dao = new MessageDAO();
		
		try {
			int rs = dao.insert(new MessageDTO(0, nickname, message));
			System.out.println("성공!");
			response.sendRedirect("/home");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
