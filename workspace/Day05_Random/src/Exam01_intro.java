import java.util.Scanner;

public class Exam01_intro {
	public static void main(String[] args) {

		/*
		 * ������ �� ���� -> Math.random() : 0.0 ~ 1.0 ������ ������ ����
		 * 
		 */
//		System.out.println( Math.random() );

//		for(int i = 0 ; i < 6; i++  ) {
//			System.out.println(Math.random());
//		}

//		 ������ ���� ���� ������ ������ ���� �̾Ƴ��� ���� ��
//		(Math.random() * (�ִ밪 - �ּҰ� + 1)) + �ּҰ�

//		for(int i = 0;i < 10; i++) {
//			System.out.println( (char)((Math.random() * (122 - 65 +1)) + 65));
//		}

		// �����Ѱ�
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Ȧ/¦ �Է��Ͻÿ�");
//		String input = sc.nextLine();
//		int a = (int) (Math.random() * (10 - 1 + 1) + 1);
//		System.out.println(a);
//		if (input.equals("¦") && (a % 2 == 0)) {
//			System.out.println("����!");
//		} else if (input.equals("Ȧ") && (a % 2 == 1)) {
//			System.out.println("����!");
//		} else {
//			System.out.println("����!");
//
//		}

		// ������� �Ѱ�
		Scanner sc = new Scanner(System.in);

		int min = 1;
		int max = 10;
		int rannum = (int) (Math.random() * (10 - 1 + 1) + 1);
//		String rs;
		String rs = null;

		if (rannum % 2 == 0) {
			rs = "¦";
//		} else {
		} else if (rannum % 2 == 0) {
			rs = "Ȧ";
		}
		System.out.println(rannum);
		System.out.println("==== Ȧ/¦ ���߱� ====");
		System.out.println("Ȧ/¦�� �Է��ϼ���");
		String input = sc.nextLine();

		if (input.equals(rs)) {
			System.out.println("����!");
		} else {
			System.out.println("����!");
		}

	}//
}
