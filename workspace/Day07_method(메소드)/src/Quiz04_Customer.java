import java.util.Scanner;

public class Quiz04_Customer {
	public static void getCustomer(String name) {
		System.out.println(name + "�� ������� !");
	}//1==========
	
	public static void getCustomer(int num) {
		if(num == 1) {
			System.out.println("ȥ�� �մ��Դϴ�.");
		}else {
			System.out.println("�մ� " + num + "�� �����Ͽ����ϴ�.");
		}
	}//2==========
	
	public static void getCustomer(double temperature) {
		if(temperature <= 37&&temperature >= 36.5) {
			System.out.println("����ü�� �Դϴ�.");
		}else if(temperature < 36.5) {
			System.out.println("��ü�� �Դϴ�.");
		}else if(temperature > 37) {
			System.out.println("���� �Ұ��Դϴ�.");
		}else {
			System.out.println("�߸��� �Է��Դϴ�.");}
	}
	//3==========
	public static void getCustomer(boolean guest) {
		if (guest == true) {
			System.out.println("���� �մ��Դϴ�.");
		}else if(guest == false) {
			System.out.println("���� �մ��Դϴ�.");
		}else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("====�մ� ���� ���α׷�====");
		System.out.print("1. �̸��� �Է��� �ּ��� >> ");
		String name = sc.nextLine();
		getCustomer(name);
		//1.========================================
		
		System.out.print("\n2. �ο����� �Է����ּ��� >> ");
		int num = Integer.parseInt(sc.nextLine());
		getCustomer(num);
		//2.========================================

		System.out.println("\n3. ���� ü���� �Է��� �ּ���."); 
		double temperature = Double.parseDouble(sc.nextLine());
		getCustomer(temperature);
		//3.========================================
		
		System.out.println("\n4. ���� �Ļ� ���θ� �Է����ּ���");
		boolean guest = Boolean.parseBoolean(sc.nextLine());
		getCustomer(guest);
		//4.========================================
		
		
		
//		4���� �޴��� ����ִ� ���α׷�
//		+ 4���� �޼��� ��� getcustomer()�̶�� �̸��� �޼���� �����ε��� ����
//		1. ����ڰ� �̸��� �Է��ϸ� '~�� �ȳ��ϼ���!' ����ϴ� �޼��� ����
//		2. ����ڰ� �ο��� (����)�� �Է��ϸ� '�մ� ~�� �����Ͽ����ϴ�. ' ��� 1���̸� ' ȥ��մ��Դϴ�' ����ϴ� �޼���
//		3. ����ڰ� ü�� (�Ǽ�)�� �Է��ϸ�, ' ���� ������ �մ��� ü���� ~�� �Դϴ�.' ���
//		+ 36.5~37�� ���̸� ����ü��, �̸��̸� ��ü��, �ʰ��� ����Ұ� ������ִ� �޼���
//		4. ����ڰ� true�� �Է��ϸ� '���� �մ��Դϴ�.' ��� / false '���� �մ��Դϴ�.' ����ϴ� �޼���
		
		
		
	}
}
