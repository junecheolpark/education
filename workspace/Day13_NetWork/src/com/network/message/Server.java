package com.network.message;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
//		// �������� > Ŭ���̾�Ʈ ���� > �������� Ŭ���̾�Ʈ���� "����~"����
		try(ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
				DataInputStream dis = new DataInputStream(sock.getInputStream());){
				
			//�������� �������� Ŭ���̾�Ʈ���� �ݵ�� �޾��ְ�
			//Ŭ���̾�Ʈ���� �������� �������� �޾��ְ� > ������ ¦�� �¾ƾ���
			
			
			String msg = "�����ϽŰ� ȯ���մϴ�~**�ڡڡڡ�";
			dos.writeUTF(msg);
			dos.flush();
			while(true) {
				//Ŭ���̾�Ʈ�� �޼��� �ޱ�
				String message = dis.readUTF();
				System.out.println(sock.getLocalAddress() + " : " + message);
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
