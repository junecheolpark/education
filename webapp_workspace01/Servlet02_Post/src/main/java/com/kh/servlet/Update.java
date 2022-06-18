package com.kh.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.dao.WepDAO;
import com.kh.dto.WepDTO;


@WebServlet("/update.proc")
public class Update extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id = request.getParameter("id");
	String post = request.getParameter("post");
	
	System.out.println(id + " : " + post);
	
	WepDAO dao = new WepDAO();
	try {
		int rs = dao.update(new WepDTO(id, post));
		if(rs>0) {
			System.out.println("수정 완료!");
			response.sendRedirect("/toOutput.proc");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
