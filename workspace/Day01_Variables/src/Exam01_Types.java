
public class Exam01_Types {
	public static void main(String[] arg) {
		
		//���� ���� / �� ����
		int a = 10; // ����
		System.out.println(a);
		
		int b;
		b = 20;
		System.out.println(b);
		
		b = 30;
		
		System.out.println("�ι�° b: " + b);
		
		//������ ù���ڴ� Ư������, ���ڷ� �����ϸ� x ��: int 40var�Ǵ� %var = 40; 
		//�������� ���� ������ ������ ���� ���ϰ� �ǹ��ְ� ���´�.
		// �����ȿ� ����ִ� �������� ������ �°� �̸��� ���Ѵ�. �� int word = 40;
		// �ΰ� �̻��� �ܾ ������ �ι�° �ܾ��� ù���ڴ� �빮�ڷ� ���� numInt
		
		//  boolean : �� Ȥ�� ������ �����ϴ� �ڷ���
		boolean t = true;
		boolean f = false;
		System.out.println("t : " + t + "");
		System.out.println("f : " + f);
		
		// char : ���ڸ� �����ϴ� �ڷ��� ''�Ͱ��� �̱� �����̼��� �̿��Ѵ�
		char c1 = 'a';
		char c2 = '��';
		char c3 = '5';
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		
		//���ڸ� �����ϴ� �ڷ���
		//������
		byte b1 = -128;
		byte b2 = 127;
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		
		short s1 = -32768;
		short s2 = 32767;
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		// int �� -> ������ ��ǥ Ÿ�� �׳� ������ ����ϰ� �Ǹ� int ������ �ν��Ѵ�.
		
		// long ���� L�� �ٿ��ߵȴ�
		long l1 = 321321321;
		System.out.println("l1 : " + l1);
		long l2 = 321331231233L;
		System.out.println("l2 : " + l2);

		//�Ǽ��� (�Ҽ���)
		// float -> �������� ���� f�� �ٿ� float ������ ���
		float f1 = 3.14f;
		System.out.println("f1 : " + f1);
		
		// double -> �Ǽ�(�Ҽ���)�� ��ǥ Ÿ��
		double d1 = 3.15;
		System.out.println("d1 : " + d1);
		
		// 8���� ������ Ÿ�� => �ڹ� ���� �⺻ ������ Ÿ�� (primitive type) / �⺻�ڷ���
		
		// String ��
		String str = "������";
		System.out.println("str : "+ str);
	
	}
}
