
public class Exam04_Overloading {
	/* overloading : �޼��尡 ���ǵ��� �� > �ϳ��� ����� ����
	 * > ������ �޼��尡 �������ִ� ��ɿ� �߰����� �������̳� �ڷ����� ��ȭ�� �༭
	 * �⺻���� �޼����� ���¸� �پ�ȭ �Ҽ� �ִ� ����
	 * �Ű������� ������ Ȥ�� �ڷ����� ���ϸ�
	 */
	public static int plus(int num1, int num2) {
		return num1 + num2;
	}
	// �޼������ ������ �Ű������� ������ �ٸ�. = �����ε�
	public static int plus(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	// �ż��� ���� ������ �Ű������� �ڷ����� �ٸ�. = �����ε�
	public static double plus(double num1, double num2, double num3) {
		return (int)(num1 + num2);
	}
	// �ż��� ���� ������ �Ű������� ������ �ڷ����� �ٸ�. = �����ε�
		public static int plus(char char1, char char2, char char3) {
			return (char1 + char2 + char3);
		}
		// �Ű������� �޶� �ٸ��޼���� �ν�
		// �ϳ��� Ŭ�������� �ߺ��� �̸��� �ٸ� �޼��尡 �����ؼ��� �ȵ�.
//		public static void plus(int num1, int num2) {
//			 num1 + num2;
//		}
		//�����ڷ����� �޶����� + �Ű������� ���µ� �޶����� �Ǹ� �ٸ� �޼���ν� ���� �̸��� ����ϴ°� ����
		public static void plus(float num1, float num2) {
			float rs = num1 + num2;
		}
		
	public static void main(String[] args) {

		//�ΰ��� ������ ���ϴ� �޼���
		System.out.println(plus(10,5));
		
		//������ char���� ���ϴ� �޼���
		System.out.println(plus('a', 'b', 'c'));
		
		
		//������ �Ǽ��� ���ϴ� �޼���
		System.out.println(plus(1.5,3.5));
		
		//������ ������ ���ϴ� �޼���
		System.out.println(plus(10,5,3));
		
		
		
		
		
		
		
	}
	private static char[] plus(double d, double e) {
		// TODO Auto-generated method stub
		return null;
	}
}
