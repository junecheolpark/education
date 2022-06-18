package day01;

public class 잔고연습 {
	public static void main(String[] args) {
		int samsung = 40000;
		int tesla = 50000;
		int kakao = 30000;
		int d = 200000;
		
		System.out.println("================= 주식 마켓 =================");
		System.out.println("삼성전자 (1주: " + samsung + ")");
		System.out.println("테슬라 (1주: " + tesla + ")");
		System.out.println("카카오 (1주: " + kakao + ")");
		System.out.println("잔고 : " + d + "원");
		System.out.println("===========================================");
		
		System.out.println("삼성전주 1주 매수");
		System.out.println("잔고 : " + (d - samsung) + "원");
		System.out.println("테슬라 2주 매수");
		System.out.println("잔고 : " + (d - samsung - (tesla*2)) + "원");
		System.out.println("카카오 1주 매수");
		System.out.println("잔고 : " + (d - samsung - (tesla*2) - kakao) + "원");
		System.out.println("테슬라 1주 매도");
		System.out.println("잔고 : " + (d - samsung - (tesla*2) - kakao + tesla) + "원");
		
		
		
	
	}
}
