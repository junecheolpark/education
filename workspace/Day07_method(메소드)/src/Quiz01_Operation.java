
public class Quiz01_Operation {
	public static int plus(int a, int b) {
		return a + b;
	}

	public static int minus(int a, int b) {

		return a - b;
	}

	public static int na(int a, int b) {

		return a / b;
	}

	public static int gop(int a, int b) {

		return a * b;
	}

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;

		/*
		 * + - * / �� �����ϴ� ������ �޼��带 ������ ������� ����� ������
		 * 
		 */

		System.out.println(plus(num1, num2));
		System.out.println(minus(num1, num2));
		System.out.println(na(num1, num2));
		System.out.println(gop(num1, num2));
		
		

	}
}
