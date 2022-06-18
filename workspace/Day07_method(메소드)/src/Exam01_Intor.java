
public class Exam01_Intor {
	public static void plus1(int c, int d) {
		int rs = c + d;
		System.out.println(rs);
	}
	public static int plus(int a, int b) {
		int rs = a + b;
		return rs; // return 값을 만나는 순간 결과값과 함계 메서드 영역을 벗어나 버림.
	}
	public static void main(String[] args) {
	System.out.println(plus(1, 5));
	plus1(2, 6);
/* Method : 자바에서 기능을 이야기함
 * > 어떤 특정한 직업을 수행하기 위해서 모아놓은 명령문의 집합
 * > function(함수)
 * 
 * 구성
 * = 정의부 : 메서드를 정의하는 영역/ 어떤 기능을 수행하게 될지에 대한 코드가 들어가는 영역
 * public 반환자료형 메서드명 (매개변수..)){
 * 처리할 기능코드
 * (리턴값);
 * }
 * 
 * =호출부 : 정의된 메서드 호출하는 영역 > 즉 이미 정의된 메서드를 호출해서 그 기능을 쓰겠다 선언하는 역역
 * 메서드명(인자값...);
 * 
 */


		
		
		
		
		
	}
}
