import java.util.Scanner;

public class Exam01_Scanner {
	public static void main(String[] args) {
	/* 
	 * Scanner : console â�� �Է� �����ϰ� ���ִ� �ڹ�(jdk) ����
	 * import : �ܺηκ��� �ʿ��� ������ �������� �۾�
	 * 
	 */

		// ctrl + shift + o : import ����Ű
		Scanner sc = new Scanner(System.in);
		//sc.next(); // ����Ű�� �������� �Է��� �������� �Ǵ�
		
		/*
		String input = sc.next();
		System.out.println( "input : " + input );
		*/
		
		// next () : ù��° ���� Ȥ�� ����Ű �ձ����� ���ڸ� ��µȴ�. ��)abc ds : abc
		
		// nextline() : ���� �ص� ������� ����Ű �ձ��� ��µȴ�.
		/*
		String input = sc.nextLine();
		System.out.println("input : " + input);
		*/
		
		/*
		// ����ڿ��� �̸�, ����, ������ �Է¹޾Ƽ� ����� ������.
		// 1. ������� �̸��� �Է¹ޱ�
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.nextLine();

		// 2. ������� ���� �Է¹ޱ�
		System.out.println("���̸� �Է��ϼ���");
		String age = sc.nextLine();

		// 3. ������� ������ �Է¹ޱ�
		System.out.println("������ �Է��ϼ���");
		String job = sc.nextLine();

		// 4. ������� �̸�+����+������ �ѹ��� ���
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("job : " + job);
*/
		//int input = sc.nextlLine(); x�ȵ�
		// ����ڿ��� ���� �״�θ� �Է¹ޱ� ���� 2���� ���
		
		// 1. next int() ���
		// ������� �ڷ����� �̿��� next ����� ����� �� �����ؾ��ϴ� ��
		// -> �Է��� �����ϴ� ����Ű�� ���� ����(����)�� �����־� ���� �Է½ÿ� ������ ��ĥ������.

		/*
		System.out.println("���̸� �Է��ϼ���");
		int input = sc.nextInt();
		System.out.println("input : " + input);
		sc.nextLine(); //�ذ���
		
		System.out.println("������ �Է��ϼ���");
		String job = sc.nextLine();
		System.out.println("job : " + job);
		*/
	
		/*
		// 2. nextLine() �� ��� -> String -> ����ȯ�ؼ� ���
		System.out.println("���̸� �Է��ϼ���");
		int input = Integer.parseInt(sc.nextLine());
		System.out.println("input : " + input);
		*/
		
		/*
		//nextLine()�� �̿��� String -> boolean
		System.out.println("true Ȥ�� false �� �Է��ϼ���");
		boolean b = Boolean.parseBoolean(sc.nextLine());
		System.out.println("b : " + b);
		*/
	
		// nextLine()�� �̿��� String -> char
		System.out.println("������ �Է��ϼ���"); // ����, ����, ����, ����, ��, ��
		char c = sc.nextLine().charAt(0);
		System.out.println(("c : " + c));
		
		
}
}
