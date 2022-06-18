import java.util.Scanner;

public class Quiz04_Customer {
	public static void getCustomer(String name) {
		System.out.println(name + "님 어서오세요 !");
	}//1==========
	
	public static void getCustomer(int num) {
		if(num == 1) {
			System.out.println("혼밥 손님입니다.");
		}else {
			System.out.println("손님 " + num + "명 입장하였습니다.");
		}
	}//2==========
	
	public static void getCustomer(double temperature) {
		if(temperature <= 37&&temperature >= 36.5) {
			System.out.println("정상체온 입니다.");
		}else if(temperature < 36.5) {
			System.out.println("저체온 입니다.");
		}else if(temperature > 37) {
			System.out.println("입장 불가입니다.");
		}else {
			System.out.println("잘못된 입력입니다.");}
	}
	//3==========
	public static void getCustomer(boolean guest) {
		if (guest == true) {
			System.out.println("매장 손님입니다.");
		}else if(guest == false) {
			System.out.println("포장 손님입니다.");
		}else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("====손님 맞이 프로그램====");
		System.out.print("1. 이름을 입력해 주세요 >> ");
		String name = sc.nextLine();
		getCustomer(name);
		//1.========================================
		
		System.out.print("\n2. 인원수를 입력해주세요 >> ");
		int num = Integer.parseInt(sc.nextLine());
		getCustomer(num);
		//2.========================================

		System.out.println("\n3. 현재 체온을 입력해 주세요."); 
		double temperature = Double.parseDouble(sc.nextLine());
		getCustomer(temperature);
		//3.========================================
		
		System.out.println("\n4. 매장 식사 여부를 입력해주세요");
		boolean guest = Boolean.parseBoolean(sc.nextLine());
		getCustomer(guest);
		//4.========================================
		
		
		
//		4가지 메뉴를 띄워주는 프로그램
//		+ 4가지 메서드 모두 getcustomer()이라는 이름의 메서드로 오버로딩을 적용
//		1. 사용자가 이름을 입력하면 '~님 안녕하세요!' 출력하는 메서드 실행
//		2. 사용자가 인원수 (정수)를 입력하면 '손님 ~명 입장하였습니다. ' 출력 1명이면 ' 혼밥손님입니다' 출력하는 메서드
//		3. 사용자가 체온 (실수)를 입력하면, ' 현재 입장한 손님의 체온은 ~도 입니다.' 출력
//		+ 36.5~37도 사이면 정상체온, 미만이면 저체온, 초과면 입장불가 출력해주는 메서드
//		4. 사용자가 true를 입력하면 '매장 손님입니다.' 출력 / false '포장 손님입니다.' 출력하는 메서드
		
		
		
	}
}
