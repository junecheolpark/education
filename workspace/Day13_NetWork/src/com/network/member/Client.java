package com.network.member;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try (Socket client = new Socket("192.168.200.147", 8000);) {
			DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());

			String hi = dis.readUTF();
			System.out.println(hi);
		
			while(true){
				System.out.println("===== 메뉴 선택 =====");
				System.out.println("1. 회원가입");
				System.out.println("2. 로그인");
				System.out.println("3. 프로그램 종료");
				
				String menu = sc.nextLine();
				dos.writeUTF(menu);
				dos.flush();
				if(menu.equals("1")) {
					System.out.println("===== 로그인 =====");
					System.out.println("생성 할 ID 입력 : ");
					String id = sc.nextLine();
					System.out.println("생성 할 Pw 입력 : ");
					String pw = sc.nextLine();
					
					dos.writeUTF(id);
					dos.writeUTF(pw);
					dos.flush();
				}else if(menu.equals("2")) {
					System.out.println("===== 로그인 =====");
					System.out.println("ID 입력 : ");
					String id = sc.nextLine();
					System.out.println("Pw 입력 : ");
					String pw = sc.nextLine();
					
					dos.writeUTF(id);
					dos.writeUTF(pw);
					dos.flush();
					
					//결과 받기
					String rs = dis.readUTF();
					if(rs.equals("success")) {
						System.out.println("로그인 성공");
					}else if(rs.equals("fail")) {
						System.out.println("아이디 혹은 비밀번호 일치하지 않다");
					}break;
				}else if(menu.equals("3")) {
					System.out.println("프로그램 종료");
					break;
				}
			}
			while(true) {
				System.out.println("\n===== 서비스 메뉴 =====");
				System.out.println("1. 오늘의 운세");
				System.out.println("2. 오늘의 날씨");
				System.out.println("3. 오늘의 로또번호");
				System.out.println("프로그램 종료");
				System.out.print("메뉴 선택 >> ");
				String menu = sc.nextLine();
				
				dos.writeUTF(menu);
				dos.flush();
				// 4번 입력했다면 프로그램 종료
				if(menu.equals("4")) {
					System.out.println("서비스 메뉴를 종료합니다.");
					break;
				}
				// 요청한 서비스에 대한 결과값
				String rs = dis.readUTF();
				System.out.println(rs);
			}
		
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
