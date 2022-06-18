import java.util.Scanner;

public class Exam02_if {
	public static void main(String[] srgs) {
		Scanner sc = new Scanner(System.in);
// 좀더 복잡한 조건문
		// 입력값 -> 사용자가 입력한 값이 50보다 작다면1을 출력
		// 50 이상이라면 2를 출력

//		System.out.print("수를 입력 >>");
//		int n1 = Integer.parseInt(sc.nextLine());
//
//		if (n1 >= 0 && n1 <= 50) {
//			System.out.println("1");
//		} else if (n1 >= 51 && n1 <= 100) {
//			System.out.println("2");
//		}

//		int s = sc.nextInt();
//		if (s >= 90) {
//			System.out.println(("A"));
//			if (s >= 95) {
//				System.out.println("학업우수상");
//				if (s == 100) {
//					System.out.println("만점");
//				}
//			}
//		}

		int s = Integer.parseInt(sc.nextLine());
		if (s == 100) {
			System.out.println("학업우수상");
		}
		if ((s >= 70) && (s <= 99)) {
			System.out.println("시험 통과");
		}
		if (s > 0 && s <= 69) {
			System.out.println(" 재시험 대상");
		}
		if (s > 0 && s <= 30) {
			System.out.println("보충학습대상");
		}

		else {
			System.out.println("점수를 잘못입력했습니다.");

		}

	}
}
