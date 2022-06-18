package day01;

public class Exam03_stock {
	public static void main(String[] arg) {
		System.out.println("================= 주식 마켓 =================");
		System.out.print("1. 삼성전자 (1주: ");
		System.out.print(40000);
		System.out.println(')');
		
		System.out.println("2. 테슬라 (1주: " + 50000 + ")");
		System.out.println("3. 카카오 (1주: " + 30000 + ")");
		System.out.println("잔고 : "+ 200000 + '원');
		System.out.println("===========================================");
		
		System.out.println(" 삼성전자 1주 매수");
		System.out.println("잔고 : " + (200000 - 40000) + "원");
		
		System.out.println(" 테슬라 2주 매수");
		System.out.println("잔고 : " + (200000 - 40000 - 100000) +"원");
		
		System.out.println(" 카카오 1주 매수");
		System.out.println("잔고 : " + (200000 - 40000 - 100000 - 30000) + "원");
		
		System.out.println(" 테슬라 1주 매도");
		System.out.println("잔고 : " + (200000 - 40000 - 100000 - 30000 + 50000) + "원");
	}
}
