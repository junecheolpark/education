package com.network.download02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
// wile-> 1. 파일 다운로드 2. 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		String path = "C:\\Users\\park\\Desktop\\";
		
		try(Socket client = new Socket("192.168.200.147", 8000);){
			DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			
			while(true) {
				System.out.println("==== 파일 다운로드 프로그램 ====");
				System.out.println("1. 다운로드");
				System.out.println("2. 프로그램 종료");
				System.out.print("메뉴를 입력하세요 \n>> ");
				String menu = sc.nextLine();
				dos.writeUTF(menu);
				dos.flush();
				if(menu.equals("1")) {
					// 몇개의 파일이름이 넘어올지
					int cnt = dis.readInt();
					System.out.println("==== 파일 목록 ====");
					for(int i = 0; i < cnt; i++) {
						System.out.println(dis.readUTF());
					}
					System.out.print("다운로드할 파일명 입력 (확장자 포함) \n>> ");
					String fileName = sc.nextLine();
					
					//서버에 다운로드할 파일명 전송
					dos.writeUTF(fileName);
					dos.flush();
					
					
					int size = dis.readInt();
					byte[] arr =new byte[size];
					
					dis.readFully(arr);
					System.out.println("받아온파일 크기: " + arr.length);
					
					try  (FileOutputStream fos = new FileOutputStream(path + "coding.jpg");) {
						fos.write(arr);
						fos.flush();
						System.out.println("다운로드 성공!");
						
						
					}catch(Exception e) {
						e.printStackTrace();
						
					}
				}else if(menu.equals("2")) {
					System.out.println("프로그램이 종료됩니다.");
					break;
				}
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
