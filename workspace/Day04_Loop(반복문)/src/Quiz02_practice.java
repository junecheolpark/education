import java.util.Scanner;

public class Quiz02_practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 3000;
		int num2 = 0;
		while (true) {
		
			System.out.println("\n" + "=== ATM �ùķ����� ===");
			System.out.println("1. �ܱ���ȸ\n2. �Ա��ϱ�\n3. ����ϱ�\n4. �����ϱ�");
			System.out.print(">> ");
			int input = Integer.parseInt(sc.nextLine());
			if (input == 1) {
				System.out.println("���� �����ܾ��� " + num1 + " �Դϴ�.");
	
			}else if (input == 2) {
				System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�?");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println(num2 + "���� �ԱݵǾ����ϴ�.");
				num1 += num2;
			}else if (input == 3) {
				System.out.println("�󸶸� ��� �Ͻðڽ��ϱ�?");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println(num2 + "���� ��ݵǾ����ϴ�.");
			num1 -= num2;
			}else if (input == 4) {
				System.out.println("�ŷ��� ���� �Ǿ����ϴ�.");
				break;
			
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}

	}
}
