import java.util.Scanner;

public class quize3 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("�λ縻�� �Է��ϼ���.");
		System.out.print(">>");
		String gr = sc.nextLine();
		
		System.out.println("�̸��� �Է��ϼ���.");
		System.out.print(">>");
		String name = sc.nextLine();
		
		System.out.println("�����̸��� �Է��ϼ���.");
		System.out.print(">>");
		String en = sc.nextLine();
		
		System.out.println("���̸� �Է��ϼ���..");
		System.out.print(">>");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("ü������ ����� �Է��ϼ���.");
		System.out.print(">>");
		double tem = Double.parseDouble(sc.nextLine());
		
		System.out.println("���� �̸��� " + name + "�Դϴ�. " + "���� �̸���" + en + " �Դϴ�.");
		System.out.println("�� ���̴� " + age + "�Դϴ�.");
		System.out.println("������ ü������ ����� " + tem + "�� " + "�Դϴ�.");
		
		
	}
}
