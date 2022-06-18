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

			System.out.println(sock.getLocalAddress() + " 접속 ");

			while (true) {
				// 사용자 선택 메뉴
				String menu = dis.readUTF();
				if (menu.equals("1")) {
					File file = new File(path_down);
					File[] files = file.listFiles();
					// 파일의 수 먼저 전송
					dos.writeInt(files.length);
					for (File f : files) {
						// 해당 파일의 이름을 반환해주는 메서드
						System.out.println(f.getName());
						// 클라이언트에게 이 이름들을 전송
						dos.writeUTF(f.getName());
					}
					dos.flush();

					// 클라이언트가 요청한 파일명
					String fileName = dis.readUTF();
					System.out.println("다운로드 요청 : " + fileName);

					// 클라이언트가 요청한 파일을 서버에서 전송해주기
					try (FileInputStream fis = new FileInputStream(path_down + fileName);) {
						// 파일을 바이트배열로 읽어오기
						byte[] arr = fis.readAllBytes();
						// 파일의 크기를 먼저 클라이언트에게 전송
						dos.writeInt(arr.length);
						// 파일 데이터 전송
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
					System.out.println("업로드 성공!");
					
				}else if (menu.equals("3")) {
					System.out.println("클라이언트의 접속이 끊어졌습니다.");
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
