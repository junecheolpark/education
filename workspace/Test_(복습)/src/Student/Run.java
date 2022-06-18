package Student;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();
		while (true) {
			System.out.println("===== �л� ���� ���α׷� =====");
			System.out.println("�޴��� �����ϼ���. (�����ư : q\n");

			System.out.println("1.�л� ���� ���");
			System.out.println("2.�л� ��� Ȯ��");
			System.out.println("3.�л� ���� ����");
			System.out.println("4.�л� ���� ����");
			System.out.print(">> ");
			String input = sc.nextLine();

			if (input.equals("1")) {
				System.out.print("��ȣ�� �Է��ϼ��� >> ");
				int no = Integer.parseInt(sc.nextLine());
				System.out.print("�̸��� �Է��ϼ��� >> ");
				String name = sc.nextLine();
				System.out.print("���̸� �Է��ϼ��� >> ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("������ �Է��ϼ���(��/��) >> ");
				char gender = sc.nextLine().charAt(0);

				StudentDTO std = new StudentDTO(no, name, age, gender);
				dao.insert(std);

			} else if (input.equals("2")) {
			
				StudentDTO[] List = dao.selectAll();
				for (int i = 0; i < List.length; i++) {
					if (List[i] != null) {
						System.out.println(List[i]);
					}
				}
			} else if (input.equals("3")) {
				System.out.print("������ �л��� ��ȣ�� �Է��ϼ��� >> ");
				int no = Integer.parseInt(sc.nextLine());
				if(dao.doesNoExist(no)) {
					// ����
				}else {
					// �ٽ� �Է��ض� ���� 
				}
				System.out.print("������ �̸��� �Է��ϼ��� >> ");
				String name = sc.nextLine();

				System.out.print("������ ���̸� �Է��ϼ��� >> ");
				int age = Integer.parseInt(sc.nextLine());

				System.out.print("������ ������ �Է��ϼ���(��/��) >> ");
				char gender = sc.nextLine().charAt(0);
				
				dao.modify(new StudentDTO(no, name, age, gender));

				
			} else if (input.equals("4")) {
				System.out.print("������ �л��� ��ȣ�� �Է��ϼ��� >> ");
				int no = Integer.parseInt(sc.nextLine());
				// stdList�迭�� 0������ ������ ���鼭 �ν��Ͻ��� �ּҰ��� . ���
				// no ����ʵ忡 �����ؼ� ������ ���� ����ڰ� �Է��� ���� ��
				dao.delete(no);
				
			} else if (input.equals("q")) { // ���α׷� ����
				System.out.println("���α׷� ����");

				break;
			} else { // ���� �޴� ����
				System.out.println("���� �޴��Դϴ�.");
			}

		}

	}

}
