import java.util.Scanner;

public class Exam02_for {
	public static void main(String[]args) {
		
		
		Scanner sc = new Scanner(System.in);
		
//		int num = Integer.parseInt(sc.nextLine());
//		
//		for(int i = 1; i <= num; i++) {
//			System.out.println(i);
//		}
	
//		int num = Integer.parseInt(sc.nextLine());
		
//		for(int i = 1; i<num; i=i+2){
//			   System.out.print(i + " ");
//			  }
		
		
//		int num = Integer.parseInt(sc.nextLine());
//		for(int i = 1; i<num; i++){
//			if (i % 2 == 1)
//			   System.out.print(i + " ");
//			  }

	
//		for(int i= 1; i < 6; i++) {
//		if(i != 3) {
//			System.out.println(i + " ");
//		}
//		}
		
		// continue > 현재 진행되고 있는 반복흐름이 종료 
		//돌고있는 바퀴의 끝지점으로 건너 뛰게됨.
//		for(int i= 1; i < 6; i++) {
//		if(i == 3) {
//			continue;
//		}
//			System.out.println(i + " ");
//		
//		}
		
		
		// 사용자에게 입력값을 받을 것
		// 1부터 입력값까지의 전체 합을 출력
		// 입력값 : 5
		// 1+2+3+4+5
		System.out.print("숫자를 입력하시오 >>");
		int a = Integer.parseInt(sc.nextLine());
		
		// 지역변수 : 반복문 / 조건문 혹은 메서드(기능)의  {} 안 범위에서만 사용할 수 있는 변수
		int sum = 0;
		for (int i = 1; i <= a ; i++) {
//			if (i == a) {
				System.out.println(i);
				sum += i;
//			}
		}
		System.out.println(sum);
	}
}
