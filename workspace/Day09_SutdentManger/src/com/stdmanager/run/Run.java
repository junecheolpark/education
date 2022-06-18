package com.stdmanager.run;

import java.util.Scanner;

import com.stdmanager.dto.Student;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stdList = new Student[10];
		int index = 0;
		
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
				System.out.print("이름을 입력하세요 >> ");
				String name = sc.nextLine();
				System.out.print("나이를 입력하세요 >> ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("성별을 입력하세요(남/여) >> ");
				char gender = sc.nextLine().charAt(0);
				
				Student std = new Student(no, name, age, gender);
				stdList[index++] = std;	
				
			}
		}
	}
}
