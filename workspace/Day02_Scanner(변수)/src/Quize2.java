import java.util.Scanner;

public class Quize2 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		/*	1	 
		ex.
		정수 : -9
		양수가 아니다
	
	
		System.out.println("정수 : ");
		int num = sc.nextInt();
		System.out.println(num > 0 ? "양수다" : "양수가 아니다");
			*/
		
		//=========================================================================
	
	/*2키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 
	양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
	
		System.out.println("정수 : ");
		int num = sc.nextInt();
		System.out.println(num > 0 ? "양수다" : (num == 0) ? "0이다" : "음수다");
		
		*/
	//=========================================================================
	
	/*3키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.

		System.out.println("정수 : ");
		int n = sc.nextInt();
		System.out.println(n % 2 == 0 ? "짝수다" : "홀수다");
		*/
		//=========================================================================
	
	/*4모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
	1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
	
	System.out.println("인원 수 : ");
	int n1 = sc.nextInt();
	System.out.println("사탕 개수 : ");
	int n2 = sc.nextInt();
	
	System.out.println("1인당 사탕 개수 : " + (n2 / n1) );
	System.out.println("남는 사탕 개수 : " + (n2 % n1) );
	
	*/
	//=========================================================================
	
	/*5키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
	이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요
	
	
	System.out.println("이름 : ");
	String name = sc.nextLine();
	
	System.out.println("학년 : ");
	int gr = sc.nextInt();
	
	System.out.println("반 : ");
	int cl = sc.nextInt();
	
	System.out.println("번호 : ");
	int num = sc.nextInt();
	
	sc.nextLine();

	System.out.println("성별 (M/F) : ");
	char gen = sc.nextLine().charAt(0);
	
	System.out.println("성적(소수점 아래 둘째자리까지) : ");
	double gr1 = sc.nextDouble();
	
	String gen1 = (gen equals 'm') ? "남학생" : "여학생";
	
	System.out.println(gr + "학년 " + cl + "반 " + num + "번 " + name + gen1 + "의 " + "성적은" + gr1 + "이다.");
	
	*/
	//=========================================================================
	
	/*
	 * 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 
성인(19세 초과)인지 출력하세요.
	
	
	System.out.println("나이 : ");
	int age = sc.nextInt();
		System.out.println(age > 19 ? "성인" : (age > 13) ? "청소년" : "어린이");
		
		 */
	
	//=========================================================================
	
	/*
	System.out.println("국어 : ");
	int num1 = sc.nextInt();
	
	System.out.println("영어 : ");
	int num2 = sc.nextInt();
	
	System.out.println("수학 : ");
	int num3 = sc.nextInt();
	
	int sum = num1 + num2 + num3;
	double avg = sum / 3.0;
	
	System.out.println("합계 : " + sum);
	System.out.println("평균 : " + avg);
	System.out.println(((num1 >= 40) && (num2 >= 40) && (num3 >= 40) && (avg >= 60)) ? "합격" : "불합격");
	
	*/
	
	//=========================================================================
	
	/*
	 * 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
	
	
	
	System.out.println("주민번호를 입력하세요 (- 포함) : ");
	String a = sc.nextLine();
	
	
	char b = a.charAt(7);
	
	System.out.println(b == '1' ? "남자" : "여자");
	 */
	
	//=========================================================================
	
	/*
	
	System.out.println("정수1 : ");
	int a = sc.nextInt();
	
	System.out.println("정수2 : ");
	int b = sc.nextInt();
	
	System.out.println("입력 : ");
	int c = sc.nextInt();
	
	boolean d = (c <= a) || (c >= b);
	System.out.println(d);
	*/
	
	//=========================================================================
	
	
	/*
	System.out.println("입력1 : ");
	int a = sc.nextInt();
	
	System.out.println("입력2 : ");
	int b = sc.nextInt();
	
	System.out.println("입력3 : ");
	int c = sc.nextInt();
	
	System.out.println((a == b) && (b == c));
	
	*/
	//=========================================================================
	
	
	System.out.print("A사원의 연봉 : ");
    int a = sc.nextInt();
    
    System.out.print("B사원의 연봉 : ");
    int b = sc.nextInt();
    
    System.out.print("C사원의 연봉 : ");
    int c = sc.nextInt();
    
    double a1 = 0.4;
    double b1 = 0;
    double c1 = 0.15;
    
    double a2 = a * (1+a1);
    double b2 = b * (1+b1);
    double c2 = c * (1+c1);
    
    String a3 = (a2 >= 3000) ? "3000 이상" : "3000 미만";
    String b3 = (b2 >= 3000) ? "3000 이상" : "3000 미만";
    String c3 = (c2 >= 3000) ? "3000 이상" : "3000 미만";
	
    System.out.println("A사원 연봉/연봉+a : 2500/3500.0" + "\n" + a3);
    System.out.println("B사원 연봉/연봉+a : 2900/2900.0" + "\n" + b3);
    System.out.println("C사원 연봉/연봉+a : 2600/2989.9999999999995" + "\n" + c3);
	
	
	
	
}

	private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void $$(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
