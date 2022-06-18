package com.kh.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.dao.WepDAO;


@WebServlet("/delete.proc")
public class Delete extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

	request.setCharacterEncoding("utf-8");
	
	String id = request.getParameter("id");
	System.out.println("id : " + id);
	
	WepDAO dao = new WepDAO();
	try {
		int rs = dao.delete(id);
		if(rs>0) {
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
