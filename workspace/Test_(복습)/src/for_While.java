import java.util.Scanner;

public class for_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		������
//		 for(int i=2; i <=9; i++) {         
//			    System.out.printf("\n*** %d�� ***\n", i);
//			    
//			    for(int j=1; j <=9; j++) {
//			      System.out.printf("%d x %d = %d\n", i, j, i*j);
//			    }
//		 }

		/*
		 * for (int dan = 2; dan < 10; dan++) { for (int gob = 1; gob < 10; gob++) {
		 * System.out.println(dan + " * " + gob + " = " + dan * gob); } } while ������ �ٲٱ�
		 * 
		 * int dan = 2; while (dan < 10) { int gob = 1; while (gob < 10) {
		 * System.out.println(dan + " * " + gob + " = " + dan * gob); gob++; } dan++; }
		 */

		/*
		 * // �ֻ��� ���� ���� 6�� �Ǵ°�츦 ��� ����Ͻÿ� for (int num = 1; num < 7; num++) { for (int
		 * num1 = 1; num1 < 7; num1++) { if (num + num1 == 6) { System.out.println("(" +
		 * num + "," + num1 + ")"); } } }
		 */
		/*
		 * // ex6) ����ڷκ��� �ΰ��� ����(����,��)�� �Է¹޾� ����(����)�ؼ� ��(����)������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * int x = Integer.parseInt(sc.nextLine()); int y =
		 * Integer.parseInt(sc.nextLine()); if (x < y) { for (int i = x; i <= y; i++) {
		 * for (int j = x; j <= y; j++) { System.out.println("(" + i + "," + j + ")" +
		 * "���ϸ�" + i * j); }
		 * 
		 * } }
		 *//*
			 * System.out.println("���� �Է����ּ���"); int input = sc.nextInt();
			 * 
			 * int sum = 0; while (input > 0) { sum += input % 10; // ���� �� ����ڰ� 123�� �Է���
			 * �ߴٸ� ������ �ؼ� ���� ������ ���� summ�� �����Ѵ� input /= 10; // ����ڰ� �Է��� ������ ������ 10�� �ؾ� ������
			 * ���� �����µ� // ���� ���� ������ ���� ���� ��� �ݺ����� �ؼ� ���ϸ� �ȴ�. } System.out.println("����� " +
			 * sum + " �Դϴ�.");
			 */

//		ex10) �Ǻ���ġ(Fibonnaci) ������ ���� �� ���� ���ؼ� ���� ���� ����� ������ �����̴�. 
//	���� ��� ���� �� ���� 1�� 1�̶�� �� ���� ���� 2�� �ǰ� �� ���� ���� 1�� 2�� ���ؼ� 3�� �Ǿ 
//	1,1,2,3,5,8,13,21,... �� ���� ������ ����ȴ�. 1�� 1���� �����ϴ� �Ǻ���ġ ������ 10��° 
//	���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		for (int i = 0; i < 10; i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(" " + num3);
		}

	}
}
