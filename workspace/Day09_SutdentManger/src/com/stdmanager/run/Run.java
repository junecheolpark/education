package com.stdmanager.run;

import java.util.Scanner;

import com.stdmanager.dto.Student;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stdList = new Student[10];
		int index = 0;
		
		while (true) {
			System.out.println("\n===== �л� ���� ���α׷� =====");
			System.out.println("�޴��� �����ϼ���. (�����ư : q)\n");
			System.out.println("1. �л� ���� ���");
			System.out.println("2. �л� ��� Ȯ��");
			System.out.println("3. �л� ���� ����");
			System.out.println("4. �л� ���� ����");
			System.out.print(">> ");
			String input = sc.nextLine();
			
			if(input.equals("1")) { // �л� ���� ���
				System.out.print("��ȣ�� �Է��ϼ��� >> ");
				int no = Integer.parseInt(sc.nextLine());
				System.out.print("�̸��� �Է��ϼ��� >> ");
				String name = sc.nextLine();
				System.out.print("���̸� �Է��ϼ��� >> ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("������ �Է��ϼ���(��/��) >> ");
				char gender = sc.nextLine().charAt(0);
				
				Student std = new Student(no, name, age, gender);
				stdList[index++] = std;	
				
			}
		}
	}
}
