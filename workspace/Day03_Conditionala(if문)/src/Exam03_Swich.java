import java.util.Scanner;

public class Exam03_Swich {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * switch : ���ǹ� if���� ����
		 * 
		 * switch(��){ case ���� : �����ڵ� case ���� : �����ڵ� case ���� : �����ڵ�
		 */

//		switch("���") { // String, char, int
//		case "�ٳ���" :
//			System.out.println("�ٳ����Դϴ�."); break;
//		case "���" :
//			System.out.println("����Դϴ�"); break;
//		case "���ξ���" :
//			System.out.println("���ξ����Դϴ�"); break;
//		}

		System.out.print("1, 2, 3 ���Է��ϼ��� >> ");
		int a = Integer.parseInt(sc.nextLine());
		switch (a) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default: // if���� else �� ���� ����
			System.out.println("�߸� �Է��߽��ϴ�.");
		}

	}
}
