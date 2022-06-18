package com.stdmanager.run;

import java.util.Scanner;

import com.stdmanager.dao.StudentDAO;
import com.stdmanager.dto.StudentDTO;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();

		while (true) {
			System.out.println("===== 학생 관리 프로그램 =====");
			System.out.println("메뉴를 선택하세요. (종료버튼 : q)");
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 목록 확인");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 삭제");
			System.out.print(">> ");
			String menu = sc.nextLine();

			if (menu.equals("1")) {
				System.out.print("번호를 입력하세요 >> ");
				int num = Integer.parseInt(sc.nextLine());
				System.out.print("이름을 입력하세요 >> ");
				String name = sc.nextLine();
				System.out.print("나이를 입력하세요 >> ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("성별을 입력하세요(남/여) >> ");
				char gender = sc.nextLine().charAt(0);

				StudentDTO std = new StudentDTO(num, name, age, gender);
				dao.insert(std);
			} else if (menu.equals("2")) {
//				StudentDTO[] list = dao.selectAll();
				dao.selectAll();
//				for (int i = 0; i < list.length; i++) {
//					if (list[i] != null) {
//						System.out.println(list[i]);
//					}
//				}
			} else if (menu.equals("3")) {
				System.out.print("번호를 입력하세요 >> ");
				int num = Integer.parseInt(sc.nextLine());
				System.out.print("이름을 입력하세요 >> ");
				String name = sc.nextLine();
				System.out.print("나이를 입력하세요 >> ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("성별을 입력하세요(남/여) >> ");
				char gender = sc.nextLine().charAt(0);

			} else if (menu.equals("4")) {
				System.out.print("번호를 입력하세요 >> ");
				int num = Integer.parseInt(sc.nextLine());
				dao.delete(num);
			} else if (menu.equals("q")) {
				System.out.println("프로그램 종료입니다.");

			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}

	}

}
