import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("==== ���� ��Ģ���� ���α׷� (1~ 100 ���� �Է�) ====");
		System.out.print("ù ��° ������ �Է��� �ּ���. >> ");
		int num1 = Integer.parseInt(sc.nextLine());

		if (((num1 >= 0) && (num1 <= 100))) {

			System.out.print("�� ��° ������ �Է��� �ּ���. >> ");
			int num2 = Integer.parseInt(sc.nextLine());

			if (((num2 >= 0) && (num2 <= 100))) {
				System.out.print("�����ڸ� �Է��� �ּ��� >> ");

			}else {
				System.out.println("�߸��� �Է��Դϴ�. ���α׷��� �����մϴ�.");
			}

			String g = sc.nextLine();
			
		int a = (num1 + num2);
		int b = (num1 - num2);
		int c = (num1 * num2);
		int d = (num1 / num2);
		
		switch(g) {
		case "+" : System.out.println("������ : " + a); break;
		case "-" : System.out.println("������ : " + b); break;
		case "*" : System.out.println("������ : " + c); break;
		case "/" : System.out.println("������ : " + d); break;
		default: System.out.println("�߸��� �Է��Դϴ� ���α׷��� �����մϴ�.");
		}
		}else {
			System.out.println("�߸��� �Է��Դϴ�. ���α׷��� �����մϴ�.");
		}
	}
}


