import java.util.Scanner;

public class Quiz01_RSP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int computer = (int) (Math.random() * (3 - 1 + 1) + 1);

		while (true) {
			System.out.println("\n==== ���� ���� �� ����====");
			System.out.println("�Ʒ��� ���� �� �ϳ��� �����ϼ���. *�̱��� ���α׷��� �����մϴ�.");
			System.out.print("1. ����  2. ���� 3.  ��\n>> ");
			int input = Integer.parseInt(sc.nextLine());

			if (input == 1) {
				if (computer == 1) {
					System.out.println("��ǻ�� : ����		����� : ����");
					System.out.println("�����ϴ�!");
				} else if (computer == 2) {
					System.out.println("��ǻ�� : ����		����� : ����");
					System.out.println("�����ϴ�!");
				} else if (computer == 3) {
					System.out.println("��ǻ�� : ��		����� : ����");
					System.out.println("�̰���ϴ�!");
					break;
				}

			} else if (input == 2) {
				if (computer == 1) {
					System.out.println("��ǻ�� : ����		����� : ����");
					System.out.println("�̰���ϴ�!");
					break;
				} else if (computer == 2) {
					System.out.println("��ǻ�� : ����		����� : ����");
					System.out.println("�����ϴ�!");
				} else if (computer == 3) {
					System.out.println("��ǻ�� : ��		����� : ����");
					System.out.println("�����ϴ�!");
				}
			} else if (input == 3) {
				if (computer == 1) {
					System.out.println("��ǻ�� : ����		����� : ��");
					System.out.println("�����ϴ�!");
				} else if (computer == 2) {
					System.out.println("��ǻ�� : ����		����� : ��");
					System.out.println("�̰���ϴ�!");
					break;
				} else if (computer == 3) {
					System.out.println("��ǻ�� : ��		����� : ��");
					System.out.println("�����ϴ�!");
				}
			} else {
				System.out.println("�߸��Է��߽��ϴ�.");
			}
		}
	}
}
