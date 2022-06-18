import java.util.Scanner;

public class Exam02_number {
//	public static int smaller(int num1 , int num2) {
//		if(num1 < num2) {
//			return num1;
//		}else if(num2 < num1){
//			return num2;
//		}else {// 두수가 같을수 있음
//			return 0;
//		}

//	}
	public static int getRanNum(int x, int y) {
		int RanNum = (int) ((Math.random() * (y - x + 1)) + x);
		return RanNum;
	}

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("최소값을 입력하쇼.");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("최대값을 입력하쇼.");
		int y = Integer.parseInt(sc.nextLine());
		// Meth.random() * (최대값 - 최소값 +1) 최소값 ;

		for(int i = 0; i < 10; i++) {
			System.out.println("getRanNum(값) :" + getRanNum(x, y));
		}
		
		/*
		 * 메서드 > 재사용성/ 범용성, 기독성 좋아짐
		 */

	}

}
