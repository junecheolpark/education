import java.util.Scanner;

public class Quiz03_Venezia {
	public static void main(String[] args) {

		// 한컴타자연습 - 산성비
		// 게임을 시작한 순간부터 종료된 순간까지 시간을 잼
		// -> system.currentTimeMillis() -> 현재시간을 long 형 데이터로 뽑아줌

		Scanner sc = new Scanner(System.in);
		String[] name = new String[] { "개발코딩", "어렵다아", "내멘탈은", "날라갔다" };
		int num = name.length;

		
	

		System.out.println("==== 베네치아 게임에 오신 걸 환영합니다 ====");
		System.out.println("1. 게임 시작");
		System.out.println("2. 게임 종료");
		System.out.print("메뉴를 선택하세요 >> ");
		int menu = Integer.parseInt(sc.nextLine());

		if (menu == 1) {
			long start = System.currentTimeMillis();
			System.out.println("게임 스타트!");
			while (true) {
				if 	
				(num != 0) {
					for (int q = 0; q < name.length; q++) {
						System.out.print(name[q] + " ");
					}
					System.out.println();
					System.out.print("입력 >> ");

					String str = sc.nextLine();
					for (int i = 0; i < name.length; i++) {
						if (name[i].equals(str)) {
							name[i] = "";
							num--;
						}
					}
				}else {
					System.out.println("Clear !");
					long end = System.currentTimeMillis();
					System.out.println(((end - start) / 1000) + "초");
					System.out.println("===== Goodbye Venezia:) =====");
					break;
				}

			}
		} else if (menu == 2) {
			System.out.println("안녕히가세요!");
		} else if (menu != 1 && menu != 2) {
			System.out.println("잘못된입력입니다"); 
		}

	}
}
