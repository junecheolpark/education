import java.util.Scanner;

public class Quize {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//	System.out.println("=== ���� ���α׷� ===");
//	System.out.print("���� �Է�1 > ");
//	int n1 = Integer.parseInt(sc.nextLine());
//	System.out.print("���� �Է�2 > ");
//	int n2 = Integer.parseInt(sc.nextLine());
//	
//	System.out.print("������ �Է� (+,-,*,/) > ");
//	String a = sc.nextLine();
//	
//	if(a.equals("+")) {
//		System.out.println(n1 + n2);
//	}
//	else if(a.equals("-")) {
//		System.out.println(n1 - n2);
//	}
//	else if(a.equals("*")) {
//		System.out.println(n1 * n2);
//	}
//	else if(a.equals("/")) {
//		System.out.println(n1 / n2);
//	}

		System.out.println("�� ������ ���?");
		System.out.println("1. �Ӹ����� ���´�.");
		System.out.println("2. �������� �Ѵ�.");
		System.out.println("3. ������ �۴´�.");
		System.out.println("4. �̸� �۴´�.");

		int n1 = Integer.parseInt(sc.nextLine());

		if (n1 == 1) {
			System.out.println("1. �������� �ϴ´��.");
			System.out.println("���� �Ҷ� �������� �ϴ� ����� ������ ������");
			System.out.println("���� ������, �̼����� ������̰� ��������.");
			System.out.println("����� ���ϰ� �޴°� ���� ��Ǫ�� ���� ������ ���!!");
			System.out.println("������ ������ ��ó�� ���� �ʴ� ���� �ʿ���!");
		} else if (n1 == 2) {
			System.out.println("2. ��ġ���� ���� �ϴ� ���.");
			System.out.println("���� ȣ����� ������ �Ż翡 ������ ���!!");
			System.out.println("�ʹ� ������ ſ�� ���� ���ۿ� ������� ����");
			System.out.println("���� ������ ���ָ� �����ϸ� ������ Ž����");
			System.out.println("���濡 ���� �������� �߰��ϰ� �;��ϴ� ������ ����");
		} else if (n1 == 3) {
			System.out.println("������ ��� ���.");
			System.out.println("������ �� �� ���� ���� ���� �Ĵ� ����� �Ѹ����");
			System.out.println("������ �߿��ϰ� ����� ����̸� �̼���");
			System.out.println("������ �мǰ���, �� ���� �߿�� ��.");
			System.out.println("������ �����ϴ� �̼��� ��Ÿ���� �� ���");
			System.out.println("���� ���� �ϴ� ��Ÿ����.");
		} else if (n1 == 4) {
			System.out.println("4. �Ӹ��� ���� ���� ���.");
			System.out.println(" ������ �Ҷ� �Ӹ��� ���� ���� ����� �ֺ� �������");
			System.out.println("���ڴµ��� �̲��� �ٴϴ� ��Ÿ��.");
			System.out.println("�����δ� �����Ѵ��ΰ��踦 �����ϴ°Ͱ�����");
			System.out.println("������ �Ӿ��̸� �ϰ� ����.");
			System.out.println("�̷������� �̼��� �������� ���������̸� �̼����� �ֵѸ�������.");
			System.out.println("����ǥ���� ���ϴ°��� �ʿ���.");
		} else {
			System.out.println("�ٽ� ���ÿ�!!");
		}

	}
}
