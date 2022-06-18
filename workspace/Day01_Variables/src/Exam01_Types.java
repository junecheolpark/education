
public class Exam01_Types {
	public static void main(String[] arg) {
		
		//변수 선언 / 값 대입
		int a = 10; // 정수
		System.out.println(a);
		
		int b;
		b = 20;
		System.out.println(b);
		
		b = 30;
		
		System.out.println("두번째 b: " + b);
		
		//변수의 첫글자는 특수문자, 숫자로 시작하면 x 예: int 40var또는 %var = 40; 
		//변수명의 길이 제한은 없지만 보통 편하고 의미있게 짓는다.
		// 변수안에 들어있는 데이터의 성질에 맞게 이름을 정한다. 예 int word = 40;
		// 두개 이상의 단어가 들어갈때는 두번째 단어의 첫글자는 대문자로 쓴다 numInt
		
		//  boolean : 참 혹은 거짓을 저장하는 자료형
		boolean t = true;
		boolean f = false;
		System.out.println("t : " + t + "");
		System.out.println("f : " + f);
		
		// char : 문자를 저장하는 자료형 ''와같은 싱글 쿼테이션을 이용한다
		char c1 = 'a';
		char c2 = '가';
		char c3 = '5';
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		
		//숫자만 저장하는 자료형
		//정수형
		byte b1 = -128;
		byte b2 = 127;
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		
		short s1 = -32768;
		short s2 = 32767;
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		// int 형 -> 정수의 대표 타입 그냥 정수를 사용하게 되면 int 형으로 인식한다.
		
		// long 형은 L을 붙여야된다
		long l1 = 321321321;
		System.out.println("l1 : " + l1);
		long l2 = 321331231233L;
		System.out.println("l2 : " + l2);

		//실수형 (소수점)
		// float -> 데이터의 끝에 f를 붙여 float 형임을 명시
		float f1 = 3.14f;
		System.out.println("f1 : " + f1);
		
		// double -> 실수(소수점)의 대표 타입
		double d1 = 3.15;
		System.out.println("d1 : " + d1);
		
		// 8개의 데이터 타입 => 자바 가장 기본 데이터 타입 (primitive type) / 기본자료형
		
		// String 형
		String str = "가나다";
		System.out.println("str : "+ str);
	
	}
}
