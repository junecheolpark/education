package com.student.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dao.StudentDAO;
import com.student.dto.StudentDTO;


@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청값에 대한 인코딩 처리
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		
		System.out.println(name + " : " + kor + " : " + eng + " : " + math);
		
		StudentDAO dao = new StudentDAO();
		
		try {
			int rs = dao.insert(new StudentDTO(0, name, kor, eng, math));
			if(rs > 0) {
				response.sendRedirect("/index.html");
			}			
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
