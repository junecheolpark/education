import java.util.Scanner;

public class Exam03_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* while(조건식){
		 *  실행할 코드
		 * }
		 * > for문과 같은 역할(반복) 
		 *  보통 언제까지 코드를 반복해야 될지 모를때
		 *  특별한 일이 일어나기 전까지 코드를 계속해서 반복해야 할 떄
		 */
		
		while(true) {
			String a = sc.nextLine();
			System.out.println(a);
			if (a.equals("q")) {
				break;
			}
		}
		// 사용자가 q라 입력할 때까지 계속 1을 출력하세요.
//		for (int i = 0; i<10000; i++) {
//			System.out.println("입력 >> ");
//			String a = sc.nextLine();
//			if (a.equals("q")) {
//				break;
//			}else {
//				System.out.println(1);
//			}
//			
//		}
		
		
		
		
		
		
	}
}
