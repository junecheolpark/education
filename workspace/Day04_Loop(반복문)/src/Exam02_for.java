import java.util.Scanner;

public class Exam02_for {
	public static void main(String[]args) {
		
		
		Scanner sc = new Scanner(System.in);
		
//		int num = Integer.parseInt(sc.nextLine());
//		
//		for(int i = 1; i <= num; i++) {
//			System.out.println(i);
//		}
	
//		int num = Integer.parseInt(sc.nextLine());
		
//		for(int i = 1; i<num; i=i+2){
//			   System.out.print(i + " ");
//			  }
		
		
//		int num = Integer.parseInt(sc.nextLine());
//		for(int i = 1; i<num; i++){
//			if (i % 2 == 1)
//			   System.out.print(i + " ");
//			  }

	
//		for(int i= 1; i < 6; i++) {
//		if(i != 3) {
//			System.out.println(i + " ");
//		}
//		}
		
		// continue > ���� ����ǰ� �ִ� �ݺ��帧�� ���� 
		//�����ִ� ������ ���������� �ǳ� �ٰԵ�.
//		for(int i= 1; i < 6; i++) {
//		if(i == 3) {
//			continue;
//		}
//			System.out.println(i + " ");
//		
//		}
		
		
		// ����ڿ��� �Է°��� ���� ��
		// 1���� �Է°������� ��ü ���� ���
		// �Է°� : 5
		// 1+2+3+4+5
		System.out.print("���ڸ� �Է��Ͻÿ� >>");
		int a = Integer.parseInt(sc.nextLine());
		
		// �������� : �ݺ��� / ���ǹ� Ȥ�� �޼���(���)��  {} �� ���������� ����� �� �ִ� ����
		int sum = 0;
		for (int i = 1; i <= a ; i++) {
//			if (i == a) {
				System.out.println(i);
				sum += i;
//			}
		}
		System.out.println(sum);
	}
}
