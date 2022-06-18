package com.network.download01;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	public static void main(String[] args) {
//서버에 있는 파일을 클라이언트가 다운
		/*
		 * 서버 가동 > 클라이언트 접속 > 클라이언트용 소켓 생성 서버의 
		 * hdd엥 잇는 파일을 서버 프로그램으로 읽어오기(입력) 불러들여온 파일을
		 * 클라이언트에 전송
		 */
		String path = "C:\\Users\\park\\Desktop\\codingclass\\";
		String fileName = "coding.jpg";
		try (ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				FileInputStream fis = new FileInputStream(path + fileName);
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());) {

			byte[] arr = fis.readAllBytes();
			System.out.println("보낼 파일 크기: " + arr.length);
			// 클라이언트에게 파일전송
			//1. 데이터의 크기를 먼저 전송 > 클라이언트가 사이즈를 받아 바이트 배열을 만들고
			//2. 데이터를 전송> 위의 배열에다가 데이터를 받아줌.
			dos.writeInt(arr.length);
			dos.write(arr);
			dos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
