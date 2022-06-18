package com.kh.cafe.copy;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CafeDAO dao = new CafeDAO();
		// == 카페 프로그램 ==
		// 1. 메뉴등록(insert) 2. 메뉴 수정 update 3. 메뉴 삭제 delete 4. 메뉴 조회 select 5. 프로그램 종료
		System.out.println("== 카페 프로그램 ==");
		System.out.println("1. 메뉴등록 \n2. 메뉴 수정 \n3. 메뉴 삭제 \n4. 메뉴 조회 \n5. 전체조회");
		System.out.print(">> ");
		int menu = Integer.parseInt(sc.nextLine());
		
		
		if(menu == 1) {
			System.out.print("등록할 메뉴의 이름을 입력해 주세요 \n>> ");
			String name = sc.nextLine();
			System.out.print("등록할 메뉴의 가격을 입력해 주세요 \n>> ");
			int price = Integer.parseInt(sc.nextLine());
			CafeDTO dto = new CafeDTO(0, name, price, null);
			try {
				
				int rs = dao.insert(dto);
				if (rs > 0) {
					System.out.println("메뉴 등록 성공");
				}else {
					System.out.println("메뉴 등록 실패");
				}
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("DB접속이 불안정 합니다.");
			}
		}else if(menu == 2) {
			System.out.print("수정할 제품의 번호 입력하세요 \n>>");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("수정할 제품의 이름을 입력하세요 \n>>");
			String name =sc.nextLine();
			System.out.print("수정할 제품의 가격을 입력하세요 \n>>");
			int price = Integer.parseInt(sc.nextLine());
			CafeDTO dto = new CafeDTO(id, name, price, null);
			try {
				int rs = dao.update(dto);
				if (rs > 0) {
					System.out.println("메뉴 수정 성공");
				}else {
					System.out.println("메뉴 수정 실패");
				}
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("DB접속이 불안정 합니다.");
			}
		}else if(menu == 3) {
			try {
				System.out.print("삭제할 메뉴의 id 값을 입력하세요 \n>> ");
				int id = Integer.parseInt(sc.nextLine());
				int rs = dao.delete(id);
				if (rs > 0) {
					System.out.println("메뉴 삭제 성공");
				}else {
					System.out.println("메뉴 삭제 실패");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}else if(menu == 4) {
			try {
				System.out.println("조회할 제품번호를 입력하세요 >>");
				int id = Integer.parseInt(sc.nextLine());
				CafeDTO rs = dao.select(id);
				if (rs != null) {
					System.out.println(rs);
				}else {
					System.out.println("데이터 조회 실패");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}else if(menu == 5) {
			try {
				for(int i = 0; i < 10; i++) {
					ArrayList<CafeDTO> list = dao.selectAll();
					if (list != null) {
						for(CafeDTO dto:list) {
							System.out.println(dto.toString());
						}
					}else {
						System.out.println("데이터 조회 실패");
					}
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(menu == 6) {
			System.out.println("프로그램을 종료합니다 ^^");
		}
		
	}
}
