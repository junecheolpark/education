package com.network.basic;

import java.net.Socket;

public class Client {
	public static void main(String[] args) {

		// 클라이언트의 소켓 생성시 두가지 인자값 필요
		// 1. 서버의 ip 주소
		// 2. 서버에서 열어준 포트번호
		// 본인의 ip 주소 > localhost 라고 써도 됨
		try(Socket client = new Socket("192.168.200.176", 8000);){
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
