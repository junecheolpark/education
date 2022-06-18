import java.util.Scanner;

public class for_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		구구단
//		 for(int i=2; i <=9; i++) {         
//			    System.out.printf("\n*** %d단 ***\n", i);
//			    
//			    for(int j=1; j <=9; j++) {
//			      System.out.printf("%d x %d = %d\n", i, j, i*j);
//			    }
//		 }

		/*
		 * for (int dan = 2; dan < 10; dan++) { for (int gob = 1; gob < 10; gob++) {
		 * System.out.println(dan + " * " + gob + " = " + dan * gob); } } while 문으로 바꾸기
		 * 
		 * int dan = 2; while (dan < 10) { int gob = 1; while (gob < 10) {
		 * System.out.println(dan + " * " + gob + " = " + dan * gob); gob++; } dan++; }
		 */

		/*
		 * // 주사위 눈의 합이 6이 되는경우를 모두 출력하시오 for (int num = 1; num < 7; num++) { for (int
		 * num1 = 1; num1 < 7; num1++) { if (num + num1 == 6) { System.out.println("(" +
		 * num + "," + num1 + ")"); } } }
		 */
		/*
		 * // ex6) 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
		 * 
		 * int x = Integer.parseInt(sc.nextLine()); int y =
		 * Integer.parseInt(sc.nextLine()); if (x < y) { for (int i = x; i <= y; i++) {
		 * for (int j = x; j <= y; j++) { System.out.println("(" + i + "," + j + ")" +
		 * "곱하면" + i * j); }
		 * 
		 * } }
		 *//*
			 * System.out.println("값을 입력해주세요"); int input = sc.nextInt();
			 * 
			 * int sum = 0; while (input > 0) { sum += input % 10; // 예를 들어서 사용자가 123을 입력을
			 * 했다면 나누기 해서 나온 나머지 값을 summ에 저장한다 input /= 10; // 사용자가 입력한 값에서 나누기 10을 해야 나머지
			 * 몫이 나오는데 // 위와 같이 나머지 나온 값을 계속 반복실행 해서 더하면 된다. } System.out.println("결과는 " +
			 * sum + " 입니다.");
			 */

//		ex10) 피보나치(Fibonnaci) 수열은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다. 
//	예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 되어서 
//	1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 1과 1부터 시작하는 피보나치 수열의 10번째 
//	수는 무엇인지 계산하는 프로그램을 작성하시오.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		for (int i = 0; i < 10; i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(" " + num3);
		}

	}
}
