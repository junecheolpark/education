package com.board.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.dao.BoardDAO;
import com.board.dto.BoardDTO;
import com.board.dto.MemberDTO;
import com.google.gson.Gson;

@WebServlet("*.bo")
public class BoardController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println("요청 uri : " + uri);
		request.setCharacterEncoding("utf-8");
		
		
		
		if (uri.equals("/board.bo")) { //게시판페이지 요청
			// 현재 페이지 
			int curPage = Integer.parseInt(request.getParameter("curPage"));
			
			// tbl_board 테이블에서 데이터 arraylist 로 가져와 request에 담아주기 
			BoardDAO dao = new BoardDAO();
			try {
				
				HashMap map = dao.getPageNavi(curPage);
				
				System.out.println("현재 페이지 : " + curPage);
				System.out.println("startNavi : " + map.get("startNavi"));
				System.out.println("endNavi : " + map.get("endNavi"));
				System.out.println("needPrev 필요? " + map.get("needPrev"));
				System.out.println("needNext 필요? " + map.get("needNext"));
							
				/* 현재 페이지가 몇 페이지 ? 
				 * 	1 -> start = 1 / end = 10
					3 -> start = 21 / end = 30
					14 -> start = 131 / end = 140
					
					start -> 현재페이지 * 10 - 9
					end = 현재페이지 * 10(한페이지에 총 몇개의 데이터를 뿌려줄건지) 
				*/				
				ArrayList<BoardDTO> list = dao.selectAll(curPage*10-9, curPage*10);
				request.setAttribute("list", list);
				request.setAttribute("naviMap", map);
			}catch(Exception e) {
				e.printStackTrace();
			}			
			request.getRequestDispatcher("/board/board.jsp").forward(request, response);
		}else if(uri.equals("/write.bo")) { // 글쓰기페이지 요청
			response.sendRedirect("/board/write.jsp");
		}else if(uri.equals("/writeProc.bo")) { // 글쓰기 요청
			
			String filePath = request.getServletContext().getRealPath("files");
			System.out.println("filePath : " + filePath);
			
			File dir = new File(filePath);
			if(!dir.exists()) {
				dir.mkdirs();
			}
			
			int maxSize = 1024*1024*10;
			
			try {
				// 서버의 경로에 파일 저장하기 
				MultipartRequest multi = new MultipartRequest(request,filePath,maxSize,"utf-8",new DefaultFileRenamePolicy());
				
				// 세션에서 닉네임, 아이디 뽑아내기
				MemberDTO dto = (MemberDTO)request.getSession().getAttribute("loginSession");
				String writer_nickname = dto.getNickname();
				String writer_id = dto.getId();
				
				// MultipartRequest 에서 제목, 내용 뽑아내기
				String title = multi.getParameter("title");
				String content = multi.getParameter("content");
				
				// MultipartRequest에서 파일태그의 name을 이용해 원본파일명, 실제 서버에 저장된 파일이름 뽑아내기
				String ori_name = multi.getOriginalFileName("file");
				String sys_name = multi.getFilesystemName("file");
	
				System.out.println(writer_nickname + " : " + writer_id + " : " + title
						+ " : " + content+ " : " + ori_name+ " : " + sys_name);
	
				BoardDAO dao = new BoardDAO();
				FileDAO daoFile = new FileDAO();
				
				try {
					// 게시글과 파일 데이터 저장하기 위해 새로운 게시글 번호 뽑아내기
					int seq_board = dao.getNewSeq();
					System.out.println("seq_board : " + seq_board);
					
					// 위에서 뽑아낸 게시글 번호를 활용하여 게시글, 파일 정보 DB에 저장 
					int rs = dao.write(new BoardDTO(seq_board,title,content,writer_nickname,writer_id,0,null));
					int rsFile = daoFile.insert(new FileDTO(0, seq_board, ori_name, sys_name));
					
					if(rs > 0 && rsFile > 0) {
						response.sendRedirect("/board.bo?curPage=1");
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}			
		}else if(uri.equals("/detailView.bo")) { //상세보기페이지 요청
			int seq_board = Integer.parseInt(request.getParameter("seq_board"));
			System.out.println("seq_board : " + seq_board);
			BoardDAO boardDAO = new BoardDAO();
			FileDAO fileDAO = new FileDAO();
			
			try {
				// 조회수를 +1 
				boardDAO.updateView_count(seq_board);
				// 상세보기 페이지를 뿌려주기 위한 작업
				BoardDTO dto = boardDAO.selectBySeq(seq_board);
				request.setAttribute("dto", dto);
				
				// 게시글에 첨부된 파일 정보 가져오기
				FileDTO dtoFile = fileDAO.select(seq_board);
				request.setAttribute("file", dtoFile);
				
				// 게시글에 해당하는 댓글을 가져와 담아주는 작업
				ReplyDAO replyDAO = new ReplyDAO();
				ArrayList<ReplyDTO> list = replyDAO.selectAll(seq_board);
				request.setAttribute("replyList", list);
			}catch(Exception e) {
				e.printStackTrace();
			}
			request.getRequestDispatcher("/board/detailView.jsp").forward(request, response);
		}else if(uri.equals("/modify.bo")) {// 수정 페이지 요청
			int seq_board = Integer.parseInt(request.getParameter("seq_board"));
			System.out.println("seq_board : " + seq_board);

			BoardDAO dao = new BoardDAO();
			try {
				BoardDTO dto = dao.selectBySeq(seq_board);
				request.setAttribute("dto", dto);
			}catch(Exception e) {
				e.printStackTrace();
			}

			request.getRequestDispatcher("/board/modify.jsp").forward(request, response);
		}else if(uri.equals("/modifyProc.bo")) { // 수정 요청
			int seq_board = Integer.parseInt(request.getParameter("seq_board"));
			String title = request.getParameter("title");
			String content = request.getParameter("content");

			BoardDAO dao = new BoardDAO();
			try {
				int rs = dao.modify(new BoardDTO(seq_board,title,content,null,null,0,null));
				if(rs > 0) {
					// 수정된 값을 바로 확인가능하게끔 상세페이지 요청
					response.sendRedirect("/detailView.bo?seq_board="+seq_board);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(uri.equals("/deleteProc.bo")) {// 삭제 요청
			int seq_board = Integer.parseInt(request.getParameter("seq_board"));
			System.out.println("seq_board :" + seq_board);

			BoardDAO dao = new BoardDAO();
			// 시퀀스번호 이용해 tbl_board에서 게시글 삭제
			try {
				int rs = dao.delete(seq_board);
				if(rs > 0) {
					// 삭제완료 후에는 게시글 목록을 요청하도록.
					response.sendRedirect("/board.bo");
				}
			}catch(Exception e) {	
				e.printStackTrace();
			}
		}else if(uri.equals("/searchProc.bo")) { //제목 검색 요청
			String searchKeyword = request.getParameter("searchKeyword");
			System.out.println("keyword : " + searchKeyword);
			
			BoardDAO dao = new BoardDAO();
			try {
				ArrayList<BoardDTO> list = dao.searchByTitle(searchKeyword);
				Gson gson = new Gson();
				String rs = gson.toJson(list);
				System.out.println(rs);
				response.setCharacterEncoding("utf-8");
				response.getWriter().append(rs);				
			}catch(Exception e) {
				e.printStackTrace();
			}			
		}
	}
}
















