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
				// ����ڰ� �Է��� ��ȣ�� ���� �ߺ��˻� �޼���
				
				System.out.print("�̸��� �Է��ϼ��� >> ");
				String name = sc.nextLine();
				System.out.print("���̸� �Է��ϼ��� >> ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("������ �Է��ϼ���(��/��) >> ");
				char gender = sc.nextLine().charAt(0);
				
				StudentDTO std = new StudentDTO(no, name, age, gender);
				dao.insert(std);
				
			}else if(input.equals("2")) { // �л� ��� Ȯ��
				
				ArrayList list = dao.selectAll();
				
				for(Object std : list) {
						System.out.println(std);
				}
			
			}else if(input.equals("3")) { // �л� ���� ����
				System.out.print("������ �л��� ��ȣ�� �Է��ϼ��� >> ");
				int no = Integer.parseInt(sc.nextLine());
				// ����ڰ� �Է��� ��ȣ�� �����ϴ� ��ȣ���� Ȯ���ϴ� �޼���
				
				if(dao.doesNoExist(no)) {
					// ����
				}else {
					// �ٽ� �Է��ض� ���� 
				}
				
				// Integer.parseInt -> ���ڰ� �ƴ� �Է°��� ���� ó�� �޼���
				// => ������� �Է°� ���õ� �޼����̱� ������ static �޼����
				// Run02 Ŭ������ ������ ��. 				
				
				System.out.print("������ �̸��� �Է��ϼ��� >> ");
				String name = sc.nextLine();
				
				System.out.print("������ ���̸� �Է��ϼ��� >> ");
				int age = Integer.parseInt(sc.nextLine());
				
				System.out.print("������ ������ �Է��ϼ���(��/��) >> ");
				char gender = sc.nextLine().charAt(0);
			
				dao.modify(new StudentDTO(no, name, age, gender));
			
							
			}else if(input.equals("4")) { // �л� ���� ����
				System.out.print("������ �л��� ��ȣ�� �Է��ϼ��� >> ");
				int no = Integer.parseInt(sc.nextLine());
				// ����ڰ� �Է��� ��ȣ�� �����ϴ� ��ȣ���� Ȯ���ϴ� �޼���
				
				// stdList�迭�� 0������ ������ ���鼭 �ν��Ͻ��� �ּҰ��� . ���
				// no ����ʵ忡 �����ؼ� ������ ���� ����ڰ� �Է��� ���� �� 				
				dao.delete(no);			
				
			}else if(input.equals("q")) { // ���α׷� ����
				System.out.println("���α׷� ����");
				break;
			}else { // ���� �޴� ����
				System.out.println("���� �޴��Դϴ�.");
			}
		}
	}
}















