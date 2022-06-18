package com.network.upload;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Ŭ���̾�Ʈ�� ������ ������ ���ε�
		// Ŭ���̾�Ʈ ���� ���
		String path = "C:\\Users\\park\\Desktop\\";
		try (Socket client = new Socket("192.168.200.147", 8000);) {
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		
			System.out.println("���ε��� ���ϸ��� �Է��ϼ���(Ȯ���� ����)");
			System.out.print(">> ");
			String fileName = sc.nextLine();
			
			try(FileInputStream fis = new FileInputStream(path + fileName);){
				// Ŭ���̾�Ʈ�� hdd�κ��� ���� �о����
				byte[] arr= fis.readAllBytes();
				// �ϴ� ���ε��� ������ ũ����� ������.
				dos.writeInt(arr.length);
				// ���ϸ��� ������ �������� Ȯ���ڸ� ���������� �������� �ʾƵ� �ǵ���
				dos.writeUTF(fileName);
				// ���� ������ ����
				dos.write(arr);
				System.out.println(fileName + "���ε� �Ϸ�");
			}catch(Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
