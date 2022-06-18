import java.util.Scanner;

public class Exam03_Swich {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * switch : 조건문 if문과 유사
		 * 
		 * switch(값){ case 조건 : 실행코드 case 조건 : 실행코드 case 조건 : 실행코드
		 */

//		switch("사과") { // String, char, int
//		case "바나나" :
//			System.out.println("바나나입니다."); break;
//		case "사과" :
//			System.out.println("사과입니다"); break;
//		case "파인애플" :
//			System.out.println("파인애플입니다"); break;
//		}

		System.out.print("1, 2, 3 중입력하세요 >> ");
		int a = Integer.parseInt(sc.nextLine());
		switch (a) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default: // if문의 else 와 같은 역할
			System.out.println("잘못 입력했습니다.");
		}

	}
}
