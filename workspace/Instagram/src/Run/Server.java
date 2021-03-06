package Run;

import java.util.Scanner;

import DTO.AccountDTO;

public class Server {
	public static void main(String[] args) {
		AccountDTO[] actList = new AccountDTO[110];
		Scanner sc = new Scanner(System.in);
		AccountDTO dto = new AccountDTO("abc", "abc", "ABC초콜릿");
		int count = 0;
		actList[count++] = dto;
		System.out.println("접속하신걸 환영합니다.");
		while(true) {
			System.out.println("==== 메뉴 선택 ====\r\n"
					+ "1. 로그인\r\n"
					+ "2. 회원가입\r\n"
					+ "3. 프로그램 종료");
			int menu = Integer.parseInt(sc.nextLine());
			System.out.print(">> ");
			if (menu == 1) {//로그인
				System.out.print("===로그인==="
						+ "\nID :");
				String id =sc.nextLine();
				System.out.print("PW :");
				String pw =sc.nextLine();
				for(int i = 0; i< actList.length; i++) {//중복된 검사 
					if(actList[i].getId() != id 
							&& actList[i].getPw() != pw) {
						System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다."); 
					} else if(actList[i].getId().equals(id) 
							&& actList[i].getPw().equals(pw)) {
						System.out.println("로그인 성공!");
						System.out.println(actList[i].getNickname() + "님 어서오세요.");
					}
				}
				
			}else if (menu == 2) {//회원가입
				
				vending: while(true) {
					System.out.print("===회원가입==="
							+ "\nID :");
					String id =sc.nextLine();
					for(int i = 0; i< actList.length; i++) {//중복된 검사 아이디
						if(actList[i].getId().equals(id)) {
							System.out.println("중복된 ID입니다"); 
							continue vending;
						} break;
					}
					System.out.print("PW :");
					String pw =sc.nextLine();
					for(int i = 0; i< actList.length; i++) {//중복된 검사 
						if(actList[i].getPw().equals(pw)) {
							System.out.println("중복된 PW입니다"); 
							continue vending;
						} break;
					}
					
					System.out.print("Nickname :");
					String nickname =sc.nextLine();
					for(int i = 0; i< actList.length; i++) {//중복된 검사 
						if(actList[i].getNickname().equals(nickname)) {
							System.out.println("중복된 닉네입니다"); 
						}else {
							AccountDTO act = new AccountDTO(id, pw, nickname);
							actList[count++] = act;
							break vending;
						}
					}
				}
				
			}else if (menu == 3) {//조회
				for (int i=0; 0<actList.length; i++) {
					if(actList[i]!=null) {
						System.out.println(actList[i]);
					}
				}
			}
		}
		
		
	}



}
