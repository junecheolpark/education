package Run;

import java.util.Scanner;

import DAO.MemberDAO;
import DTO.Basic;
import DTO.Member;
import DTO.Premium;
import DTO.Standard;

public class Class {
	static Scanner sc = new Scanner(System.in);
	public static int getInput() {
		while(true) {
			try {
				System.out.print(">> ");
				int menu = Integer.parseInt(sc.nextLine());
				return menu;
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		int menu = 0;

		while (true) {
			
			System.out.println("*** Netflix ***");
			System.out.println("1. �ű� ȸ�� ��� \r\n" + "2. ȸ�� ��� ��� \r\n" + "3. ȸ�� ���� �˻� \r\n" + "4. ȸ�� ���� ���� \r\n"
					+ "5. ȸ�� ���� ���� \r\n" + "6. �ý��� ����");
			menu = getInput();
			if (menu==1) { // ���
				System.out.println("1. Basic \r\n"
					+ "2. Standard \r\n"
					+ "3. Premium \r\n");
				int input = getInput();
				
				System.out.print("�ű� ȸ�� ID(7�� �̳�) :");
				String id = sc.nextLine();
				System.out.print("�ű� ȸ�� �г��� (4���̳�) :");
				String nickname = sc.nextLine();
				System.out.print("�ű� ȸ�� ������ :");
				String signup_date = sc.nextLine();
				System.out.print("�ű� ȸ�� ����Ʈ :");
				int point = Integer.parseInt(sc.nextLine());
				
				if(input == 1) {
					dao.insert(new Basic(id, nickname, signup_date, point));
				}else if(input == 2) {
					dao.insert(new Standard(id, nickname, signup_date, point));
				}else if(input == 3) {
					dao.insert(new Premium(id, nickname, signup_date, point));
				}
//				dao.insertsample();

			} else if (menu==2 ) {// ���
				dao.Output();
			} else if (menu ==3 ) {// �˻�
				System.out.print("1. ID�� �˻� \n2. �г������� �˻�\n>> ");
				int input = Integer.parseInt(sc.nextLine());
				if (input == 1) {// id
					System.out.print("�˻� �� ID �Է�\n>> ");
					String id = sc.nextLine();

					Member dto = dao.selectById(id);
					if (dto != null) {
						System.out.println("ID\t���\t�г���\t������\t����Ʈ");
						System.out.println(dto.toString());
					} else {
						System.out.println("�г����� �߸��Է��Ͽ����ϴ�.");
					}
				} else if (input == 2) {// �г���
					System.out.print("�˻� �� �г��� �Է�\n>> ");
					String nickname = sc.nextLine();

					Member dto = dao.selectById(nickname);
					if (dto != null) {
						System.out.println("ID\t���\t�г���\t������\t����Ʈ");
						System.out.println(dto.toString());
					} else {
						System.out.println("�г����� �߸��Է��Ͽ����ϴ�.");
					}
				}
			} else if (menu== 4) {// ����
				
				dao.Output();

				System.out.print("���� �� ID �Է� :");
				String id = sc.nextLine();
				System.out.print("���� �� ȸ�� �г��� (4���̳�) :");
				String nickname = sc.nextLine();
				System.out.print("���� �� ȸ�� ����Ʈ :");
				int point = Integer.parseInt(sc.nextLine());

				int rs = dao.modify(id, nickname, point);
				if (rs == 1) {
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				}else if (rs == -1) {
					System.out.println("�����Ҽ� ���� ID�Դϴ�.");
				}

			}
			else if (menu ==5) {// ����
				dao.Output();
					
					System.out.print("���� �� ID �Է� :");
					String id = sc.nextLine();
					int rs = dao.delete(id);
					if (rs == 1) {
						System.out.println("���� �Ϸ�Ǿ����ϴ�.");
					}else if (rs == -1) {
						System.out.println("���� �Ҽ� ���� ID�Դϴ�.");
					}
			}
			else if (menu== 6) {// ����
				break;
			}
		}

	}
}
