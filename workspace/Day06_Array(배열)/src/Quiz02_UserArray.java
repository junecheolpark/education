import java.util.Scanner;

public class Quiz02_UserArray {
	public static void main(String[] args) {
		// 사용자에게 입력받은 정수만큼 int 형 배열의 크기를 할당
		// 그리고 1부터 순차적으로 값을 저장
	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		int arr = Integer.parseInt(sc.nextLine());
//
//		int num[] = new int[arr];

//		for(int i : num) {
//			System.out.println(i + " ");

//		for (int i = 0; i < num.length; i++) {
//			num[i] = 1 + i;
//			System.out.println(num[i]);

			// try ~ catch : 예외(에러) 처리
			Scanner sc = new Scanner(System.in);
			try {		

			System.out.println("숫자를 입력하세요");
			int arr = Integer.parseInt(sc.nextLine());

		}catch(NumberFormatException e) {
			System.out.println("입력한 값은 숫자가 아닙니다.");
		}
			
		}

	}
//}

