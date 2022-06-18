package com.network.download02.copy;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
// wile-> 1. ���� �ٿ�ε� 2. ���α׷� ����
		
		Scanner sc = new Scanner(System.in);
		String path_up = "D:\\backup\\upload\\";
		String path_down = "D:\\backup\\download\\";
		try(Socket client = new Socket("192.168.200.147", 8000);){
			DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			
			while(true) {
				System.out.println("==== ���� �ٿ�ε� ���α׷� ====");
				System.out.println("1. �ٿ�ε�");
				System.out.println("2. ���ε�");
				System.out.println("3. ���α׷� ����");
				System.out.print("�޴��� �Է��ϼ��� \n>> ");
				String menu = sc.nextLine();
				dos.writeUTF(menu);
				dos.flush();
				//===================================================================
				if(menu.equals("1")) {
					// ��� �����̸��� �Ѿ����
					int cnt = dis.readInt();
					System.out.println("==== ���� ��� ====");
					for(int i = 0; i < cnt; i++) {
						System.out.println(dis.readUTF());
					}
					System.out.print("�ٿ�ε��� ���ϸ� �Է� (Ȯ���� ����) \n>> ");
					String fileName = sc.nextLine();
					
					//������ �ٿ�ε��� ���ϸ� ����
					dos.writeUTF(fileName);
					dos.flush();
					
					
					int size = dis.readInt();
					byte[] arr =new byte[size];
					
					dis.readFully(arr);
					System.out.println("�޾ƿ����� ũ��: " + arr.length);
					
					try  (FileOutputStream fos = new FileOutputStream(path_down + fileName);) {
						fos.write(arr);
						fos.flush();
						System.out.println("�ٿ�ε� ����!");
						
						
					}catch(Exception e) {
						e.printStackTrace();
						
					}
					//===================================================================
				}else if(menu.equals("2")) {
					System.out.println("���ε��� ���ϸ��� �Է��ϼ���(Ȯ���� ����)");
					System.out.print(">> ");
					String fileName = sc.nextLine();
					
					try(FileInputStream fis = new FileInputStream(path_up + fileName);){
						byte[] arr = fis.readAllBytes();
						dos.writeUTF(fileName);
						dos.writeInt(arr.length);
						
						dos.write(arr);
						dos.flush();
						
						
						
					}catch(Exception e) {
						e.printStackTrace();
					} 
					System.out.println("���ε� ����!");
					//===================================================================
				}else if(menu.equals("3")) {
					System.out.println("���α׷��� ����˴ϴ�.");
					break;
				}
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
