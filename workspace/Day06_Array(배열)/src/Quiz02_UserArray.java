import java.util.Scanner;

public class Quiz02_UserArray {
	public static void main(String[] args) {
		// ����ڿ��� �Է¹��� ������ŭ int �� �迭�� ũ�⸦ �Ҵ�
		// �׸��� 1���� ���������� ���� ����
	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���ڸ� �Է��ϼ���");
//		int arr = Integer.parseInt(sc.nextLine());
//
//		int num[] = new int[arr];

//		for(int i : num) {
//			System.out.println(i + " ");

//		for (int i = 0; i < num.length; i++) {
//			num[i] = 1 + i;
//			System.out.println(num[i]);

			// try ~ catch : ����(����) ó��
			Scanner sc = new Scanner(System.in);
			try {		

			System.out.println("���ڸ� �Է��ϼ���");
			int arr = Integer.parseInt(sc.nextLine());

		}catch(NumberFormatException e) {
			System.out.println("�Է��� ���� ���ڰ� �ƴմϴ�.");
		}
			
		}

	}
//}

