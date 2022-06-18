import java.util.Scanner;

public class Quize {
	public static void main(String [] args) {
	
		Scanner sc = new Scanner(System.in);
	/* 1.
				
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();

		System.out.println("성별을 입력하세요 (남자/여자) : ");
		String gender = sc.nextLine();

		System.out.println("나이를 입력하세요 : ");
		String age = sc.nextLine();
		
		System.out.println("키를 입력하세요(cm) : ");
		String tall = sc.nextLine();
		
		System.out.println("키 " + tall + "인 " + age + "살 " + gender + " " + name + "님 반갑습니다 ^^");
		
		*/
//=========================================================================
		
		/* 2.
		System.out.println("첫번째 정수 : ");
		int input1 = Integer.parseInt(sc.nextLine());
		
		
		System.out.println("두번째 정수 : ");
		int input2 = Integer.parseInt(sc.nextLine());

		
		System.out.println("더하기 결과: " + (input1 + input2));
		
		System.out.println("빼기 결과: " + (input1 - input2));
		
		System.out.println("곱하기 결과: " + (input1 * input2));
		
		System.out.println("나누기 결과: " + (input1 / input2));
		
		*/
	
	//=========================================================================
		
		/* 3.
	
	
		System.out.println("가로 : ");
		double galo = Double.parseDouble(sc.nextLine());
	
		System.out.println("세로 : ");
		double selo = Double.parseDouble(sc.nextLine());
		
		System.out.println("면적 : " + (galo * selo));
		
		System.out.println("둘레 : " + (galo + selo) * 2);

		*/
		
		//=========================================================================
			
		System.out.println("문자열을 입력하세요 : "); // apple
		
		String a = sc.nextLine();
		
		System.out.println("첫번째 문자 : " + a.charAt(0));
		System.out.println("두번쨰 문자 : " + a.charAt(1));
		System.out.println("세번째 문자 : " + a.charAt(2));
		
		
		
		
		
	}
}
