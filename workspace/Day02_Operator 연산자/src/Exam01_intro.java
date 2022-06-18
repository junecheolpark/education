
public class Exam01_intro {
	public static void main(String[] args) {
		/*
		 * 연산자
		 * 1. 산술 연산자 ( + - * / \ % )
		 * 2. 대입 연산자 ( =, +=, -=, /=, %=, *= )
		 * 3. 비교 연산자 ( <, >, <=, >=, == )
		 * 4. 증감 연산자 ( 전위 연산, 후위 연산 )
		 * 5. 논리 연산자 ( $$ and ||or )
		 * 6. 삼항 연산자 ( 조건식?(a=b) 식1(a=b) : 식2(a!=b) )
		 */
		
		int a = 10;
		int b = 4;
		int c = 4;
	
		//산술 연산자
		System.out.println( a + b);
		System.out.println( a - b);
		System.out.println( a * b);
		System.out.println( a / b); // 몫 연산
		System.out.println( a % b); // 나머지 연산
		
		//비교 연산자 ( <, >, <=, >=, == )
		System.out.println(" a > b: " + ( a > b));
		System.out.println(" a == b: " + ( a == b ));
		System.out.println(" b <= c: " + ( b <= c ));
		
		char c1 = 'a'; //97
		char c2 = 'A'; //65
		System.out.println("c1 == c2: " + (c1 == c2));
		System.out.println(" c1 > c2 : " + (c1 > c2));
		
		// 참조 자료형 String 값에 대한 비교를 할 때는 == 쓰지 x
		// equls () 기능을 이용해서 문자열을 비교
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = "def";
		
		System.out.println( str1.equals(str2));
		System.out.println( str2.equals(str3));
		
		// 대입 연산자
		int d = 5;
		d += 3;
		System.out.println(d);
		d -= 4;
		System.out.println(d);
		d *= 10;
		System.out.println(d);
		
		// 증감 연산자 (전위/후위) : ++(+1) --(-1)
		int e = 20;
		int f = 20;
		System.out.println("원본 데이터 : " + e + " / " + f);
		
		//전위 연산
		System.out.println( ++e ); // +1 하고 저장됨
		System.out.println( e ); // 21임
		System.out.println( --e ); // 21에서 -1를 뺸 20 이된다
		System.out.println( e );
		
		//후위 연산
		System.out.println( f++ ); //f 이후에 +1이된다
		System.out.println( f );
		System.out.println( f-- ); //f 이후에 -1이된다
		System.out.println( f );
		
		
		System.out.println(" 연산1 : " + ( ++e + 5 ));
		System.out.println(" 연산2 : " + ( f++ + 5));
		
		int x = 10;
		int y = x-- + 5 + --x;
		System.out.println(y);
		
		// 논리 연산자 ( and, or 연산, ! 부정 연산)
		// 반드시 true 혹은 false 만 나온다.
		
		// and (&&) 양쪽 두조건이 모두 맞아야 true 라는 결과가 나옴
		System.out.println( "a > b %% a > c : " + (a > b && a > c)); //a가 b보다 크면서 a가 c보다 크다.
		
		// or (||) 연산은 연산자를 기준으로 양쪽의 두 조건 중에 하나라도 true 가 되면 true 라는 결과값이 나옴.
		System.out.println("a > b | a > c : " + (a > b || a > c));
		
		// !not
		System.out.println(!true);
		System.out.println(!(10 == 5));
		
		// 삼항 연산자
		// 비교식? a : b      -> 비교식이 참이면 a 실행 거짓이면 b 실행
		System.out.println( a < b ? "참" : "거짓");
		
}
}
