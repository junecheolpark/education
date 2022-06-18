
public class Exam01_intro {
	public static void main(String[] args) {
		/*
		 * ������
		 * 1. ��� ������ ( + - * / \ % )
		 * 2. ���� ������ ( =, +=, -=, /=, %=, *= )
		 * 3. �� ������ ( <, >, <=, >=, == )
		 * 4. ���� ������ ( ���� ����, ���� ���� )
		 * 5. �� ������ ( $$ and ||or )
		 * 6. ���� ������ ( ���ǽ�?(a=b) ��1(a=b) : ��2(a!=b) )
		 */
		
		int a = 10;
		int b = 4;
		int c = 4;
	
		//��� ������
		System.out.println( a + b);
		System.out.println( a - b);
		System.out.println( a * b);
		System.out.println( a / b); // �� ����
		System.out.println( a % b); // ������ ����
		
		//�� ������ ( <, >, <=, >=, == )
		System.out.println(" a > b: " + ( a > b));
		System.out.println(" a == b: " + ( a == b ));
		System.out.println(" b <= c: " + ( b <= c ));
		
		char c1 = 'a'; //97
		char c2 = 'A'; //65
		System.out.println("c1 == c2: " + (c1 == c2));
		System.out.println(" c1 > c2 : " + (c1 > c2));
		
		// ���� �ڷ��� String ���� ���� �񱳸� �� ���� == ���� x
		// equls () ����� �̿��ؼ� ���ڿ��� ��
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = "def";
		
		System.out.println( str1.equals(str2));
		System.out.println( str2.equals(str3));
		
		// ���� ������
		int d = 5;
		d += 3;
		System.out.println(d);
		d -= 4;
		System.out.println(d);
		d *= 10;
		System.out.println(d);
		
		// ���� ������ (����/����) : ++(+1) --(-1)
		int e = 20;
		int f = 20;
		System.out.println("���� ������ : " + e + " / " + f);
		
		//���� ����
		System.out.println( ++e ); // +1 �ϰ� �����
		System.out.println( e ); // 21��
		System.out.println( --e ); // 21���� -1�� �A 20 �̵ȴ�
		System.out.println( e );
		
		//���� ����
		System.out.println( f++ ); //f ���Ŀ� +1�̵ȴ�
		System.out.println( f );
		System.out.println( f-- ); //f ���Ŀ� -1�̵ȴ�
		System.out.println( f );
		
		
		System.out.println(" ����1 : " + ( ++e + 5 ));
		System.out.println(" ����2 : " + ( f++ + 5));
		
		int x = 10;
		int y = x-- + 5 + --x;
		System.out.println(y);
		
		// �� ������ ( and, or ����, ! ���� ����)
		// �ݵ�� true Ȥ�� false �� ���´�.
		
		// and (&&) ���� �������� ��� �¾ƾ� true ��� ����� ����
		System.out.println( "a > b %% a > c : " + (a > b && a > c)); //a�� b���� ũ�鼭 a�� c���� ũ��.
		
		// or (||) ������ �����ڸ� �������� ������ �� ���� �߿� �ϳ��� true �� �Ǹ� true ��� ������� ����.
		System.out.println("a > b | a > c : " + (a > b || a > c));
		
		// !not
		System.out.println(!true);
		System.out.println(!(10 == 5));
		
		// ���� ������
		// �񱳽�? a : b      -> �񱳽��� ���̸� a ���� �����̸� b ����
		System.out.println( a < b ? "��" : "����");
		
}
}
