import java.util.Scanner;

public class Exam01_Scanner {
	public static void main(String[] args) {
	/* 
	 * Scanner : console 창을 입력 가능하게 해주는 자바(jdk) 도구
	 * import : 외부로부터 필요한 도구를 가져오는 작업
	 * 
	 */

		// ctrl + shift + o : import 단축키
		Scanner sc = new Scanner(System.in);
		//sc.next(); // 엔터키를 기준으로 입력이 끝났음을 판단
		
		/*
		String input = sc.next();
		System.out.println( "input : " + input );
		*/
		
		// next () : 첫번째 띄어쓰기 혹은 엔터키 앞까지의 무자만 출력된다. 예)abc ds : abc
		
		// nextline() : 띄어쓰기 해도 상관없이 엔터키 앞까지 출력된다.
		/*
		String input = sc.nextLine();
		System.out.println("input : " + input);
		*/
		
		/*
		// 사용자에게 이름, 나이, 직업을 입력받아서 출력해 보세요.
		// 1. 사용자의 이름을 입력받기
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();

		// 2. 사용자의 나이 입력받기
		System.out.println("나이를 입력하세요");
		String age = sc.nextLine();

		// 3. 사용자의 직업을 입력받기
		System.out.println("직업를 입력하세요");
		String job = sc.nextLine();

		// 4. 사용자의 이름+나이+직업을 한번에 출력
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("job : " + job);
*/
		//int input = sc.nextlLine(); x안됨
		// 사용자에게 숫자 그대로를 입력받기 위한 2가지 방법
		
		// 1. next int() 사용
		// 명시적인 자료형을 이용한 next 기능을 사용할 떄 주의해야하는 점
		// -> 입력을 종료하는 엔터키가 아직 대기실(버퍼)에 남아있어 다음 입력시에 영향을 끼칠수있음.

		/*
		System.out.println("나이를 입력하세요");
		int input = sc.nextInt();
		System.out.println("input : " + input);
		sc.nextLine(); //해결방법
		
		System.out.println("직업를 입력하세요");
		String job = sc.nextLine();
		System.out.println("job : " + job);
		*/
	
		/*
		// 2. nextLine() 을 사용 -> String -> 형변환해서 사용
		System.out.println("나이를 입력하세요");
		int input = Integer.parseInt(sc.nextLine());
		System.out.println("input : " + input);
		*/
		
		/*
		//nextLine()을 이용해 String -> boolean
		System.out.println("true 혹은 false 를 입력하세요");
		boolean b = Boolean.parseBoolean(sc.nextLine());
		System.out.println("b : " + b);
		*/
	
		// nextLine()을 이용해 String -> char
		System.out.println("성별을 입력하세요"); // 남자, 여자, 남성, 여성, 남, 여
		char c = sc.nextLine().charAt(0);
		System.out.println(("c : " + c));
		
		
}
}
