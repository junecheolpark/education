package Run;

import java.util.ArrayList;
import java.util.Scanner;

import DAO.MemberDAO;
import DTO.Basic;
import DTO.Membership;
import DTO.Premium;
import DTO.Stand;

public class Run {
	public static void main(String[] args) {

		MemberDAO dao = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n*** Netflix 회원 관리 시스템 ***");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 목록 출력");
			System.out.println("3. 회원 정보 검색");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 정보 삭제");
			System.out.print("6. 시스템 종료\n>> ");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {// 1.회원등록
				System.out.print("\n회원 등급 선택\n1. Basic\n2. Standard\n3. Premium\n>> ");
				int grade = Integer.parseInt(sc.nextLine());
				System.out.print("신규회원 ID(7자 이내) : ");
				String id = sc.nextLine();
				System.out.print("신규회원 닉네임(4자 이내) : ");
				String nickname = sc.nextLine();
				System.out.print("신규회원 가입일(210505 형식으로) :");
				String signup_date = sc.nextLine();
				System.out.print("신규회원 포인트 : ");
				int point = Integer.parseInt(sc.nextLine());

				if (grade == 1) {// Basic
					dao.insert(new Basic(id, nickname, signup_date, point));
				} else if (grade == 2) {// Standard
					dao.insert(new Stand(id, nickname, signup_date, point));
				} else if (grade == 3) {// Premium
					dao.insert(new Premium(id, nickname, signup_date, point));
				}
//				dao.insertSample();

				// ====================================================================================
			} else if (menu == 2) {// 2.회원출력
				System.out.println("Id" + "\t" + "등급" + "\t" + "닉네임" + "\t" + "가입일" + "\t" + "포인트");
				ArrayList<Membership> list = dao.selctAll();
				for (Membership dto : list) {
					System.out.println(dto.toString());
				}

//  ====================================================================================                   
			} else if (menu == 3) {// 3. 회원 정보 검색
				System.out.print("1. ID로 검색\n");
				System.out.print("2. 닉네임으로 검색 \n>> ");
				int search = Integer.parseInt(sc.nextLine());

				if (search == 1) {
					System.out.print("검색 할 ID 입력: ");
					String id = sc.nextLine();
					Membership dto = dao.selectById(id);
					if (dto != null) {
						System.out.println("ID\t등급\t닉네임\t가입일\t포인트");
						System.out.println(dto.toString());
					}

				} else if (search == 2) {
					System.out.print("검색 할 닉네임 입력: ");
					String nickname = sc.nextLine();
					dao.selectByNickName(nickname);
					Membership dto = dao.selectByNickName(nickname);
					if (dto != null) {
						System.out.println("ID\t등급\t닉네임\t가입일\t포인트");
						System.out.println(dto.toString());
					}

				}
				// ====================================================================================
			} else if (menu == 4) {// 4. 회원 정보 수정
				System.out.println("ID\t등급\t닉네임\t가입일\t포인트");
				ArrayList<Membership> list = dao.selctAll();
				for (Membership dto : list) {
					System.out.println(dto.toString());
				}
				System.out.print("수정할 회원의 ID 입력: ");
				String id = sc.nextLine();
				System.out.print("수정할 닉네임(4자 이내) : ");
				String nickname = sc.nextLine();
				System.out.print("수정할 포인트 : ");
				int point = Integer.parseInt(sc.nextLine());

				int rs = dao.modify(id, nickname, point);
				if (rs == 1) {
					System.out.println("변경이 완료되었습니다.");
				} else if (rs == -1) {
					System.out.println("변경할수 없는 ID입니다.");
				}
				// ====================================================================================
			} else if (menu == 5) {// 5. 회원 정보 삭제
				System.out.println("ID\t등급\t닉네임\t가입일\t포인트");
				ArrayList<Membership> list = dao.selctAll();
				for (Membership dto : list) {
					System.out.println(dto.toString());
				}
				System.out.print("삭제할 회원의 ID 입력: ");
				String id = sc.nextLine();
				int rs = dao.delete(id);
				if (rs == 1) {
					System.out.println("삭제 완료되었습니다.");
				} else if (rs == -1) {
					System.out.println("삭제할수 없는 ID입니다.");
				}

//  ==================================================================================== 
			} else if (menu == 6) {// 6. 시스템종료
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("\n메뉴를 정확히 입력해주세요.");
			}
		}
	}
}
