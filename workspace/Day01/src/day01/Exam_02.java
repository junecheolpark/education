package day01;

public class Exam_02 {
	public static void main(String[] args) {

		//자바에서 "":문자열 (0글자 이상을 쓸수있다)
		//       '':문자  (한글자만 쓸수있다)
	
		/*System.out.println("");
		System.out.println('가');
		System.out.println("가나다");
		System.out.println(50);
		System.out.println("50");
		System.out.println(-5.55);
		*/

		// 실습1: 인삿말, 본인의 이름, 영어이름, 나이, 체온 측정결과
//		System.out.println("안녕하세요?");
//		System.out.print("저의 이름은 박준철입니다.");
//		System.out.println("영어 이름은 JUNECHEOL입니다.");
//		
//		System.out.print("제 나이는 ");
//		System.out.print(55);
//		System.out.print("살입니다.");

		// !드래그치그 컨트롤 슬래시 누르면 전체 슬래시가 됨		
		System.out.println("\n제 체온은 모릅니다.");
		// + : 문자열 연결 , 덧셈
		System.out.println("안녕하세요?");
		System.out.println("저의 이름은 박준철입니다. 영어이름은 JuneCheol 입니다.");
		System.out.println("제 나이는 " + 55 + "살 입니다.");
		System.out.println("오늘의 체온 결과는 "+ 40 + "도 입니다.");

		// 문자와 숫자를 연결할 떄 주의해야 하는 점 
		// 순서에 따라 계산이 될수도 연결이 될수도 있음.(왼쪽부터 계산한다)
		// ("A")+("B")+5+10= AB510 , 5+10+("A")+("B")=15AB
		}
}
