import java.util.Scanner;

public class Quize {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//	System.out.println("=== 계산기 프로그램 ===");
//	System.out.print("숫자 입력1 > ");
//	int n1 = Integer.parseInt(sc.nextLine());
//	System.out.print("숫자 입력2 > ");
//	int n2 = Integer.parseInt(sc.nextLine());
//	
//	System.out.print("연산자 입력 (+,-,*,/) > ");
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

		System.out.println("넌 어디부터 싰어?");
		System.out.println("1. 머리부터 감는다.");
		System.out.println("2. 세수부터 한다.");
		System.out.println("3. 몸부터 닦는다.");
		System.out.println("4. 이를 닦는다.");

		int n1 = Integer.parseInt(sc.nextLine());

		if (n1 == 1) {
			System.out.println("1. 세수부터 하는당신.");
			System.out.println("샤워 할때 세수부터 하는 당신은 순수한 마음을");
			System.out.println("갖고 있으며, 이성에게 헌신적이고 순종적임.");
			System.out.println("배려를 잘하고 받는것 보다 베푸는 것이 먼저인 당신!!");
			System.out.println("순수한 마음에 상처를 받지 않는 것이 필요함!");
		} else if (n1 == 2) {
			System.out.println("2. 양치질을 먼저 하는 당신.");
			System.out.println("지적 호기심이 높으며 매사에 신중한 당신!!");
			System.out.println("너무 신중한 탓에 연애 시작에 어려움이 있을");
			System.out.println("수도 있으나 연애를 시작하면 지적인 탐구나");
			System.out.println("상대방에 대해 많은것을 발견하고 싶어하는 경향이 있음");
		} else if (n1 == 3) {
			System.out.println("몸부터 싰는 당신.");
			System.out.println("샤워를 할 때 몸을 가장 먼저 씻는 당신은 겉모습을");
			System.out.println("굉장히 중요하게 여기는 사람이며 이성을");
			System.out.println("볼때도 패션감각, 얼굴 등을 중요시 함.");
			System.out.println("하지만 좋아하는 이성이 나타나면 그 사람");
			System.out.println("에게 올인 하는 스타일임.");
		} else if (n1 == 4) {
			System.out.println("4. 머리를 먼저 감는 당신.");
			System.out.println(" 샤워를 할때 머리를 먼저 감는 당신은 주변 사람들이");
			System.out.println("하자는데로 이끌려 다니는 스타일.");
			System.out.println("겉으로는 원만한대인관계를 유지하는것같지만");
			System.out.println("속으론 속앓이를 하고 있음.");
			System.out.println("이런성격은 이성을 만날떄도 마찬가지이며 이성에게 휘둘리는편임.");
			System.out.println("감정표현을 잘하는것이 필요함.");
		} else {
			System.out.println("다시 고르시오!!");
		}

	}
}
