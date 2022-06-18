package com.network.download01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {

		/* 서버가 전송한 파일 받기
		 * 클라이언트의 hdd 에 파일에 저장(출력)
		 */
		String path = "C:\\Users\\park\\Desktop\\";
		try  (Socket client = new Socket("192.168.200.147", 8000);) {
			DataInputStream dis = new DataInputStream(client.getInputStream());
			
			//사이즈를 먼저 받아 배열만들기
			int size = dis.readInt();
			byte[] arr =new byte[size];
			
			dis.readFully(arr);
			System.out.println("받아온파일 크기: " + arr.length);
			
			try  (FileOutputStream fos = new FileOutputStream(path + "coding.jpg");) {
				fos.write(arr);
				fos.flush();
				System.out.println("다운로드 성공!");
				
				
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		
	}
}
