package Run;

import java.util.ArrayList;
import java.util.Scanner;

import DAO.MemberDAO;
import DTO.Basic;
import DTO.Membership;
import DTO.Premium;
import DTO.Stand;

public class Run {
	public static void main(String[] args) {

		MemberDAO dao = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n*** Netflix ȸ�� ���� �ý��� ***");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ��� ���");
			System.out.println("3. ȸ�� ���� �˻�");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ����");
			System.out.print("6. �ý��� ����\n>> ");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {// 1.ȸ�����
				System.out.print("\nȸ�� ��� ����\n1. Basic\n2. Standard\n3. Premium\n>> ");
				int grade = Integer.parseInt(sc.nextLine());
				System.out.print("�ű�ȸ�� ID(7�� �̳�) : ");
				String id = sc.nextLine();
				System.out.print("�ű�ȸ�� �г���(4�� �̳�) : ");
				String nickname = sc.nextLine();
				System.out.print("�ű�ȸ�� ������(210505 ��������) :");
				String signup_date = sc.nextLine();
				System.out.print("�ű�ȸ�� ����Ʈ : ");
				int point = Integer.parseInt(sc.nextLine());

				if (grade == 1) {// Basic
					dao.insert(new Basic(id, nickname, signup_date, point));
				} else if (grade == 2) {// Standard
					dao.insert(new Stand(id, nickname, signup_date, point));
				} else if (grade == 3) {// Premium
					dao.insert(new Premium(id, nickname, signup_date, point));
				}
//				dao.insertSample();

				// ====================================================================================
			} else if (menu == 2) {// 2.ȸ�����
				System.out.println("Id" + "\t" + "���" + "\t" + "�г���" + "\t" + "������" + "\t" + "����Ʈ");
				ArrayList<Membership> list = dao.selctAll();
				for (Membership dto : list) {
					System.out.println(dto.toString());
				}

//  ====================================================================================                   
			} else if (menu == 3) {// 3. ȸ�� ���� �˻�
				System.out.print("1. ID�� �˻�\n");
				System.out.print("2. �г������� �˻� \n>> ");
				int search = Integer.parseInt(sc.nextLine());

				if (search == 1) {
					System.out.print("�˻� �� ID �Է�: ");
					String id = sc.nextLine();
					Membership dto = dao.selectById(id);
					if (dto != null) {
						System.out.println("ID\t���\t�г���\t������\t����Ʈ");
						System.out.println(dto.toString());
					}

				} else if (search == 2) {
					System.out.print("�˻� �� �г��� �Է�: ");
					String nickname = sc.nextLine();
					dao.selectByNickName(nickname);
					Membership dto = dao.selectByNickName(nickname);
					if (dto != null) {
						System.out.println("ID\t���\t�г���\t������\t����Ʈ");
						System.out.println(dto.toString());
					}

				}
				// ====================================================================================
			} else if (menu == 4) {// 4. ȸ�� ���� ����
				System.out.println("ID\t���\t�г���\t������\t����Ʈ");
				ArrayList<Membership> list = dao.selctAll();
				for (Membership dto : list) {
					System.out.println(dto.toString());
				}
				System.out.print("������ ȸ���� ID �Է�: ");
				String id = sc.nextLine();
				System.out.print("������ �г���(4�� �̳�) : ");
				String nickname = sc.nextLine();
				System.out.print("������ ����Ʈ : ");
				int point = Integer.parseInt(sc.nextLine());

				int rs = dao.modify(id, nickname, point);
				if (rs == 1) {
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				} else if (rs == -1) {
					System.out.println("�����Ҽ� ���� ID�Դϴ�.");
				}
				// ====================================================================================
			} else if (menu == 5) {// 5. ȸ�� ���� ����
				System.out.println("ID\t���\t�г���\t������\t����Ʈ");
				ArrayList<Membership> list = dao.selctAll();
				for (Membership dto : list) {
					System.out.println(dto.toString());
				}
				System.out.print("������ ȸ���� ID �Է�: ");
				String id = sc.nextLine();
				int rs = dao.delete(id);
				if (rs == 1) {
					System.out.println("���� �Ϸ�Ǿ����ϴ�.");
				} else if (rs == -1) {
					System.out.println("�����Ҽ� ���� ID�Դϴ�.");
				}

//  ==================================================================================== 
			} else if (menu == 6) {// 6. �ý�������
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("\n�޴��� ��Ȯ�� �Է����ּ���.");
			}
		}
	}
}
