package com.kh.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.dao.WebDAO;
import com.kh.dto.WebDTO;

@WebServlet("*.post")
public class PostController extends HttpServlet {
	/* 1.하나의 객체(DTO)를 대표할 수 있는 Controller (Servlet) 생성
	 * 2. 하나의 객체와 관련됨 기능을 요청하기 위해 일관된 url 패턴을 생성 ~.post
	 * 3. 프론트 컨트롤러의 annotation yrl 값을 .post로 끝나는 모든 요청을 받아줄수있게 *.post 형식으로 잡아준다.
	 * *앞에 / 붙이지 않음.
	 * 4. 하나의 객체 기능과 관련된 클라이언트의 요청값을 모두 .post 끝나게끔 잡아줌.
	 * 5. doAction() 메서드 생성
	 * 6. doGet, doPost가 무조건 doAction 메서드를 호출하도록 만듬
	 * 7. doAction 메서드 내부에서 요청url 에 대한 분석
	 * 8. if문을 통해서 기능을 분리
	 * 
	 * */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//클라이언트가 보낸 요청 url
		String uri = request.getRequestURI();
		System.out.println("uri : " + uri);
		
		if(uri.equals("/toInput.post")) {//input 페이지 요청
			response.sendRedirect("/input.jsp");
		}else if(uri.equals("/input.post")) {//insert 제대로 수행된 경우
			
			// 요청값에 대한 인코딩 처리
			request.setCharacterEncoding("utf-8");
			System.out.println("input 접속완료!");
			
			String id = request.getParameter("id");
			String post = request.getParameter("post");
			
			System.out.println("id : " + id);
			System.out.println("post : " + post);
			
			WebDAO dao = new WebDAO();
			try {
				int rs = dao.insert(new WebDTO(0, id, post));
				if(rs > 0) { // insert 제대로 수행된 경우
					System.out.println("메세지 저장 완료!");
				
				}else { // insert 제대로 수행X
					System.out.println("메세지 저장 실패!");
					
				}
				/*redirect
				 * - request, response 가 유지되자 않음
				 * - url 값이 변화함
				 * 
				 * forward
				 * -request, response가 유지됨
				 * -url 값도 처음 요청 url 값이 유지됨
				 * -> 새로고침을 하게 되면 중복된 데이터의 입력/삭제/수정이 일어날 수 잇음
				 * */
				response.sendRedirect("/index.jsp");
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}else if(uri.equals("/toOutput.post")) {
			System.out.println("toOutput.proc 접속완료!");
			WebDAO dao = new WebDAO();

			try {
				ArrayList<WebDTO> list = dao.selectAll();
				request.setAttribute("list", list);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// request.getRequestDispatcher(request를 전달할 경로값)
			request.getRequestDispatcher("/output.jsp").forward(request, response);

		}else if(uri.equals("/delete.post")) {
			request.setCharacterEncoding("utf-8");
			
			int no = Integer.parseInt(request.getParameter("no"));
			System.out.println("완료!");
//			System.out.println("no : " + no);
			WebDAO dao = new WebDAO();
			try {
				int rs = dao.delete(no);
				if(rs>0) {
					System.out.println("no : " + no);
					response.sendRedirect("/toOutput.post");
					
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(uri.endsWith("/modify.post")) {
			request.setCharacterEncoding("utf-8");
			System.out.println("접속완료!");
			int no = Integer.parseInt(request.getParameter("no"));
			
			System.out.println("no : " + no);
		
			//1. DAO에게 no 를 넘겨서 그 no에 해당하는 행의 데이터를 조회
			WebDAO dao = new WebDAO();
			try {
				WebDTO dto= dao.selectByNo(no);
				
				// 2. 조회해온 데이터 (DTO)를 modify.jsp에게 넘겨줌
				if(dto != null) {// 조회된 값이 있다면 modify. jsp에게 넘겨줌
					request.setAttribute("dto", dto);
					request.getRequestDispatcher("modify.jsp").forward(request, response);
					//response.sendRedirect("/output.jsp");
				}else {//조회된 값이 없는경우
					response.sendRedirect("/toOutput.post");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(uri.equals("/modyfyProc.post")) {
			request.setCharacterEncoding("utf-8");
			System.out.println("접속완료!");
			
			int no = Integer.parseInt(request.getParameter("no"));
			String id = request.getParameter("id");
			String post = request.getParameter("post");
			
			System.out.println(no + " : " + id + " : " + post );
			
			WebDAO dao = new WebDAO();
			try {
				int rs = dao.modifyByNo(new WebDTO(no, id, post));
				if(rs>0) {
					response.sendRedirect("/toOutput.post");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
}
