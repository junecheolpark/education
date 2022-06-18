package if_Switch;

import java.util.Scanner;

public class If_Switch {
	public static void main(String[] args) {
//		(1) int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		if (10 < x) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

//		(6) 문자열 참조변수 str이 "yes"일 때 true인 조건식
		String str = sc.nextLine();
		if ("yes".equals(str)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
