package com.kh.student;

import java.util.ArrayList;
import java.util.Scanner;





public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();
		// == 카페 프로그램 ==
		// 1. 메뉴등록(insert) 2. 메뉴 수정 update 3. 메뉴 삭제 delete 4. 메뉴 조회 select 5. 전체 조회
		System.out.println("== 학생 프로그램 ==");
		System.out.println("1. 메뉴등록 \n2. 메뉴 수정 \n3. 메뉴 삭제 \n4. 메뉴 조회 \n5. 전체 조회");
		System.out.print(">> ");
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu == 1) {
			System.out.print("등록할 이름을 입력해 주세요 \n>> ");
			String name = sc.nextLine();
			System.out.print("등록할 번호를 입력해 주세요 \n>> ");
			String phon = sc.nextLine();
			System.out.print("등록할 날짜를 입력해 주세요 \n>> ");
			String birth = sc.nextLine();
			DTO dto = new DTO(0, name, phon, birth);
			try {
				
				int rs = dao.insert(dto);
				if (rs > 0) {
					System.out.println("데이터 입력 성공");
				}else {
					System.out.println("데이터 입력 실패");
				}
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("DB접속이 불안정 합니다.");
			}
		}else if(menu == 2) {
			System.out.print("수정할  이름을 입력하세요 \n>>");
			String name =sc.nextLine();
			System.out.print("수정할 번호를 입력하세요 \n>>");
			String phon =sc.nextLine();
			System.out.print("수정할 날짜를 입력하세요 \n>>");
			String birth =sc.nextLine();
			System.out.print("수정할 번호를 입력하세요 \n>>");
			int no = Integer.parseInt(sc.nextLine());
			DTO dto = new DTO(no, name, phon, birth);
			try {
				
				int rs = dao.update(dto);
				if (rs > 0) {
					System.out.println("수정 성공");
				}else {
					System.out.println("수정 실패");
				}
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("DB접속이 불안정 합니다.");
			}
			
		}else if(menu == 3) {
			System.out.println("삭제할 번호를 입력하세요");
			int no = Integer.parseInt(sc.nextLine());
			try {
				
				int rs = dao.delete(no);
				if( rs > 0) {
					System.out.println("삭제 성공");
				}else {
					System.out.println("삭제 실패");
				}
				
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("DB접속이 불안정 합니다.");
			}
		}else if(menu == 4) {
			System.out.println("조회할 제품번호를 입력하세요 >>");
			int no = Integer.parseInt(sc.nextLine());
			try {
				
				DTO rs = dao.select(no);
				if (rs != null) {
					System.out.println(rs);
				}else {
					System.out.println("데이터 조회 실패");
				}
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("DB접속이 불안정 합니다.");
			}
		}else if(menu == 5) {
		try {
			ArrayList<DTO> list = dao.selectAll();
			if(list != null) {
				for(DTO dto: list) {
					System.out.println(dto.toString());
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB접속이 불안정 합니다.");
		}
		}
			
		
	}
}
	
