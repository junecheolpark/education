import java.util.Scanner;

public class Quiz01_Printname {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println("** ������ �����Ϸ��� q�� �Է��ϼ���.");
//			System.out.print(i + " : �г����� �Է��� �ּ��� >> ");
//			String name = sc.nextLine();
//			if (name.equals("q")) {
//				break;
//			}
//		}
		
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println("** ������ �����Ϸ��� q�� �Է��ϼ���.");
//			System.out.print(i + " : �г����� �Է��� �ּ��� >> ");
//
//			String name = sc.nextLine();
//			if (name.equals("manager")) {
//				System.out.println("�Ŵ����� �������!");
//			} else if (name.equals("q")) {
//				break;
//			} else {
//				System.out.println(name + "�� �������!");
//				continue;
//			}
//		}
		int i = 0;
		while(true) {			
			System.out.println("** ������ �����Ϸ��� q�� �Է��ϼ���.");
			System.out.print(i++ + " : �г����� �Է��� �ּ��� >> ");

			String name = sc.nextLine();
			if (name.equals("manager")) {
				System.out.println("�Ŵ����� �������!");
			} else if (name.equals("q")) {
				break;
			} else {
				System.out.println(name + "�� �������!");
				continue;
			}
		}
		
		
		
	}
}
