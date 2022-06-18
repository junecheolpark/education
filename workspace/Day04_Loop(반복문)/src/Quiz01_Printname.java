import java.util.Scanner;

public class Quiz01_Printname {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println("** 입장을 종료하려면 q를 입력하세요.");
//			System.out.print(i + " : 닉네임을 입력해 주세요 >> ");
//			String name = sc.nextLine();
//			if (name.equals("q")) {
//				break;
//			}
//		}
		
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println("** 입장을 종료하려면 q를 입력하세요.");
//			System.out.print(i + " : 닉네임을 입력해 주세요 >> ");
//
//			String name = sc.nextLine();
//			if (name.equals("manager")) {
//				System.out.println("매니저님 어서오세요!");
//			} else if (name.equals("q")) {
//				break;
//			} else {
//				System.out.println(name + "님 어서오세요!");
//				continue;
//			}
//		}
		int i = 0;
		while(true) {			
			System.out.println("** 입장을 종료하려면 q를 입력하세요.");
			System.out.print(i++ + " : 닉네임을 입력해 주세요 >> ");

			String name = sc.nextLine();
			if (name.equals("manager")) {
				System.out.println("매니저님 어서오세요!");
			} else if (name.equals("q")) {
				break;
			} else {
				System.out.println(name + "님 어서오세요!");
				continue;
			}
		}
		
		
		
	}
}
