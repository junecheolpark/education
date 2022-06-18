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

@WebServlet("*.fi")
public class FileController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		System.out.println("요청 uri : " + uri);
		
		if(uri.equals("/download.fi")) { //파일 다운로드 요청
			String ori_name = request.getParameter("ori_name");
			String sys_name = request.getParameter("sys_name");
			System.out.println(ori_name + " : " + sys_name);
			
			// 실제 서버에 저장된 파일의 full 경로
			String filePath = request.getServletContext().getRealPath("files") + File.separator + sys_name;
			
			File file = new File(filePath); // 파일의 사이즈값 얻어내기 위함 
			
			ori_name = new String(ori_name.getBytes("utf-8"), "ISO-8859-1");
			response.setHeader("Content-disposition", "attachment; filename=\""+ ori_name + "\"");
			
			try(DataInputStream dis = new DataInputStream(new FileInputStream(filePath));
				DataOutputStream dos = new DataOutputStream(response.getOutputStream())){
				
				byte[] arr = new byte[(int)file.length()];
				dis.readFully(arr);
				
				dos.write(arr);
				dos.flush();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
