import java.util.Scanner;

public class Exam02_if {
	public static void main(String[] srgs) {
		Scanner sc = new Scanner(System.in);
// ���� ������ ���ǹ�
		// �Է°� -> ����ڰ� �Է��� ���� 50���� �۴ٸ�1�� ���
		// 50 �̻��̶�� 2�� ���

//		System.out.print("���� �Է� >>");
//		int n1 = Integer.parseInt(sc.nextLine());
//
//		if (n1 >= 0 && n1 <= 50) {
//			System.out.println("1");
//		} else if (n1 >= 51 && n1 <= 100) {
//			System.out.println("2");
//		}

//		int s = sc.nextInt();
//		if (s >= 90) {
//			System.out.println(("A"));
//			if (s >= 95) {
//				System.out.println("�о������");
//				if (s == 100) {
//					System.out.println("����");
//				}
//			}
//		}

		int s = Integer.parseInt(sc.nextLine());
		if (s == 100) {
			System.out.println("�о������");
		}
		if ((s >= 70) && (s <= 99)) {
			System.out.println("���� ���");
		}
		if (s > 0 && s <= 69) {
			System.out.println(" ����� ���");
		}
		if (s > 0 && s <= 30) {
			System.out.println("�����н����");
		}

		else {
			System.out.println("������ �߸��Է��߽��ϴ�.");

		}

	}
}
