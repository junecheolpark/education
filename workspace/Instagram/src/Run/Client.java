package Run;

import java.util.ArrayList;
import java.util.Scanner;

import DAO.AccountDAO;
import DAO.FeedDAO;
import DTO.AccountDTO;


public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountDAO acdao = new AccountDAO();
		FeedDAO fdao = new FeedDAO();
		
		while(true) {
			System.out.print("==== 메뉴 선택 ====\r\n" + "1. 로그인\r\n" + "2. 회원가입\r\n" + "0. 프로그램 종료\r\n" + ">> ");
			int menu = Integer.parseInt(sc.nextLine());
			if(menu == 1) {//로그인
				String id = "abc";
				String pw = "abc";
				String nickname = "abc";
				AccountDTO dto = new AccountDTO(id, pw, nickname);
				acdao.insert(dto);
//				acdao.insertsample();
			}else if(menu == 2) {//회원가입
				while(true) {
					System.out.print("==== 회원가입 ====\nID : ");
					String id = sc.nextLine();
					int rs = acdao.samePw(id);
					if(rs == 1) {
						System.out.println("이미 사용중인 아이디입니다");
					}
					System.out.print("PW : ");
					String pw = sc.nextLine();
					int rs1 = acdao.samePw(id);
					if(rs1 == 1) {
						System.out.println("이미 사용중인 비밀번호입니다");
					}
					System.out.print("NICKNAME : ");
					String nickname = sc.nextLine();
					int rs2 = acdao.samePw(id);
					if(rs2 == 1) {
						System.out.println("이미 사용중인 닉네임입니다");
					}
					
					
					acdao.insert(new AccountDTO(id, pw, nickname));
					
				}
				
			}else if(menu == 3) {//프로그램종료
				System.out.println(acdao.selctAll().toString()); 
				
			}
				
			}
		
		
	}

	
}
