package com.network.download01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {

		/* ������ ������ ���� �ޱ�
		 * Ŭ���̾�Ʈ�� hdd �� ���Ͽ� ����(���)
		 */
		String path = "C:\\Users\\park\\Desktop\\";
		try  (Socket client = new Socket("192.168.200.147", 8000);) {
			DataInputStream dis = new DataInputStream(client.getInputStream());
			
			//����� ���� �޾� �迭�����
			int size = dis.readInt();
			byte[] arr =new byte[size];
			
			dis.readFully(arr);
			System.out.println("�޾ƿ����� ũ��: " + arr.length);
			
			try  (FileOutputStream fos = new FileOutputStream(path + "coding.jpg");) {
				fos.write(arr);
				fos.flush();
				System.out.println("�ٿ�ε� ����!");
				
				
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		
	}
}
