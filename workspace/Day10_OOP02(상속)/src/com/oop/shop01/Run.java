package com.oop.shop01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		
		// 아이스크림 재고 관리 프로그램
		Scanner sc = new Scanner(System.in);
		Shop baskin = new Shop("베스킨라빈스31", "09:00", "21:00", new Product[10]);
		/*
		 * 가게에 메뉴가 추가될때마다 따라오는 문제점 
		 * 1. 메뉴가 추가될때마다 생성자, getter/setter, 멤버필드 -> 똑같은 코드 반복 -> 코드 중복도 증가
		 * -> 상속을 통해 문제 해결 
		 * 2. index, add, print 메서드가 연쇄적으로 증가 -> 코드 결합도 증가 
		 * 3. 저장소(배열) 사이즈 문제, 추가, 삭제, 수정 복잡  
		 * */
				
//		IceCream[] iceCream = new IceCream[100];
		//Shop baskin = new Shop("BaskinRobbins31", "09:00", "21:00", iceCream);
		
		while(true) {
			System.out.println("***** baskin 재고 관리 프로그램 ******");
			// 1.아이스크림 등록 2. 아이스크림 목록 확인  3. 가게 정보 확인 0. 프로그램 종료
			System.out.println("1. 제품 등록");
			System.out.println("2. 제품 목록 확인");
			System.out.println("3. 가게 정보 확인");
			System.out.println("0. 프로그램 종료");
			System.out.print(">> ");
			
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				System.out.println("등록할 제품을 선택하세요.");
				System.out.println("1. 아이스크림");
				System.out.println("2. 빵");
				System.out.println("3. 음료");
				System.out.print(">> ");
				int pd = Integer.parseInt(sc.nextLine());
				
				System.out.print("품번 입력 >> ");
				String product_no = sc.nextLine();
				
				System.out.print("이름 입력 >> ");
				String name = sc.nextLine();
				
				System.out.print("가격 입력 >> ");
				int price = Integer.parseInt(sc.nextLine());
				
				
				if(pd == 1) {
					baskin.addProduct(new IceCream(product_no, name, price));
				}else if(pd == 2) {
					baskin.addProduct(new Bread(product_no, name, price));
				}else if(pd == 3) {
					baskin.addProduct(new Beverage(product_no, name, price));
				}
				
				//baskin.addIceCream(new IceCream(product_no, name, price));				
			}else if(menu == 2) {
				
				//System.out.println( baskin.printIceCream() );
				
			}else if(menu == 3) {
				
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("잘못입력했습니다.");
			}
		}
	}
}











