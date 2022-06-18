package com.network.upload;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		String path = "C:\\Users\\park\\Desktop\\codingclass\\";
		try(ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				DataInputStream dis = new DataInputStream(sock.getInputStream());){
			
			int size = dis.readInt();
			byte[] arr= new byte[size];
			// 파일명 받아주기(확장자포함)
			String fileName = dis.readUTF();
			// 파일받기
			dis.readFully(arr);
			try(FileOutputStream fos = new FileOutputStream(path + System.currentTimeMillis()+ fileName);){
				fos.write(arr);
				fos.flush();
				System.out.println("업로드 완료");
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
