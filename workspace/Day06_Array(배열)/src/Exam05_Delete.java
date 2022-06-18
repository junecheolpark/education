import java.util.Scanner;

public class Exam05_Delete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		// 배열 삭제
		// 배열은 처음 만들 때 사이즈 고정

		int[] arr = { 1, 2, 3 };
		// int의 초기값인 0을 이용해 의미없는 값으로 만들어 버리기.
		arr[1] = 0;

		for (int i : arr) {
			System.out.println(i);
		}
		int[] temp = new int[2];
		for (int i = 0; i < 3; i++) {
			temp[i] = arr[i];

		}
		*/
	/*	
		String[] temp = { "abc", "가나다", "50" };
		temp[0] = null;
		for (String s : temp) {
			if (s != null) {
				System.out.println(s);
			}

		}

	*/
		// int형 배열 안에서 사용자가 입력한값만 삭제하기.
		
		int[] Arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int num = 0;
		// 사용자가 입력한 값이 들어있는 인덱스를 0으로 바꾸시오
	/*	try {
			System.out.println("숫자를 입력하시오.");
			int num = Integer.parseInt(sc.nextLine());
			Arr[num - 1] = 0;
		}catch(Exception e) {
			System.out.println("0~10 사이의 숫자를 입력해주세요.");
		}
						
		for(int i : Arr) {
			System.out.print(i + " ");
		}
		*/
		try {
			System.out.println("숫자를 입력하시오.");
			num = Integer.parseInt(sc.nextLine());

		}catch(Exception e) {
			System.out.println("0~10 사이의 숫자를 입력해주세요.");
		}
		System.out.println("사용자 입력값 : " + num);
		
		for(int i = 0; i< Arr.length; i++){
			if(Arr[i] == num) {
				Arr[i] = 0;
			}
			System.out.println(Arr[i] + " ");
		}
		
		
		
		
		

	}
}
