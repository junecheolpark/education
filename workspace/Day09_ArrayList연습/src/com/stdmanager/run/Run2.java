package com.stdmanager.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.stdmanager.dao.StudentDAO;
import com.stdmanager.dto.StudentDTO;

public class Run2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		StudentDAO dao = new StudentDAO();
		
		while (true) {
			System.out.println("\n===== 학생 관리 프로그램 =====");
			System.out.println("메뉴를 선택하세요. (종료버튼 : q)\n");
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 목록 확인");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 삭제");
			System.out.print(">> ");
			String input = sc.nextLine();
			
			if(input.equals("1")) { // 학생 정보 등록
				System.out.print("번호를 입력하세요 >> ");
				int no = Integer.parseInt(sc.nextLine());
				// 사용자가 입력한 번호에 대한 중복검사 메서드
				
				System.out.print("이름을 입력하세요 >> ");
				String name = sc.nextLine();
				System.out.print("나이를 입력하세요 >> ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("성별을 입력하세요(남/여) >> ");
				char gender = sc.nextLine().charAt(0);
				
				StudentDTO std = new StudentDTO(no, name, age, gender);
				dao.insert(std);
				
			}else if(input.equals("2")) { // 학생 목록 확인
				
				ArrayList list = dao.selectAll();
				
				for(Object std : list) {
						System.out.println(std);
				}
			
			}else if(input.equals("3")) { // 학생 정보 수정
				System.out.print("수정할 학생의 번호를 입력하세요 >> ");
				int no = Integer.parseInt(sc.nextLine());
				// 사용자가 입력한 번호가 존재하는 번호인지 확인하는 메서드
				
				if(dao.doesNoExist(no)) {
					// 수정
				}else {
					// 다시 입력해라 문구 
				}
				
				// Integer.parseInt -> 숫자가 아닌 입력값에 대한 처리 메서드
				// => 사용자의 입력과 관련된 메서드이기 때문에 static 메서드로
				// Run02 클래스에 만들어야 함. 				
				
				System.out.print("수정할 이름을 입력하세요 >> ");
				String name = sc.nextLine();
				
				System.out.print("수정할 나이를 입력하세요 >> ");
				int age = Integer.parseInt(sc.nextLine());
				
				System.out.print("수정할 성별을 입력하세요(남/여) >> ");
				char gender = sc.nextLine().charAt(0);
			
				dao.modify(new StudentDTO(no, name, age, gender));
			
							
			}else if(input.equals("4")) { // 학생 정보 삭제
				System.out.print("삭제할 학생의 번호를 입력하세요 >> ");
				int no = Integer.parseInt(sc.nextLine());
				// 사용자가 입력한 번호가 존재하는 번호인지 확인하는 메서드
				
				// stdList배열을 0번부터 끝까지 돌면서 인스턴스의 주소값에 . 찍고
				// no 멤버필드에 접근해서 가져온 값을 사용자가 입력한 값과 비교 				
				dao.delete(no);			
				
			}else if(input.equals("q")) { // 프로그램 종료
				System.out.println("프로그램 종료");
				break;
			}else { // 없는 메뉴 선택
				System.out.println("없는 메뉴입니다.");
			}
		}
	}
}















