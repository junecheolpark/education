import java.util.Scanner;

public class Quize2 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		/*	1	 
		ex.
		���� : -9
		����� �ƴϴ�
	
	
		System.out.println("���� : ");
		int num = sc.nextInt();
		System.out.println(num > 0 ? "�����" : "����� �ƴϴ�");
			*/
		
		//=========================================================================
	
	/*2Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, 
	����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�, 0�� �ƴϸ� �������١��� ����ϼ���.
	
		System.out.println("���� : ");
		int num = sc.nextInt();
		System.out.println(num > 0 ? "�����" : (num == 0) ? "0�̴�" : "������");
		
		*/
	//=========================================================================
	
	/*3Ű����� �Է� ���� �ϳ��� ������ ¦���̸� ��¦���١�, ¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.

		System.out.println("���� : ");
		int n = sc.nextInt();
		System.out.println(n % 2 == 0 ? "¦����" : "Ȧ����");
		*/
		//=========================================================================
	
	/*4��� ����� ������ ���� ������������ �Ѵ�. �ο� ���� ���� ������ Ű����� �Է� �ް�
	1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���.
	
	System.out.println("�ο� �� : ");
	int n1 = sc.nextInt();
	System.out.println("���� ���� : ");
	int n2 = sc.nextInt();
	
	System.out.println("1�δ� ���� ���� : " + (n2 / n1) );
	System.out.println("���� ���� ���� : " + (n2 % n1) );
	
	*/
	//=========================================================================
	
	/*5Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
	�� �� ������ ��M���̸� ���л�, ��M���� �ƴϸ� ���л����� ��� ó�� �ϼ���
	
	
	System.out.println("�̸� : ");
	String name = sc.nextLine();
	
	System.out.println("�г� : ");
	int gr = sc.nextInt();
	
	System.out.println("�� : ");
	int cl = sc.nextInt();
	
	System.out.println("��ȣ : ");
	int num = sc.nextInt();
	
	sc.nextLine();

	System.out.println("���� (M/F) : ");
	char gen = sc.nextLine().charAt(0);
	
	System.out.println("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
	double gr1 = sc.nextDouble();
	
	String gen1 = (gen equals 'm') ? "���л�" : "���л�";
	
	System.out.println(gr + "�г� " + cl + "�� " + num + "�� " + name + gen1 + "�� " + "������" + gr1 + "�̴�.");
	
	*/
	//=========================================================================
	
	/*
	 * ���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����, 
����(19�� �ʰ�)���� ����ϼ���.
	
	
	System.out.println("���� : ");
	int age = sc.nextInt();
		System.out.println(age > 19 ? "����" : (age > 13) ? "û�ҳ�" : "���");
		
		 */
	
	//=========================================================================
	
	/*
	System.out.println("���� : ");
	int num1 = sc.nextInt();
	
	System.out.println("���� : ");
	int num2 = sc.nextInt();
	
	System.out.println("���� : ");
	int num3 = sc.nextInt();
	
	int sum = num1 + num2 + num3;
	double avg = sum / 3.0;
	
	System.out.println("�հ� : " + sum);
	System.out.println("��� : " + avg);
	System.out.println(((num1 >= 40) && (num2 >= 40) && (num3 >= 40) && (avg >= 60)) ? "�հ�" : "���հ�");
	
	*/
	
	//=========================================================================
	
	/*
	 * �ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϼ���.
	
	
	
	System.out.println("�ֹι�ȣ�� �Է��ϼ��� (- ����) : ");
	String a = sc.nextLine();
	
	
	char b = a.charAt(7);
	
	System.out.println(b == '1' ? "����" : "����");
	 */
	
	//=========================================================================
	
	/*
	
	System.out.println("����1 : ");
	int a = sc.nextInt();
	
	System.out.println("����2 : ");
	int b = sc.nextInt();
	
	System.out.println("�Է� : ");
	int c = sc.nextInt();
	
	boolean d = (c <= a) || (c >= b);
	System.out.println(d);
	*/
	
	//=========================================================================
	
	
	/*
	System.out.println("�Է�1 : ");
	int a = sc.nextInt();
	
	System.out.println("�Է�2 : ");
	int b = sc.nextInt();
	
	System.out.println("�Է�3 : ");
	int c = sc.nextInt();
	
	System.out.println((a == b) && (b == c));
	
	*/
	//=========================================================================
	
	
	System.out.print("A����� ���� : ");
    int a = sc.nextInt();
    
    System.out.print("B����� ���� : ");
    int b = sc.nextInt();
    
    System.out.print("C����� ���� : ");
    int c = sc.nextInt();
    
    double a1 = 0.4;
    double b1 = 0;
    double c1 = 0.15;
    
    double a2 = a * (1+a1);
    double b2 = b * (1+b1);
    double c2 = c * (1+c1);
    
    String a3 = (a2 >= 3000) ? "3000 �̻�" : "3000 �̸�";
    String b3 = (b2 >= 3000) ? "3000 �̻�" : "3000 �̸�";
    String c3 = (c2 >= 3000) ? "3000 �̻�" : "3000 �̸�";
	
    System.out.println("A��� ����/����+a : 2500/3500.0" + "\n" + a3);
    System.out.println("B��� ����/����+a : 2900/2900.0" + "\n" + b3);
    System.out.println("C��� ����/����+a : 2600/2989.9999999999995" + "\n" + c3);
	
	
	
	
}

	private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void $$(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
