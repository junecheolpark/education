import java.util.Scanner;

public class quize3 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("인사말을 입력하세요.");
		System.out.print(">>");
		String gr = sc.nextLine();
		
		System.out.println("이름을 입력하세요.");
		System.out.print(">>");
		String name = sc.nextLine();
		
		System.out.println("영문이름을 입력하세요.");
		System.out.print(">>");
		String en = sc.nextLine();
		
		System.out.println("나이를 입력하세요..");
		System.out.print(">>");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("체온측정 결과를 입력하세요.");
		System.out.print(">>");
		double tem = Double.parseDouble(sc.nextLine());
		
		System.out.println("저의 이름은 " + name + "입니다. " + "영어 이름은" + en + " 입니다.");
		System.out.println("제 나이는 " + age + "입니다.");
		System.out.println("오늘의 체온측정 결과는 " + tem + "도 " + "입니다.");
		
		
	}
}
