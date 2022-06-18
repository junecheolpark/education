package com.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.board.dao.MemberDAO;
import com.board.dto.MemberDTO;
import com.board.utils.EncryptionUtils;

@WebServlet("*.mem")
public class MemberController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// 클라이언트의 요청 url 
		String uri = request.getRequestURI();
		System.out.println("요청 uri : " + uri);
		
		request.setCharacterEncoding("utf-8");
		
		if(uri.equals("/toSignup.mem")) { // 회원가입 페이지 요청
			response.sendRedirect("/member/signup.jsp");
		}else if(uri.equals("/idCheckPopup.mem")) { // 아이디 중복확인 팝업 페이지 요청
			response.sendRedirect("/member/popup.jsp");
		}else if(uri.equals("/checkId.mem")) { //아이디 중복확인 요청
			String id = request.getParameter("id");
			System.out.println("id : " + id);
			
			MemberDAO dao = new MemberDAO();
			try {
				boolean rs = dao.checkId(id);
				System.out.println("rs : " + rs);
				
				if(rs) { // 사용할 수 있는 아이디라면
					request.setAttribute("rs", "ok");
				}else { // 중복된 아이디라면
					request.setAttribute("rs", "no");
				}
				request.setAttribute("id", id);
				request.getRequestDispatcher("/member/popup.jsp").forward(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(uri.equals("/signupProc.mem")) { // 회원가입 요청			
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String nickname = request.getParameter("nickname");
			String phone = request.getParameter("phone");
			String postCode = request.getParameter("postCode");
			String roadAddr = request.getParameter("roadAddr");
			String detailAddr = request.getParameter("detailAddr");
			String extraAddr = request.getParameter("extraAddr");
			
			System.out.println(id+" : "+pw+" : "+nickname+" : "+phone
					+" : "+postCode+" : "+ roadAddr+" : "+detailAddr+" : "+extraAddr);
		
			MemberDAO dao = new MemberDAO();
			try {
//				pw = EncryptionUtils.getSHA512(pw);
				System.out.println("암호화된 데이터 : " + pw);
				
				int rs = dao.signup(new MemberDTO(id,pw,nickname,phone,postCode,roadAddr,detailAddr,extraAddr));
				if(rs > 0) {
					response.sendRedirect("/");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(uri.equals("/loginProc.mem")) { // 로그인 요청
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			System.out.println(id + " : " + pw);
			
			MemberDAO dao = new MemberDAO();
			try {
//				pw = EncryptionUtils.getSHA512(pw);
				System.out.println("암호화된 비번 : " + pw);
				
				MemberDTO dto = dao.isLoginOk(id, pw);
				if(dto != null) { //로그인 성공
					System.out.println("로그인 성공");
					request.setAttribute("rs", true);
					HttpSession session = request.getSession();
					session.setAttribute("loginSession", dto);
				}else {// 로그인 실패
					System.out.println("로그인 실패");
					request.setAttribute("rs", false);
				}
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(uri.equals("/logoutProc.mem")) {// 로그아웃 요청
			// 지금 요청을 보낸 클라이언트의 세션 얻어오기
			HttpSession session = request.getSession();
			// session.getAttribute("세션의 key");-> key에 담긴 값 가져오기
			System.out.println(session.getAttribute("loginSession"));
			
			// 1. session 객체를 초기화
			session.invalidate();
			response.sendRedirect("/index.jsp");
			
			// 2. session 저장소에서 loginSession 값만 삭제
//			session.removeAttribute("loginSession");
//			response.sendRedirect("/index.jsp");
			
		}else if(uri.equals("/myPage.mem")) { //마이페이지 요청
			HttpSession session = request.getSession();
			String id = ((MemberDTO)session.getAttribute("loginSession")).getId();
			
			System.out.println("id : " + id);
		
			MemberDAO dao = new MemberDAO();
			try {
				MemberDTO dto = dao.selectById(id);				
				
				request.setAttribute("dto", dto);
				request.getRequestDispatcher("/member/myPage.jsp").forward(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(uri.equals("/modifyProc.mem")) {//정보수정 요청
			HttpSession session = request.getSession();
			String id = ((MemberDTO)session.getAttribute("loginSession")).getId();
			String nickname = request.getParameter("nickname");
			String phone = request.getParameter("phone");
			String postCode = request.getParameter("postCode");
			String roadAddr = request.getParameter("roadAddr");
			String detailAddr = request.getParameter("detailAddr");
			String extraAddr = request.getParameter("extraAddr");
			
			System.out.println(id+":"+nickname+":"+phone
					+":"+postCode+":"+roadAddr+":"+detailAddr+":"+extraAddr);
			
			MemberDAO dao = new MemberDAO();
			try {
				int rs = dao.modify(new MemberDTO(id, null, nickname, phone, postCode, roadAddr, detailAddr, extraAddr));
				if(rs > 0) {
					response.sendRedirect("/myPage.mem");
				}
			}catch(Exception e) {
				
			}
		}
	}
}
