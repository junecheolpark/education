package com.network.download02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {

		String path = "C:\\Users\\park\\Desktop\\codingclass\\";
		String fileName = "";
		try(ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
				DataInputStream dis = new DataInputStream(sock.getInputStream());
				) {
			
			
			while(true) {
				System.out.println(sock.getLocalAddress() + "����");
				String menu = dis.readUTF();
				System.out.println(menu);
				if(menu.equals("1")) {
					File file = new File(path);
					File[] files = file.listFiles();
					// ������ ����� ��������
					dos.writeInt(files.length);
					for(File f : files) {
						//�ش� ������ �̸��� ��ȯ���ִ� �޼���
						System.out.println(f.getName());
						//Ŭ���̾�Ʈ���� �� �̸����� ����
						dos.writeUTF(f.getName());
					}
					dos.flush();
					// Ŭ���̾�Ʈ�� ��û�� ���ϸ�
					fileName= dis.readUTF();
					System.out.println("�ٿ�ε� ��û : " +fileName);
					
					//Ŭ���̾�Ʈ�� ��û�� ������ �������� �������ֱ�
					try(FileInputStream fis = new FileInputStream(path + fileName);){
						//������ ����Ʈ �迭�� �о����
						byte[] arr = fis.readAllBytes();
						System.out.println("���� ���� ũ��: " + arr.length);
						dos.writeInt(arr.length);
						dos.write(arr);
						dos.flush();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}else if(menu.equals("2")) {
					System.out.println("������ ���������ϴ�");
					break;
				}
				
			}
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
