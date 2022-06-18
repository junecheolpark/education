import java.util.Scanner;

public class quize4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 정수 사칙연산 프로그램 ====");
		System.out.print("첫 번째 정수를 입력해 주세요 >> ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력해 주세요 >> ");
		int num2 = sc.nextInt();
		
		System.out.println("15 + 10 = " + (num1 + num2));
		System.out.println("15 - 10 = " + (num1 - num2));
		System.out.println("15 * 10 = " + (num1 * num2));
		System.out.println("15 / 10 = " + (num1 / num2));
		
		
	}
}
