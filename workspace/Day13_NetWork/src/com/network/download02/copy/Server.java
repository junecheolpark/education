package com.network.download02.copy;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {

		String path_down = "D:\\backup\\download\\";
		String path_up = "D:\\backup\\upload\\";
		try (ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
				DataInputStream dis = new DataInputStream(sock.getInputStream())) {

			System.out.println(sock.getLocalAddress() + " ���� ");

			while (true) {
				// ����� ���� �޴�
				String menu = dis.readUTF();
				if (menu.equals("1")) {
					File file = new File(path_down);
					File[] files = file.listFiles();
					// ������ �� ���� ����
					dos.writeInt(files.length);
					for (File f : files) {
						// �ش� ������ �̸��� ��ȯ���ִ� �޼���
						System.out.println(f.getName());
						// Ŭ���̾�Ʈ���� �� �̸����� ����
						dos.writeUTF(f.getName());
					}
					dos.flush();

					// Ŭ���̾�Ʈ�� ��û�� ���ϸ�
					String fileName = dis.readUTF();
					System.out.println("�ٿ�ε� ��û : " + fileName);

					// Ŭ���̾�Ʈ�� ��û�� ������ �������� �������ֱ�
					try (FileInputStream fis = new FileInputStream(path_down + fileName);) {
						// ������ ����Ʈ�迭�� �о����
						byte[] arr = fis.readAllBytes();
						// ������ ũ�⸦ ���� Ŭ���̾�Ʈ���� ����
						dos.writeInt(arr.length);
						// ���� ������ ����
						dos.write(arr);
						dos.flush();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}else if(menu.equals("2")) {
					String fileName = dis.readUTF();
					int size = dis.readInt();
					byte[] arr = new byte[size];
					
					
					dis.readFully(arr);	
					
					try(FileOutputStream fos = new FileOutputStream(path_down+ System.currentTimeMillis()+"_"+fileName))	{
						fos.write(arr);
						fos.flush();
					}catch(Exception e) {
						e.printStackTrace();
					}			
					System.out.println("���ε� ����!");
					
				}else if (menu.equals("3")) {
					System.out.println("Ŭ���̾�Ʈ�� ������ ���������ϴ�.");
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
