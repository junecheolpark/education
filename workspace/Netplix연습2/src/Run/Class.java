package Run;

import java.util.Scanner;

import DAO.MemberDAO;
import DTO.Basic;
import DTO.Member;
import DTO.Premium;
import DTO.Standard;

public class Class {
	static Scanner sc = new Scanner(System.in);
	public static int getInput() {
		while(true) {
			try {
				System.out.print(">> ");
				int menu = Integer.parseInt(sc.nextLine());
				return menu;
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		int menu = 0;

		while (true) {
			
			System.out.println("*** Netflix ***");
			System.out.println("1. 신규 회원 등록 \r\n" + "2. 회원 목록 출력 \r\n" + "3. 회원 정보 검색 \r\n" + "4. 회원 정보 수정 \r\n"
					+ "5. 회원 정보 삭제 \r\n" + "6. 시스템 종료");
			menu = getInput();
			if (menu==1) { // 등록
				System.out.println("1. Basic \r\n"
					+ "2. Standard \r\n"
					+ "3. Premium \r\n");
				int input = getInput();
				
				System.out.print("신규 회원 ID(7자 이내) :");
				String id = sc.nextLine();
				System.out.print("신규 회원 닉네임 (4자이내) :");
				String nickname = sc.nextLine();
				System.out.print("신규 회원 가입일 :");
				String signup_date = sc.nextLine();
				System.out.print("신규 회원 포인트 :");
				int point = Integer.parseInt(sc.nextLine());
				
				if(input == 1) {
					dao.insert(new Basic(id, nickname, signup_date, point));
				}else if(input == 2) {
					dao.insert(new Standard(id, nickname, signup_date, point));
				}else if(input == 3) {
					dao.insert(new Premium(id, nickname, signup_date, point));
				}
//				dao.insertsample();

			} else if (menu==2 ) {// 출력
				dao.Output();
			} else if (menu ==3 ) {// 검색
				System.out.print("1. ID로 검색 \n2. 닉네임으로 검색\n>> ");
				int input = Integer.parseInt(sc.nextLine());
				if (input == 1) {// id
					System.out.print("검색 할 ID 입력\n>> ");
					String id = sc.nextLine();

					Member dto = dao.selectById(id);
					if (dto != null) {
						System.out.println("ID\t등급\t닉네임\t가입일\t포인트");
						System.out.println(dto.toString());
					} else {
						System.out.println("닉네임을 잘못입력하였습니다.");
					}
				} else if (input == 2) {// 닉네임
					System.out.print("검색 할 닉네임 입력\n>> ");
					String nickname = sc.nextLine();

					Member dto = dao.selectById(nickname);
					if (dto != null) {
						System.out.println("ID\t등급\t닉네임\t가입일\t포인트");
						System.out.println(dto.toString());
					} else {
						System.out.println("닉네임을 잘못입력하였습니다.");
					}
				}
			} else if (menu== 4) {// 수정
				
				dao.Output();

				System.out.print("수정 할 ID 입력 :");
				String id = sc.nextLine();
				System.out.print("수정 할 회원 닉네임 (4자이내) :");
				String nickname = sc.nextLine();
				System.out.print("수정 할 회원 포인트 :");
				int point = Integer.parseInt(sc.nextLine());

				int rs = dao.modify(id, nickname, point);
				if (rs == 1) {
					System.out.println("변경이 완료되었습니다.");
				}else if (rs == -1) {
					System.out.println("변경할수 없는 ID입니다.");
				}

			}
			else if (menu ==5) {// 삭제
				dao.Output();
					
					System.out.print("삭제 할 ID 입력 :");
					String id = sc.nextLine();
					int rs = dao.delete(id);
					if (rs == 1) {
						System.out.println("삭제 완료되었습니다.");
					}else if (rs == -1) {
						System.out.println("삭제 할수 없는 ID입니다.");
					}
			}
			else if (menu== 6) {// 종료
				break;
			}
		}

	}
}
