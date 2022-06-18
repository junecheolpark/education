package com.kh.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.dao.MessageDAO;

@WebServlet("/delete.proc")
public class delete extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		request 에 대한 인코딩 설정 (한글 깨짐방지)
		request.setCharacterEncoding("utf-8");
		
		String nickname = request.getParameter("nickname");
		System.out.println("nickname : "+ nickname);
		
		MessageDAO dao = new MessageDAO();
		try {
			int rs = dao.delete(nickname);
			if(rs>0) {
				response.sendRedirect("/toOutput.proc");
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
