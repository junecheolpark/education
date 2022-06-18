import java.util.Scanner;

public class Exam01_intro {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		/* 반복문 : 조건문처럼 프로그램 (코드)의 흐름을 제어할 수 있는 문법
		 * -> 조건식을 충족하는 동안은 해당 범위(블록) 의 코드가 반복되서 실행 됨.
		 * -> 반면 조건식을 불충족하는 순간 그범위를 벗어나 코드의 흐름이 원래대로 아래로 흘러 내려간다.
		 * for :
		 * for (초기식; 조건식; 증감식) {
		 * 		실행할코드
		 * }
		 * while (조건식) {
		 * 		실행할코드
		 * }
		 */	
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
		//초기값: 몇번부터 시작할건지
		//조건식 : 언제까지 반복할건지
		// 증감식 : for문 안쪽의 코드가 한번 반복될때마다 증가시킬 값
		
//	for(int i = 0; i <= 4; i++) {
//		System.out.println(i);
//	}
		
//		for(int i = 1; i <= 100; i++) {
//			System.out.println(i);
//		}
//		
		
		for(int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		
		
		
}
}




