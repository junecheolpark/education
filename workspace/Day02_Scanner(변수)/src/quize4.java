import java.util.Scanner;

public class quize4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== ���� ��Ģ���� ���α׷� ====");
		System.out.print("ù ��° ������ �Է��� �ּ��� >> ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��� �ּ��� >> ");
		int num2 = sc.nextInt();
		
		System.out.println("15 + 10 = " + (num1 + num2));
		System.out.println("15 - 10 = " + (num1 - num2));
		System.out.println("15 * 10 = " + (num1 * num2));
		System.out.println("15 / 10 = " + (num1 / num2));
		
		
	}
}
