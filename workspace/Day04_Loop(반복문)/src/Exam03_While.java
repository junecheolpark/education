import java.util.Scanner;

public class Exam03_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* while(���ǽ�){
		 *  ������ �ڵ�
		 * }
		 * > for���� ���� ����(�ݺ�) 
		 *  ���� �������� �ڵ带 �ݺ��ؾ� ���� �𸦶�
		 *  Ư���� ���� �Ͼ�� ������ �ڵ带 ����ؼ� �ݺ��ؾ� �� ��
		 */
		
		while(true) {
			String a = sc.nextLine();
			System.out.println(a);
			if (a.equals("q")) {
				break;
			}
		}
		// ����ڰ� q�� �Է��� ������ ��� 1�� ����ϼ���.
//		for (int i = 0; i<10000; i++) {
//			System.out.println("�Է� >> ");
//			String a = sc.nextLine();
//			if (a.equals("q")) {
//				break;
//			}else {
//				System.out.println(1);
//			}
//			
//		}
		
		
		
		
		
		
	}
}
