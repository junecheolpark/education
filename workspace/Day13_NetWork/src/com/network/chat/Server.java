package com.network.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		/* ���� ���� > Ŭ���̾�Ʈ ����
		 * 1.Ŭ���̾�Ʈ���� ȯ�� �λ� ����
		 * 2.Ŭ���̾�Ʈ�� > �г��� �Է��ؼ� �����ϰ� �Ǹ�
		 * 3. �������� " ~�� ����"
		 * 
		 * 4. Ŭ���̾�Ʈ�� ���� �޼��� ����
		 * 5. �������� �޼����� �޾� "~�� �޼��� : �޽��� ����"
		 * 6. Ŭ���̾�Ʈ���� �޼��� ����
		 * 7.Ŭ���̾�Ʈ���� �޼����� �޾� : "���� �޼���: �޼��� ����"
		 * 
		 * 4~7 ���� ���� �ݸ�
		 */
		Scanner sc = new Scanner(System.in);
		try(ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				DataInputStream dis = new DataInputStream(sock.getInputStream());
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());){
			//ȯ���λ� ����
			String hi = "ä�����α׷��� �����Ͻ� �� ȯ���մϴ�.";
			dos.writeUTF(hi);
			dos.flush();
			// �г��� �ޱ�
			String nickname = dis.readUTF();
			System.out.println(nickname + "�� ����~!");
			try {
				while(true) {
					//�޼��� �ޱ�
					String msg = dis.readUTF();
					System.out.println(nickname + "�� �޼���: " + msg);
					//�޼��� ����
					System.out.print("�޼��� �Է� >> ");
					String msg_server =sc.nextLine();
					dos.writeUTF(msg_server);
					dos.flush();
				}
			}catch(Exception e){
				System.out.println("������ ������ϼ���.");
				e.printStackTrace();
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
