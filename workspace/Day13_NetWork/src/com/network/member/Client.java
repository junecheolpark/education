package com.network.member;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try (Socket client = new Socket("192.168.200.147", 8000);) {
			DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());

			String hi = dis.readUTF();
			System.out.println(hi);
		
			while(true){
				System.out.println("===== �޴� ���� =====");
				System.out.println("1. ȸ������");
				System.out.println("2. �α���");
				System.out.println("3. ���α׷� ����");
				
				String menu = sc.nextLine();
				dos.writeUTF(menu);
				dos.flush();
				if(menu.equals("1")) {
					System.out.println("===== �α��� =====");
					System.out.println("���� �� ID �Է� : ");
					String id = sc.nextLine();
					System.out.println("���� �� Pw �Է� : ");
					String pw = sc.nextLine();
					
					dos.writeUTF(id);
					dos.writeUTF(pw);
					dos.flush();
				}else if(menu.equals("2")) {
					System.out.println("===== �α��� =====");
					System.out.println("ID �Է� : ");
					String id = sc.nextLine();
					System.out.println("Pw �Է� : ");
					String pw = sc.nextLine();
					
					dos.writeUTF(id);
					dos.writeUTF(pw);
					dos.flush();
					
					//��� �ޱ�
					String rs = dis.readUTF();
					if(rs.equals("success")) {
						System.out.println("�α��� ����");
					}else if(rs.equals("fail")) {
						System.out.println("���̵� Ȥ�� ��й�ȣ ��ġ���� �ʴ�");
					}break;
				}else if(menu.equals("3")) {
					System.out.println("���α׷� ����");
					break;
				}
			}
			while(true) {
				System.out.println("\n===== ���� �޴� =====");
				System.out.println("1. ������ �");
				System.out.println("2. ������ ����");
				System.out.println("3. ������ �ζǹ�ȣ");
				System.out.println("���α׷� ����");
				System.out.print("�޴� ���� >> ");
				String menu = sc.nextLine();
				
				dos.writeUTF(menu);
				dos.flush();
				// 4�� �Է��ߴٸ� ���α׷� ����
				if(menu.equals("4")) {
					System.out.println("���� �޴��� �����մϴ�.");
					break;
				}
				// ��û�� ���񽺿� ���� �����
				String rs = dis.readUTF();
				System.out.println(rs);
			}
		
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
