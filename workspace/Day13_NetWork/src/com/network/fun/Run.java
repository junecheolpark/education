package com.network.fun;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

//1.220.236.76
public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path_up = "D:\\backup\\upload\\";
		try (Socket client = new Socket("15.165.159.46", 8000);) {
			DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());

			while (true) {
				System.out.println("�޴��� �Է��Ͻÿ�");
				String menu = sc.nextLine();
				dos.writeUTF(menu);
				dos.flush();
				if (menu.equals("1")) {
					System.out.println("���ε��� ���ϸ��� �Է��ϼ���(Ȯ���� ����)");
					System.out.print(">> ");
					String fileName = sc.nextLine();

					try (FileInputStream fis = new FileInputStream(path_up + fileName);) {
						byte[] arr = fis.readAllBytes();
						dos.writeUTF(fileName);
						dos.writeInt(arr.length);
						dos.write(arr);
						dos.flush();
					}
					System.out.println("���ε强��!");

				} else if (menu.equals("2")) {
					System.out.println("���α׷�����");
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
