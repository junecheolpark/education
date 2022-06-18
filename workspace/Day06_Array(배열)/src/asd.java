import java.util.Scanner;

public class asd {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] strArr = { "마부위침", "흘깃흘깃", "부서지다", "싱글벙글", "귀모토각", "사흘돌이", "반근착절", "바람언덕", "백전백승" };

		int num = strArr.length;

		System.out.println("===== 베네치아 게임에 오신 걸 환영합니다 =====");

		System.out.println("1. 게임 시작");

		System.out.println("2. 게임 종료");

		System.out.print("메뉴를 선택하세요 >> ");

		int menu = sc.nextInt();

		String xx = sc.nextLine();

		if (menu == 1) {

			System.out.println("\n게임 Start!");

			long start = System.currentTimeMillis();

			while (true) {

				if (num != 0) {

					for (int i = 0; i < strArr.length; i++) {

						System.out.print(strArr[i] + " ");

					}

					System.out.println();

					System.out.print("입력 >> ");

					String str = sc.nextLine();

					for (int j = 0; j < strArr.length; j++) {

						if (strArr[j].equals(str)) {

							strArr[j] = "";

							num--;

						}

					}

				} else {

					long end = System.currentTimeMillis();

					System.out.println("\nClear !");

					System.out.println("플레이 시간 : " + (end - start) / 1000 + "초");

					System.out.println("===== Goodbye Venezia:) =====");

					break;

				}

			}

		} else if (menu == 2) {

			System.out.println("\n게임을 종료합니다.");

		}

	}
}
