import java.util.Scanner;

public class Quiz03_Venezia {
	public static void main(String[] args) {

		// ����Ÿ�ڿ��� - �꼺��
		// ������ ������ �������� ����� �������� �ð��� ��
		// -> system.currentTimeMillis() -> ����ð��� long �� �����ͷ� �̾���

		Scanner sc = new Scanner(System.in);
		String[] name = new String[] { "�����ڵ�", "��ƴپ�", "����Ż��", "���󰬴�" };
		int num = name.length;

		
	

		System.out.println("==== ����ġ�� ���ӿ� ���� �� ȯ���մϴ� ====");
		System.out.println("1. ���� ����");
		System.out.println("2. ���� ����");
		System.out.print("�޴��� �����ϼ��� >> ");
		int menu = Integer.parseInt(sc.nextLine());

		if (menu == 1) {
			long start = System.currentTimeMillis();
			System.out.println("���� ��ŸƮ!");
			while (true) {
				if 	
				(num != 0) {
					for (int q = 0; q < name.length; q++) {
						System.out.print(name[q] + " ");
					}
					System.out.println();
					System.out.print("�Է� >> ");

					String str = sc.nextLine();
					for (int i = 0; i < name.length; i++) {
						if (name[i].equals(str)) {
							name[i] = "";
							num--;
						}
					}
				}else {
					System.out.println("Clear !");
					long end = System.currentTimeMillis();
					System.out.println(((end - start) / 1000) + "��");
					System.out.println("===== Goodbye Venezia:) =====");
					break;
				}

			}
		} else if (menu == 2) {
			System.out.println("�ȳ���������!");
		} else if (menu != 1 && menu != 2) {
			System.out.println("�߸����Է��Դϴ�"); 
		}

	}
}
