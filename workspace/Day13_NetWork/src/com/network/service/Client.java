package com.network.service;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try(Socket client = new Socket("192.168.200.176", 8000);) {
			DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());

			String hi = dis.readUTF();
			System.out.println(hi);
			
			// ������ ���� �������� �� �ִ� ���� �޴��� �����.
			// 1. ������ � / 2. ������ ����/ 3. ������ �ζǹ�ȣ
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
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
