
public class Exam04_Overloading {
	/* overloading : 메서드가 정의됐을 떄 > 하나의 기능이 있음
	 * > 기존에 메서드가 가지고있는 기능에 추가적인 인지값이나 자료형의 벼화를 줘서
	 * 기본적인 메서드의 형태를 다양화 할수 있는 문법
	 * 매개변수의 개수나 혹은 자료형이 변하면
	 */
	public static int plus(int num1, int num2) {
		return num1 + num2;
	}
	// 메서드명은 같지만 매개변수의 개수가 다름. = 오버로딩
	public static int plus(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	// 매서드 명은 같지만 매개변수의 자료형이 다름. = 오버로딩
	public static double plus(double num1, double num2, double num3) {
		return (int)(num1 + num2);
	}
	// 매서드 명은 같지만 매개변수의 개수와 자료형이 다름. = 오버로딩
		public static int plus(char char1, char char2, char char3) {
			return (char1 + char2 + char3);
		}
		// 매개변수가 달라서 다른메서드로 인식
		// 하나의 클래스에는 중복된 이름의 다른 메서드가 존재해서는 안됨.
//		public static void plus(int num1, int num2) {
//			 num1 + num2;
//		}
		//리턴자료형이 달라지고 + 매개변수의 형태도 달라지게 되면 다른 메서드로써 같은 이름을 사용하는게 가능
		public static void plus(float num1, float num2) {
			float rs = num1 + num2;
		}
		
	public static void main(String[] args) {

		//두개의 정수를 더하는 메서드
		System.out.println(plus(10,5));
		
		//세개의 char수를 더하는 메서드
		System.out.println(plus('a', 'b', 'c'));
		
		
		//세개의 실수를 더하는 메서드
		System.out.println(plus(1.5,3.5));
		
		//세개의 정수를 더하는 메서드
		System.out.println(plus(10,5,3));
		
		
		
		
		
		
		
	}
	private static char[] plus(double d, double e) {
		// TODO Auto-generated method stub
		return null;
	}
}
