import java.util.Scanner;

public class Exam05_Delete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		// �迭 ����
		// �迭�� ó�� ���� �� ������ ����

		int[] arr = { 1, 2, 3 };
		// int�� �ʱⰪ�� 0�� �̿��� �ǹ̾��� ������ ����� ������.
		arr[1] = 0;

		for (int i : arr) {
			System.out.println(i);
		}
		int[] temp = new int[2];
		for (int i = 0; i < 3; i++) {
			temp[i] = arr[i];

		}
		*/
	/*	
		String[] temp = { "abc", "������", "50" };
		temp[0] = null;
		for (String s : temp) {
			if (s != null) {
				System.out.println(s);
			}

		}

	*/
		// int�� �迭 �ȿ��� ����ڰ� �Է��Ѱ��� �����ϱ�.
		
		int[] Arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int num = 0;
		// ����ڰ� �Է��� ���� ����ִ� �ε����� 0���� �ٲٽÿ�
	/*	try {
			System.out.println("���ڸ� �Է��Ͻÿ�.");
			int num = Integer.parseInt(sc.nextLine());
			Arr[num - 1] = 0;
		}catch(Exception e) {
			System.out.println("0~10 ������ ���ڸ� �Է����ּ���.");
		}
						
		for(int i : Arr) {
			System.out.print(i + " ");
		}
		*/
		try {
			System.out.println("���ڸ� �Է��Ͻÿ�.");
			num = Integer.parseInt(sc.nextLine());

		}catch(Exception e) {
			System.out.println("0~10 ������ ���ڸ� �Է����ּ���.");
		}
		System.out.println("����� �Է°� : " + num);
		
		for(int i = 0; i< Arr.length; i++){
			if(Arr[i] == num) {
				Arr[i] = 0;
			}
			System.out.println(Arr[i] + " ");
		}
		
		
		
		
		

	}
}
