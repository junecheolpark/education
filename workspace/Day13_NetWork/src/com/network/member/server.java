package com.network.member;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();

		try (ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
				DataInputStream dis = new DataInputStream(sock.getInputStream());) {

			String hi = "접속을 환영합니다.";
			dos.writeUTF(hi);
			dos.flush();
			while (true) {
				String menu = dis.readUTF();
				if (menu.equals("1")) {// 회원가입
					String id = dis.readUTF();
					String pw = dis.readUTF();
					System.out.println("클라이언트의 id : " + id);
					System.out.println("클라이언트의 pw : " + pw);
					AccountDTO acd = new AccountDTO(id, pw);
					dao.join(acd);
					System.out.println("회원가입 완료!");

					// 서비스
				} else if (menu.equals("2")) {// 로그인
					String id = dis.readUTF();
					String pw = dis.readUTF();
					System.out.println("클라이언트의 id : " + id);
					System.out.println("클라이언트의 pw : " + pw);
					

					if (dao.checkLogin(id, pw)) {
						dos.writeUTF("success");
					} else {
						dos.writeUTF("fail");
					}
					dos.flush();
					break;
				} else if (menu.equals("3")) {// 프로그램 종료
					System.out.println("클라이언트의 접속이 끊어졌습니다.");
					break;
				}
			}
			while(true) {
				String menu = dis.readUTF();
				System.out.println(menu +"를 입력하셨습니다");
				String rs = "";
				if(menu.equals("1")) {
					rs ="1995년생, 대체로 길하나 여성의 경우 천천히 이뤄지겠다.";
				}else if(menu.equals("2")) {
					rs ="12°C°F\r\n"
							+ "강수확률: 0%\r\n"
							+ "습도: 68%\r\n"
							+ "풍속: 4m/s";
				}else if(menu.equals("3")) {
					rs ="로또 번호!\n" + dao.getLotto();
				}else if(menu.equals("4")) {
					System.out.println("클라이언트의 접속이 끊어졌습니다.");
					break;
				}
				dos.writeUTF(rs);
				dos.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
