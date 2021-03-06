package com.kh.member.copy;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDAO memberDao = new MemberDAO();

		while (true) {
			System.out.println("=== 멤버 서비스 프로그램 ===");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 회원탈퇴");
			System.out.println("4. 프로그램 종료");
			System.out.print(">> ");
			String menu = sc.nextLine();

			if (menu.equals("1")) { // 로그인
				while(true) {
					System.out.print("아이디 입력 >> ");
					String id = sc.nextLine();
					System.out.print("비밀번호 입력 >> ");
					String pw = sc.nextLine();
					
					try {
						if(memberDao.isLoginOk(id, pw)) { //로그인 가능
							// 서비스 메뉴 출력
							// 지금 로그인한 사용자의 닉네임을 부르면서 ~님 환영합니다. + 오늘의 날씨 정보 띄워주기
							String nickname = memberDao.getNickname(id);
							System.out.println(nickname + "님 환영합니다~");
							System.out.println("오늘의 날씨는 흐림. 평균기온은 14.5도입니다.");							
							break;
						}else {
							System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
						}
					}catch(Exception e) {
						e.printStackTrace();
						System.out.println("오류가 발생했습니다. 관리자에게 문의하세요.");
					}					
				}
				
			} else if (menu.equals("2")) { // 회원가입
				while(true) {
					System.out.print("아이디 입력 >> ");
					String id = sc.nextLine();
					// 중복검사
					try {
						if(memberDao.checkId(id)) {
							System.out.print("비밀번호 입력 >> ");
							String pw = sc.nextLine();
							System.out.print("닉네임 입력 >> ");
							String nickname = sc.nextLine();
							
							// 실제 회원정보 추가
							try {
								int rs = memberDao.insert(new MemberDTO(id, pw, nickname));
								if(rs > 0) {
									System.out.println("회원가입 성공");
								}else {
									System.out.println("회원가입 실패");
								}
							}catch(Exception e) {
								e.printStackTrace();
								System.out.println("오류가 발생했습니다. 잠시 후 다시 시도하세요.");
							}						
							break;
						}else {
							System.out.println("중복된 아이디입니다.");
						}
					}catch(Exception e) {
						e.printStackTrace();
						System.out.println("오류가 발생했습니다. 관리자에게 문의하세요.");
					}
				}
			} else if (menu.equals("3")) { // 회원탈퇴
				System.out.print("탈퇴할 아이디 입력 >> ");
				String id = sc.nextLine();
				System.out.print("탈퇴할 비밀번호 입력 >> ");
				String pw = sc.nextLine();
				
				try {
					if(memberDao.isLoginOk(id, pw)) { // 올바른 id, pw 입력했다면
						// ~ 님 정말 탈퇴하시겠습니까?(Y/N)
						String nickname = memberDao.getNickname(id);
						System.out.println(nickname + "님 정말 탈퇴하시겠습니까?(Y/N)");
						System.out.print(">> ");
						String answer = sc.nextLine();
						
						if(answer.equals("Y")) { // 탈퇴 진행
							int rs = memberDao.delete(id); 
							if(rs > 0) {
								System.out.println("그동안 사용해주셔서 감사합니다.");
							}else {
								System.out.println("회원탈퇴에 실패했습니다.");
							}							
						}else if(answer.equals("N")) { // 탈퇴 중단
							System.out.println("감사합니다.. 계속 많은 사랑 부탁드려요.");
						}					
					}
				}catch(Exception e) {
					e.printStackTrace();
					System.out.println("오류가 발생했습니다. 관리자에게 문의하세요.");
				}				
			} else if (menu.equals("4")) { // 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
