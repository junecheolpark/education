package com.network.member;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();

		try (ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
				DataInputStream dis = new DataInputStream(sock.getInputStream());) {

			String hi = "������ ȯ���մϴ�.";
			dos.writeUTF(hi);
			dos.flush();
			while (true) {
				String menu = dis.readUTF();
				if (menu.equals("1")) {// ȸ������
					String id = dis.readUTF();
					String pw = dis.readUTF();
					System.out.println("Ŭ���̾�Ʈ�� id : " + id);
					System.out.println("Ŭ���̾�Ʈ�� pw : " + pw);
					AccountDTO acd = new AccountDTO(id, pw);
					dao.join(acd);
					System.out.println("ȸ������ �Ϸ�!");

					// ����
				} else if (menu.equals("2")) {// �α���
					String id = dis.readUTF();
					String pw = dis.readUTF();
					System.out.println("Ŭ���̾�Ʈ�� id : " + id);
					System.out.println("Ŭ���̾�Ʈ�� pw : " + pw);
					

					if (dao.checkLogin(id, pw)) {
						dos.writeUTF("success");
					} else {
						dos.writeUTF("fail");
					}
					dos.flush();
					break;
				} else if (menu.equals("3")) {// ���α׷� ����
					System.out.println("Ŭ���̾�Ʈ�� ������ ���������ϴ�.");
					break;
				}
			}
			while(true) {
				String menu = dis.readUTF();
				System.out.println(menu +"�� �Է��ϼ̽��ϴ�");
				String rs = "";
				if(menu.equals("1")) {
					rs ="1995���, ��ü�� ���ϳ� ������ ��� õõ�� �̷����ڴ�.";
				}else if(menu.equals("2")) {
					rs ="12��C��F\r\n"
							+ "����Ȯ��: 0%\r\n"
							+ "����: 68%\r\n"
							+ "ǳ��: 4m/s";
				}else if(menu.equals("3")) {
					rs ="�ζ� ��ȣ!\n" + dao.getLotto();
				}else if(menu.equals("4")) {
					System.out.println("Ŭ���̾�Ʈ�� ������ ���������ϴ�.");
					break;
				}
				dos.writeUTF(rs);
				dos.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
