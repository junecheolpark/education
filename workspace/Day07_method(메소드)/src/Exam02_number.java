import java.util.Scanner;

public class Exam02_number {
//	public static int smaller(int num1 , int num2) {
//		if(num1 < num2) {
//			return num1;
//		}else if(num2 < num1){
//			return num2;
//		}else {// �μ��� ������ ����
//			return 0;
//		}

//	}
	public static int getRanNum(int x, int y) {
		int RanNum = (int) ((Math.random() * (y - x + 1)) + x);
		return RanNum;
	}

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("�ּҰ��� �Է��ϼ�.");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("�ִ밪�� �Է��ϼ�.");
		int y = Integer.parseInt(sc.nextLine());
		// Meth.random() * (�ִ밪 - �ּҰ� +1) �ּҰ� ;

		for(int i = 0; i < 10; i++) {
			System.out.println("getRanNum(��) :" + getRanNum(x, y));
		}
		
		/*
		 * �޼��� > ���뼺/ ���뼺, �⵶�� ������
		 */

	}

}
