import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("==== 정수 사칙연산 프로그램 (1~ 100 사이 입력) ====");
		System.out.print("첫 번째 정수를 입력해 주세요. >> ");
		int num1 = Integer.parseInt(sc.nextLine());

		if (((num1 >= 0) && (num1 <= 100))) {

			System.out.print("두 번째 정수를 입력해 주세요. >> ");
			int num2 = Integer.parseInt(sc.nextLine());

			if (((num2 >= 0) && (num2 <= 100))) {
				System.out.print("연산자를 입력해 주세요 >> ");

			}else {
				System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
			}

			String g = sc.nextLine();
			
		int a = (num1 + num2);
		int b = (num1 - num2);
		int c = (num1 * num2);
		int d = (num1 / num2);
		
		switch(g) {
		case "+" : System.out.println("연산결과 : " + a); break;
		case "-" : System.out.println("연산결과 : " + b); break;
		case "*" : System.out.println("연산결과 : " + c); break;
		case "/" : System.out.println("연산결과 : " + d); break;
		default: System.out.println("잘못된 입력입니다 프로그램을 종료합니다.");
		}
		}else {
			System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
		}
	}
}


