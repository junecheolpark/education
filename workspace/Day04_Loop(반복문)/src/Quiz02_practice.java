import java.util.Scanner;

public class Quiz02_practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 3000;
		int num2 = 0;
		while (true) {
		
			System.out.println("\n" + "=== ATM 시뮬레이터 ===");
			System.out.println("1. 잔금조회\n2. 입금하기\n3. 출금하기\n4. 종료하기");
			System.out.print(">> ");
			int input = Integer.parseInt(sc.nextLine());
			if (input == 1) {
				System.out.println("현재 보유잔액은 " + num1 + " 입니다.");
	
			}else if (input == 2) {
				System.out.println("얼마를 입금하시겠습니까?");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println(num2 + "원이 입금되었습니다.");
				num1 += num2;
			}else if (input == 3) {
				System.out.println("얼마를 출금 하시겠습니까?");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println(num2 + "원이 출금되었습니다.");
			num1 -= num2;
			}else if (input == 4) {
				System.out.println("거래가 종료 되었습니다.");
				break;
			
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}

	}
}
