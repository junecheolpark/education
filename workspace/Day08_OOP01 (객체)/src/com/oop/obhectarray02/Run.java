package com.oop.obhectarray02;

import java.util.Scanner;

import com.oop.objacktarray01.Laptop;

public class Run {
	public static void main(String[] args) {
		
		// 프로그램을 실행시키면
		// === laptop 등록 프로그램====
		// 1. 등록
		// 2. 조회(전체)
		// 3. 종료
		
		Scanner sc = new Scanner(System.in);
		Laptop[] lt = new Laptop[3];
		int count = 0;

	

		vand: while (true) {
			System.out.println("=== laptop 등록 프로그램====");
			System.out.println("1. 등록");
			System.out.println("2. 조회(전체)");
			System.out.println("3. 조회(개별)");
			System.out.println("4. 종료");
			System.out.println("메뉴를 입력해주세요.");
			int menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				if (count < lt.length) {
					System.out.print("brand를 입력하세요. : ");
					String brand = sc.nextLine();

					System.out.print("price를 입력하세요. : ");
					int price = Integer.parseInt(sc.nextLine());

					System.out.print("color를 입력하세요. : ");
					String color = sc.nextLine();
					lt[count] = new Laptop(brand, price, color);
					System.out.println(lt[count].printAll());
					count++;
				}else {
					System.out.println("등록을 종료 하겠습니다."); continue;
				}

			} else if (menu == 2) {
				for (int i = 0; i < lt.length; i++) {
					if (lt[i] != null) {
						System.out.println(i + ". " + lt[i].printAll());
					}
				}
			} else if (menu == 3) {				
				System.out.println("번호를 입력하세요");
				int num = Integer.parseInt(sc.nextLine());
				if(lt[num] != null) {
					System.out.println(num + ". " + lt[num].printAll());
				}else {
					System.out.println("입력된 정보가 없습니다.");
				}
				
			}  else if (menu == 4) {
				System.out.println("프로그램을 종료 하겠습니다.");
				break vand;
			} else {
				System.out.println("잘못입력했어요.");
			}
		}

	}

}
