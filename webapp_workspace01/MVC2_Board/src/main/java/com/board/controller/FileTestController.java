package com.board.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("*.file")
public class FileTestController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		System.out.println("요청 uri : " + uri);
		
		if(uri.equals("/upload1.file")) {
			System.out.println("파일 업로드 요청");
//			String file = request.getParameter("file");
//			System.out.println("file : " + file);
			/* file request를 받았을때에는 HttpServletRequest 로 데이터를 받아줄 수 없음
			 * 
			 * DB에 파일을 저장하지 않을 것 -> 서버의 컴퓨터(물리적 경로)에 저장
			 * -> tomcat이 실행되고 있는 root 경로  ->  이 안에 files 폴더 만들어 파일을 저장 
			 * DB-> 실제 서버의 컴퓨터에 저장된 파일의 경로값만 저장 
			 * 
			 * controller는 클라이언트에게 요청받은 파일이 있다면 DB에 저장된 경로값을 꺼내서
			 * InputStream을 이용해 해당 파일을 프로그램으로 불러들여오고, 그 후 클라이언트에게 응답 
			 * 
			 * */	
			// 1. 서버의 root 경로 
			String realPath = request.getServletContext().getRealPath("");
			System.out.println("realPath : " + realPath);
			
			// 2. 서버의 루트에 실제 파일이 저장될 경로값 만들어주기
			String filePath = request.getServletContext().getRealPath("files");
			System.out.println("filePath : " + filePath);
			
			// 3. File을 이용해 실제 위의 경로값이 존재하는지 체크 -> 없다면 폴더 생성 
			File dir = new File(filePath);
			if(!dir.exists()) {
				System.out.println("폴더 생성!");
				dir.mkdirs();
			}
			
			// 4. 업로드할 파일의 최대크기를 얼마로 지정해줄지 
			// 1MB = 1024 * 1024 * 1
			// 10MB = 1024 * 1024 * 10
			int maxSize = 1024 * 1024 * 10;
			
			// MultipartRequest 객체 생성하는 작업 -> 바로 파일의 업로드가 이뤄짐. 
			// MultipartRequest(request, 파일 저장경로, 파일 최대 크기, 인코딩, 파일 이름 중복 처리 방지)
			MultipartRequest multi = new MultipartRequest(request,filePath,maxSize,"utf-8", new DefaultFileRenamePolicy());
			
			// 업로드된 파일의 원본파일명 
			// 파일 다운로드 기능을 구현할때 만약 첨부파일의 목록을 띄워준다면
			// 처음 업로드됐던 파일의 원본명을 띄워주기 위한 용도로 originalfilename이 필요 
			String ori_name = multi.getOriginalFileName("file");	
			
			// 실제 서버 경로에 업로드된 파일명
			// 만약 파일을 다시 다운로드하는 작업을 할때 
			// 요청된 파일을 실제 서버 경로에서 가져오려면 파일의 경로값의 역할을 해주는 filesystemname이 필요
			String sys_name = multi.getFilesystemName("file");
			
			System.out.println("ori_name : " + ori_name);
			System.out.println("sys_name : " + sys_name);
			
		}else if(uri.equals("/upload2.file")) {
			String filePath = request.getServletContext().getRealPath("files");
			System.out.println("filePath : " + filePath);
			
			File dir = new File(filePath);
			if(!dir.exists()) {
				dir.mkdirs();
			}
			
			int maxSize = 1024*1024*10;
			
			try {
				MultipartRequest multi = new MultipartRequest(request, filePath, maxSize, "utf-8", new DefaultFileRenamePolicy());
				
				String ori_name1 = multi.getOriginalFileName("file1");
				String sys_name1 = multi.getFilesystemName("file1");
				System.out.println(ori_name1 + " : " + sys_name1);
				
				String ori_name2 = multi.getOriginalFileName("file2");
				String sys_name2 = multi.getFilesystemName("file2");
				System.out.println(ori_name2 + " : " + sys_name2);
				
			}catch(Exception e) {
				e.printStackTrace();
			}		
		}else if(uri.equals("/upload3.file")) {
			// form 인코딩 타입이 multipart/form-data 일 때는 
			// 보내주는 텍스트 데이터를 일반 request 로 받아줄 수 없음
//			String title = request.getParameter("title");
//			String message = request.getParameter("message");
//			System.out.println(title + " : " + message);
			
			String filePath = request.getServletContext().getRealPath("files");
			
			File dir = new File(filePath);
			if(!dir.exists()) {
				dir.mkdirs();
			}
			int maxSize = 1024*1024*10;
			
			try {
			
				MultipartRequest multi = new MultipartRequest(request, filePath, maxSize, "utf-8", new DefaultFileRenamePolicy());
				
				String ori_name = multi.getOriginalFileName("file1");
				String sys_name = multi.getFilesystemName("file1");
				System.out.println("파일명: " + ori_name + " : " + sys_name);
				
				String title = multi.getParameter("title");
				String message = multi.getParameter("message");
				System.out.println(title + " : " + message);
				
			}catch(Exception e) {
				e.printStackTrace();
			}			
		}else if(uri.equals("/download.file")) { // 다운로드 요청 
			System.out.println("다운로드 요청! ");
			/* 
			 * 특정 파일의 다운로드 요청 -> 서버에 실제 저장된 파일명 
			 * 실제 파일이 저장되어 있는 서버의 경로 값(files 폴더 + 파일명) 
			 * 경로값을 이용해 InputStream을 통해 서버프로그램으로 HDD에 존재하는 파일을 읽어들여옴
			 * 서버 프로그램과 클라이언트 사이에 OutputStream을 열어주고 파일을 전송한다.*/
		
			String fileName = "logo.png"; // 서버에 실제 저장되어있는 파일명
			String uploadFilePath = request.getServletContext().getRealPath("files");
			System.out.println("uploadFilePath : " + uploadFilePath);
			
			// File.seperator : 서버프로그램이 돌고있는 컴퓨터의 OS에 맞춰서 /를 쓸지 \를 쓸지 등(폴더의 경로구분자)을 알아서 잡아 줌. 
			String filePath = uploadFilePath + File.separator + fileName;
			System.out.println("filePath : " + filePath);
			
			// 아래에서 실제 파일을 읽어들여올때 파일의 크기값을 활용하기 위해 file 객체 생성 
			File file = new File(filePath);
			
			String ori_name = "로고.png"; // 파일의 원본파일명(파일 테이블이 있다면 거기서 얻어온 값) 
			
			// 파일명 한글깨짐 방지
			ori_name = new String(ori_name.getBytes("utf-8"), "ISO-8859-1");
			
			// response의 header 설정 -> 지금 돌아가는 응답값이 일반적이 html 이 아니라 다운로드가 이뤄져야 하는 파일이라는 것을 명시	
			response.setHeader("Content-disposition", "attachment; filename=\""+ori_name+"\"");
			// filename="logo.png" 이와 같이 생긴 문자열 만들어서 filename 속성에 값으로 넣어주기.
			
			// 서버의 HDD에 있는 파일을 서버 프로그램으로 읽어들여오고
			// 클라이언트에게 그 파일을 응답 
			try(DataInputStream dis = new DataInputStream(new FileInputStream(filePath));
				DataOutputStream dos = new DataOutputStream(response.getOutputStream())){
				
				// 비어있는 byte배열 하나 만들어 그 배열안 데이터를 한번에 불러들일 것. 
				byte[] arr = new byte[(int)file.length()];
				// datainputstream을 이용해 비어있는 배열의 파일 데이터를 불러와 담음
				dis.readFully(arr);
				
				// 클라이언트에게 파일을 응답 
				dos.write(arr);
				dos.flush();				
			}catch(Exception e) {
				e.printStackTrace();
			}			
		}
	}
}















