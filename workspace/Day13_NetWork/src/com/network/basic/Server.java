package com.network.basic;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
//		1. ������ ���� ����
		// SeverSocket : client ����ŭ socket�� �������ִ� ����
		try( ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();){
			//2. Ŭ���̾�Ʈ�� ��û�� ������ Ŭ���̾�Ʈ ���� ���ϻ���
			// Ŭ���̾�Ʈ�� ���� ���� �������� ������ ����ϴٰ� ���� ����.
			System.out.println("���ο� Ŭ���̾�Ʈ�� �����߽��ϴ�.");
			System.out.println("������ IP : " + sock.getLocalSocketAddress());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
