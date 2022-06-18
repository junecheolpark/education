package com.kh.member;

import java.util.Scanner;



public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDAO dao = MemberDAO.getInstance();
		while (true) {
			System.out.print(
					"** 멤버 서비스 프로그램 ** \r\n" + "1. 로그인\r\n" + "2. 회원가입\r\n" + "3. 회원탈퇴\r\n" + "4. 프로그램 종료 \n>> ");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {// 로그인
				System.out.print("id 입력 >> ");
				String id = sc.nextLine();
				System.out.print("pw 입력 >> ");
				String pw = sc.nextLine();
				try{
					String rs = dao.login(id, pw);
					if (rs != null) {
						System.out.println(rs + "님 환영합니다!");
						System.out.println("오늘의 날씨는 흐림, 평균 온도는 12.5도입니다");
					}else {
						System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			} else if (menu == 2) {// 회원가입
				while(true) {
					System.out.print("id 입력 >> ");
					String id = sc.nextLine();
					try {
						String rs = dao.Check(id);
						if(rs != null) {
							System.out.println("중복된 id 값입니다 다시 입력해주세요");
							continue;
						}else {
							System.out.print("pw 입력 >> ");
							String pw = sc.nextLine();
							System.out.print("nickname 입력 >> ");
							String nickname = sc.nextLine();
							MemberDTO dto = new MemberDTO(id, pw, nickname);
							int rs1 = dao.insert(dto);
							if (rs1 > 0) {
								System.out.println("회원가입 성공!");
								break;
							} else {
								System.out.println("회원가입 실패");
								break;
							}
						}
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				
			} else if (menu == 3) {// 회원탈퇴
				System.out.print("id 입력 >> ");
				String id = sc.nextLine();
				System.out.print("pw 입력 >> ");
				String pw = sc.nextLine();
				try {
					String rs = dao.login(id, pw); // 일치확인
					if (rs != null) {
						System.out.println(rs + "님 정말 탈퇴하시겠습니까?(Y/N 입력)");
						System.out.print(">> ");
						String input = sc.nextLine();
						if(input.equals("Y")||input.equals("y")) {
							dao.delete(id,pw);
							System.out.println("그동안 이용해주셔서 감사합니다");
						}else if (input.equals("N")||input.equals("n")) {
							System.out.println("남아주셔서 감사합니다!");
						}
						
					}else {
						System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (menu == 4) {
				System.out.println("프로그램종료합니다");
				break;
			}
		}

	}
}
