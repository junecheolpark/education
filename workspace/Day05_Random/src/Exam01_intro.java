import java.util.Scanner;

public class Exam01_intro {
	public static void main(String[] args) {

		/*
		 * 랜덤한 수 생성 -> Math.random() : 0.0 ~ 1.0 사이의 난수를 생성
		 * 
		 */
//		System.out.println( Math.random() );

//		for(int i = 0 ; i < 6; i++  ) {
//			System.out.println(Math.random());
//		}

//		 지정한 숫자 범위 내에서 랜덤한 수를 뽑아내고 싶을 떄
//		(Math.random() * (최대값 - 최소값 + 1)) + 최소값

//		for(int i = 0;i < 10; i++) {
//			System.out.println( (char)((Math.random() * (122 - 65 +1)) + 65));
//		}

		// 내가한거
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("홀/짝 입력하시오");
//		String input = sc.nextLine();
//		int a = (int) (Math.random() * (10 - 1 + 1) + 1);
//		System.out.println(a);
//		if (input.equals("짝") && (a % 2 == 0)) {
//			System.out.println("정답!");
//		} else if (input.equals("홀") && (a % 2 == 1)) {
//			System.out.println("정답!");
//		} else {
//			System.out.println("실패!");
//
//		}

		// 강사님이 한거
		Scanner sc = new Scanner(System.in);

		int min = 1;
		int max = 10;
		int rannum = (int) (Math.random() * (10 - 1 + 1) + 1);
//		String rs;
		String rs = null;

		if (rannum % 2 == 0) {
			rs = "짝";
//		} else {
		} else if (rannum % 2 == 0) {
			rs = "홀";
		}
		System.out.println(rannum);
		System.out.println("==== 홀/짝 맞추기 ====");
		System.out.println("홀/짝을 입력하세요");
		String input = sc.nextLine();

		if (input.equals(rs)) {
			System.out.println("정답!");
		} else {
			System.out.println("실패!");
		}

	}//
}
