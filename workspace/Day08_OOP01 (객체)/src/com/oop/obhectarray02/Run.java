package com.oop.obhectarray02;

import java.util.Scanner;

import com.oop.objacktarray01.Laptop;

public class Run {
	public static void main(String[] args) {
		
		// ���α׷��� �����Ű��
		// === laptop ��� ���α׷�====
		// 1. ���
		// 2. ��ȸ(��ü)
		// 3. ����
		
		Scanner sc = new Scanner(System.in);
		Laptop[] lt = new Laptop[3];
		int count = 0;

	

		vand: while (true) {
			System.out.println("=== laptop ��� ���α׷�====");
			System.out.println("1. ���");
			System.out.println("2. ��ȸ(��ü)");
			System.out.println("3. ��ȸ(����)");
			System.out.println("4. ����");
			System.out.println("�޴��� �Է����ּ���.");
			int menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				if (count < lt.length) {
					System.out.print("brand�� �Է��ϼ���. : ");
					String brand = sc.nextLine();

					System.out.print("price�� �Է��ϼ���. : ");
					int price = Integer.parseInt(sc.nextLine());

					System.out.print("color�� �Է��ϼ���. : ");
					String color = sc.nextLine();
					lt[count] = new Laptop(brand, price, color);
					System.out.println(lt[count].printAll());
					count++;
				}else {
					System.out.println("����� ���� �ϰڽ��ϴ�."); continue;
				}

			} else if (menu == 2) {
				for (int i = 0; i < lt.length; i++) {
					if (lt[i] != null) {
						System.out.println(i + ". " + lt[i].printAll());
					}
				}
			} else if (menu == 3) {				
				System.out.println("��ȣ�� �Է��ϼ���");
				int num = Integer.parseInt(sc.nextLine());
				if(lt[num] != null) {
					System.out.println(num + ". " + lt[num].printAll());
				}else {
					System.out.println("�Էµ� ������ �����ϴ�.");
				}
				
			}  else if (menu == 4) {
				System.out.println("���α׷��� ���� �ϰڽ��ϴ�.");
				break vand;
			} else {
				System.out.println("�߸��Է��߾��.");
			}
		}

	}

}
