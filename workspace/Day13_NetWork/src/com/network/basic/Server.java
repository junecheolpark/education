package com.network.basic;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
//		1. 서버용 소켓 생성
		// SeverSocket : client 수만큼 socket을 생성해주는 공장
		try( ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();){
			//2. 클라이언트의 요청을 수락할 클라이언트 전용 소켓생성
			// 클라이언트의 실제 접속 감지됐을 떄까지 대기하다가 소켓 생성.
			System.out.println("새로운 클라이언트가 접속했습니다.");
			System.out.println("접속한 IP : " + sock.getLocalSocketAddress());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
