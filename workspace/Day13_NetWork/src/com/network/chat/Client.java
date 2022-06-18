package com.network.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try(Socket client = new Socket("192.168.200.176", 8000)){
			DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			//ȯ���λ� �ޱ�
			String hi = dis.readUTF();
			System.out.println(hi);
			//�г��� ����
			System.out.print("�г��� �Է� >> ");
			String nickname = sc.nextLine();
			dos.writeUTF(nickname);
			dos.flush();
			try {
				while(true) {
					//�޼��� ����
					System.out.print("�޼��� �Է� >> ");
					String msg = sc.nextLine();
					dos.writeUTF(msg);
					dos.flush();
					//�޼��� �ޱ�
					String msg_server = dis.readUTF();
					System.out.println("���� �޼��� : " + msg_server);
				}
			}catch(Exception e){
				System.out.println("������ ��Ȱ���� �ʽ��ϴ�. �������ϼ���.");
				e.printStackTrace();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
