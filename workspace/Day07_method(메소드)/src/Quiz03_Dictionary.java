import java.util.Scanner;

public class Quiz03_Dictionary {
	public static String dict(String input){
		String eng = " ";
		if(input.equals("당근")) {
			eng = "carrot";
		}else if(input.equals("오이")) {
			eng = "cucumber";
		}else if(input.equals("토마토")) {
			eng = "tomato"	;		
		}else {
			eng = "사전에 등록되지 않은 단어";
		}
		return eng;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==원하는 채소의 이름을 입력하세요==");
		String input = sc.nextLine();
		String eng = dict(input);
		System.out.println("입력한 " + input + " 은/는 영어로 " + eng + "입니다.");
	
		
		/* 사용자에게
		 * ==== 원하는 채소의 이름을 입력하세요. ====
		 * >>
		 * 
		 * > dict() 메서드를 이용해서 사용자가 입력한 채소를 영어 단어로 바꿔서 반환해주는 메서드를 구성
		 * > 사용자한테 " 입력한 00은 영어로 00입니다." 출력
		 * 
		 * > 세가지만 영어뜻으로만들어놓자
 		 */
	}
}
