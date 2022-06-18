import java.util.Scanner;

public class Quiz02_oo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = (int) (Math.random() * (100 - 1 + 1) + 1);
		int win = 0;
		int lose = 0;

		vending: while (true) {
			System.out.println("\n====Up & Down Game ====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("Type menu >> ");
			
			int menu = Integer.parseInt(sc.nextLine());
			int play = 5;
			switch (menu) {
			case 1:
				for (int i = 1; i <= play; i++) {
					System.out.print("\nInput Number >> ");
					int input = Integer.parseInt(sc.nextLine());

					if (i != play) {
						if (input < num) {
							System.out.println("<< Up >>");
						} else if (input > num) {
							System.out.println("<< Down >>");
						} else if (input == num) {
							System.out.println("<< Excellent! >>");
							win++;
							System.out.println("Your current score >> " + win + "win " + lose + "lose");
							break;
						}
					} else if (i == play) {
						lose++;
					}

				}
			case 2:
				System.out.println("Your current score >> " + win + "win " + lose + "lose");
				break;
			case 3:
				System.out.println("==== End ====");
				break vending;
			}

		}

	}
}
