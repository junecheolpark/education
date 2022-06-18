import java.util.Scanner;

public class Quiz01_RSP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int computer = (int) (Math.random() * (3 - 1 + 1) + 1);

		while (true) {
			System.out.println("\n==== 가위 바위 보 게임====");
			System.out.println("아래의 숫자 중 하나를 선택하세요. *이길경우 프로그램을 종료합니다.");
			System.out.print("1. 가위  2. 바위 3.  보\n>> ");
			int input = Integer.parseInt(sc.nextLine());

			if (input == 1) {
				if (computer == 1) {
					System.out.println("컴퓨터 : 가위		사용자 : 가위");
					System.out.println("비겼습니다!");
				} else if (computer == 2) {
					System.out.println("컴퓨터 : 바위		사용자 : 가위");
					System.out.println("졌습니다!");
				} else if (computer == 3) {
					System.out.println("컴퓨터 : 보		사용자 : 가위");
					System.out.println("이겼습니다!");
					break;
				}

			} else if (input == 2) {
				if (computer == 1) {
					System.out.println("컴퓨터 : 가위		사용자 : 바위");
					System.out.println("이겼습니다!");
					break;
				} else if (computer == 2) {
					System.out.println("컴퓨터 : 바위		사용자 : 바위");
					System.out.println("비겼습니다!");
				} else if (computer == 3) {
					System.out.println("컴퓨터 : 보		사용자 : 바위");
					System.out.println("졌습니다!");
				}
			} else if (input == 3) {
				if (computer == 1) {
					System.out.println("컴퓨터 : 가위		사용자 : 보");
					System.out.println("졌습니다!");
				} else if (computer == 2) {
					System.out.println("컴퓨터 : 바위		사용자 : 보");
					System.out.println("이겼습니다!");
					break;
				} else if (computer == 3) {
					System.out.println("컴퓨터 : 보		사용자 : 보");
					System.out.println("비겼습니다!");
				}
			} else {
				System.out.println("잘못입력했습니다.");
			}
		}
	}
}
