import java.util.Scanner;

public class Quiz03_VendingMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cola = 0;
		int cola1 = 1000;
		int cider = 0;
		int plum = 0;
		int money = 3000;

		while (true) {
			System.out.println("\n=== 자판기 시뮬레이터 ===");
			System.out.println("음료수를 선택하세요.");
			System.out.println("1. 콜라("+cola1+") 2. 사이다(800) 3. 매실차(1500) " 
			+ "0.소지품확인 10. 자판기 종료");
			int input = Integer.parseInt(sc.nextLine());
			if (input == 1 && money > cola1) {
				System.out.println("콜라를 구매했습니다.");
				System.out.println("콜라 +1");
				System.out.println("소지금 -("+cola1+")");
				cola += 1;
				money -= cola;
			} else if (input == 2 && money > 800) {
				System.out.println("사이다를 구매했습니다.");
				System.out.println("사이다 +1");
				System.out.println("소지금 -800");
				cider += 1;
				money -= 800;
			} else if (input == 3 && money > 1500) {
				System.out.println("매실차를 구매했습니다.");
				System.out.println("매실차 +1");
				System.out.println("소지금 -1500");
				plum += 1;
				money -= 1500;
			} else if (input == 0) {
				System.out.println("====소지품 목록====");
				System.out.println("소지금 :" + money);
				System.out.println("콜라 :" + cola + "개");
				System.out.println("사이다 :" + cider + "개");
				System.out.println("사이다 :" + plum + "개");
				System.out.println("================");
			} else if (input == 10) {
				System.out.println("자판기를 종료합니다.");
				break;
			} else if (input != 1 && input != 2 && input != 3 && input != 0 && input != 10) {
				System.out.println("입력한 숫자를 다시 확인해주세요.");
			} else {
				System.out.println("잔액이 부족합니다.");
			}

		}

	}
}
