package com.network.download01;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	public static void main(String[] args) {
//������ �ִ� ������ Ŭ���̾�Ʈ�� �ٿ�
		/*
		 * ���� ���� > Ŭ���̾�Ʈ ���� > Ŭ���̾�Ʈ�� ���� ���� ������ 
		 * hdd�� �մ� ������ ���� ���α׷����� �о����(�Է�) �ҷ��鿩�� ������
		 * Ŭ���̾�Ʈ�� ����
		 */
		String path = "C:\\Users\\park\\Desktop\\codingclass\\";
		String fileName = "coding.jpg";
		try (ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				FileInputStream fis = new FileInputStream(path + fileName);
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());) {

			byte[] arr = fis.readAllBytes();
			System.out.println("���� ���� ũ��: " + arr.length);
			// Ŭ���̾�Ʈ���� ��������
			//1. �������� ũ�⸦ ���� ���� > Ŭ���̾�Ʈ�� ����� �޾� ����Ʈ �迭�� �����
			//2. �����͸� ����> ���� �迭���ٰ� �����͸� �޾���.
			dos.writeInt(arr.length);
			dos.write(arr);
			dos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
