package if_Switch;

import java.util.Scanner;

public class If_Switch {
	public static void main(String[] args) {
//		(1) int�� ���� x�� 10���� ũ�� 20���� ���� �� true�� ���ǽ�
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		if (10 < x) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

//		(6) ���ڿ� �������� str�� "yes"�� �� true�� ���ǽ�
		String str = sc.nextLine();
		if ("yes".equals(str)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
