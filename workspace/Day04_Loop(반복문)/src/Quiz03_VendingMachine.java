import java.util.Scanner;

public class Quiz03_VendingMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cola = 0;
		int cola1 = 1000;
		int cider = 0;
		int plum = 0;
		int money = 3000;

		while (true) {
			System.out.println("\n=== ���Ǳ� �ùķ����� ===");
			System.out.println("������� �����ϼ���.");
			System.out.println("1. �ݶ�("+cola1+") 2. ���̴�(800) 3. �Ž���(1500) " 
			+ "0.����ǰȮ�� 10. ���Ǳ� ����");
			int input = Integer.parseInt(sc.nextLine());
			if (input == 1 && money > cola1) {
				System.out.println("�ݶ� �����߽��ϴ�.");
				System.out.println("�ݶ� +1");
				System.out.println("������ -("+cola1+")");
				cola += 1;
				money -= cola;
			} else if (input == 2 && money > 800) {
				System.out.println("���̴ٸ� �����߽��ϴ�.");
				System.out.println("���̴� +1");
				System.out.println("������ -800");
				cider += 1;
				money -= 800;
			} else if (input == 3 && money > 1500) {
				System.out.println("�Ž����� �����߽��ϴ�.");
				System.out.println("�Ž��� +1");
				System.out.println("������ -1500");
				plum += 1;
				money -= 1500;
			} else if (input == 0) {
				System.out.println("====����ǰ ���====");
				System.out.println("������ :" + money);
				System.out.println("�ݶ� :" + cola + "��");
				System.out.println("���̴� :" + cider + "��");
				System.out.println("���̴� :" + plum + "��");
				System.out.println("================");
			} else if (input == 10) {
				System.out.println("���Ǳ⸦ �����մϴ�.");
				break;
			} else if (input != 1 && input != 2 && input != 3 && input != 0 && input != 10) {
				System.out.println("�Է��� ���ڸ� �ٽ� Ȯ�����ּ���.");
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
			}

		}

	}
}
