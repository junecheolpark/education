package com.network.upload;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		String path = "C:\\Users\\park\\Desktop\\codingclass\\";
		try(ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				DataInputStream dis = new DataInputStream(sock.getInputStream());){
			
			int size = dis.readInt();
			byte[] arr= new byte[size];
			// ���ϸ� �޾��ֱ�(Ȯ��������)
			String fileName = dis.readUTF();
			// ���Ϲޱ�
			dis.readFully(arr);
			try(FileOutputStream fos = new FileOutputStream(path + System.currentTimeMillis()+ fileName);){
				fos.write(arr);
				fos.flush();
				System.out.println("���ε� �Ϸ�");
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
