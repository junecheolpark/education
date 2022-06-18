package com.kh.serblet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.dao.CafeDAO;
import com.kh.dto.CafeDTO;

@WebServlet("*.cafe")
public class CafeController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String uri = request.getRequestURI();
		System.out.println("uri : " + uri);
		
		if(uri.equals("/toOutput.cafe")) {
			System.out.println("toOutput.cafe 접속완료!");
			CafeDAO dao = new CafeDAO();

			try {
				ArrayList<CafeDTO> list = dao.selectAll();
				request.setAttribute("list", list);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// request.getRequestDispatcher(request를 전달할 경로값)
			request.getRequestDispatcher("/list.jsp").forward(request, response);

		}else if (uri.equals("/input.cafe")) {
			
		}
	
	}
	
	
	
	
	
	}
