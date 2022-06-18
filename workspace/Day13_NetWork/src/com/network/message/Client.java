package com.network.message;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (Socket client = new Socket("192.168.200.176", 8000);) {
			DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());

			String msg = dis.readUTF();
			System.out.println("msg : " + msg);
			while(true) {
				//�������� �޼��� ������
				System.out.print("�޼����� �Է��ϼ��� >> ");
				String message = sc.nextLine();
				dos.writeUTF(message);
				dos.flush();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
