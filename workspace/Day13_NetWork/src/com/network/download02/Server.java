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
				System.out.println(sock.getLocalAddress() + "접속");
				String menu = dis.readUTF();
				System.out.println(menu);
				if(menu.equals("1")) {
					File file = new File(path);
					File[] files = file.listFiles();
					// 파일이 몇개인지 전송해줌
					dos.writeInt(files.length);
					for(File f : files) {
						//해당 파일의 이름을 반환해주는 메서드
						System.out.println(f.getName());
						//클라이언트에게 이 이름들을 전송
						dos.writeUTF(f.getName());
					}
					dos.flush();
					// 클라이언트가 요청한 파일명
					fileName= dis.readUTF();
					System.out.println("다운로드 요청 : " +fileName);
					
					//클라이언트가 요청한 파일을 서버에서 전송해주기
					try(FileInputStream fis = new FileInputStream(path + fileName);){
						//파일을 바이트 배열로 읽어오기
						byte[] arr = fis.readAllBytes();
						System.out.println("보낼 파일 크기: " + arr.length);
						dos.writeInt(arr.length);
						dos.write(arr);
						dos.flush();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}else if(menu.equals("2")) {
					System.out.println("접속이 끊어졌습니다");
					break;
				}
				
			}
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
