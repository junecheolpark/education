package com.stdmanager.run;

import java.util.Scanner;

import com.stdmanager.dao.StudentDAO;
import com.stdmanager.dto.StudentDTO;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();

		while (true) {
			System.out.println("===== �л� ���� ���α׷� =====");
			System.out.println("�޴��� �����ϼ���. (�����ư : q)");
			System.out.println("1. �л� ���� ���");
			System.out.println("2. �л� ��� Ȯ��");
			System.out.println("3. �л� ���� ����");
			System.out.println("4. �л� ���� ����");
			System.out.print(">> ");
			String menu = sc.nextLine();

			if (menu.equals("1")) {
				System.out.print("��ȣ�� �Է��ϼ��� >> ");
				int num = Integer.parseInt(sc.nextLine());
				System.out.print("�̸��� �Է��ϼ��� >> ");
				String name = sc.nextLine();
				System.out.print("���̸� �Է��ϼ��� >> ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("������ �Է��ϼ���(��/��) >> ");
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
				System.out.print("��ȣ�� �Է��ϼ��� >> ");
				int num = Integer.parseInt(sc.nextLine());
				System.out.print("�̸��� �Է��ϼ��� >> ");
				String name = sc.nextLine();
				System.out.print("���̸� �Է��ϼ��� >> ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("������ �Է��ϼ���(��/��) >> ");
				char gender = sc.nextLine().charAt(0);

			} else if (menu.equals("4")) {
				System.out.print("��ȣ�� �Է��ϼ��� >> ");
				int num = Integer.parseInt(sc.nextLine());
				dao.delete(num);
			} else if (menu.equals("q")) {
				System.out.println("���α׷� �����Դϴ�.");

			} else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}

	}

}
