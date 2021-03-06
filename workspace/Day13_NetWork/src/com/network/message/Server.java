package com.network.message;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
//		// 서버가동 > 클라이언트 접속 > 서버에서 클라이언트에게 "접속~"전송
		try(ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
				DataInputStream dis = new DataInputStream(sock.getInputStream());){
				
			//서버에서 보냈으면 클라이언트에서 반드시 받아주고
			//클라이언트에서 보냈으면 서버에서 받아주고 > 순서와 짝이 맞아야함
			
			
			String msg = "접속하신걸 환영합니다~**★★★★";
			dos.writeUTF(msg);
			dos.flush();
			while(true) {
				//클라이언트의 메세지 받기
				String message = dis.readUTF();
				System.out.println(sock.getLocalAddress() + " : " + message);
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
